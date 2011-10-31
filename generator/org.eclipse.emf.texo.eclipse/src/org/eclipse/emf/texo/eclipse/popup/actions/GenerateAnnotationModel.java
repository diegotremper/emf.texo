/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: GenerateAnnotationModel.java,v 1.8 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.popup.actions;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.eclipse.Messages;
import org.eclipse.emf.texo.generator.AnnotationModelGenerator;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelAnnotatorRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * The generate annotation model menu option. Collects the selected files and their projects and generate an annotated
 * model.
 * 
 * @author mtaal
 */
public class GenerateAnnotationModel extends BaseGenerateAction {

  @Override
  protected void generateFromUris(IProgressMonitor monitor, IProject project, List<URI> uris) {
    for (URI uri : uris) {
      generateFromURI(monitor, project, uri);
    }
  }

  /**
   * Method returns all annotators in the {@link ModelAnnotatorRegistry}, should be overridden to only use specific
   * annotators.
   * 
   * @return the full list of registered annotators.
   */
  protected List<ModelAnnotator> getModelAnnotators() {
    return ModelAnnotatorRegistry.getInstance().getModelAnnotators();
  }

  /**
   * Create a completely empty annotation model, default false.
   */
  protected boolean doOnlyInitialModel() {
    return false;
  }

  protected String getModelAnnotatorSuffix() {
    return ""; //$NON-NLS-1$
  }

  protected EPackage getAnnotationEPackage() {
    return null;
  }

  protected void generateFromURI(IProgressMonitor monitor, IProject project, URI uri) {
    // always start with a fresh epackage registry
    final List<EPackage> ePackages = GeneratorUtils.readEPackages(Collections.singletonList(uri),
        GeneratorUtils.createEPackageRegistry());

    // get rid of the epackages which are subpackages
    final ListIterator<EPackage> iterator = ePackages.listIterator();
    while (iterator.hasNext()) {
      final EPackage ePackage = iterator.next();
      if (ePackage.eContainer() instanceof EPackage) {
        iterator.remove();
      }
    }

    if (ePackages.size() != 1) {
      Shell shell = new Shell();
      MessageDialog.openInformation(shell, Messages.getString("incorrect.number.of.epackages.message"), Messages //$NON-NLS-1$
          .formatMessage("incorrect.number.of.epackages.message", uri.toString(), ePackages.size())); //$NON-NLS-1$
      return;
    }
    final AnnotationModelGenerator generator = new AnnotationModelGenerator();
    generator.setCreateOnlyInitialModel(doOnlyInitialModel());
    generator.setModelAnnotators(getModelAnnotators());
    generator.createStoreAnnotationModel(ePackages.get(0), getModelAnnotatorSuffix(), getAnnotationEPackage());
  }
}

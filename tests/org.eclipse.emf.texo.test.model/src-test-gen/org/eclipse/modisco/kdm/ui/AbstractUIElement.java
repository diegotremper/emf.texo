package org.eclipse.modisco.kdm.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * A representation of the model object '<em><b>AbstractUIElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "AbstractUIElement")
public abstract class AbstractUIElement extends KDMEntity {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = SourceRef.class)
  @JoinColumns({ @JoinColumn() })
  private Set<SourceRef> source = new HashSet<SourceRef>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractUIRelationship.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractUIRelationship> uIRelation = new HashSet<AbstractUIRelationship>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = AbstractCodeElement.class)
  @JoinTable(name = "AbstractUIElement_implementation")
  private Set<AbstractCodeElement> implementation = new HashSet<AbstractCodeElement>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ActionElement.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<ActionElement> abstraction = new ArrayList<ActionElement>();

  /**
   * Returns the value of '<em><b>source</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>source</b></em>' feature
   * @generated
   */
  public Set<SourceRef> getSource() {
    return source;
  }

  /**
   * Adds to the <em>source</em> feature.
   * @generated
   */
  public void addToSource(SourceRef sourceValue) {
    if (!source.contains(sourceValue)) {

      source.add(sourceValue);
    }

  }

  /**			
   * Removes from the <em>source</em> feature.
   * @generated
   */
  public void removeFromSource(SourceRef sourceValue) {
    if (source.contains(sourceValue)) {
      source.remove(sourceValue);
    }
  }

  /**			
   * Clears the <em>source</em> feature.
   * @generated
   */
  public void clearSource() {
    for (SourceRef sourceElement : source) {
      removeFromSource(sourceElement);
    }
  }

  /**
   * Sets the '{@link AbstractUIElement#getSource() <em>source</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractUIElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>UIRelation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>UIRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractUIRelationship> getUIRelation() {
    return uIRelation;
  }

  /**
   * Adds to the <em>UIRelation</em> feature.
   * @generated
   */
  public void addToUIRelation(AbstractUIRelationship uIRelationValue) {
    if (!uIRelation.contains(uIRelationValue)) {

      uIRelation.add(uIRelationValue);
    }

  }

  /**			
   * Removes from the <em>UIRelation</em> feature.
   * @generated
   */
  public void removeFromUIRelation(AbstractUIRelationship uIRelationValue) {
    if (uIRelation.contains(uIRelationValue)) {
      uIRelation.remove(uIRelationValue);
    }
  }

  /**			
   * Clears the <em>UIRelation</em> feature.
   * @generated
   */
  public void clearUIRelation() {
    for (AbstractUIRelationship uIRelationElement : uIRelation) {
      removeFromUIRelation(uIRelationElement);
    }
  }

  /**
   * Sets the '{@link AbstractUIElement#getUIRelation() <em>UIRelation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractUIElement#getUIRelation() UIRelation}' feature.
   * @generated
   */
  public void setUIRelation(Set<AbstractUIRelationship> newUIRelation) {
    uIRelation = newUIRelation;
  }

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeElement> getImplementation() {
    return implementation;
  }

  /**
   * Adds to the <em>implementation</em> feature.
   * @generated
   */
  public void addToImplementation(AbstractCodeElement implementationValue) {
    if (!implementation.contains(implementationValue)) {

      implementation.add(implementationValue);
    }

  }

  /**			
   * Removes from the <em>implementation</em> feature.
   * @generated
   */
  public void removeFromImplementation(AbstractCodeElement implementationValue) {
    if (implementation.contains(implementationValue)) {
      implementation.remove(implementationValue);
    }
  }

  /**			
   * Clears the <em>implementation</em> feature.
   * @generated
   */
  public void clearImplementation() {
    for (AbstractCodeElement implementationElement : implementation) {
      removeFromImplementation(implementationElement);
    }
  }

  /**
   * Sets the '{@link AbstractUIElement#getImplementation() <em>implementation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractUIElement#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<AbstractCodeElement> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * Returns the value of '<em><b>abstraction</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>abstraction</b></em>' feature
   * @generated
   */
  public List<ActionElement> getAbstraction() {
    return abstraction;
  }

  /**
   * Adds to the <em>abstraction</em> feature.
   * @generated
   */
  public void addToAbstraction(ActionElement abstractionValue) {
    if (!abstraction.contains(abstractionValue)) {

      abstraction.add(abstractionValue);
    }

  }

  /**			
   * Removes from the <em>abstraction</em> feature.
   * @generated
   */
  public void removeFromAbstraction(ActionElement abstractionValue) {
    if (abstraction.contains(abstractionValue)) {
      abstraction.remove(abstractionValue);
    }
  }

  /**			
   * Clears the <em>abstraction</em> feature.
   * @generated
   */
  public void clearAbstraction() {
    for (ActionElement abstractionElement : abstraction) {
      removeFromAbstraction(abstractionElement);
    }
  }

  /**
   * Sets the '{@link AbstractUIElement#getAbstraction() <em>abstraction</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractUIElement#getAbstraction() abstraction}' feature.
   * @generated
   */
  public void setAbstraction(List<ActionElement> newAbstraction) {
    abstraction = newAbstraction;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractUIElement ";
  }
}
package org.eclipse.emf.texo.test.model.schemaconstructs.documentroot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.schemaconstructs.documentroot.dao.ComplexTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>documentroot</b></em>'.
 * It contains initialization code and access to the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class DocumentrootModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/documentroot";

  /**
   * The {@link ModelFactory} for this package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final DocumentrootModelFactory MODELFACTORY = new DocumentrootModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int COMPLEXTYPE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int COMPLEXTYPE_TEST_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DOCUMENTROOT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DOCUMENTROOT_MIXED_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DOCUMENTROOT_OTHERTEST_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DOCUMENTROOT_TEST_FEATURE_ID = 4;

  /**
   * The static member with the instance of this {@link ModelPackage}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final DocumentrootModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static DocumentrootModelPackage initialize() {

    if (isInitialized) {
      return (DocumentrootModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final DocumentrootModelPackage modelPackage = new DocumentrootModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(ComplexType.class, modelPackage.getComplexTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(ComplexType.class, ComplexTypeDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link DocumentrootModelFactory} instance.
   * @generated
   */
  @Override
  public DocumentrootModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /** 
   * Returns the nsUri of the {@link EPackage} managed by this Package instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage 
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "documentroot.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>ComplexType</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>ComplexType</b></em>' 
   * @generated
   */
  public EClass getComplexTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPLEXTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ComplexType.test</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ComplexType.test</b></em>'.
   * @generated
   */
  public EAttribute getComplexType_Test() {
    return (EAttribute) getComplexTypeEClass().getEAllStructuralFeatures().get(COMPLEXTYPE_TEST_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DocumentRoot</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>DocumentRoot</b></em>' 
   * @generated
   */
  public EClass getDocumentRootEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DOCUMENTROOT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.mixed</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.mixed</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_MIXED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.xMLNSPrefixMap</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.xMLNSPrefixMap</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.xSISchemaLocation</b></em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.xSISchemaLocation</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.otherTest</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.otherTest</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_OtherTest() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_OTHERTEST_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.test</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.test</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_Test() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_TEST_FEATURE_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param eClassifier
   *            the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case COMPLEXTYPE_CLASSIFIER_ID:
      return ComplexType.class;
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    }
    throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
  }
}
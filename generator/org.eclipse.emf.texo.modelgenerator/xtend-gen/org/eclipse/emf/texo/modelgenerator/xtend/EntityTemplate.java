package org.eclipse.emf.texo.modelgenerator.xtend;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.BaseTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.FeatureGroupTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityTemplate extends BaseTemplate {
  private ModelController modelController;
  
  private EClassModelGenAnnotation eClassModelGenAnnotation;
  
  private EPackageModelGenAnnotation ePackageModelGenAnnotation;
  
  public void generate(final ModelController theModelController, final EClassModelGenAnnotation theEClassModelGenAnnotation) {
    this.modelController = theModelController;
    this.eClassModelGenAnnotation = theEClassModelGenAnnotation;
    EPackageModelGenAnnotation _ownerEPackageAnnotation = theEClassModelGenAnnotation.getOwnerEPackageAnnotation();
    this.ePackageModelGenAnnotation = _ownerEPackageAnnotation;
    boolean _and = false;
    boolean _isGenerateCode = this.eClassModelGenAnnotation.isGenerateCode();
    if (!_isGenerateCode) {
      _and = false;
    } else {
      boolean _or = false;
      boolean _isAddRuntimeModelBehavior = this.ePackageModelGenAnnotation.isAddRuntimeModelBehavior();
      if (_isAddRuntimeModelBehavior) {
        _or = true;
      } else {
        EClass _eClass = this.eClassModelGenAnnotation.getEClass();
        boolean _isDocumentRoot = TemplateUtil.isDocumentRoot(_eClass);
        boolean _not = (!_isDocumentRoot);
        _or = (_isAddRuntimeModelBehavior || _not);
      }
      _and = (_isGenerateCode && _or);
    }
    if (_and) {
      String fileName = TemplateUtil.classFileName(this.eClassModelGenAnnotation);
      String content = this.generateContent();
      this.addFile(fileName, content);
      this.generateFeatureGroups();
    }
  }
  
  public String generateContent() {
    StringConcatenation _builder = new StringConcatenation();
    String _javaFileHeader = this.ePackageModelGenAnnotation.getJavaFileHeader();
    _builder.append(_javaFileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = this.ePackageModelGenAnnotation.getPackagePath();
    _builder.append(_packagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/** ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* A representation of the model object \'<em><b>");
    String _name = this.eClassModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    {
      String _documentation = this.eClassModelGenAnnotation.getDocumentation();
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        _builder.append("* <!-- begin-model-doc -->");
        _builder.newLine();
        _builder.append("* ");
        String _documentation_1 = this.eClassModelGenAnnotation.getDocumentation();
        _builder.append(_documentation_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("* <!-- end-model-doc -->");
        _builder.newLine();
      }
    }
    _builder.append(" ");
    _builder.append("* @generated ");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    EClass _eClass = this.eClassModelGenAnnotation.getEClass();
    String _javaAnnotations = this.modelController.getJavaAnnotations(_eClass, "type");
    _builder.append(_javaAnnotations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public");
    {
      boolean _abstractValue = this.eClassModelGenAnnotation.getAbstractValue();
      if (_abstractValue) {
        _builder.append(" abstract");
      }
    }
    _builder.append(" class ");
    String _simpleClassName = this.eClassModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _classExtends = this.eClassModelGenAnnotation.getClassExtends();
      int _size = _classExtends.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append(" extends ");
        EList<String> _classExtends_1 = this.eClassModelGenAnnotation.getClassExtends();
        String _get = _classExtends_1.get(0);
        _builder.append(_get, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<String> _classImplements = this.eClassModelGenAnnotation.getClassImplements();
      int _size_1 = _classImplements.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append(" implements");
        _builder.newLineIfNotEmpty();
        {
          EList<String> _classImplements_1 = this.eClassModelGenAnnotation.getClassImplements();
          boolean _hasElements = false;
          for(final String classImplements : _classImplements_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append(classImplements, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("{ ");
    _builder.newLine();
    {
      boolean _isSerializable = this.eClassModelGenAnnotation.isSerializable();
      if (_isSerializable) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append("*/");
        _builder.newLine();
        _builder.append("private static final long serialVersionUID = 1L;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations = this.eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation : _eStructuralFeatureModelGenAnnotations) {
        _builder.append("\t\t");
        _builder.newLine();
        {
          boolean _or = false;
          EClass _eClass_1 = this.eClassModelGenAnnotation.getEClass();
          boolean _isDocumentRoot = TemplateUtil.isDocumentRoot(_eClass_1);
          if (_isDocumentRoot) {
            _or = true;
          } else {
            EStructuralFeature _eStructuralFeature = featureAnnotation.getEStructuralFeature();
            boolean _isVolatile = _eStructuralFeature.isVolatile();
            boolean _not = (!_isVolatile);
            _or = (_isDocumentRoot || _not);
          }
          if (_or) {
            _builder.newLine();
            _builder.append("\t");
            _builder.append("/** ");
            _builder.newLine();
            _builder.append(" \t\t ");
            _builder.append("* <!-- begin-user-doc -->");
            _builder.newLine();
            _builder.append(" \t\t ");
            _builder.append("* <!-- end-user-doc -->");
            _builder.newLine();
            {
              String _documentation_2 = featureAnnotation.getDocumentation();
              boolean _notEquals_1 = (!Objects.equal(_documentation_2, null));
              if (_notEquals_1) {
                _builder.append("\t");
                _builder.append("* <!-- begin-model-doc -->");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("* ");
                String _documentation_3 = featureAnnotation.getDocumentation();
                _builder.append(_documentation_3, "	");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("* <!-- end-model-doc -->");
                _builder.newLine();
              }
            }
            _builder.append("\t ");
            _builder.append("* @generated ");
            _builder.newLine();
            _builder.append("\t ");
            _builder.append("*/");
            _builder.newLine();
            _builder.append("\t");
            EStructuralFeature _eStructuralFeature_1 = featureAnnotation.getEStructuralFeature();
            String _javaAnnotations_1 = this.modelController.getJavaAnnotations(_eStructuralFeature_1, "field");
            _builder.append(_javaAnnotations_1, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("private ");
            String _type = featureAnnotation.getType();
            _builder.append(_type, "	");
            _builder.append(" ");
            String _validJavaMemberName = featureAnnotation.getValidJavaMemberName();
            _builder.append(_validJavaMemberName, "	");
            _builder.append(" = ");
            String _defaultValue = featureAnnotation.getDefaultValue();
            _builder.append(_defaultValue, "	");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations_1 = this.eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_1 : _eStructuralFeatureModelGenAnnotations_1) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Returns the value of \'<em><b>");
        EStructuralFeature _eStructuralFeature_2 = featureAnnotation_1.getEStructuralFeature();
        String _name_1 = _eStructuralFeature_2.getName();
        _builder.append(_name_1, " ");
        _builder.append("</b></em>\' feature.");
        _builder.newLineIfNotEmpty();
        {
          boolean _and = false;
          boolean _and_1 = false;
          boolean _and_2 = false;
          boolean _or_1 = false;
          EClass _eClass_2 = this.eClassModelGenAnnotation.getEClass();
          boolean _isDocumentRoot_1 = TemplateUtil.isDocumentRoot(_eClass_2);
          if (_isDocumentRoot_1) {
            _or_1 = true;
          } else {
            EStructuralFeature _eStructuralFeature_3 = featureAnnotation_1.getEStructuralFeature();
            boolean _isVolatile_1 = _eStructuralFeature_3.isVolatile();
            boolean _not_1 = (!_isVolatile_1);
            _or_1 = (_isDocumentRoot_1 || _not_1);
          }
          if (!_or_1) {
            _and_2 = false;
          } else {
            boolean _isMany = featureAnnotation_1.isMany();
            _and_2 = (_or_1 && _isMany);
          }
          if (!_and_2) {
            _and_1 = false;
          } else {
            boolean _isReference = featureAnnotation_1.isReference();
            _and_1 = (_and_2 && _isReference);
          }
          if (!_and_1) {
            _and = false;
          } else {
            boolean _isGenerateSafeManyAccess = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateSafeManyAccess();
            _and = (_and_1 && _isGenerateSafeManyAccess);
          }
          if (_and) {
            _builder.append("* Note: the returned collection is Unmodifiable use the {#addTo");
            String _validJavaMemberName_1 = featureAnnotation_1.getValidJavaMemberName();
            String _firstUpper = TemplateUtil.toFirstUpper(_validJavaMemberName_1);
            _builder.append(_firstUpper, "");
            _builder.append("(");
            String _itemType = featureAnnotation_1.getItemType();
            _builder.append(_itemType, "");
            _builder.append(" value)}");
            _builder.newLineIfNotEmpty();
            _builder.append("* and {@link #removeFrom");
            String _validJavaMemberName_2 = featureAnnotation_1.getValidJavaMemberName();
            String _firstUpper_1 = TemplateUtil.toFirstUpper(_validJavaMemberName_2);
            _builder.append(_firstUpper_1, "");
            _builder.append("(");
            String _itemType_1 = featureAnnotation_1.getItemType();
            _builder.append(_itemType_1, "");
            _builder.append(" value)} methods ");
            _builder.newLineIfNotEmpty();
            _builder.append("* to modify this feature.");
            _builder.newLine();
          }
        }
        _builder.append(" ");
        _builder.append("*");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* <!-- begin-user-doc -->");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* <!-- end-user-doc -->");
        _builder.newLine();
        {
          String _documentation_4 = featureAnnotation_1.getDocumentation();
          boolean _notEquals_2 = (!Objects.equal(_documentation_4, null));
          if (_notEquals_2) {
            _builder.append("* <!-- begin-model-doc -->");
            _builder.newLine();
            _builder.append("* ");
            String _documentation_5 = featureAnnotation_1.getDocumentation();
            _builder.append(_documentation_5, "");
            _builder.newLineIfNotEmpty();
            _builder.append("* <!-- end-model-doc -->");
            _builder.newLine();
          }
        }
        _builder.append(" ");
        _builder.append("* @return the value of \'<em><b>");
        EStructuralFeature _eStructuralFeature_4 = featureAnnotation_1.getEStructuralFeature();
        String _name_2 = _eStructuralFeature_4.getName();
        _builder.append(_name_2, " ");
        _builder.append("</b></em>\' feature");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        EStructuralFeature _eStructuralFeature_5 = featureAnnotation_1.getEStructuralFeature();
        String _javaAnnotations_2 = this.modelController.getJavaAnnotations(_eStructuralFeature_5, "getter");
        _builder.append(_javaAnnotations_2, "");
        _builder.newLineIfNotEmpty();
        _builder.append("public ");
        String _type_1 = featureAnnotation_1.getType();
        _builder.append(_type_1, "");
        _builder.append(" ");
        String _getter = featureAnnotation_1.getGetter();
        _builder.append(_getter, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        {
          boolean _or_2 = false;
          EClass _eClass_3 = this.eClassModelGenAnnotation.getEClass();
          boolean _isDocumentRoot_2 = TemplateUtil.isDocumentRoot(_eClass_3);
          if (_isDocumentRoot_2) {
            _or_2 = true;
          } else {
            EStructuralFeature _eStructuralFeature_6 = featureAnnotation_1.getEStructuralFeature();
            boolean _isVolatile_2 = _eStructuralFeature_6.isVolatile();
            boolean _not_2 = (!_isVolatile_2);
            _or_2 = (_isDocumentRoot_2 || _not_2);
          }
          if (_or_2) {
            {
              boolean _and_3 = false;
              boolean _and_4 = false;
              boolean _isMany_1 = featureAnnotation_1.isMany();
              if (!_isMany_1) {
                _and_4 = false;
              } else {
                boolean _isReference_1 = featureAnnotation_1.isReference();
                _and_4 = (_isMany_1 && _isReference_1);
              }
              if (!_and_4) {
                _and_3 = false;
              } else {
                boolean _isGenerateSafeManyAccess_1 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateSafeManyAccess();
                _and_3 = (_and_4 && _isGenerateSafeManyAccess_1);
              }
              if (_and_3) {
                {
                  boolean _isUseList = ((EReferenceModelGenAnnotation) featureAnnotation_1).isUseList();
                  if (_isUseList) {
                    _builder.append("return java.util.Collections.unmodifiableList(");
                    String _validJavaMemberName_3 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_3, "");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("return java.util.Collections.unmodifiableSet(");
                    String _validJavaMemberName_4 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_4, "");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                _builder.append("return ");
                String _validJavaMemberName_5 = featureAnnotation_1.getValidJavaMemberName();
                _builder.append(_validJavaMemberName_5, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            EStructuralFeatureModelGenAnnotation _featureMapFeature = featureAnnotation_1.getFeatureMapFeature();
            boolean _notEquals_3 = (!Objects.equal(_featureMapFeature, null));
            if (_notEquals_3) {
              {
                boolean _isMany_2 = featureAnnotation_1.isMany();
                if (_isMany_2) {
                  _builder.append("return ");
                  EStructuralFeatureModelGenAnnotation _featureMapFeature_1 = featureAnnotation_1.getFeatureMapFeature();
                  String _featureMapQualifiedClassName = _featureMapFeature_1.getFeatureMapQualifiedClassName();
                  _builder.append(_featureMapQualifiedClassName, "");
                  _builder.append(".createUnmodifiableValueList(");
                  EStructuralFeatureModelGenAnnotation _featureMapFeature_2 = featureAnnotation_1.getFeatureMapFeature();
                  String _getter_1 = _featureMapFeature_2.getGetter();
                  _builder.append(_getter_1, "");
                  _builder.append("(), ");
                  EStructuralFeatureModelGenAnnotation _featureMapFeature_3 = featureAnnotation_1.getFeatureMapFeature();
                  String _featureMapQualifiedClassName_1 = _featureMapFeature_3.getFeatureMapQualifiedClassName();
                  _builder.append(_featureMapQualifiedClassName_1, "");
                  _builder.append(".Feature.");
                  String _name_3 = featureAnnotation_1.getName();
                  String _upperCase = TemplateUtil.toUpperCase(_name_3);
                  _builder.append(_upperCase, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("return ");
                  EStructuralFeatureModelGenAnnotation _featureMapFeature_4 = featureAnnotation_1.getFeatureMapFeature();
                  String _featureMapQualifiedClassName_2 = _featureMapFeature_4.getFeatureMapQualifiedClassName();
                  _builder.append(_featureMapQualifiedClassName_2, "");
                  _builder.append(".getSingleFeatureMapValue(");
                  EStructuralFeatureModelGenAnnotation _featureMapFeature_5 = featureAnnotation_1.getFeatureMapFeature();
                  String _getter_2 = _featureMapFeature_5.getGetter();
                  _builder.append(_getter_2, "");
                  _builder.append("(), ");
                  EStructuralFeatureModelGenAnnotation _featureMapFeature_6 = featureAnnotation_1.getFeatureMapFeature();
                  String _featureMapQualifiedClassName_3 = _featureMapFeature_6.getFeatureMapQualifiedClassName();
                  _builder.append(_featureMapQualifiedClassName_3, "");
                  _builder.append(".Feature.");
                  String _name_4 = featureAnnotation_1.getName();
                  String _upperCase_1 = TemplateUtil.toUpperCase(_name_4);
                  _builder.append(_upperCase_1, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            } else {
              _builder.append("// Volatile feature");
              _builder.newLine();
              _builder.append("// TODO: implement this method to return the \'");
              EStructuralFeature _eStructuralFeature_7 = featureAnnotation_1.getEStructuralFeature();
              String _name_5 = _eStructuralFeature_7.getName();
              _builder.append(_name_5, "");
              _builder.append("\'");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
              _builder.newLine();
              _builder.append("\t\t\t");
              _builder.append("throw new UnsupportedOperationException();");
              _builder.newLine();
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        {
          boolean _or_3 = false;
          EStructuralFeature _eStructuralFeature_8 = featureAnnotation_1.getEStructuralFeature();
          boolean _isChangeable = _eStructuralFeature_8.isChangeable();
          if (_isChangeable) {
            _or_3 = true;
          } else {
            boolean _and_5 = false;
            boolean _isReference_2 = featureAnnotation_1.isReference();
            if (!_isReference_2) {
              _and_5 = false;
            } else {
              EReferenceModelGenAnnotation _oppositeModelGenAnnotation = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
              boolean _notEquals_4 = (!Objects.equal(_oppositeModelGenAnnotation, null));
              _and_5 = (_isReference_2 && _notEquals_4);
            }
            _or_3 = (_isChangeable || _and_5);
          }
          if (_or_3) {
            {
              boolean _and_6 = false;
              boolean _and_7 = false;
              boolean _and_8 = false;
              EStructuralFeatureModelGenAnnotation _featureMapFeature_7 = featureAnnotation_1.getFeatureMapFeature();
              boolean _equals = Objects.equal(_featureMapFeature_7, null);
              if (!_equals) {
                _and_8 = false;
              } else {
                boolean _isMany_3 = featureAnnotation_1.isMany();
                _and_8 = (_equals && _isMany_3);
              }
              if (!_and_8) {
                _and_7 = false;
              } else {
                boolean _isReference_3 = featureAnnotation_1.isReference();
                _and_7 = (_and_8 && _isReference_3);
              }
              if (!_and_7) {
                _and_6 = false;
              } else {
                boolean _or_4 = false;
                boolean _isGenerateBidirectionalAssociationSupport = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateBidirectionalAssociationSupport();
                if (_isGenerateBidirectionalAssociationSupport) {
                  _or_4 = true;
                } else {
                  boolean _isGenerateSafeManyAccess_2 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateSafeManyAccess();
                  _or_4 = (_isGenerateBidirectionalAssociationSupport || _isGenerateSafeManyAccess_2);
                }
                _and_6 = (_and_7 && _or_4);
              }
              if (_and_6) {
                _builder.append("/**");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* Adds to the <em>");
                EStructuralFeature _eStructuralFeature_9 = featureAnnotation_1.getEStructuralFeature();
                String _name_6 = _eStructuralFeature_9.getName();
                _builder.append(_name_6, " ");
                _builder.append("</em> feature.");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("* @generated");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                _builder.append("public void addTo");
                String _validJavaMemberName_6 = featureAnnotation_1.getValidJavaMemberName();
                String _firstUpper_2 = TemplateUtil.toFirstUpper(_validJavaMemberName_6);
                _builder.append(_firstUpper_2, "");
                _builder.append("(");
                String _itemType_2 = featureAnnotation_1.getItemType();
                _builder.append(_itemType_2, "");
                _builder.append(" ");
                String _validJavaMemberName_7 = featureAnnotation_1.getValidJavaMemberName();
                _builder.append(_validJavaMemberName_7, "");
                _builder.append("Value) {");
                _builder.newLineIfNotEmpty();
                {
                  EStructuralFeature _eStructuralFeature_10 = featureAnnotation_1.getEStructuralFeature();
                  boolean _isVolatile_3 = _eStructuralFeature_10.isVolatile();
                  boolean _not_3 = (!_isVolatile_3);
                  if (_not_3) {
                    {
                      EStructuralFeature _eStructuralFeature_11 = featureAnnotation_1.getEStructuralFeature();
                      boolean _isUnique = _eStructuralFeature_11.isUnique();
                      if (_isUnique) {
                        _builder.append("\t");
                        _builder.append("if (!");
                        String _validJavaMemberName_8 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_8, "	");
                        _builder.append(".contains(");
                        String _validJavaMemberName_9 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_9, "	");
                        _builder.append("Value)) {");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t");
                    _builder.append("\t");
                    String _validJavaMemberName_10 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_10, "		");
                    _builder.append(".add(");
                    String _validJavaMemberName_11 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_11, "		");
                    _builder.append("Value);");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_9 = false;
                      EReferenceModelGenAnnotation _oppositeModelGenAnnotation_1 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                      boolean _notEquals_5 = (!Objects.equal(_oppositeModelGenAnnotation_1, null));
                      if (!_notEquals_5) {
                        _and_9 = false;
                      } else {
                        boolean _isGenerateBidirectionalAssociationSupport_1 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateBidirectionalAssociationSupport();
                        _and_9 = (_notEquals_5 && _isGenerateBidirectionalAssociationSupport_1);
                      }
                      if (_and_9) {
                        _builder.append("\t");
                        _builder.append("\t");
                        EReferenceModelGenAnnotation oppositeAnnotation = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                        _builder.append("\t\t\t");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isMany_4 = oppositeAnnotation.isMany();
                          if (_isMany_4) {
                            {
                              boolean _isGenerateSafeManyAccess_3 = oppositeAnnotation.isGenerateSafeManyAccess();
                              if (_isGenerateSafeManyAccess_3) {
                                _builder.append("\t");
                                _builder.append("\t");
                                String _validJavaMemberName_12 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_12, "		");
                                _builder.append("Value.addTo");
                                String _validJavaMemberName_13 = oppositeAnnotation.getValidJavaMemberName();
                                String _firstUpper_3 = TemplateUtil.toFirstUpper(_validJavaMemberName_13);
                                _builder.append(_firstUpper_3, "		");
                                _builder.append("(this);");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t");
                                _builder.append("\t");
                                String _validJavaMemberName_14 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_14, "		");
                                _builder.append("Value.add(this);");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          } else {
                            _builder.append("\t");
                            _builder.append("\t");
                            String _validJavaMemberName_15 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_15, "		");
                            _builder.append("Value.");
                            String _setter = oppositeAnnotation.getSetter();
                            _builder.append(_setter, "		");
                            _builder.append("(this);");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                    {
                      EStructuralFeature _eStructuralFeature_12 = featureAnnotation_1.getEStructuralFeature();
                      boolean _isUnique_1 = _eStructuralFeature_12.isUnique();
                      if (_isUnique_1) {
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
                      }
                    }
                  } else {
                    _builder.append("\t\t    \t");
                    _builder.append("// Volatile feature");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("throw new UnsupportedOperationException();");
                    _builder.newLine();
                  }
                }
                _builder.append("}");
                _builder.newLine();
                _builder.newLine();
                _builder.append("/**\t\t\t");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* Removes from the <em>");
                EStructuralFeature _eStructuralFeature_13 = featureAnnotation_1.getEStructuralFeature();
                String _name_7 = _eStructuralFeature_13.getName();
                _builder.append(_name_7, " ");
                _builder.append("</em> feature.");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("* @generated");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                _builder.append("public void removeFrom");
                String _validJavaMemberName_16 = featureAnnotation_1.getValidJavaMemberName();
                String _firstUpper_4 = TemplateUtil.toFirstUpper(_validJavaMemberName_16);
                _builder.append(_firstUpper_4, "");
                _builder.append("(");
                String _itemType_3 = featureAnnotation_1.getItemType();
                _builder.append(_itemType_3, "");
                _builder.append(" ");
                String _validJavaMemberName_17 = featureAnnotation_1.getValidJavaMemberName();
                _builder.append(_validJavaMemberName_17, "");
                _builder.append("Value) {");
                _builder.newLineIfNotEmpty();
                {
                  EStructuralFeature _eStructuralFeature_14 = featureAnnotation_1.getEStructuralFeature();
                  boolean _isVolatile_4 = _eStructuralFeature_14.isVolatile();
                  boolean _not_4 = (!_isVolatile_4);
                  if (_not_4) {
                    _builder.append("\t");
                    _builder.append("if (");
                    String _validJavaMemberName_18 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_18, "	");
                    _builder.append(".contains(");
                    String _validJavaMemberName_19 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_19, "	");
                    _builder.append("Value)) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    String _validJavaMemberName_20 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_20, "		");
                    _builder.append(".remove(");
                    String _validJavaMemberName_21 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_21, "		");
                    _builder.append("Value);\t\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_10 = false;
                      EReferenceModelGenAnnotation _oppositeModelGenAnnotation_2 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                      boolean _notEquals_6 = (!Objects.equal(_oppositeModelGenAnnotation_2, null));
                      if (!_notEquals_6) {
                        _and_10 = false;
                      } else {
                        boolean _isGenerateBidirectionalAssociationSupport_2 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateBidirectionalAssociationSupport();
                        _and_10 = (_notEquals_6 && _isGenerateBidirectionalAssociationSupport_2);
                      }
                      if (_and_10) {
                        _builder.append("\t");
                        _builder.append("\t");
                        EReferenceModelGenAnnotation oppositeAnnotation_1 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                        _builder.append("\t\t\t");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isMany_5 = oppositeAnnotation_1.isMany();
                          if (_isMany_5) {
                            {
                              boolean _isGenerateSafeManyAccess_4 = oppositeAnnotation_1.isGenerateSafeManyAccess();
                              if (_isGenerateSafeManyAccess_4) {
                                _builder.append("\t");
                                _builder.append("\t");
                                String _validJavaMemberName_22 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_22, "		");
                                _builder.append("Value.removeFrom");
                                String _validJavaMemberName_23 = oppositeAnnotation_1.getValidJavaMemberName();
                                String _firstUpper_5 = TemplateUtil.toFirstUpper(_validJavaMemberName_23);
                                _builder.append(_firstUpper_5, "		");
                                _builder.append("(this);");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t");
                                _builder.append("\t");
                                String _validJavaMemberName_24 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_24, "		");
                                _builder.append("Value.remove(oppositeAnnotation.validJavaMemberName)\u00BB(this);");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          } else {
                            _builder.append("\t");
                            _builder.append("\t");
                            String _validJavaMemberName_25 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_25, "		");
                            _builder.append("Value.");
                            String _setter_1 = oppositeAnnotation_1.getSetter();
                            _builder.append(_setter_1, "		");
                            _builder.append("(null);");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    _builder.append("\t\t    \t");
                    _builder.append("// Volatile feature");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("throw new UnsupportedOperationException();");
                    _builder.newLine();
                  }
                }
                _builder.append("}");
                _builder.newLine();
                _builder.newLine();
                _builder.append("/**\t\t\t");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* Clears the <em>");
                EStructuralFeature _eStructuralFeature_15 = featureAnnotation_1.getEStructuralFeature();
                String _name_8 = _eStructuralFeature_15.getName();
                _builder.append(_name_8, " ");
                _builder.append("</em> feature.");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("* @generated");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                _builder.append("public void clear");
                String _validJavaMemberName_26 = featureAnnotation_1.getValidJavaMemberName();
                String _firstUpper_6 = TemplateUtil.toFirstUpper(_validJavaMemberName_26);
                _builder.append(_firstUpper_6, "");
                _builder.append("() {");
                _builder.newLineIfNotEmpty();
                {
                  EStructuralFeature _eStructuralFeature_16 = featureAnnotation_1.getEStructuralFeature();
                  boolean _isVolatile_5 = _eStructuralFeature_16.isVolatile();
                  boolean _not_5 = (!_isVolatile_5);
                  if (_not_5) {
                    _builder.append("\t");
                    _builder.append("while (!");
                    String _validJavaMemberName_27 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_27, "	");
                    _builder.append(".isEmpty()) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("removeFrom");
                    String _validJavaMemberName_28 = featureAnnotation_1.getValidJavaMemberName();
                    String _firstUpper_7 = TemplateUtil.toFirstUpper(_validJavaMemberName_28);
                    _builder.append(_firstUpper_7, "		");
                    _builder.append("(");
                    String _validJavaMemberName_29 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_29, "		");
                    _builder.append(".iterator().next());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    _builder.append("\t\t    \t");
                    _builder.append("// Volatile feature");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("throw new UnsupportedOperationException();");
                    _builder.newLine();
                  }
                }
                _builder.append("}");
                _builder.newLine();
              }
            }
            _builder.append("/**");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* Sets the \'{@link ");
            String _simpleClassName_1 = this.eClassModelGenAnnotation.getSimpleClassName();
            _builder.append(_simpleClassName_1, " ");
            _builder.append("#");
            String _getter_3 = featureAnnotation_1.getGetter();
            _builder.append(_getter_3, " ");
            _builder.append("() <em>");
            EStructuralFeature _eStructuralFeature_17 = featureAnnotation_1.getEStructuralFeature();
            String _name_9 = _eStructuralFeature_17.getName();
            _builder.append(_name_9, " ");
            _builder.append("</em>}\' feature.");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* <!-- begin-user-doc -->");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* <!-- end-user-doc -->");
            _builder.newLine();
            {
              String _documentation_6 = featureAnnotation_1.getDocumentation();
              boolean _notEquals_7 = (!Objects.equal(_documentation_6, null));
              if (_notEquals_7) {
                _builder.append("* <!-- begin-model-doc -->");
                _builder.newLine();
                _builder.append("* ");
                String _documentation_7 = featureAnnotation_1.getDocumentation();
                _builder.append(_documentation_7, "");
                _builder.newLineIfNotEmpty();
                _builder.append("* <!-- end-model-doc -->");
                _builder.newLine();
              }
            }
            _builder.append(" ");
            _builder.append("* @param the new value of the \'{@link ");
            String _simpleClassName_2 = this.eClassModelGenAnnotation.getSimpleClassName();
            _builder.append(_simpleClassName_2, " ");
            _builder.append("#");
            String _getter_4 = featureAnnotation_1.getGetter();
            _builder.append(_getter_4, " ");
            _builder.append("() ");
            EStructuralFeature _eStructuralFeature_18 = featureAnnotation_1.getEStructuralFeature();
            String _name_10 = _eStructuralFeature_18.getName();
            _builder.append(_name_10, " ");
            _builder.append("}\' feature.");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("* @generated");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            EStructuralFeature _eStructuralFeature_19 = featureAnnotation_1.getEStructuralFeature();
            String _javaAnnotations_3 = this.modelController.getJavaAnnotations(_eStructuralFeature_19, "setter");
            _builder.append(_javaAnnotations_3, "");
            _builder.newLineIfNotEmpty();
            _builder.append("public void ");
            String _setter_2 = featureAnnotation_1.getSetter();
            _builder.append(_setter_2, "");
            _builder.append("(");
            String _type_2 = featureAnnotation_1.getType();
            _builder.append(_type_2, "");
            _builder.append(" new");
            String _validJavaMemberName_30 = featureAnnotation_1.getValidJavaMemberName();
            String _firstUpper_8 = TemplateUtil.toFirstUpper(_validJavaMemberName_30);
            _builder.append(_firstUpper_8, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            {
              boolean _or_5 = false;
              EClass _eClass_4 = this.eClassModelGenAnnotation.getEClass();
              boolean _isDocumentRoot_3 = TemplateUtil.isDocumentRoot(_eClass_4);
              if (_isDocumentRoot_3) {
                _or_5 = true;
              } else {
                EStructuralFeature _eStructuralFeature_20 = featureAnnotation_1.getEStructuralFeature();
                boolean _isVolatile_6 = _eStructuralFeature_20.isVolatile();
                boolean _not_6 = (!_isVolatile_6);
                _or_5 = (_isDocumentRoot_3 || _not_6);
              }
              if (_or_5) {
                {
                  boolean _and_11 = false;
                  boolean _isReference_4 = featureAnnotation_1.isReference();
                  if (!_isReference_4) {
                    _and_11 = false;
                  } else {
                    boolean _isGenerateSafeManyAccess_5 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateSafeManyAccess();
                    _and_11 = (_isReference_4 && _isGenerateSafeManyAccess_5);
                  }
                  if (_and_11) {
                    {
                      boolean _isMany_6 = featureAnnotation_1.isMany();
                      if (_isMany_6) {
                        _builder.append("clear");
                        String _validJavaMemberName_31 = featureAnnotation_1.getValidJavaMemberName();
                        String _firstUpper_9 = TemplateUtil.toFirstUpper(_validJavaMemberName_31);
                        _builder.append(_firstUpper_9, "");
                        _builder.append("();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("for (");
                        String _itemType_4 = featureAnnotation_1.getItemType();
                        _builder.append(_itemType_4, "");
                        _builder.append(" value : new");
                        String _validJavaMemberName_32 = featureAnnotation_1.getValidJavaMemberName();
                        String _firstUpper_10 = TemplateUtil.toFirstUpper(_validJavaMemberName_32);
                        _builder.append(_firstUpper_10, "");
                        _builder.append(") {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("addTo");
                        String _validJavaMemberName_33 = featureAnnotation_1.getValidJavaMemberName();
                        String _firstUpper_11 = TemplateUtil.toFirstUpper(_validJavaMemberName_33);
                        _builder.append(_firstUpper_11, "	");
                        _builder.append("(value);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        {
                          boolean _and_12 = false;
                          EReferenceModelGenAnnotation _oppositeModelGenAnnotation_3 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                          boolean _notEquals_8 = (!Objects.equal(_oppositeModelGenAnnotation_3, null));
                          if (!_notEquals_8) {
                            _and_12 = false;
                          } else {
                            boolean _isGenerateBidirectionalAssociationSupport_3 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateBidirectionalAssociationSupport();
                            _and_12 = (_notEquals_8 && _isGenerateBidirectionalAssociationSupport_3);
                          }
                          if (_and_12) {
                            EReferenceModelGenAnnotation oppositeAnnotation_2 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                            _builder.append("\t\t\t");
                            _builder.newLineIfNotEmpty();
                            _builder.append("if (");
                            String _validJavaMemberName_34 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_34, "");
                            _builder.append(" != new");
                            String _validJavaMemberName_35 = featureAnnotation_1.getValidJavaMemberName();
                            String _firstUpper_12 = TemplateUtil.toFirstUpper(_validJavaMemberName_35);
                            _builder.append(_firstUpper_12, "");
                            _builder.append(") {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("if (");
                            String _validJavaMemberName_36 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_36, "	");
                            _builder.append(" != null) {");
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _isMany_7 = oppositeAnnotation_2.isMany();
                              if (_isMany_7) {
                                {
                                  boolean _isGenerateSafeManyAccess_6 = ((EReferenceModelGenAnnotation) oppositeAnnotation_2).isGenerateSafeManyAccess();
                                  if (_isGenerateSafeManyAccess_6) {
                                    _builder.append("\t\t");
                                    String _validJavaMemberName_37 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_37, "		");
                                    _builder.append(".removeFrom");
                                    String _validJavaMemberName_38 = oppositeAnnotation_2.getValidJavaMemberName();
                                    String _firstUpper_13 = TemplateUtil.toFirstUpper(_validJavaMemberName_38);
                                    _builder.append(_firstUpper_13, "		");
                                    _builder.append("(this);");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    _builder.append("\t\t");
                                    String _validJavaMemberName_39 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_39, "		");
                                    _builder.append(".remove(this);");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              } else {
                                _builder.append("\t\t");
                                String _type_3 = featureAnnotation_1.getType();
                                _builder.append(_type_3, "		");
                                _builder.append(" temp");
                                String _validJavaMemberName_40 = featureAnnotation_1.getValidJavaMemberName();
                                String _firstUpper_14 = TemplateUtil.toFirstUpper(_validJavaMemberName_40);
                                _builder.append(_firstUpper_14, "		");
                                _builder.append(" = ");
                                String _validJavaMemberName_41 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_41, "		");
                                _builder.append(";");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t");
                                String _validJavaMemberName_42 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_42, "		");
                                _builder.append(" = null;");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t");
                                _builder.append("temp");
                                String _validJavaMemberName_43 = featureAnnotation_1.getValidJavaMemberName();
                                String _firstUpper_15 = TemplateUtil.toFirstUpper(_validJavaMemberName_43);
                                _builder.append(_firstUpper_15, "		");
                                _builder.append(".");
                                String _setter_3 = oppositeAnnotation_2.getSetter();
                                _builder.append(_setter_3, "		");
                                _builder.append("(null);");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t");
                            String _validJavaMemberName_44 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_44, "	");
                            _builder.append(" = new");
                            String _validJavaMemberName_45 = featureAnnotation_1.getValidJavaMemberName();
                            String _firstUpper_16 = TemplateUtil.toFirstUpper(_validJavaMemberName_45);
                            _builder.append(_firstUpper_16, "	");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("if (");
                            String _validJavaMemberName_46 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_46, "	");
                            _builder.append(" != null) {");
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _isMany_8 = oppositeAnnotation_2.isMany();
                              if (_isMany_8) {
                                {
                                  boolean _isGenerateSafeManyAccess_7 = ((EReferenceModelGenAnnotation) oppositeAnnotation_2).isGenerateSafeManyAccess();
                                  if (_isGenerateSafeManyAccess_7) {
                                    _builder.append("\t\t");
                                    String _validJavaMemberName_47 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_47, "		");
                                    _builder.append(".addTo");
                                    String _validJavaMemberName_48 = oppositeAnnotation_2.getValidJavaMemberName();
                                    String _firstUpper_17 = TemplateUtil.toFirstUpper(_validJavaMemberName_48);
                                    _builder.append(_firstUpper_17, "		");
                                    _builder.append("(this);");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    _builder.append("\t\t");
                                    String _validJavaMemberName_49 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_49, "		");
                                    _builder.append(".add(this);");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              } else {
                                _builder.append("\t\t");
                                String _validJavaMemberName_50 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_50, "		");
                                _builder.append(".");
                                String _setter_4 = oppositeAnnotation_2.getSetter();
                                _builder.append(_setter_4, "		");
                                _builder.append("(this);\t\t\t\t\t\t\t");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("} ");
                            _builder.newLine();
                          } else {
                            String _validJavaMemberName_51 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_51, "");
                            _builder.append(" = new");
                            String _validJavaMemberName_52 = featureAnnotation_1.getValidJavaMemberName();
                            String _firstUpper_18 = TemplateUtil.toFirstUpper(_validJavaMemberName_52);
                            _builder.append(_firstUpper_18, "");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  } else {
                    String _validJavaMemberName_53 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_53, "");
                    _builder.append(" = new");
                    String _validJavaMemberName_54 = featureAnnotation_1.getValidJavaMemberName();
                    String _firstUpper_19 = TemplateUtil.toFirstUpper(_validJavaMemberName_54);
                    _builder.append(_firstUpper_19, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                EStructuralFeatureModelGenAnnotation _featureMapFeature_8 = featureAnnotation_1.getFeatureMapFeature();
                boolean _notEquals_9 = (!Objects.equal(_featureMapFeature_8, null));
                if (_notEquals_9) {
                  {
                    boolean _isMany_9 = featureAnnotation_1.isMany();
                    if (_isMany_9) {
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_9 = featureAnnotation_1.getFeatureMapFeature();
                      String _setter_5 = _featureMapFeature_9.getSetter();
                      _builder.append(_setter_5, "");
                      _builder.append("(");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_10 = featureAnnotation_1.getFeatureMapFeature();
                      String _featureMapQualifiedClassName_4 = _featureMapFeature_10.getFeatureMapQualifiedClassName();
                      _builder.append(_featureMapQualifiedClassName_4, "");
                      _builder.append(".createFeatureGroupList(");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_11 = featureAnnotation_1.getFeatureMapFeature();
                      String _featureMapQualifiedClassName_5 = _featureMapFeature_11.getFeatureMapQualifiedClassName();
                      _builder.append(_featureMapQualifiedClassName_5, "");
                      _builder.append(".Feature.");
                      String _name_11 = featureAnnotation_1.getName();
                      String _upperCase_2 = TemplateUtil.toUpperCase(_name_11);
                      _builder.append(_upperCase_2, "");
                      _builder.append(", new");
                      String _validJavaMemberName_55 = featureAnnotation_1.getValidJavaMemberName();
                      String _firstUpper_20 = TemplateUtil.toFirstUpper(_validJavaMemberName_55);
                      _builder.append(_firstUpper_20, "");
                      _builder.append("));");
                      _builder.newLineIfNotEmpty();
                    } else {
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_12 = featureAnnotation_1.getFeatureMapFeature();
                      String _featureMapQualifiedClassName_6 = _featureMapFeature_12.getFeatureMapQualifiedClassName();
                      _builder.append(_featureMapQualifiedClassName_6, "");
                      _builder.append(".setSingleFeatureMapValue(");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_13 = featureAnnotation_1.getFeatureMapFeature();
                      String _getter_5 = _featureMapFeature_13.getGetter();
                      _builder.append(_getter_5, "");
                      _builder.append("(), ");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_14 = featureAnnotation_1.getFeatureMapFeature();
                      String _featureMapQualifiedClassName_7 = _featureMapFeature_14.getFeatureMapQualifiedClassName();
                      _builder.append(_featureMapQualifiedClassName_7, "");
                      _builder.append(".Feature.");
                      String _name_12 = featureAnnotation_1.getName();
                      String _upperCase_3 = TemplateUtil.toUpperCase(_name_12);
                      _builder.append(_upperCase_3, "");
                      _builder.append(", new");
                      String _validJavaMemberName_56 = featureAnnotation_1.getValidJavaMemberName();
                      String _firstUpper_21 = TemplateUtil.toFirstUpper(_validJavaMemberName_56);
                      _builder.append(_firstUpper_21, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                } else {
                  _builder.append("\t\t    \t");
                  _builder.append("// Volatile feature");
                  _builder.newLine();
                  _builder.append("// TODO: implement this method to set the \'");
                  EStructuralFeature _eStructuralFeature_21 = featureAnnotation_1.getEStructuralFeature();
                  String _name_13 = _eStructuralFeature_21.getName();
                  _builder.append(_name_13, "");
                  _builder.append("\'");
                  _builder.newLineIfNotEmpty();
                  _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                  _builder.newLine();
                  _builder.append("throw new UnsupportedOperationException();");
                  _builder.newLine();
                }
              }
            }
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* A toString method which prints the values of all EAttributes of this instance.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append(" \t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("return  \"");
    String _name_14 = this.eClassModelGenAnnotation.getName();
    _builder.append(_name_14, "	 	");
    _builder.append(" \"");
    _builder.newLineIfNotEmpty();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations_2 = this.eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_2 : _eStructuralFeatureModelGenAnnotations_2) {
        {
          boolean _and_13 = false;
          boolean _isReference_5 = featureAnnotation_2.isReference();
          boolean _not_7 = (!_isReference_5);
          if (!_not_7) {
            _and_13 = false;
          } else {
            EStructuralFeature _eStructuralFeature_22 = featureAnnotation_2.getEStructuralFeature();
            boolean _isMany_10 = _eStructuralFeature_22.isMany();
            boolean _not_8 = (!_isMany_10);
            _and_13 = (_not_7 && _not_8);
          }
          if (_and_13) {
            _builder.append("+ \" [");
            String _name_15 = featureAnnotation_2.getName();
            _builder.append(_name_15, "");
            _builder.append(": \" +  ");
            String _getter_6 = featureAnnotation_2.getGetter();
            _builder.append(_getter_6, "");
            _builder.append("() + \"]\"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t \t");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("}\t \t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public void generateFeatureGroups() {
    EList<EStructuralFeatureModelGenAnnotation> _featureMapFeatures = this.eClassModelGenAnnotation.getFeatureMapFeatures();
    for (final EStructuralFeatureModelGenAnnotation featureAnnotation : _featureMapFeatures) {
      {
        FeatureGroupTemplate _featureGroupTemplate = new FeatureGroupTemplate();
        FeatureGroupTemplate template = _featureGroupTemplate;
        template.generate(this.modelController, featureAnnotation);
        Map<String,String> _files = template.getFiles();
        this.addFiles(_files);
      }
    }
  }
}

package org.eclipse.emf.texo.test.model.schemaconstructs.simplechoice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;

/** 
 * A representation for the Feature Group '<em><b>Person.group</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
public class PersonGroupFeatureGroup {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which feature is set in this feature group.
   * 
   * @generated
   */
  public static enum Feature {
    AGE, LENGTH
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Returns only the values from the feature group which have the feature
   * equal to the parameter.
   * 
   * @param featureGroup
   *          the featureGroup List to filter
   * @param filterByFeature
   *          filters by this enum
   * @return a list with instances corresponding to the feature kind
   * @see Collections#unmodifiableList(List)
   * @generated
   */
  @SuppressWarnings("unchecked")
  public static <T> List<T> createUnmodifiableValueList(List<PersonGroupFeatureGroup> featureGroup,
      Feature filterByFeature) {
    final List<Object> result = new ArrayList<Object>();
    for (final PersonGroupFeatureGroup group : featureGroup) {
      if (group.getFeature() == filterByFeature) {
        result.add(group.getValue());
      }
    }
    return (List<T>) Collections.unmodifiableList(result);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Returns a single value from the feature group which has the feature
   * equal to the parameter. The first found value is returned. If no value can be found then null is returned.
   * 
   * @param featureGroup
   *          the featureGroup List to filter
   * @param filterByFeature
   *          filters by this enum
   * @return an instance corresponding to the feature kind or null if not found.
   * @generated
   */
  @SuppressWarnings("unchecked")
  public static <T> T getSingleFeatureMapValue(List<PersonGroupFeatureGroup> featureGroup, Feature filterByFeature) {
    for (final PersonGroupFeatureGroup group : featureGroup) {
      if (group.getFeature() == filterByFeature) {
        return (T) group.getValue();
      }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Creates a list of group instances set with the passed feature and
   * values.
   * 
   * @param feature
   *          the feature to set
   * @param values
   *          the values to set as value of each group instance in the result.
   * @return a list with instances of this class, set with the Feature and values
   * @generated
   */
  public static List<PersonGroupFeatureGroup> createFeatureGroupList(Feature feature, List<?> values) {
    final List<PersonGroupFeatureGroup> result = new ArrayList<PersonGroupFeatureGroup>();
    for (Object value : values) {
      final PersonGroupFeatureGroup group = new PersonGroupFeatureGroup();
      group.setValue(feature, value);
      result.add(group);
    }
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private Feature feature = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private Integer age;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private Integer length;

  /**
   * @generated
   */
  public void setFeature(Feature feature) {
    this.feature = feature;
  }

  /**
   * @generated
   */
  public Feature getFeature() {
    return feature;
  }

  /**
   * Returns the value of '<em><b>age</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>age</b></em>' feature
   * @generated
   */
  public Integer getAge() {
    return age;
  }

  /**
   * Sets the '{@link Person#getAge() <em>age</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Person#getAge() age}' feature.
   * @generated
   */
  public void setAge(Integer newAge) {
    age = newAge;
    setFeature(Feature.AGE);
  }

  /**
   * Returns the value of '<em><b>length</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>length</b></em>' feature
   * @generated
   */
  public Integer getLength() {
    return length;
  }

  /**
   * Sets the '{@link Person#getLength() <em>length</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Person#getLength() length}' feature.
   * @generated
   */
  public void setLength(Integer newLength) {
    length = newLength;
    setFeature(Feature.LENGTH);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of this feature map entry. The type of the returned value is based on the feature.
   * @see #getFeature()
   * @generated 
   */
  public Object getValue() {
    switch (getFeature()) {
    case AGE:
      return getAge();
    case LENGTH:
      return getLength();
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param feature the feature to set
   * @param the value to set in this instance
   * @see #getFeature()
   * @generated 
   */
  public void setValue(Feature feature, Object value) {
    switch (feature) {
    case AGE:
      setAge((Integer) value);
      break;
    case LENGTH:
      setLength((Integer) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
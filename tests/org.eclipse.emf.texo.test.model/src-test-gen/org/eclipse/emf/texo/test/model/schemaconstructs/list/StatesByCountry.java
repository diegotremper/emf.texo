package org.eclipse.emf.texo.test.model.schemaconstructs.list;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;

/** 
 * A representation of the model object '<em><b>statesByCountry</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "statesByCountry")
public class StatesByCountry {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String country = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private int index = 0;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private List<String> allStates = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private List<String> sixImportantStates = null;

  /**
   * Returns the value of '<em><b>country</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>country</b></em>' feature
   * @generated
   */
  public String getCountry() {
    return country;
  }

  /**
   * Sets the '{@link StatesByCountry#getCountry() <em>country</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link StatesByCountry#getCountry() country}' feature.
   * @generated
   */
  public void setCountry(String newCountry) {
    country = newCountry;
  }

  /**
   * Returns the value of '<em><b>index</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>index</b></em>' feature
   * @generated
   */
  public int getIndex() {
    return index;
  }

  /**
   * Sets the '{@link StatesByCountry#getIndex() <em>index</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link StatesByCountry#getIndex() index}' feature.
   * @generated
   */
  public void setIndex(int newIndex) {
    index = newIndex;
  }

  /**
   * Returns the value of '<em><b>allStates</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>allStates</b></em>' feature
   * @generated
   */
  public List<String> getAllStates() {
    return allStates;
  }

  /**
   * Sets the '{@link StatesByCountry#getAllStates() <em>allStates</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link StatesByCountry#getAllStates() allStates}' feature.
   * @generated
   */
  public void setAllStates(List<String> newAllStates) {
    allStates = newAllStates;
  }

  /**
   * Returns the value of '<em><b>sixImportantStates</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>sixImportantStates</b></em>' feature
   * @generated
   */
  public List<String> getSixImportantStates() {
    return sixImportantStates;
  }

  /**
   * Sets the '{@link StatesByCountry#getSixImportantStates() <em>sixImportantStates</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link StatesByCountry#getSixImportantStates() sixImportantStates}' feature.
   * @generated
   */
  public void setSixImportantStates(List<String> newSixImportantStates) {
    sixImportantStates = newSixImportantStates;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "statesByCountry " + " [country: " + getCountry() + "]" + " [index: " + getIndex() + "]" + " [allStates: "
        + getAllStates() + "]" + " [sixImportantStates: " + getSixImportantStates() + "]";
  }
}
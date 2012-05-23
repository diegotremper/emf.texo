package org.eclipse.emf.texo.test.model.schemaconstructs.documentroot;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>ComplexType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ComplexType")
public class ComplexType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String test = null;

  /**
   * Returns the value of '<em><b>test</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>test</b></em>' feature
   * @generated
   */
  public String getTest() {
    return test;
  }

  /**
   * Sets the '{@link ComplexType#getTest() <em>test</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ComplexType#getTest() test}' feature.
   * @generated
   */
  public void setTest(String newTest) {
    test = newTest;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ComplexType " + " [test: " + getTest() + "]";
  }
}

package org.eclipse.emf.texo.test.model.issues.bz378087;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Test</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Test")
public class Test extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String class_ = null;

  /**
   * Returns the value of '<em><b>class</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>class</b></em>' feature
   * @generated
   */
  public String getClass_() {
    return class_;
  }

  /**
   * Sets the '{@link Test#getClass_() <em>class</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Test#getClass_() class}' feature.
   * @generated
   */
  public void setClass_(String newClass_) {
    class_ = newClass_;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Test " + " [class_: " + getClass_() + "]";
  }
}

package org.eclipse.graphiti.mm.pictograms;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.graphiti.mm.algorithms.styles.Point;

/**
 * A representation of the model object '<em><b>FixPointAnchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_FixPointAnchor")
public class FixPointAnchor extends AdvancedAnchor {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private Point location = null;

  /**
   * Returns the value of '<em><b>location</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>location</b></em>' feature
   * @generated
   */
  public Point getLocation() {
    return location;
  }

  /**
   * Sets the '{@link FixPointAnchor#getLocation() <em>location</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link FixPointAnchor#getLocation() location}' feature.
   * @generated
   */
  public void setLocation(Point newLocation) {
    location = newLocation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "FixPointAnchor ";
  }
}
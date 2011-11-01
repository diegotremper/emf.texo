package org.eclipse.emf.texo.test.model.samples.extendedpo2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/** 
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Customer")
public class Customer extends Identifiable {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private int customerID = 0;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = PurchaseOrder.class)
  @OrderColumn()
  @JoinTable(name = "Customer_orders")
  private List<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();

  /**
   * Returns the value of '<em><b>customerID</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>customerID</b></em>' feature
   * @generated
   */
  public int getCustomerID() {
    return customerID;
  }

  /**
   * Sets the '{@link Customer#getCustomerID() <em>customerID</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Customer#getCustomerID() customerID}' feature.
   * @generated
   */
  public void setCustomerID(int newCustomerID) {
    customerID = newCustomerID;
  }

  /**
   * Returns the value of '<em><b>orders</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>orders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getOrders() {
    return orders;
  }

  /**
   * Adds to the <em>orders</em> feature.
   * @generated
   */
  public void addToOrders(PurchaseOrder ordersValue) {
    if (!orders.contains(ordersValue)) {

      orders.add(ordersValue);
    }

  }

  /**			
   * Removes from the <em>orders</em> feature.
   * @generated
   */
  public void removeFromOrders(PurchaseOrder ordersValue) {
    if (orders.contains(ordersValue)) {
      orders.remove(ordersValue);
    }
  }

  /**			
   * Clears the <em>orders</em> feature.
   * @generated
   */
  public void clearOrders() {
    for (PurchaseOrder ordersElement : orders) {
      removeFromOrders(ordersElement);
    }
  }

  /**
   * Sets the '{@link Customer#getOrders() <em>orders</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Customer#getOrders() orders}' feature.
   * @generated
   */
  public void setOrders(List<PurchaseOrder> newOrders) {
    orders = newOrders;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Customer " + " [customerID: " + getCustomerID() + "]";
  }
}
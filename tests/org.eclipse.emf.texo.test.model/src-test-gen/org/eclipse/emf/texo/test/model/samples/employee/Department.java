package org.eclipse.emf.texo.test.model.samples.employee;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Department")
public class Department {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String name = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Employee.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Employee> employees = new ArrayList<Employee>();

  /**
   * @generated
   */
  public String helloWorld() {
    System.err.println("hello, I am Department ");
    return " Department";
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Department#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Department#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>employees</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>employees</b></em>' feature
   * @generated
   */
  public List<Employee> getEmployees() {
    return employees;
  }

  /**
   * Adds to the <em>employees</em> feature.
   * @generated
   */
  public void addToEmployees(Employee employeesValue) {
    if (!employees.contains(employeesValue)) {

      employees.add(employeesValue);
    }

  }

  /**			
   * Removes from the <em>employees</em> feature.
   * @generated
   */
  public void removeFromEmployees(Employee employeesValue) {
    if (employees.contains(employeesValue)) {
      employees.remove(employeesValue);
    }
  }

  /**			
   * Clears the <em>employees</em> feature.
   * @generated
   */
  public void clearEmployees() {
    for (Employee employeesElement : employees) {
      removeFromEmployees(employeesElement);
    }
  }

  /**
   * Sets the '{@link Department#getEmployees() <em>employees</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Department#getEmployees() employees}' feature.
   * @generated
   */
  public void setEmployees(List<Employee> newEmployees) {
    employees = newEmployees;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Department " + " [name: " + getName() + "]";
  }
}
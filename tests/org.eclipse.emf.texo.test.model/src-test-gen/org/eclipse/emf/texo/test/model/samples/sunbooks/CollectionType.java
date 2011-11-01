package org.eclipse.emf.texo.test.model.samples.sunbooks;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/** 
 * A representation of the model object '<em><b>CollectionType</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "CollectionType")
public class CollectionType {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false, targetEntity = BooksType.class)
  @JoinColumns({ @JoinColumn() })
  private BooksType books = null;

  /**
   * Returns the value of '<em><b>books</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>books</b></em>' feature
   * @generated
   */
  public BooksType getBooks() {
    return books;
  }

  /**
   * Sets the '{@link CollectionType#getBooks() <em>books</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link CollectionType#getBooks() books}' feature.
   * @generated
   */
  public void setBooks(BooksType newBooks) {
    books = newBooks;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "CollectionType ";
  }
}
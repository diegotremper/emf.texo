/**
 * <copyright>
 * </copyright>
 *
 * $Id: DirectionType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Direction Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * 
 * * * An enum that is used within the StoredProcedureParameter annotation. * It is used to specify the direction of the
 * stored procedure * parameters of a named stored procedure query. * public enum Direction { * * Input parameter * IN,
 * 
 * * * Output parameter * OUT,
 * 
 * * * Input and output parameter * IN_OUT,
 * 
 * * * Output cursor * OUT_CURSOR }
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getDirectionType()
 * @model extendedMetaData="name='direction-type'"
 * @generated
 */
public enum DirectionType implements Enumerator {
  /**
   * The '<em><b>IN</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #IN_VALUE
   * @generated
   * @ordered
   */
  IN(0, "IN", "IN"),

  /**
   * The '<em><b>OUT</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #OUT_VALUE
   * @generated
   * @ordered
   */
  OUT(1, "OUT", "OUT"),

  /**
   * The '<em><b>INOUT</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #INOUT_VALUE
   * @generated
   * @ordered
   */
  INOUT(2, "INOUT", "IN_OUT"),

  /**
   * The '<em><b>OUTCURSOR</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #OUTCURSOR_VALUE
   * @generated
   * @ordered
   */
  OUTCURSOR(3, "OUTCURSOR", "OUT_CURSOR");

  /**
   * The '<em><b>IN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IN</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IN
   * @model
   * @generated
   * @ordered
   */
  public static final int IN_VALUE = 0;

  /**
   * The '<em><b>OUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OUT</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OUT
   * @model
   * @generated
   * @ordered
   */
  public static final int OUT_VALUE = 1;

  /**
   * The '<em><b>INOUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INOUT</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INOUT
   * @model literal="IN_OUT"
   * @generated
   * @ordered
   */
  public static final int INOUT_VALUE = 2;

  /**
   * The '<em><b>OUTCURSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OUTCURSOR</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OUTCURSOR
   * @model literal="OUT_CURSOR"
   * @generated
   * @ordered
   */
  public static final int OUTCURSOR_VALUE = 3;

  /**
   * An array of all the '<em><b>Direction Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static final DirectionType[] VALUES_ARRAY = new DirectionType[] {
      IN,
      OUT,
      INOUT,
      OUTCURSOR,
    };

  /**
   * A public read-only list of all the '<em><b>Direction Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static final List<DirectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Direction Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static DirectionType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      DirectionType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Direction Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static DirectionType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      DirectionType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Direction Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static DirectionType get(int value) {
    switch (value) {
      case IN_VALUE: return IN;
      case OUT_VALUE: return OUT;
      case INOUT_VALUE: return INOUT;
      case OUTCURSOR_VALUE: return OUTCURSOR;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private DirectionType(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }

} // DirectionType

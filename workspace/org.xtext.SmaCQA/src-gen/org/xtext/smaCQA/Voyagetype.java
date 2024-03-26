/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Voyagetype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.smaCQA.SmaCQAPackage#getVoyagetype()
 * @model
 * @generated
 */
public enum Voyagetype implements Enumerator
{
  /**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
  TIME(0, "time", "time"),

  /**
	 * The '<em><b>Voyage</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #VOYAGE_VALUE
	 * @generated
	 * @ordered
	 */
  VOYAGE(1, "voyage", "voyage");

  /**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
  public static final int TIME_VALUE = 0;

  /**
	 * The '<em><b>Voyage</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #VOYAGE
	 * @model name="voyage"
	 * @generated
	 * @ordered
	 */
  public static final int VOYAGE_VALUE = 1;

  /**
	 * An array of all the '<em><b>Voyagetype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Voyagetype[] VALUES_ARRAY =
    new Voyagetype[] {
			TIME,
			VOYAGE,
		};

  /**
	 * A public read-only list of all the '<em><b>Voyagetype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Voyagetype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Voyagetype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Voyagetype get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Voyagetype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Voyagetype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Voyagetype getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Voyagetype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Voyagetype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Voyagetype get(int value)
  {
		switch (value) {
			case TIME_VALUE: return TIME;
			case VOYAGE_VALUE: return VOYAGE;
		}
		return null;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final int value;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String name;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String literal;

  /**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private Voyagetype(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //Voyagetype

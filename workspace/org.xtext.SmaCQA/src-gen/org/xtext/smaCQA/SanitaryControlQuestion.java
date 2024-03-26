/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sanitary Control Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.SanitaryControlQuestion#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smaCQA.SanitaryControlQuestion#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getSanitaryControlQuestion()
 * @model
 * @generated
 */
public interface SanitaryControlQuestion extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getSanitaryControlQuestion_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.SanitaryControlQuestion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' attribute.
	 * @see #setAnswer(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getSanitaryControlQuestion_Answer()
	 * @model
	 * @generated
	 */
  String getAnswer();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.SanitaryControlQuestion#getAnswer <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' attribute.
	 * @see #getAnswer()
	 * @generated
	 */
  void setAnswer(String value);

} // SanitaryControlQuestion

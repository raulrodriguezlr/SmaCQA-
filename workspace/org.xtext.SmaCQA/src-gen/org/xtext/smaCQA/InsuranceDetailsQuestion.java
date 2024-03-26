/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Details Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getQ1 <em>Q1</em>}</li>
 *   <li>{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswer1 <em>Answer1</em>}</li>
 *   <li>{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswerUnitCoin1 <em>Answer Unit Coin1</em>}</li>
 *   <li>{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getQ2 <em>Q2</em>}</li>
 *   <li>{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswer2 <em>Answer2</em>}</li>
 *   <li>{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getQ3 <em>Q3</em>}</li>
 *   <li>{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswer3 <em>Answer3</em>}</li>
 *   <li>{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswerUnitCoin3 <em>Answer Unit Coin3</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion()
 * @model
 * @generated
 */
public interface InsuranceDetailsQuestion extends EObject
{
  /**
	 * Returns the value of the '<em><b>Q1</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Q1</em>' attribute.
	 * @see #setQ1(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion_Q1()
	 * @model
	 * @generated
	 */
  String getQ1();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getQ1 <em>Q1</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q1</em>' attribute.
	 * @see #getQ1()
	 * @generated
	 */
  void setQ1(String value);

  /**
	 * Returns the value of the '<em><b>Answer1</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer1</em>' attribute.
	 * @see #setAnswer1(int)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion_Answer1()
	 * @model
	 * @generated
	 */
  int getAnswer1();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswer1 <em>Answer1</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer1</em>' attribute.
	 * @see #getAnswer1()
	 * @generated
	 */
  void setAnswer1(int value);

  /**
	 * Returns the value of the '<em><b>Answer Unit Coin1</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtext.smaCQA.UnitCoin}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Unit Coin1</em>' attribute.
	 * @see org.xtext.smaCQA.UnitCoin
	 * @see #setAnswerUnitCoin1(UnitCoin)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion_AnswerUnitCoin1()
	 * @model
	 * @generated
	 */
  UnitCoin getAnswerUnitCoin1();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswerUnitCoin1 <em>Answer Unit Coin1</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Unit Coin1</em>' attribute.
	 * @see org.xtext.smaCQA.UnitCoin
	 * @see #getAnswerUnitCoin1()
	 * @generated
	 */
  void setAnswerUnitCoin1(UnitCoin value);

  /**
	 * Returns the value of the '<em><b>Q2</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Q2</em>' attribute.
	 * @see #setQ2(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion_Q2()
	 * @model
	 * @generated
	 */
  String getQ2();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getQ2 <em>Q2</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q2</em>' attribute.
	 * @see #getQ2()
	 * @generated
	 */
  void setQ2(String value);

  /**
	 * Returns the value of the '<em><b>Answer2</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer2</em>' attribute.
	 * @see #setAnswer2(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion_Answer2()
	 * @model
	 * @generated
	 */
  String getAnswer2();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswer2 <em>Answer2</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer2</em>' attribute.
	 * @see #getAnswer2()
	 * @generated
	 */
  void setAnswer2(String value);

  /**
	 * Returns the value of the '<em><b>Q3</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Q3</em>' attribute.
	 * @see #setQ3(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion_Q3()
	 * @model
	 * @generated
	 */
  String getQ3();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getQ3 <em>Q3</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q3</em>' attribute.
	 * @see #getQ3()
	 * @generated
	 */
  void setQ3(String value);

  /**
	 * Returns the value of the '<em><b>Answer3</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer3</em>' attribute.
	 * @see #setAnswer3(int)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion_Answer3()
	 * @model
	 * @generated
	 */
  int getAnswer3();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswer3 <em>Answer3</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer3</em>' attribute.
	 * @see #getAnswer3()
	 * @generated
	 */
  void setAnswer3(int value);

  /**
	 * Returns the value of the '<em><b>Answer Unit Coin3</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtext.smaCQA.UnitCoin}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Unit Coin3</em>' attribute.
	 * @see org.xtext.smaCQA.UnitCoin
	 * @see #setAnswerUnitCoin3(UnitCoin)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getInsuranceDetailsQuestion_AnswerUnitCoin3()
	 * @model
	 * @generated
	 */
  UnitCoin getAnswerUnitCoin3();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.InsuranceDetailsQuestion#getAnswerUnitCoin3 <em>Answer Unit Coin3</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Unit Coin3</em>' attribute.
	 * @see org.xtext.smaCQA.UnitCoin
	 * @see #getAnswerUnitCoin3()
	 * @generated
	 */
  void setAnswerUnitCoin3(UnitCoin value);

} // InsuranceDetailsQuestion

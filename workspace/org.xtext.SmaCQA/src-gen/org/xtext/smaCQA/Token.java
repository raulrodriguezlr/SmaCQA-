/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.Token#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smaCQA.Token#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.xtext.smaCQA.Token#getSupply <em>Supply</em>}</li>
 *   <li>{@link org.xtext.smaCQA.Token#getAnswerMintSentence <em>Answer Mint Sentence</em>}</li>
 *   <li>{@link org.xtext.smaCQA.Token#getAnswerBurnSentence <em>Answer Burn Sentence</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getToken_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.Token#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getToken_Symbol()
	 * @model
	 * @generated
	 */
  String getSymbol();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.Token#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
  void setSymbol(String value);

  /**
	 * Returns the value of the '<em><b>Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply</em>' attribute.
	 * @see #setSupply(int)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getToken_Supply()
	 * @model
	 * @generated
	 */
  int getSupply();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.Token#getSupply <em>Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply</em>' attribute.
	 * @see #getSupply()
	 * @generated
	 */
  void setSupply(int value);

  /**
	 * Returns the value of the '<em><b>Answer Mint Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Mint Sentence</em>' attribute.
	 * @see #setAnswerMintSentence(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getToken_AnswerMintSentence()
	 * @model
	 * @generated
	 */
  String getAnswerMintSentence();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.Token#getAnswerMintSentence <em>Answer Mint Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Mint Sentence</em>' attribute.
	 * @see #getAnswerMintSentence()
	 * @generated
	 */
  void setAnswerMintSentence(String value);

  /**
	 * Returns the value of the '<em><b>Answer Burn Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Burn Sentence</em>' attribute.
	 * @see #setAnswerBurnSentence(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getToken_AnswerBurnSentence()
	 * @model
	 * @generated
	 */
  String getAnswerBurnSentence();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.Token#getAnswerBurnSentence <em>Answer Burn Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Burn Sentence</em>' attribute.
	 * @see #getAnswerBurnSentence()
	 * @generated
	 */
  void setAnswerBurnSentence(String value);

} // Token

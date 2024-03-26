/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.smaCQA.SmaCQAPackage;
import org.xtext.smaCQA.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.impl.TokenImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.TokenImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.TokenImpl#getSupply <em>Supply</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.TokenImpl#getAnswerMintSentence <em>Answer Mint Sentence</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.TokenImpl#getAnswerBurnSentence <em>Answer Burn Sentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenImpl extends MinimalEObjectImpl.Container implements Token
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
  protected static final String SYMBOL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
  protected String symbol = SYMBOL_EDEFAULT;

  /**
	 * The default value of the '{@link #getSupply() <em>Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSupply()
	 * @generated
	 * @ordered
	 */
  protected static final int SUPPLY_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getSupply() <em>Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSupply()
	 * @generated
	 * @ordered
	 */
  protected int supply = SUPPLY_EDEFAULT;

  /**
	 * The default value of the '{@link #getAnswerMintSentence() <em>Answer Mint Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnswerMintSentence()
	 * @generated
	 * @ordered
	 */
  protected static final String ANSWER_MINT_SENTENCE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAnswerMintSentence() <em>Answer Mint Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnswerMintSentence()
	 * @generated
	 * @ordered
	 */
  protected String answerMintSentence = ANSWER_MINT_SENTENCE_EDEFAULT;

  /**
	 * The default value of the '{@link #getAnswerBurnSentence() <em>Answer Burn Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnswerBurnSentence()
	 * @generated
	 * @ordered
	 */
  protected static final String ANSWER_BURN_SENTENCE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAnswerBurnSentence() <em>Answer Burn Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnswerBurnSentence()
	 * @generated
	 * @ordered
	 */
  protected String answerBurnSentence = ANSWER_BURN_SENTENCE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TokenImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SmaCQAPackage.Literals.TOKEN;
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
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.TOKEN__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getSymbol()
  {
		return symbol;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setSymbol(String newSymbol)
  {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.TOKEN__SYMBOL, oldSymbol, symbol));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int getSupply()
  {
		return supply;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setSupply(int newSupply)
  {
		int oldSupply = supply;
		supply = newSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.TOKEN__SUPPLY, oldSupply, supply));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getAnswerMintSentence()
  {
		return answerMintSentence;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setAnswerMintSentence(String newAnswerMintSentence)
  {
		String oldAnswerMintSentence = answerMintSentence;
		answerMintSentence = newAnswerMintSentence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.TOKEN__ANSWER_MINT_SENTENCE, oldAnswerMintSentence, answerMintSentence));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getAnswerBurnSentence()
  {
		return answerBurnSentence;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setAnswerBurnSentence(String newAnswerBurnSentence)
  {
		String oldAnswerBurnSentence = answerBurnSentence;
		answerBurnSentence = newAnswerBurnSentence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.TOKEN__ANSWER_BURN_SENTENCE, oldAnswerBurnSentence, answerBurnSentence));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SmaCQAPackage.TOKEN__NAME:
				return getName();
			case SmaCQAPackage.TOKEN__SYMBOL:
				return getSymbol();
			case SmaCQAPackage.TOKEN__SUPPLY:
				return getSupply();
			case SmaCQAPackage.TOKEN__ANSWER_MINT_SENTENCE:
				return getAnswerMintSentence();
			case SmaCQAPackage.TOKEN__ANSWER_BURN_SENTENCE:
				return getAnswerBurnSentence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SmaCQAPackage.TOKEN__NAME:
				setName((String)newValue);
				return;
			case SmaCQAPackage.TOKEN__SYMBOL:
				setSymbol((String)newValue);
				return;
			case SmaCQAPackage.TOKEN__SUPPLY:
				setSupply((Integer)newValue);
				return;
			case SmaCQAPackage.TOKEN__ANSWER_MINT_SENTENCE:
				setAnswerMintSentence((String)newValue);
				return;
			case SmaCQAPackage.TOKEN__ANSWER_BURN_SENTENCE:
				setAnswerBurnSentence((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SmaCQAPackage.TOKEN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmaCQAPackage.TOKEN__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case SmaCQAPackage.TOKEN__SUPPLY:
				setSupply(SUPPLY_EDEFAULT);
				return;
			case SmaCQAPackage.TOKEN__ANSWER_MINT_SENTENCE:
				setAnswerMintSentence(ANSWER_MINT_SENTENCE_EDEFAULT);
				return;
			case SmaCQAPackage.TOKEN__ANSWER_BURN_SENTENCE:
				setAnswerBurnSentence(ANSWER_BURN_SENTENCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SmaCQAPackage.TOKEN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmaCQAPackage.TOKEN__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case SmaCQAPackage.TOKEN__SUPPLY:
				return supply != SUPPLY_EDEFAULT;
			case SmaCQAPackage.TOKEN__ANSWER_MINT_SENTENCE:
				return ANSWER_MINT_SENTENCE_EDEFAULT == null ? answerMintSentence != null : !ANSWER_MINT_SENTENCE_EDEFAULT.equals(answerMintSentence);
			case SmaCQAPackage.TOKEN__ANSWER_BURN_SENTENCE:
				return ANSWER_BURN_SENTENCE_EDEFAULT == null ? answerBurnSentence != null : !ANSWER_BURN_SENTENCE_EDEFAULT.equals(answerBurnSentence);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", supply: ");
		result.append(supply);
		result.append(", answerMintSentence: ");
		result.append(answerMintSentence);
		result.append(", answerBurnSentence: ");
		result.append(answerBurnSentence);
		result.append(')');
		return result.toString();
	}

} //TokenImpl

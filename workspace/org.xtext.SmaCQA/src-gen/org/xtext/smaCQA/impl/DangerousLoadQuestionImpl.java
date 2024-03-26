/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.smaCQA.DangerousLoadQuestion;
import org.xtext.smaCQA.SmaCQAPackage;
import org.xtext.smaCQA.SpecialMeasuresQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dangerous Load Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.impl.DangerousLoadQuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.DangerousLoadQuestionImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.DangerousLoadQuestionImpl#getSubSentenceSpecialMeasures <em>Sub Sentence Special Measures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DangerousLoadQuestionImpl extends MinimalEObjectImpl.Container implements DangerousLoadQuestion
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
	 * The default value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
  protected static final String ANSWER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
  protected String answer = ANSWER_EDEFAULT;

  /**
	 * The cached value of the '{@link #getSubSentenceSpecialMeasures() <em>Sub Sentence Special Measures</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSubSentenceSpecialMeasures()
	 * @generated
	 * @ordered
	 */
  protected SpecialMeasuresQuestion subSentenceSpecialMeasures;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DangerousLoadQuestionImpl()
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
		return SmaCQAPackage.Literals.DANGEROUS_LOAD_QUESTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DANGEROUS_LOAD_QUESTION__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getAnswer()
  {
		return answer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setAnswer(String newAnswer)
  {
		String oldAnswer = answer;
		answer = newAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DANGEROUS_LOAD_QUESTION__ANSWER, oldAnswer, answer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public SpecialMeasuresQuestion getSubSentenceSpecialMeasures()
  {
		return subSentenceSpecialMeasures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSubSentenceSpecialMeasures(SpecialMeasuresQuestion newSubSentenceSpecialMeasures, NotificationChain msgs)
  {
		SpecialMeasuresQuestion oldSubSentenceSpecialMeasures = subSentenceSpecialMeasures;
		subSentenceSpecialMeasures = newSubSentenceSpecialMeasures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES, oldSubSentenceSpecialMeasures, newSubSentenceSpecialMeasures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setSubSentenceSpecialMeasures(SpecialMeasuresQuestion newSubSentenceSpecialMeasures)
  {
		if (newSubSentenceSpecialMeasures != subSentenceSpecialMeasures) {
			NotificationChain msgs = null;
			if (subSentenceSpecialMeasures != null)
				msgs = ((InternalEObject)subSentenceSpecialMeasures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES, null, msgs);
			if (newSubSentenceSpecialMeasures != null)
				msgs = ((InternalEObject)newSubSentenceSpecialMeasures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES, null, msgs);
			msgs = basicSetSubSentenceSpecialMeasures(newSubSentenceSpecialMeasures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES, newSubSentenceSpecialMeasures, newSubSentenceSpecialMeasures));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES:
				return basicSetSubSentenceSpecialMeasures(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__NAME:
				return getName();
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__ANSWER:
				return getAnswer();
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES:
				return getSubSentenceSpecialMeasures();
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
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__NAME:
				setName((String)newValue);
				return;
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__ANSWER:
				setAnswer((String)newValue);
				return;
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES:
				setSubSentenceSpecialMeasures((SpecialMeasuresQuestion)newValue);
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
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__ANSWER:
				setAnswer(ANSWER_EDEFAULT);
				return;
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES:
				setSubSentenceSpecialMeasures((SpecialMeasuresQuestion)null);
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
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__ANSWER:
				return ANSWER_EDEFAULT == null ? answer != null : !ANSWER_EDEFAULT.equals(answer);
			case SmaCQAPackage.DANGEROUS_LOAD_QUESTION__SUB_SENTENCE_SPECIAL_MEASURES:
				return subSentenceSpecialMeasures != null;
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
		result.append(", answer: ");
		result.append(answer);
		result.append(')');
		return result.toString();
	}

} //DangerousLoadQuestionImpl

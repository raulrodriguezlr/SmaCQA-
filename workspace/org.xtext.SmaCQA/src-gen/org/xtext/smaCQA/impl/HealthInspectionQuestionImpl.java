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

import org.xtext.smaCQA.HealthInspectionQuestion;
import org.xtext.smaCQA.InspectionResultQuestion;
import org.xtext.smaCQA.SmaCQAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Inspection Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.impl.HealthInspectionQuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.HealthInspectionQuestionImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.HealthInspectionQuestionImpl#getSubsentence <em>Subsentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthInspectionQuestionImpl extends MinimalEObjectImpl.Container implements HealthInspectionQuestion
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
	 * The cached value of the '{@link #getSubsentence() <em>Subsentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSubsentence()
	 * @generated
	 * @ordered
	 */
  protected InspectionResultQuestion subsentence;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HealthInspectionQuestionImpl()
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
		return SmaCQAPackage.Literals.HEALTH_INSPECTION_QUESTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.HEALTH_INSPECTION_QUESTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.HEALTH_INSPECTION_QUESTION__ANSWER, oldAnswer, answer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public InspectionResultQuestion getSubsentence()
  {
		return subsentence;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSubsentence(InspectionResultQuestion newSubsentence, NotificationChain msgs)
  {
		InspectionResultQuestion oldSubsentence = subsentence;
		subsentence = newSubsentence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE, oldSubsentence, newSubsentence);
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
  public void setSubsentence(InspectionResultQuestion newSubsentence)
  {
		if (newSubsentence != subsentence) {
			NotificationChain msgs = null;
			if (subsentence != null)
				msgs = ((InternalEObject)subsentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE, null, msgs);
			if (newSubsentence != null)
				msgs = ((InternalEObject)newSubsentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE, null, msgs);
			msgs = basicSetSubsentence(newSubsentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE, newSubsentence, newSubsentence));
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
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE:
				return basicSetSubsentence(null, msgs);
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
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__NAME:
				return getName();
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__ANSWER:
				return getAnswer();
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE:
				return getSubsentence();
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
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__NAME:
				setName((String)newValue);
				return;
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__ANSWER:
				setAnswer((String)newValue);
				return;
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE:
				setSubsentence((InspectionResultQuestion)newValue);
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
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__ANSWER:
				setAnswer(ANSWER_EDEFAULT);
				return;
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE:
				setSubsentence((InspectionResultQuestion)null);
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
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__ANSWER:
				return ANSWER_EDEFAULT == null ? answer != null : !ANSWER_EDEFAULT.equals(answer);
			case SmaCQAPackage.HEALTH_INSPECTION_QUESTION__SUBSENTENCE:
				return subsentence != null;
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

} //HealthInspectionQuestionImpl
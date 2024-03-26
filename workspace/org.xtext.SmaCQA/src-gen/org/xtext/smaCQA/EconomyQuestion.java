/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Economy Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.EconomyQuestion#getMinimumAmountQuestion <em>Minimum Amount Question</em>}</li>
 *   <li>{@link org.xtext.smaCQA.EconomyQuestion#getShipmentCostResponsibility <em>Shipment Cost Responsibility</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getEconomyQuestion()
 * @model
 * @generated
 */
public interface EconomyQuestion extends EObject
{
  /**
	 * Returns the value of the '<em><b>Minimum Amount Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Amount Question</em>' containment reference.
	 * @see #setMinimumAmountQuestion(MinimumAmountQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getEconomyQuestion_MinimumAmountQuestion()
	 * @model containment="true"
	 * @generated
	 */
  MinimumAmountQuestion getMinimumAmountQuestion();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.EconomyQuestion#getMinimumAmountQuestion <em>Minimum Amount Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Amount Question</em>' containment reference.
	 * @see #getMinimumAmountQuestion()
	 * @generated
	 */
  void setMinimumAmountQuestion(MinimumAmountQuestion value);

  /**
	 * Returns the value of the '<em><b>Shipment Cost Responsibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Cost Responsibility</em>' containment reference.
	 * @see #setShipmentCostResponsibility(ShipmentCostResponsibilityQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getEconomyQuestion_ShipmentCostResponsibility()
	 * @model containment="true"
	 * @generated
	 */
  ShipmentCostResponsibilityQuestion getShipmentCostResponsibility();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.EconomyQuestion#getShipmentCostResponsibility <em>Shipment Cost Responsibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Cost Responsibility</em>' containment reference.
	 * @see #getShipmentCostResponsibility()
	 * @generated
	 */
  void setShipmentCostResponsibility(ShipmentCostResponsibilityQuestion value);

} // EconomyQuestion

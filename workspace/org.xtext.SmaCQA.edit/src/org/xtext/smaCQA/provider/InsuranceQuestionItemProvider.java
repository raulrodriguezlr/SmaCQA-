/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xtext.smaCQA.InsuranceQuestion;
import org.xtext.smaCQA.SmaCQAFactory;
import org.xtext.smaCQA.SmaCQAPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.smaCQA.InsuranceQuestion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InsuranceQuestionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceQuestionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SmaCQAPackage.Literals.INSURANCE_QUESTION__SHIPMENT_INSURANCE);
			childrenFeatures.add(SmaCQAPackage.Literals.INSURANCE_QUESTION__INSURANCE_DETAILS);
			childrenFeatures.add(SmaCQAPackage.Literals.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS);
			childrenFeatures.add(SmaCQAPackage.Literals.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns InsuranceQuestion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InsuranceQuestion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_InsuranceQuestion_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(InsuranceQuestion.class)) {
			case SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE:
			case SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS:
			case SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS:
			case SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SmaCQAPackage.Literals.INSURANCE_QUESTION__SHIPMENT_INSURANCE,
				 SmaCQAFactory.eINSTANCE.createShipmentInsuranceQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCQAPackage.Literals.INSURANCE_QUESTION__INSURANCE_DETAILS,
				 SmaCQAFactory.eINSTANCE.createInsuranceDetailsQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCQAPackage.Literals.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS,
				 SmaCQAFactory.eINSTANCE.createReturnsOrCancellationsQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCQAPackage.Literals.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT,
				 SmaCQAFactory.eINSTANCE.createPenaltyForNeglectQuestion()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SmaCQAEditPlugin.INSTANCE;
	}

}

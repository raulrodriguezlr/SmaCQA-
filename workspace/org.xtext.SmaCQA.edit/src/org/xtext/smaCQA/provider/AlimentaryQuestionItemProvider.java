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

import org.xtext.smaCQA.AlimentaryQuestion;
import org.xtext.smaCQA.SmaCQAFactory;
import org.xtext.smaCQA.SmaCQAPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.smaCQA.AlimentaryQuestion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AlimentaryQuestionItemProvider 
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
	public AlimentaryQuestionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__AGREED_PRICE);
			childrenFeatures.add(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__PRODUCT_QUALITY);
			childrenFeatures.add(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__INTERNATIONAL_SEAL);
			childrenFeatures.add(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__HEALTH_INSPECTION);
			childrenFeatures.add(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__STORAGE_CONDITIONS);
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
	 * This returns AlimentaryQuestion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AlimentaryQuestion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AlimentaryQuestion_type");
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

		switch (notification.getFeatureID(AlimentaryQuestion.class)) {
			case SmaCQAPackage.ALIMENTARY_QUESTION__AGREED_PRICE:
			case SmaCQAPackage.ALIMENTARY_QUESTION__PRODUCT_QUALITY:
			case SmaCQAPackage.ALIMENTARY_QUESTION__INTERNATIONAL_SEAL:
			case SmaCQAPackage.ALIMENTARY_QUESTION__HEALTH_INSPECTION:
			case SmaCQAPackage.ALIMENTARY_QUESTION__STORAGE_CONDITIONS:
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
				(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__AGREED_PRICE,
				 SmaCQAFactory.eINSTANCE.createAgreedPriceQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__PRODUCT_QUALITY,
				 SmaCQAFactory.eINSTANCE.createProductQualityQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__INTERNATIONAL_SEAL,
				 SmaCQAFactory.eINSTANCE.createInternationalSealQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__HEALTH_INSPECTION,
				 SmaCQAFactory.eINSTANCE.createHealthInspectionQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCQAPackage.Literals.ALIMENTARY_QUESTION__STORAGE_CONDITIONS,
				 SmaCQAFactory.eINSTANCE.createStorageConditionsQuestion()));
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

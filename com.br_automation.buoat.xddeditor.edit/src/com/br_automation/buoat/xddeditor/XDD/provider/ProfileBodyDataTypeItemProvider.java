/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileBodyDataTypeItemProvider 
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
	public ProfileBodyDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addFileCreationDatePropertyDescriptor(object);
			addFileCreationTimePropertyDescriptor(object);
			addFileCreatorPropertyDescriptor(object);
			addFileModificationDatePropertyDescriptor(object);
			addFileModificationTimePropertyDescriptor(object);
			addFileModifiedByPropertyDescriptor(object);
			addFileNamePropertyDescriptor(object);
			addFileVersionPropertyDescriptor(object);
			addFormatNamePropertyDescriptor(object);
			addFormatVersionPropertyDescriptor(object);
			addSupportedLanguagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_fileCreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_fileCreationDate_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FileCreationDate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Creation Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileCreationTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_fileCreationTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_fileCreationTime_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FileCreationTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Creator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileCreatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_fileCreator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_fileCreator_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FileCreator(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Modification Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileModificationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_fileModificationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_fileModificationDate_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FileModificationDate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Modification Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileModificationTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_fileModificationTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_fileModificationTime_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FileModificationTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Modified By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileModifiedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_fileModifiedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_fileModifiedBy_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FileModifiedBy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_fileName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_fileName_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FileName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_fileVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_fileVersion_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FileVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_formatName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_formatName_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FormatName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_formatVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_formatVersion_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_FormatVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Languages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedLanguagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyDataType_supportedLanguages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyDataType_supportedLanguages_feature", "_UI_ProfileBodyDataType_type"),
				 XDDPackage.eINSTANCE.getProfileBodyDataType_SupportedLanguages(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProfileBodyDataType)object).getFileName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProfileBodyDataType_type") :
			getString("_UI_ProfileBodyDataType_type") + " " + label;
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

		switch (notification.getFeatureID(ProfileBodyDataType.class)) {
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATOR:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_NAME:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_VERSION:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_NAME:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_VERSION:
			case XDDPackage.PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XDDEditPlugin.INSTANCE;
	}

}

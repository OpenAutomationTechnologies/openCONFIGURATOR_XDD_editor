/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Body Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFileCreationDate <em>File Creation Date</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFileCreationTime <em>File Creation Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFileCreator <em>File Creator</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFileModificationDate <em>File Modification Date</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFileModificationTime <em>File Modification Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFileModifiedBy <em>File Modified By</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFileVersion <em>File Version</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFormatName <em>Format Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getFormatVersion <em>Format Version</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl#getSupportedLanguages <em>Supported Languages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProfileBodyDataTypeImpl extends EObjectImpl implements ProfileBodyDataType {
	/**
	 * The default value of the '{@link #getFileCreationDate() <em>File Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FILE_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileCreationDate() <em>File Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fileCreationDate = FILE_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileCreationTime() <em>File Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FILE_CREATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileCreationTime() <em>File Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreationTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fileCreationTime = FILE_CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileCreator() <em>File Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileCreator() <em>File Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreator()
	 * @generated
	 * @ordered
	 */
	protected String fileCreator = FILE_CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileModificationDate() <em>File Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileModificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FILE_MODIFICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileModificationDate() <em>File Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileModificationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fileModificationDate = FILE_MODIFICATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileModificationTime() <em>File Modification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileModificationTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FILE_MODIFICATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileModificationTime() <em>File Modification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileModificationTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fileModificationTime = FILE_MODIFICATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileModifiedBy() <em>File Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_MODIFIED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileModifiedBy() <em>File Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected String fileModifiedBy = FILE_MODIFIED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileVersion() <em>File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileVersion() <em>File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileVersion()
	 * @generated
	 * @ordered
	 */
	protected String fileVersion = FILE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatName() <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_NAME_EDEFAULT = "DDXML";

	/**
	 * The cached value of the '{@link #getFormatName() <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected String formatName = FORMAT_NAME_EDEFAULT;

	/**
	 * This is true if the Format Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatNameESet;

	/**
	 * The default value of the '{@link #getFormatVersion() <em>Format Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_VERSION_EDEFAULT = "2.0";

	/**
	 * The cached value of the '{@link #getFormatVersion() <em>Format Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatVersion()
	 * @generated
	 * @ordered
	 */
	protected String formatVersion = FORMAT_VERSION_EDEFAULT;

	/**
	 * This is true if the Format Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatVersionESet;

	/**
	 * The default value of the '{@link #getSupportedLanguages() <em>Supported Languages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLanguages()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> SUPPORTED_LANGUAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportedLanguages() <em>Supported Languages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLanguages()
	 * @generated
	 * @ordered
	 */
	protected List<String> supportedLanguages = SUPPORTED_LANGUAGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileBodyDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getProfileBodyDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFileCreationDate() {
		return fileCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileCreationDate(XMLGregorianCalendar newFileCreationDate) {
		XMLGregorianCalendar oldFileCreationDate = fileCreationDate;
		fileCreationDate = newFileCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE, oldFileCreationDate, fileCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFileCreationTime() {
		return fileCreationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileCreationTime(XMLGregorianCalendar newFileCreationTime) {
		XMLGregorianCalendar oldFileCreationTime = fileCreationTime;
		fileCreationTime = newFileCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME, oldFileCreationTime, fileCreationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileCreator() {
		return fileCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileCreator(String newFileCreator) {
		String oldFileCreator = fileCreator;
		fileCreator = newFileCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATOR, oldFileCreator, fileCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFileModificationDate() {
		return fileModificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileModificationDate(XMLGregorianCalendar newFileModificationDate) {
		XMLGregorianCalendar oldFileModificationDate = fileModificationDate;
		fileModificationDate = newFileModificationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE, oldFileModificationDate, fileModificationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFileModificationTime() {
		return fileModificationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileModificationTime(XMLGregorianCalendar newFileModificationTime) {
		XMLGregorianCalendar oldFileModificationTime = fileModificationTime;
		fileModificationTime = newFileModificationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME, oldFileModificationTime, fileModificationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileModifiedBy() {
		return fileModifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileModifiedBy(String newFileModifiedBy) {
		String oldFileModifiedBy = fileModifiedBy;
		fileModifiedBy = newFileModifiedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY, oldFileModifiedBy, fileModifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileVersion() {
		return fileVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileVersion(String newFileVersion) {
		String oldFileVersion = fileVersion;
		fileVersion = newFileVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_VERSION, oldFileVersion, fileVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatName() {
		return formatName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatName(String newFormatName) {
		String oldFormatName = formatName;
		formatName = newFormatName;
		boolean oldFormatNameESet = formatNameESet;
		formatNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_NAME, oldFormatName, formatName, !oldFormatNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormatName() {
		String oldFormatName = formatName;
		boolean oldFormatNameESet = formatNameESet;
		formatName = FORMAT_NAME_EDEFAULT;
		formatNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_NAME, oldFormatName, FORMAT_NAME_EDEFAULT, oldFormatNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormatName() {
		return formatNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatVersion() {
		return formatVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatVersion(String newFormatVersion) {
		String oldFormatVersion = formatVersion;
		formatVersion = newFormatVersion;
		boolean oldFormatVersionESet = formatVersionESet;
		formatVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_VERSION, oldFormatVersion, formatVersion, !oldFormatVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormatVersion() {
		String oldFormatVersion = formatVersion;
		boolean oldFormatVersionESet = formatVersionESet;
		formatVersion = FORMAT_VERSION_EDEFAULT;
		formatVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_VERSION, oldFormatVersion, FORMAT_VERSION_EDEFAULT, oldFormatVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormatVersion() {
		return formatVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSupportedLanguages() {
		return supportedLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedLanguages(List<String> newSupportedLanguages) {
		List<String> oldSupportedLanguages = supportedLanguages;
		supportedLanguages = newSupportedLanguages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES, oldSupportedLanguages, supportedLanguages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE:
				return getFileCreationDate();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME:
				return getFileCreationTime();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATOR:
				return getFileCreator();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE:
				return getFileModificationDate();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME:
				return getFileModificationTime();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY:
				return getFileModifiedBy();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_NAME:
				return getFileName();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_VERSION:
				return getFileVersion();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_NAME:
				return getFormatName();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_VERSION:
				return getFormatVersion();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES:
				return getSupportedLanguages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE:
				setFileCreationDate((XMLGregorianCalendar)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME:
				setFileCreationTime((XMLGregorianCalendar)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATOR:
				setFileCreator((String)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE:
				setFileModificationDate((XMLGregorianCalendar)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME:
				setFileModificationTime((XMLGregorianCalendar)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY:
				setFileModifiedBy((String)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_VERSION:
				setFileVersion((String)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_NAME:
				setFormatName((String)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_VERSION:
				setFormatVersion((String)newValue);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES:
				setSupportedLanguages((List<String>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE:
				setFileCreationDate(FILE_CREATION_DATE_EDEFAULT);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME:
				setFileCreationTime(FILE_CREATION_TIME_EDEFAULT);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATOR:
				setFileCreator(FILE_CREATOR_EDEFAULT);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE:
				setFileModificationDate(FILE_MODIFICATION_DATE_EDEFAULT);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME:
				setFileModificationTime(FILE_MODIFICATION_TIME_EDEFAULT);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY:
				setFileModifiedBy(FILE_MODIFIED_BY_EDEFAULT);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_VERSION:
				setFileVersion(FILE_VERSION_EDEFAULT);
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_NAME:
				unsetFormatName();
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_VERSION:
				unsetFormatVersion();
				return;
			case XDDPackage.PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES:
				setSupportedLanguages(SUPPORTED_LANGUAGES_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE:
				return FILE_CREATION_DATE_EDEFAULT == null ? fileCreationDate != null : !FILE_CREATION_DATE_EDEFAULT.equals(fileCreationDate);
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME:
				return FILE_CREATION_TIME_EDEFAULT == null ? fileCreationTime != null : !FILE_CREATION_TIME_EDEFAULT.equals(fileCreationTime);
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_CREATOR:
				return FILE_CREATOR_EDEFAULT == null ? fileCreator != null : !FILE_CREATOR_EDEFAULT.equals(fileCreator);
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE:
				return FILE_MODIFICATION_DATE_EDEFAULT == null ? fileModificationDate != null : !FILE_MODIFICATION_DATE_EDEFAULT.equals(fileModificationDate);
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME:
				return FILE_MODIFICATION_TIME_EDEFAULT == null ? fileModificationTime != null : !FILE_MODIFICATION_TIME_EDEFAULT.equals(fileModificationTime);
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY:
				return FILE_MODIFIED_BY_EDEFAULT == null ? fileModifiedBy != null : !FILE_MODIFIED_BY_EDEFAULT.equals(fileModifiedBy);
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FILE_VERSION:
				return FILE_VERSION_EDEFAULT == null ? fileVersion != null : !FILE_VERSION_EDEFAULT.equals(fileVersion);
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_NAME:
				return isSetFormatName();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__FORMAT_VERSION:
				return isSetFormatVersion();
			case XDDPackage.PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES:
				return SUPPORTED_LANGUAGES_EDEFAULT == null ? supportedLanguages != null : !SUPPORTED_LANGUAGES_EDEFAULT.equals(supportedLanguages);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileCreationDate: ");
		result.append(fileCreationDate);
		result.append(", fileCreationTime: ");
		result.append(fileCreationTime);
		result.append(", fileCreator: ");
		result.append(fileCreator);
		result.append(", fileModificationDate: ");
		result.append(fileModificationDate);
		result.append(", fileModificationTime: ");
		result.append(fileModificationTime);
		result.append(", fileModifiedBy: ");
		result.append(fileModifiedBy);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", fileVersion: ");
		result.append(fileVersion);
		result.append(", formatName: ");
		if (formatNameESet) result.append(formatName); else result.append("<unset>");
		result.append(", formatVersion: ");
		if (formatVersionESet) result.append(formatVersion); else result.append("<unset>");
		result.append(", supportedLanguages: ");
		result.append(supportedLanguages);
		result.append(')');
		return result.toString();
	}

} //ProfileBodyDataTypeImpl

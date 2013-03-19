/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.DictionaryType;
import com.br_automation.buoat.xddeditor.XDD.FileType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dictionary Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.DictionaryTypeImpl#getFile
 * <em>File</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.DictionaryTypeImpl#getDictID
 * <em>Dict ID</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.DictionaryTypeImpl#getLang
 * <em>Lang</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DictionaryTypeImpl extends EObjectImpl implements DictionaryType {
    /**
     * The cached value of the '{@link #getFile() <em>File</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected FileType file;

    /**
     * The default value of the '{@link #getDictID() <em>Dict ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDictID()
     * @generated
     * @ordered
     */
    protected static final String DICT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDictID() <em>Dict ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDictID()
     * @generated
     * @ordered
     */
    protected String dictID = DICT_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected static final String LANG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected String lang = LANG_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DictionaryTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getDictionaryType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FileType getFile() {
        return file;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
        FileType oldFile = file;
        file = newFile;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.DICTIONARY_TYPE__FILE, oldFile, newFile);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setFile(FileType newFile) {
        if (newFile != file) {
            NotificationChain msgs = null;
            if (file != null)
                msgs = ((InternalEObject) file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.DICTIONARY_TYPE__FILE, null, msgs);
            if (newFile != null)
                msgs = ((InternalEObject) newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.DICTIONARY_TYPE__FILE, null, msgs);
            msgs = basicSetFile(newFile, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.DICTIONARY_TYPE__FILE,
                newFile, newFile));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getDictID() {
        return dictID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDictID(String newDictID) {
        String oldDictID = dictID;
        dictID = newDictID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.DICTIONARY_TYPE__DICT_ID, oldDictID, dictID));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getLang() {
        return lang;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLang(String newLang) {
        String oldLang = lang;
        lang = newLang;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.DICTIONARY_TYPE__LANG,
                oldLang, lang));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID,
        NotificationChain msgs) {
        switch (featureID) {
            case XDDPackage.DICTIONARY_TYPE__FILE:
                return basicSetFile(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.DICTIONARY_TYPE__FILE:
                return getFile();
            case XDDPackage.DICTIONARY_TYPE__DICT_ID:
                return getDictID();
            case XDDPackage.DICTIONARY_TYPE__LANG:
                return getLang();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.DICTIONARY_TYPE__FILE:
                setFile((FileType) newValue);
                return;
            case XDDPackage.DICTIONARY_TYPE__DICT_ID:
                setDictID((String) newValue);
                return;
            case XDDPackage.DICTIONARY_TYPE__LANG:
                setLang((String) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XDDPackage.DICTIONARY_TYPE__FILE:
                setFile((FileType) null);
                return;
            case XDDPackage.DICTIONARY_TYPE__DICT_ID:
                setDictID(DICT_ID_EDEFAULT);
                return;
            case XDDPackage.DICTIONARY_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XDDPackage.DICTIONARY_TYPE__FILE:
                return file != null;
            case XDDPackage.DICTIONARY_TYPE__DICT_ID:
                return DICT_ID_EDEFAULT == null ? dictID != null : !DICT_ID_EDEFAULT.equals(dictID);
            case XDDPackage.DICTIONARY_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (dictID: ");
        result.append(dictID);
        result.append(", lang: ");
        result.append(lang);
        result.append(')');
        return result.toString();
    }

} //DictionaryTypeImpl

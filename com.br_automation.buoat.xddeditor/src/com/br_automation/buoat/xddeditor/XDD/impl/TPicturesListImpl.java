/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.PictureType;
import com.br_automation.buoat.xddeditor.XDD.TPicturesList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TPictures List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TPicturesListImpl#getPicture
 * <em>Picture</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TPicturesListImpl extends EObjectImpl implements TPicturesList {
    /**
     * The cached value of the '{@link #getPicture() <em>Picture</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPicture()
     * @generated
     * @ordered
     */
    protected EList<PictureType> picture;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TPicturesListImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTPicturesList();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<PictureType> getPicture() {
        if (picture == null) {
            picture = new EObjectContainmentEList<PictureType>(PictureType.class, this,
                XDDPackage.TPICTURES_LIST__PICTURE);
        }
        return picture;
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
            case XDDPackage.TPICTURES_LIST__PICTURE:
                return ((InternalEList<?>) getPicture()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.TPICTURES_LIST__PICTURE:
                return getPicture();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.TPICTURES_LIST__PICTURE:
                getPicture().clear();
                getPicture().addAll((Collection<? extends PictureType>) newValue);
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
            case XDDPackage.TPICTURES_LIST__PICTURE:
                getPicture().clear();
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
            case XDDPackage.TPICTURES_LIST__PICTURE:
                return picture != null && !picture.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TPicturesListImpl

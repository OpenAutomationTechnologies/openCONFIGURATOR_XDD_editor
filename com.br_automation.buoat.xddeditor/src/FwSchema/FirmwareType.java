/**
 */
package FwSchema;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firmware Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FwSchema.FirmwareType#getApplSwDate <em>Appl Sw Date</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getApplSwTime <em>Appl Sw Time</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getBootOffsHi <em>Boot Offs Hi</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getChk <em>Chk</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getDate <em>Date</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getDev <em>Dev</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getFct <em>Fct</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getKeepXmlHeader <em>Keep Xml Header</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getLen <em>Len</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getMat <em>Mat</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getRem <em>Rem</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getUse <em>Use</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getVar <em>Var</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getVen <em>Ven</em>}</li>
 *   <li>{@link FwSchema.FirmwareType#getVer <em>Ver</em>}</li>
 * </ul>
 *
 * @see FwSchema.FwSchemaPackage#getFirmwareType()
 * @model extendedMetaData="name='Firmware_._type' kind='empty'"
 * @generated
 */
public interface FirmwareType extends EObject {
    /**
     * Returns the value of the '<em><b>Appl Sw Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the application software date as defined in EPSG DS301.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Appl Sw Date</em>' attribute.
     * @see #isSetApplSwDate()
     * @see #unsetApplSwDate()
     * @see #setApplSwDate(long)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_ApplSwDate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
     *        extendedMetaData="kind='attribute' name='ApplSwDate' namespace='##targetNamespace'"
     * @generated
     */
    long getApplSwDate();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getApplSwDate <em>Appl Sw Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Appl Sw Date</em>' attribute.
     * @see #isSetApplSwDate()
     * @see #unsetApplSwDate()
     * @see #getApplSwDate()
     * @generated
     */
    void setApplSwDate(long value);

    /**
     * Unsets the value of the '{@link FwSchema.FirmwareType#getApplSwDate <em>Appl Sw Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApplSwDate()
     * @see #getApplSwDate()
     * @see #setApplSwDate(long)
     * @generated
     */
    void unsetApplSwDate();

    /**
     * Returns whether the value of the '{@link FwSchema.FirmwareType#getApplSwDate <em>Appl Sw Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Appl Sw Date</em>' attribute is set.
     * @see #unsetApplSwDate()
     * @see #getApplSwDate()
     * @see #setApplSwDate(long)
     * @generated
     */
    boolean isSetApplSwDate();

    /**
     * Returns the value of the '<em><b>Appl Sw Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the application software time as defined in EPSG DS301.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Appl Sw Time</em>' attribute.
     * @see #isSetApplSwTime()
     * @see #unsetApplSwTime()
     * @see #setApplSwTime(long)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_ApplSwTime()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
     *        extendedMetaData="kind='attribute' name='ApplSwTime' namespace='##targetNamespace'"
     * @generated
     */
    long getApplSwTime();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getApplSwTime <em>Appl Sw Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Appl Sw Time</em>' attribute.
     * @see #isSetApplSwTime()
     * @see #unsetApplSwTime()
     * @see #getApplSwTime()
     * @generated
     */
    void setApplSwTime(long value);

    /**
     * Unsets the value of the '{@link FwSchema.FirmwareType#getApplSwTime <em>Appl Sw Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApplSwTime()
     * @see #getApplSwTime()
     * @see #setApplSwTime(long)
     * @generated
     */
    void unsetApplSwTime();

    /**
     * Returns whether the value of the '{@link FwSchema.FirmwareType#getApplSwTime <em>Appl Sw Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Appl Sw Time</em>' attribute is set.
     * @see #unsetApplSwTime()
     * @see #getApplSwTime()
     * @see #setApplSwTime(long)
     * @generated
     */
    boolean isSetApplSwTime();

    /**
     * Returns the value of the '<em><b>Boot Offs Hi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the offset where the boot image starts.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Boot Offs Hi</em>' attribute.
     * @see #setBootOffsHi(String)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_BootOffsHi()
     * @model dataType="FwSchema.BootOffsHiType"
     *        extendedMetaData="kind='attribute' name='BootOffsHi' namespace='##targetNamespace'"
     * @generated
     */
    String getBootOffsHi();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getBootOffsHi <em>Boot Offs Hi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Boot Offs Hi</em>' attribute.
     * @see #getBootOffsHi()
     * @generated
     */
    void setBootOffsHi(String value);

    /**
     * Returns the value of the '<em><b>Chk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the checksum of the payload data.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Chk</em>' attribute.
     * @see #setChk(String)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Chk()
     * @model dataType="FwSchema.ChkType"
     *        extendedMetaData="kind='attribute' name='Chk' namespace='##targetNamespace'"
     * @generated
     */
    String getChk();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getChk <em>Chk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chk</em>' attribute.
     * @see #getChk()
     * @generated
     */
    void setChk(String value);

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the file creation date.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(String)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Date()
     * @model dataType="FwSchema.DateType"
     *        extendedMetaData="kind='attribute' name='Date' namespace='##targetNamespace'"
     * @generated
     */
    String getDate();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(String value);

    /**
     * Returns the value of the '<em><b>Dev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the product code. The same value as in the IdentResponse frame.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dev</em>' attribute.
     * @see #isSetDev()
     * @see #unsetDev()
     * @see #setDev(long)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Dev()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
     *        extendedMetaData="kind='attribute' name='Dev' namespace='##targetNamespace'"
     * @generated
     */
    long getDev();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getDev <em>Dev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dev</em>' attribute.
     * @see #isSetDev()
     * @see #unsetDev()
     * @see #getDev()
     * @generated
     */
    void setDev(long value);

    /**
     * Unsets the value of the '{@link FwSchema.FirmwareType#getDev <em>Dev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDev()
     * @see #getDev()
     * @see #setDev(long)
     * @generated
     */
    void unsetDev();

    /**
     * Returns whether the value of the '{@link FwSchema.FirmwareType#getDev <em>Dev</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dev</em>' attribute is set.
     * @see #unsetDev()
     * @see #getDev()
     * @see #setDev(long)
     * @generated
     */
    boolean isSetDev();

    /**
     * Returns the value of the '<em><b>Fct</b></em>' attribute.
     * The default value is <code>"_"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fct</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fct</em>' attribute.
     * @see #isSetFct()
     * @see #unsetFct()
     * @see #setFct(String)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Fct()
     * @model default="_" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='Fct' namespace='##targetNamespace'"
     * @generated
     */
    String getFct();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getFct <em>Fct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fct</em>' attribute.
     * @see #isSetFct()
     * @see #unsetFct()
     * @see #getFct()
     * @generated
     */
    void setFct(String value);

    /**
     * Unsets the value of the '{@link FwSchema.FirmwareType#getFct <em>Fct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFct()
     * @see #getFct()
     * @see #setFct(String)
     * @generated
     */
    void unsetFct();

    /**
     * Returns whether the value of the '{@link FwSchema.FirmwareType#getFct <em>Fct</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fct</em>' attribute is set.
     * @see #unsetFct()
     * @see #getFct()
     * @see #setFct(String)
     * @generated
     */
    boolean isSetFct();

    /**
     * Returns the value of the '<em><b>Keep Xml Header</b></em>' attribute.
     * The literals are from the enumeration {@link FwSchema.KeepXmlHeaderType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true (1), the firmware download includes this XML header.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Keep Xml Header</em>' attribute.
     * @see FwSchema.KeepXmlHeaderType
     * @see #isSetKeepXmlHeader()
     * @see #unsetKeepXmlHeader()
     * @see #setKeepXmlHeader(KeepXmlHeaderType)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_KeepXmlHeader()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='KeepXmlHeader' namespace='##targetNamespace'"
     * @generated
     */
    KeepXmlHeaderType getKeepXmlHeader();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getKeepXmlHeader <em>Keep Xml Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keep Xml Header</em>' attribute.
     * @see FwSchema.KeepXmlHeaderType
     * @see #isSetKeepXmlHeader()
     * @see #unsetKeepXmlHeader()
     * @see #getKeepXmlHeader()
     * @generated
     */
    void setKeepXmlHeader(KeepXmlHeaderType value);

    /**
     * Unsets the value of the '{@link FwSchema.FirmwareType#getKeepXmlHeader <em>Keep Xml Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKeepXmlHeader()
     * @see #getKeepXmlHeader()
     * @see #setKeepXmlHeader(KeepXmlHeaderType)
     * @generated
     */
    void unsetKeepXmlHeader();

    /**
     * Returns whether the value of the '{@link FwSchema.FirmwareType#getKeepXmlHeader <em>Keep Xml Header</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Keep Xml Header</em>' attribute is set.
     * @see #unsetKeepXmlHeader()
     * @see #getKeepXmlHeader()
     * @see #setKeepXmlHeader(KeepXmlHeaderType)
     * @generated
     */
    boolean isSetKeepXmlHeader();

    /**
     * Returns the value of the '<em><b>Len</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the length of the payload data.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Len</em>' attribute.
     * @see #setLen(BigInteger)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Len()
     * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
     *        extendedMetaData="kind='attribute' name='Len' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getLen();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getLen <em>Len</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Len</em>' attribute.
     * @see #getLen()
     * @generated
     */
    void setLen(BigInteger value);

    /**
     * Returns the value of the '<em><b>Mat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines order reference in ASCII text. Maximum 18 characters.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mat</em>' attribute.
     * @see #setMat(String)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Mat()
     * @model dataType="FwSchema.MatType"
     *        extendedMetaData="kind='attribute' name='Mat' namespace='##targetNamespace'"
     * @generated
     */
    String getMat();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getMat <em>Mat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mat</em>' attribute.
     * @see #getMat()
     * @generated
     */
    void setMat(String value);

    /**
     * Returns the value of the '<em><b>Rem</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines remarks.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rem</em>' attribute.
     * @see #setRem(String)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Rem()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='Rem' namespace='##targetNamespace'"
     * @generated
     */
    String getRem();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getRem <em>Rem</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rem</em>' attribute.
     * @see #getRem()
     * @generated
     */
    void setRem(String value);

    /**
     * Returns the value of the '<em><b>Use</b></em>' attribute.
     * The default value is <code>"fw"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use</em>' attribute.
     * @see #isSetUse()
     * @see #unsetUse()
     * @see #setUse(Object)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Use()
     * @model default="fw" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='Use' namespace='##targetNamespace'"
     * @generated
     */
    Object getUse();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getUse <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use</em>' attribute.
     * @see #isSetUse()
     * @see #unsetUse()
     * @see #getUse()
     * @generated
     */
    void setUse(Object value);

    /**
     * Unsets the value of the '{@link FwSchema.FirmwareType#getUse <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUse()
     * @see #getUse()
     * @see #setUse(Object)
     * @generated
     */
    void unsetUse();

    /**
     * Returns whether the value of the '{@link FwSchema.FirmwareType#getUse <em>Use</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use</em>' attribute is set.
     * @see #unsetUse()
     * @see #getUse()
     * @see #setUse(Object)
     * @generated
     */
    boolean isSetUse();

    /**
     * Returns the value of the '<em><b>Var</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the firmware revision number. The same value as present in the IdentResponse frame.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Var</em>' attribute.
     * @see #isSetVar()
     * @see #unsetVar()
     * @see #setVar(long)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Var()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
     *        extendedMetaData="kind='attribute' name='Var' namespace='##targetNamespace'"
     * @generated
     */
    long getVar();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getVar <em>Var</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Var</em>' attribute.
     * @see #isSetVar()
     * @see #unsetVar()
     * @see #getVar()
     * @generated
     */
    void setVar(long value);

    /**
     * Unsets the value of the '{@link FwSchema.FirmwareType#getVar <em>Var</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVar()
     * @see #getVar()
     * @see #setVar(long)
     * @generated
     */
    void unsetVar();

    /**
     * Returns whether the value of the '{@link FwSchema.FirmwareType#getVar <em>Var</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Var</em>' attribute is set.
     * @see #unsetVar()
     * @see #getVar()
     * @see #setVar(long)
     * @generated
     */
    boolean isSetVar();

    /**
     * Returns the value of the '<em><b>Ven</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the vendor ID.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ven</em>' attribute.
     * @see #setVen(String)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Ven()
     * @model dataType="FwSchema.VenType"
     *        extendedMetaData="kind='attribute' name='Ven' namespace='##targetNamespace'"
     * @generated
     */
    String getVen();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getVen <em>Ven</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ven</em>' attribute.
     * @see #getVen()
     * @generated
     */
    void setVen(String value);

    /**
     * Returns the value of the '<em><b>Ver</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the firmware version number.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ver</em>' attribute.
     * @see #setVer(BigInteger)
     * @see FwSchema.FwSchemaPackage#getFirmwareType_Ver()
     * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
     *        extendedMetaData="kind='attribute' name='Ver' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getVer();

    /**
     * Sets the value of the '{@link FwSchema.FirmwareType#getVer <em>Ver</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ver</em>' attribute.
     * @see #getVer()
     * @generated
     */
    void setVer(BigInteger value);

} // FirmwareType

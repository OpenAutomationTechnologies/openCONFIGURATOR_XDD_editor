/**
 */
package FwSchema.impl;

import FwSchema.FirmwareType;
import FwSchema.FwSchemaPackage;
import FwSchema.KeepXmlHeaderType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firmware Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getApplSwDate <em>Appl Sw Date</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getApplSwTime <em>Appl Sw Time</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getBootOffsHi <em>Boot Offs Hi</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getChk <em>Chk</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getDev <em>Dev</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getFct <em>Fct</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getKeepXmlHeader <em>Keep Xml Header</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getLen <em>Len</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getMat <em>Mat</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getRem <em>Rem</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getUse <em>Use</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getVen <em>Ven</em>}</li>
 *   <li>{@link FwSchema.impl.FirmwareTypeImpl#getVer <em>Ver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirmwareTypeImpl extends MinimalEObjectImpl.Container implements FirmwareType {
    /**
     * The default value of the '{@link #getApplSwDate() <em>Appl Sw Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplSwDate()
     * @generated
     * @ordered
     */
    protected static final long APPL_SW_DATE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getApplSwDate() <em>Appl Sw Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplSwDate()
     * @generated
     * @ordered
     */
    protected long applSwDate = APPL_SW_DATE_EDEFAULT;

    /**
     * This is true if the Appl Sw Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean applSwDateESet;

    /**
     * The default value of the '{@link #getApplSwTime() <em>Appl Sw Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplSwTime()
     * @generated
     * @ordered
     */
    protected static final long APPL_SW_TIME_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getApplSwTime() <em>Appl Sw Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplSwTime()
     * @generated
     * @ordered
     */
    protected long applSwTime = APPL_SW_TIME_EDEFAULT;

    /**
     * This is true if the Appl Sw Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean applSwTimeESet;

    /**
     * The default value of the '{@link #getBootOffsHi() <em>Boot Offs Hi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBootOffsHi()
     * @generated
     * @ordered
     */
    protected static final String BOOT_OFFS_HI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBootOffsHi() <em>Boot Offs Hi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBootOffsHi()
     * @generated
     * @ordered
     */
    protected String bootOffsHi = BOOT_OFFS_HI_EDEFAULT;

    /**
     * The default value of the '{@link #getChk() <em>Chk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChk()
     * @generated
     * @ordered
     */
    protected static final String CHK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChk() <em>Chk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChk()
     * @generated
     * @ordered
     */
    protected String chk = CHK_EDEFAULT;

    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final String DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected String date = DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getDev() <em>Dev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDev()
     * @generated
     * @ordered
     */
    protected static final long DEV_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getDev() <em>Dev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDev()
     * @generated
     * @ordered
     */
    protected long dev = DEV_EDEFAULT;

    /**
     * This is true if the Dev attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean devESet;

    /**
     * The default value of the '{@link #getFct() <em>Fct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFct()
     * @generated
     * @ordered
     */
    protected static final String FCT_EDEFAULT = "_";

    /**
     * The cached value of the '{@link #getFct() <em>Fct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFct()
     * @generated
     * @ordered
     */
    protected String fct = FCT_EDEFAULT;

    /**
     * This is true if the Fct attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fctESet;

    /**
     * The default value of the '{@link #getKeepXmlHeader() <em>Keep Xml Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeepXmlHeader()
     * @generated
     * @ordered
     */
    protected static final KeepXmlHeaderType KEEP_XML_HEADER_EDEFAULT = KeepXmlHeaderType._0;

    /**
     * The cached value of the '{@link #getKeepXmlHeader() <em>Keep Xml Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeepXmlHeader()
     * @generated
     * @ordered
     */
    protected KeepXmlHeaderType keepXmlHeader = KEEP_XML_HEADER_EDEFAULT;

    /**
     * This is true if the Keep Xml Header attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keepXmlHeaderESet;

    /**
     * The default value of the '{@link #getLen() <em>Len</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLen()
     * @generated
     * @ordered
     */
    protected static final BigInteger LEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLen() <em>Len</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLen()
     * @generated
     * @ordered
     */
    protected BigInteger len = LEN_EDEFAULT;

    /**
     * The default value of the '{@link #getMat() <em>Mat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMat()
     * @generated
     * @ordered
     */
    protected static final String MAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMat() <em>Mat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMat()
     * @generated
     * @ordered
     */
    protected String mat = MAT_EDEFAULT;

    /**
     * The default value of the '{@link #getRem() <em>Rem</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRem()
     * @generated
     * @ordered
     */
    protected static final String REM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRem() <em>Rem</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRem()
     * @generated
     * @ordered
     */
    protected String rem = REM_EDEFAULT;

    /**
     * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUse()
     * @generated
     * @ordered
     */
    protected static final Object USE_EDEFAULT = "fw";

    /**
     * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUse()
     * @generated
     * @ordered
     */
    protected Object use = USE_EDEFAULT;

    /**
     * This is true if the Use attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useESet;

    /**
     * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVar()
     * @generated
     * @ordered
     */
    protected static final long VAR_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVar()
     * @generated
     * @ordered
     */
    protected long var = VAR_EDEFAULT;

    /**
     * This is true if the Var attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean varESet;

    /**
     * The default value of the '{@link #getVen() <em>Ven</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVen()
     * @generated
     * @ordered
     */
    protected static final String VEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVen() <em>Ven</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVen()
     * @generated
     * @ordered
     */
    protected String ven = VEN_EDEFAULT;

    /**
     * The default value of the '{@link #getVer() <em>Ver</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVer()
     * @generated
     * @ordered
     */
    protected static final BigInteger VER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVer() <em>Ver</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVer()
     * @generated
     * @ordered
     */
    protected BigInteger ver = VER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FirmwareTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FwSchemaPackage.Literals.FIRMWARE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getApplSwDate() {
        return applSwDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplSwDate(long newApplSwDate) {
        long oldApplSwDate = applSwDate;
        applSwDate = newApplSwDate;
        boolean oldApplSwDateESet = applSwDateESet;
        applSwDateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_DATE, oldApplSwDate, applSwDate, !oldApplSwDateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetApplSwDate() {
        long oldApplSwDate = applSwDate;
        boolean oldApplSwDateESet = applSwDateESet;
        applSwDate = APPL_SW_DATE_EDEFAULT;
        applSwDateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_DATE, oldApplSwDate, APPL_SW_DATE_EDEFAULT, oldApplSwDateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetApplSwDate() {
        return applSwDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getApplSwTime() {
        return applSwTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplSwTime(long newApplSwTime) {
        long oldApplSwTime = applSwTime;
        applSwTime = newApplSwTime;
        boolean oldApplSwTimeESet = applSwTimeESet;
        applSwTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_TIME, oldApplSwTime, applSwTime, !oldApplSwTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetApplSwTime() {
        long oldApplSwTime = applSwTime;
        boolean oldApplSwTimeESet = applSwTimeESet;
        applSwTime = APPL_SW_TIME_EDEFAULT;
        applSwTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_TIME, oldApplSwTime, APPL_SW_TIME_EDEFAULT, oldApplSwTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetApplSwTime() {
        return applSwTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBootOffsHi() {
        return bootOffsHi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBootOffsHi(String newBootOffsHi) {
        String oldBootOffsHi = bootOffsHi;
        bootOffsHi = newBootOffsHi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__BOOT_OFFS_HI, oldBootOffsHi, bootOffsHi));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getChk() {
        return chk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChk(String newChk) {
        String oldChk = chk;
        chk = newChk;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__CHK, oldChk, chk));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDate(String newDate) {
        String oldDate = date;
        date = newDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__DATE, oldDate, date));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getDev() {
        return dev;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDev(long newDev) {
        long oldDev = dev;
        dev = newDev;
        boolean oldDevESet = devESet;
        devESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__DEV, oldDev, dev, !oldDevESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDev() {
        long oldDev = dev;
        boolean oldDevESet = devESet;
        dev = DEV_EDEFAULT;
        devESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FwSchemaPackage.FIRMWARE_TYPE__DEV, oldDev, DEV_EDEFAULT, oldDevESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDev() {
        return devESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFct() {
        return fct;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFct(String newFct) {
        String oldFct = fct;
        fct = newFct;
        boolean oldFctESet = fctESet;
        fctESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__FCT, oldFct, fct, !oldFctESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFct() {
        String oldFct = fct;
        boolean oldFctESet = fctESet;
        fct = FCT_EDEFAULT;
        fctESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FwSchemaPackage.FIRMWARE_TYPE__FCT, oldFct, FCT_EDEFAULT, oldFctESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFct() {
        return fctESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KeepXmlHeaderType getKeepXmlHeader() {
        return keepXmlHeader;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeepXmlHeader(KeepXmlHeaderType newKeepXmlHeader) {
        KeepXmlHeaderType oldKeepXmlHeader = keepXmlHeader;
        keepXmlHeader = newKeepXmlHeader == null ? KEEP_XML_HEADER_EDEFAULT : newKeepXmlHeader;
        boolean oldKeepXmlHeaderESet = keepXmlHeaderESet;
        keepXmlHeaderESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__KEEP_XML_HEADER, oldKeepXmlHeader, keepXmlHeader, !oldKeepXmlHeaderESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetKeepXmlHeader() {
        KeepXmlHeaderType oldKeepXmlHeader = keepXmlHeader;
        boolean oldKeepXmlHeaderESet = keepXmlHeaderESet;
        keepXmlHeader = KEEP_XML_HEADER_EDEFAULT;
        keepXmlHeaderESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FwSchemaPackage.FIRMWARE_TYPE__KEEP_XML_HEADER, oldKeepXmlHeader, KEEP_XML_HEADER_EDEFAULT, oldKeepXmlHeaderESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetKeepXmlHeader() {
        return keepXmlHeaderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getLen() {
        return len;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLen(BigInteger newLen) {
        BigInteger oldLen = len;
        len = newLen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__LEN, oldLen, len));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMat() {
        return mat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMat(String newMat) {
        String oldMat = mat;
        mat = newMat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__MAT, oldMat, mat));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRem() {
        return rem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRem(String newRem) {
        String oldRem = rem;
        rem = newRem;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__REM, oldRem, rem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUse() {
        return use;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUse(Object newUse) {
        Object oldUse = use;
        use = newUse;
        boolean oldUseESet = useESet;
        useESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__USE, oldUse, use, !oldUseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUse() {
        Object oldUse = use;
        boolean oldUseESet = useESet;
        use = USE_EDEFAULT;
        useESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FwSchemaPackage.FIRMWARE_TYPE__USE, oldUse, USE_EDEFAULT, oldUseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUse() {
        return useESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getVar() {
        return var;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVar(long newVar) {
        long oldVar = var;
        var = newVar;
        boolean oldVarESet = varESet;
        varESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__VAR, oldVar, var, !oldVarESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVar() {
        long oldVar = var;
        boolean oldVarESet = varESet;
        var = VAR_EDEFAULT;
        varESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FwSchemaPackage.FIRMWARE_TYPE__VAR, oldVar, VAR_EDEFAULT, oldVarESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVar() {
        return varESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVen() {
        return ven;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVen(String newVen) {
        String oldVen = ven;
        ven = newVen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__VEN, oldVen, ven));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getVer() {
        return ver;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVer(BigInteger newVer) {
        BigInteger oldVer = ver;
        ver = newVer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FwSchemaPackage.FIRMWARE_TYPE__VER, oldVer, ver));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_DATE:
                return getApplSwDate();
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_TIME:
                return getApplSwTime();
            case FwSchemaPackage.FIRMWARE_TYPE__BOOT_OFFS_HI:
                return getBootOffsHi();
            case FwSchemaPackage.FIRMWARE_TYPE__CHK:
                return getChk();
            case FwSchemaPackage.FIRMWARE_TYPE__DATE:
                return getDate();
            case FwSchemaPackage.FIRMWARE_TYPE__DEV:
                return getDev();
            case FwSchemaPackage.FIRMWARE_TYPE__FCT:
                return getFct();
            case FwSchemaPackage.FIRMWARE_TYPE__KEEP_XML_HEADER:
                return getKeepXmlHeader();
            case FwSchemaPackage.FIRMWARE_TYPE__LEN:
                return getLen();
            case FwSchemaPackage.FIRMWARE_TYPE__MAT:
                return getMat();
            case FwSchemaPackage.FIRMWARE_TYPE__REM:
                return getRem();
            case FwSchemaPackage.FIRMWARE_TYPE__USE:
                return getUse();
            case FwSchemaPackage.FIRMWARE_TYPE__VAR:
                return getVar();
            case FwSchemaPackage.FIRMWARE_TYPE__VEN:
                return getVen();
            case FwSchemaPackage.FIRMWARE_TYPE__VER:
                return getVer();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_DATE:
                setApplSwDate((Long)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_TIME:
                setApplSwTime((Long)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__BOOT_OFFS_HI:
                setBootOffsHi((String)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__CHK:
                setChk((String)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__DATE:
                setDate((String)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__DEV:
                setDev((Long)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__FCT:
                setFct((String)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__KEEP_XML_HEADER:
                setKeepXmlHeader((KeepXmlHeaderType)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__LEN:
                setLen((BigInteger)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__MAT:
                setMat((String)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__REM:
                setRem((String)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__USE:
                setUse(newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__VAR:
                setVar((Long)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__VEN:
                setVen((String)newValue);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__VER:
                setVer((BigInteger)newValue);
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
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_DATE:
                unsetApplSwDate();
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_TIME:
                unsetApplSwTime();
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__BOOT_OFFS_HI:
                setBootOffsHi(BOOT_OFFS_HI_EDEFAULT);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__CHK:
                setChk(CHK_EDEFAULT);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__DEV:
                unsetDev();
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__FCT:
                unsetFct();
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__KEEP_XML_HEADER:
                unsetKeepXmlHeader();
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__LEN:
                setLen(LEN_EDEFAULT);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__MAT:
                setMat(MAT_EDEFAULT);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__REM:
                setRem(REM_EDEFAULT);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__USE:
                unsetUse();
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__VAR:
                unsetVar();
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__VEN:
                setVen(VEN_EDEFAULT);
                return;
            case FwSchemaPackage.FIRMWARE_TYPE__VER:
                setVer(VER_EDEFAULT);
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
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_DATE:
                return isSetApplSwDate();
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_TIME:
                return isSetApplSwTime();
            case FwSchemaPackage.FIRMWARE_TYPE__BOOT_OFFS_HI:
                return BOOT_OFFS_HI_EDEFAULT == null ? bootOffsHi != null : !BOOT_OFFS_HI_EDEFAULT.equals(bootOffsHi);
            case FwSchemaPackage.FIRMWARE_TYPE__CHK:
                return CHK_EDEFAULT == null ? chk != null : !CHK_EDEFAULT.equals(chk);
            case FwSchemaPackage.FIRMWARE_TYPE__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case FwSchemaPackage.FIRMWARE_TYPE__DEV:
                return isSetDev();
            case FwSchemaPackage.FIRMWARE_TYPE__FCT:
                return isSetFct();
            case FwSchemaPackage.FIRMWARE_TYPE__KEEP_XML_HEADER:
                return isSetKeepXmlHeader();
            case FwSchemaPackage.FIRMWARE_TYPE__LEN:
                return LEN_EDEFAULT == null ? len != null : !LEN_EDEFAULT.equals(len);
            case FwSchemaPackage.FIRMWARE_TYPE__MAT:
                return MAT_EDEFAULT == null ? mat != null : !MAT_EDEFAULT.equals(mat);
            case FwSchemaPackage.FIRMWARE_TYPE__REM:
                return REM_EDEFAULT == null ? rem != null : !REM_EDEFAULT.equals(rem);
            case FwSchemaPackage.FIRMWARE_TYPE__USE:
                return isSetUse();
            case FwSchemaPackage.FIRMWARE_TYPE__VAR:
                return isSetVar();
            case FwSchemaPackage.FIRMWARE_TYPE__VEN:
                return VEN_EDEFAULT == null ? ven != null : !VEN_EDEFAULT.equals(ven);
            case FwSchemaPackage.FIRMWARE_TYPE__VER:
                return VER_EDEFAULT == null ? ver != null : !VER_EDEFAULT.equals(ver);
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
        result.append(" (applSwDate: ");
        if (applSwDateESet) result.append(applSwDate); else result.append("<unset>");
        result.append(", applSwTime: ");
        if (applSwTimeESet) result.append(applSwTime); else result.append("<unset>");
        result.append(", bootOffsHi: ");
        result.append(bootOffsHi);
        result.append(", chk: ");
        result.append(chk);
        result.append(", date: ");
        result.append(date);
        result.append(", dev: ");
        if (devESet) result.append(dev); else result.append("<unset>");
        result.append(", fct: ");
        if (fctESet) result.append(fct); else result.append("<unset>");
        result.append(", keepXmlHeader: ");
        if (keepXmlHeaderESet) result.append(keepXmlHeader); else result.append("<unset>");
        result.append(", len: ");
        result.append(len);
        result.append(", mat: ");
        result.append(mat);
        result.append(", rem: ");
        result.append(rem);
        result.append(", use: ");
        if (useESet) result.append(use); else result.append("<unset>");
        result.append(", var: ");
        if (varESet) result.append(var); else result.append("<unset>");
        result.append(", ven: ");
        result.append(ven);
        result.append(", ver: ");
        result.append(ver);
        result.append(')');
        return result.toString();
    }

} //FirmwareTypeImpl

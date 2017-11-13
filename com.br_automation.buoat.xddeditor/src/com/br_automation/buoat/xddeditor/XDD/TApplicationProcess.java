/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TApplication Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getDataTypeList <em>Data Type List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getFunctionTypeList <em>Function Type List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getFunctionInstanceList <em>Function Instance List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getTemplateList <em>Template List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getParameterGroupList <em>Parameter Group List</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationProcess()
 * @model extendedMetaData="name='t_ApplicationProcess' kind='elementOnly'"
 * @generated
 */
public interface TApplicationProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This element contains a list of user-defined data types.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type List</em>' containment reference.
	 * @see #setDataTypeList(TDataTypeList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationProcess_DataTypeList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataTypeList' namespace='##targetNamespace'"
	 * @generated
	 */
	TDataTypeList getDataTypeList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getDataTypeList <em>Data Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type List</em>' containment reference.
	 * @see #getDataTypeList()
	 * @generated
	 */
	void setDataTypeList(TDataTypeList value);

	/**
	 * Returns the value of the '<em><b>Function Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Type List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Type List</em>' containment reference.
	 * @see #setFunctionTypeList(TFunctionTypeList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationProcess_FunctionTypeList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='functionTypeList' namespace='##targetNamespace'"
	 * @generated
	 */
	TFunctionTypeList getFunctionTypeList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getFunctionTypeList <em>Function Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Type List</em>' containment reference.
	 * @see #getFunctionTypeList()
	 * @generated
	 */
	void setFunctionTypeList(TFunctionTypeList value);

	/**
	 * Returns the value of the '<em><b>Function Instance List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Instance List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Instance List</em>' containment reference.
	 * @see #setFunctionInstanceList(TFunctionInstanceList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationProcess_FunctionInstanceList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='functionInstanceList' namespace='##targetNamespace'"
	 * @generated
	 */
	TFunctionInstanceList getFunctionInstanceList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getFunctionInstanceList <em>Function Instance List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Instance List</em>' containment reference.
	 * @see #getFunctionInstanceList()
	 * @generated
	 */
	void setFunctionInstanceList(TFunctionInstanceList value);

	/**
	 * Returns the value of the '<em><b>Template List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This element contains a list of templates of parameters or allowed values.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template List</em>' containment reference.
	 * @see #setTemplateList(TTemplateList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationProcess_TemplateList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templateList' namespace='##targetNamespace'"
	 * @generated
	 */
	TTemplateList getTemplateList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getTemplateList <em>Template List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template List</em>' containment reference.
	 * @see #getTemplateList()
	 * @generated
	 */
	void setTemplateList(TTemplateList value);

	/**
	 * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This element contains a list of parameters.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter List</em>' containment reference.
	 * @see #setParameterList(TParameterList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationProcess_ParameterList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameterList' namespace='##targetNamespace'"
	 * @generated
	 */
	TParameterList getParameterList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getParameterList <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter List</em>' containment reference.
	 * @see #getParameterList()
	 * @generated
	 */
	void setParameterList(TParameterList value);

	/**
	 * Returns the value of the '<em><b>Parameter Group List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This element contains a list of parameter groups.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Group List</em>' containment reference.
	 * @see #setParameterGroupList(TParameterGroupList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationProcess_ParameterGroupList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterGroupList' namespace='##targetNamespace'"
	 * @generated
	 */
	TParameterGroupList getParameterGroupList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getParameterGroupList <em>Parameter Group List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Group List</em>' containment reference.
	 * @see #getParameterGroupList()
	 * @generated
	 */
	void setParameterGroupList(TParameterGroupList value);

} // TApplicationProcess

/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Buffer#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.Buffer#getOutputslot <em>Outputslot</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getBuffer()
 * @model
 * @generated
 */
public interface Buffer extends Components {
	/**
	 * Returns the value of the '<em><b>Inputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputslot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputslot</em>' reference.
	 * @see #setInputslot(InputSlot)
	 * @see stl.StlPackage#getBuffer_Inputslot()
	 * @model required="true"
	 * @generated
	 */
	InputSlot getInputslot();

	/**
	 * Sets the value of the '{@link stl.Buffer#getInputslot <em>Inputslot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputslot</em>' reference.
	 * @see #getInputslot()
	 * @generated
	 */
	void setInputslot(InputSlot value);

	/**
	 * Returns the value of the '<em><b>Outputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputslot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputslot</em>' reference.
	 * @see #setOutputslot(OutputSlot)
	 * @see stl.StlPackage#getBuffer_Outputslot()
	 * @model required="true"
	 * @generated
	 */
	OutputSlot getOutputslot();

	/**
	 * Sets the value of the '{@link stl.Buffer#getOutputslot <em>Outputslot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputslot</em>' reference.
	 * @see #getOutputslot()
	 * @generated
	 */
	void setOutputslot(OutputSlot value);

} // Buffer

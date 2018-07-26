/**
 */
package filesystem.filesystem_uncertainty;

import filesystem.Sync;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uSync</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filesystem.filesystem_uncertainty.uSync#getUleft <em>Uleft</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.uSync#getUright <em>Uright</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.uSync#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuSync()
 * @model
 * @generated
 */
public interface uSync extends aSync {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Sync}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuSync_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sync> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Sync}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuSync_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sync> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.filesystem_uncertainty.uSync}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuSync_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uSync> getUpoint();

} // uSync

/**
 */
package filesystem.filesystem_uncertainty;

import filesystem.Filesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uFilesystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filesystem.filesystem_uncertainty.uFilesystem#getUleft <em>Uleft</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.uFilesystem#getUright <em>Uright</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.uFilesystem#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuFilesystem()
 * @model
 * @generated
 */
public interface uFilesystem extends aFilesystem {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Filesystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuFilesystem_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filesystem> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Filesystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuFilesystem_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filesystem> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.filesystem_uncertainty.uFilesystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuFilesystem_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uFilesystem> getUpoint();

} // uFilesystem

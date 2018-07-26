/**
 */
package filesystem.filesystem_uncertainty;

import filesystem.Folder;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uFolder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filesystem.filesystem_uncertainty.uFolder#getUleft <em>Uleft</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.uFolder#getUright <em>Uright</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.uFolder#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuFolder()
 * @model
 * @generated
 */
public interface uFolder extends aFolder {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuFolder_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuFolder_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.filesystem_uncertainty.uFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuFolder_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uFolder> getUpoint();

} // uFolder

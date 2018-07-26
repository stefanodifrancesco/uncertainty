/**
 */
package filesystem.filesystem_uncertainty;

import filesystem.Drive;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uDrive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filesystem.filesystem_uncertainty.uDrive#getUleft <em>Uleft</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.uDrive#getUright <em>Uright</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.uDrive#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuDrive()
 * @model
 * @generated
 */
public interface uDrive extends aDrive {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Drive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuDrive_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<Drive> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Drive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuDrive_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<Drive> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' reference list.
	 * The list contents are of type {@link filesystem.filesystem_uncertainty.uDrive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upoint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' reference list.
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#getuDrive_Upoint()
	 * @model
	 * @generated
	 */
	EList<uDrive> getUpoint();

} // uDrive

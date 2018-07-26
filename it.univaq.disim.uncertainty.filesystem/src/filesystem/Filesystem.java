/**
 */
package filesystem;

import filesystem.filesystem_uncertainty.aDrive;
import filesystem.filesystem_uncertainty.aFilesystem;
import filesystem.filesystem_uncertainty.aSync;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filesystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filesystem.Filesystem#getDrives <em>Drives</em>}</li>
 *   <li>{@link filesystem.Filesystem#getSyncs <em>Syncs</em>}</li>
 * </ul>
 *
 * @see filesystem.FilesystemPackage#getFilesystem()
 * @model
 * @generated
 */
public interface Filesystem extends aFilesystem {
	/**
	 * Returns the value of the '<em><b>Drives</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.filesystem_uncertainty.aDrive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drives</em>' containment reference list.
	 * @see filesystem.FilesystemPackage#getFilesystem_Drives()
	 * @model containment="true"
	 * @generated
	 */
	EList<aDrive> getDrives();

	/**
	 * Returns the value of the '<em><b>Syncs</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.filesystem_uncertainty.aSync}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syncs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syncs</em>' containment reference list.
	 * @see filesystem.FilesystemPackage#getFilesystem_Syncs()
	 * @model containment="true"
	 * @generated
	 */
	EList<aSync> getSyncs();

} // Filesystem

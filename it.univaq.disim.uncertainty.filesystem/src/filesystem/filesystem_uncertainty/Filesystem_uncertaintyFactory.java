/**
 */
package filesystem.filesystem_uncertainty;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage
 * @generated
 */
public interface Filesystem_uncertaintyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Filesystem_uncertaintyFactory eINSTANCE = filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>aFilesystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>aFilesystem</em>'.
	 * @generated
	 */
	aFilesystem createaFilesystem();

	/**
	 * Returns a new object of class '<em>uFilesystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uFilesystem</em>'.
	 * @generated
	 */
	uFilesystem createuFilesystem();

	/**
	 * Returns a new object of class '<em>aFile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>aFile</em>'.
	 * @generated
	 */
	aFile createaFile();

	/**
	 * Returns a new object of class '<em>uFile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uFile</em>'.
	 * @generated
	 */
	uFile createuFile();

	/**
	 * Returns a new object of class '<em>aSync</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>aSync</em>'.
	 * @generated
	 */
	aSync createaSync();

	/**
	 * Returns a new object of class '<em>uSync</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uSync</em>'.
	 * @generated
	 */
	uSync createuSync();

	/**
	 * Returns a new object of class '<em>aShortcut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>aShortcut</em>'.
	 * @generated
	 */
	aShortcut createaShortcut();

	/**
	 * Returns a new object of class '<em>uShortcut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uShortcut</em>'.
	 * @generated
	 */
	uShortcut createuShortcut();

	/**
	 * Returns a new object of class '<em>aFolder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>aFolder</em>'.
	 * @generated
	 */
	aFolder createaFolder();

	/**
	 * Returns a new object of class '<em>aDrive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>aDrive</em>'.
	 * @generated
	 */
	aDrive createaDrive();

	/**
	 * Returns a new object of class '<em>uFolder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uFolder</em>'.
	 * @generated
	 */
	uFolder createuFolder();

	/**
	 * Returns a new object of class '<em>uDrive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uDrive</em>'.
	 * @generated
	 */
	uDrive createuDrive();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Filesystem_uncertaintyPackage getFilesystem_uncertaintyPackage();

} //Filesystem_uncertaintyFactory

/**
 */
package filesystem.filesystem_uncertainty;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyFactory
 * @model kind="package"
 * @generated
 */
public interface Filesystem_uncertaintyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filesystem_uncertainty";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "filesystem_uncertainty";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filesystem_uncertainty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Filesystem_uncertaintyPackage eINSTANCE = filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl.init();

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.aFilesystemImpl <em>aFilesystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.aFilesystemImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaFilesystem()
	 * @generated
	 */
	int AFILESYSTEM = 0;

	/**
	 * The number of structural features of the '<em>aFilesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFILESYSTEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aFilesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFILESYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.uFilesystemImpl <em>uFilesystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.uFilesystemImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuFilesystem()
	 * @generated
	 */
	int UFILESYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILESYSTEM__ULEFT = AFILESYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILESYSTEM__URIGHT = AFILESYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILESYSTEM__UPOINT = AFILESYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>uFilesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILESYSTEM_FEATURE_COUNT = AFILESYSTEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>uFilesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILESYSTEM_OPERATION_COUNT = AFILESYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.aFileImpl <em>aFile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.aFileImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaFile()
	 * @generated
	 */
	int AFILE = 2;

	/**
	 * The number of structural features of the '<em>aFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFILE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.uFileImpl <em>uFile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.uFileImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuFile()
	 * @generated
	 */
	int UFILE = 3;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILE__ULEFT = AFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILE__URIGHT = AFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILE__UPOINT = AFILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>uFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILE_FEATURE_COUNT = AFILE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>uFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFILE_OPERATION_COUNT = AFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.aSyncImpl <em>aSync</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.aSyncImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaSync()
	 * @generated
	 */
	int ASYNC = 4;

	/**
	 * The number of structural features of the '<em>aSync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aSync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.uSyncImpl <em>uSync</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.uSyncImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuSync()
	 * @generated
	 */
	int USYNC = 5;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USYNC__ULEFT = ASYNC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USYNC__URIGHT = ASYNC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USYNC__UPOINT = ASYNC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>uSync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USYNC_FEATURE_COUNT = ASYNC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>uSync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USYNC_OPERATION_COUNT = ASYNC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.aShortcutImpl <em>aShortcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.aShortcutImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaShortcut()
	 * @generated
	 */
	int ASHORTCUT = 6;

	/**
	 * The number of structural features of the '<em>aShortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASHORTCUT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aShortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASHORTCUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.uShortcutImpl <em>uShortcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.uShortcutImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuShortcut()
	 * @generated
	 */
	int USHORTCUT = 7;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORTCUT__ULEFT = ASHORTCUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORTCUT__URIGHT = ASHORTCUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORTCUT__UPOINT = ASHORTCUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>uShortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORTCUT_FEATURE_COUNT = ASHORTCUT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>uShortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORTCUT_OPERATION_COUNT = ASHORTCUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.aFolderImpl <em>aFolder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.aFolderImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaFolder()
	 * @generated
	 */
	int AFOLDER = 8;

	/**
	 * The number of structural features of the '<em>aFolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFOLDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aFolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.aDriveImpl <em>aDrive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.aDriveImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaDrive()
	 * @generated
	 */
	int ADRIVE = 9;

	/**
	 * The number of structural features of the '<em>aDrive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRIVE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aDrive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.uFolderImpl <em>uFolder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.uFolderImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuFolder()
	 * @generated
	 */
	int UFOLDER = 10;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFOLDER__ULEFT = AFOLDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFOLDER__URIGHT = AFOLDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFOLDER__UPOINT = AFOLDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>uFolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFOLDER_FEATURE_COUNT = AFOLDER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>uFolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UFOLDER_OPERATION_COUNT = AFOLDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.filesystem_uncertainty.impl.uDriveImpl <em>uDrive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.filesystem_uncertainty.impl.uDriveImpl
	 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuDrive()
	 * @generated
	 */
	int UDRIVE = 11;

	/**
	 * The feature id for the '<em><b>Uleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDRIVE__ULEFT = ADRIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDRIVE__URIGHT = ADRIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upoint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDRIVE__UPOINT = ADRIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>uDrive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDRIVE_FEATURE_COUNT = ADRIVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>uDrive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDRIVE_OPERATION_COUNT = ADRIVE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.aFilesystem <em>aFilesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aFilesystem</em>'.
	 * @see filesystem.filesystem_uncertainty.aFilesystem
	 * @generated
	 */
	EClass getaFilesystem();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.uFilesystem <em>uFilesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uFilesystem</em>'.
	 * @see filesystem.filesystem_uncertainty.uFilesystem
	 * @generated
	 */
	EClass getuFilesystem();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFilesystem#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see filesystem.filesystem_uncertainty.uFilesystem#getUleft()
	 * @see #getuFilesystem()
	 * @generated
	 */
	EReference getuFilesystem_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFilesystem#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see filesystem.filesystem_uncertainty.uFilesystem#getUright()
	 * @see #getuFilesystem()
	 * @generated
	 */
	EReference getuFilesystem_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFilesystem#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see filesystem.filesystem_uncertainty.uFilesystem#getUpoint()
	 * @see #getuFilesystem()
	 * @generated
	 */
	EReference getuFilesystem_Upoint();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.aFile <em>aFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aFile</em>'.
	 * @see filesystem.filesystem_uncertainty.aFile
	 * @generated
	 */
	EClass getaFile();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.uFile <em>uFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uFile</em>'.
	 * @see filesystem.filesystem_uncertainty.uFile
	 * @generated
	 */
	EClass getuFile();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFile#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see filesystem.filesystem_uncertainty.uFile#getUleft()
	 * @see #getuFile()
	 * @generated
	 */
	EReference getuFile_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFile#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see filesystem.filesystem_uncertainty.uFile#getUright()
	 * @see #getuFile()
	 * @generated
	 */
	EReference getuFile_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFile#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see filesystem.filesystem_uncertainty.uFile#getUpoint()
	 * @see #getuFile()
	 * @generated
	 */
	EReference getuFile_Upoint();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.aSync <em>aSync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aSync</em>'.
	 * @see filesystem.filesystem_uncertainty.aSync
	 * @generated
	 */
	EClass getaSync();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.uSync <em>uSync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uSync</em>'.
	 * @see filesystem.filesystem_uncertainty.uSync
	 * @generated
	 */
	EClass getuSync();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uSync#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see filesystem.filesystem_uncertainty.uSync#getUleft()
	 * @see #getuSync()
	 * @generated
	 */
	EReference getuSync_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uSync#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see filesystem.filesystem_uncertainty.uSync#getUright()
	 * @see #getuSync()
	 * @generated
	 */
	EReference getuSync_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uSync#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see filesystem.filesystem_uncertainty.uSync#getUpoint()
	 * @see #getuSync()
	 * @generated
	 */
	EReference getuSync_Upoint();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.aShortcut <em>aShortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aShortcut</em>'.
	 * @see filesystem.filesystem_uncertainty.aShortcut
	 * @generated
	 */
	EClass getaShortcut();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.uShortcut <em>uShortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uShortcut</em>'.
	 * @see filesystem.filesystem_uncertainty.uShortcut
	 * @generated
	 */
	EClass getuShortcut();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uShortcut#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see filesystem.filesystem_uncertainty.uShortcut#getUleft()
	 * @see #getuShortcut()
	 * @generated
	 */
	EReference getuShortcut_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uShortcut#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see filesystem.filesystem_uncertainty.uShortcut#getUright()
	 * @see #getuShortcut()
	 * @generated
	 */
	EReference getuShortcut_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uShortcut#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see filesystem.filesystem_uncertainty.uShortcut#getUpoint()
	 * @see #getuShortcut()
	 * @generated
	 */
	EReference getuShortcut_Upoint();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.aFolder <em>aFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aFolder</em>'.
	 * @see filesystem.filesystem_uncertainty.aFolder
	 * @generated
	 */
	EClass getaFolder();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.aDrive <em>aDrive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aDrive</em>'.
	 * @see filesystem.filesystem_uncertainty.aDrive
	 * @generated
	 */
	EClass getaDrive();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.uFolder <em>uFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uFolder</em>'.
	 * @see filesystem.filesystem_uncertainty.uFolder
	 * @generated
	 */
	EClass getuFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFolder#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see filesystem.filesystem_uncertainty.uFolder#getUleft()
	 * @see #getuFolder()
	 * @generated
	 */
	EReference getuFolder_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFolder#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see filesystem.filesystem_uncertainty.uFolder#getUright()
	 * @see #getuFolder()
	 * @generated
	 */
	EReference getuFolder_Uright();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uFolder#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upoint</em>'.
	 * @see filesystem.filesystem_uncertainty.uFolder#getUpoint()
	 * @see #getuFolder()
	 * @generated
	 */
	EReference getuFolder_Upoint();

	/**
	 * Returns the meta object for class '{@link filesystem.filesystem_uncertainty.uDrive <em>uDrive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uDrive</em>'.
	 * @see filesystem.filesystem_uncertainty.uDrive
	 * @generated
	 */
	EClass getuDrive();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uDrive#getUleft <em>Uleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uleft</em>'.
	 * @see filesystem.filesystem_uncertainty.uDrive#getUleft()
	 * @see #getuDrive()
	 * @generated
	 */
	EReference getuDrive_Uleft();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.filesystem_uncertainty.uDrive#getUright <em>Uright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uright</em>'.
	 * @see filesystem.filesystem_uncertainty.uDrive#getUright()
	 * @see #getuDrive()
	 * @generated
	 */
	EReference getuDrive_Uright();

	/**
	 * Returns the meta object for the reference list '{@link filesystem.filesystem_uncertainty.uDrive#getUpoint <em>Upoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upoint</em>'.
	 * @see filesystem.filesystem_uncertainty.uDrive#getUpoint()
	 * @see #getuDrive()
	 * @generated
	 */
	EReference getuDrive_Upoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Filesystem_uncertaintyFactory getFilesystem_uncertaintyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.aFilesystemImpl <em>aFilesystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.aFilesystemImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaFilesystem()
		 * @generated
		 */
		EClass AFILESYSTEM = eINSTANCE.getaFilesystem();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.uFilesystemImpl <em>uFilesystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.uFilesystemImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuFilesystem()
		 * @generated
		 */
		EClass UFILESYSTEM = eINSTANCE.getuFilesystem();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFILESYSTEM__ULEFT = eINSTANCE.getuFilesystem_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFILESYSTEM__URIGHT = eINSTANCE.getuFilesystem_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFILESYSTEM__UPOINT = eINSTANCE.getuFilesystem_Upoint();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.aFileImpl <em>aFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.aFileImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaFile()
		 * @generated
		 */
		EClass AFILE = eINSTANCE.getaFile();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.uFileImpl <em>uFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.uFileImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuFile()
		 * @generated
		 */
		EClass UFILE = eINSTANCE.getuFile();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFILE__ULEFT = eINSTANCE.getuFile_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFILE__URIGHT = eINSTANCE.getuFile_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFILE__UPOINT = eINSTANCE.getuFile_Upoint();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.aSyncImpl <em>aSync</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.aSyncImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaSync()
		 * @generated
		 */
		EClass ASYNC = eINSTANCE.getaSync();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.uSyncImpl <em>uSync</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.uSyncImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuSync()
		 * @generated
		 */
		EClass USYNC = eINSTANCE.getuSync();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USYNC__ULEFT = eINSTANCE.getuSync_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USYNC__URIGHT = eINSTANCE.getuSync_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USYNC__UPOINT = eINSTANCE.getuSync_Upoint();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.aShortcutImpl <em>aShortcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.aShortcutImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaShortcut()
		 * @generated
		 */
		EClass ASHORTCUT = eINSTANCE.getaShortcut();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.uShortcutImpl <em>uShortcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.uShortcutImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuShortcut()
		 * @generated
		 */
		EClass USHORTCUT = eINSTANCE.getuShortcut();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USHORTCUT__ULEFT = eINSTANCE.getuShortcut_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USHORTCUT__URIGHT = eINSTANCE.getuShortcut_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USHORTCUT__UPOINT = eINSTANCE.getuShortcut_Upoint();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.aFolderImpl <em>aFolder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.aFolderImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaFolder()
		 * @generated
		 */
		EClass AFOLDER = eINSTANCE.getaFolder();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.aDriveImpl <em>aDrive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.aDriveImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getaDrive()
		 * @generated
		 */
		EClass ADRIVE = eINSTANCE.getaDrive();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.uFolderImpl <em>uFolder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.uFolderImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuFolder()
		 * @generated
		 */
		EClass UFOLDER = eINSTANCE.getuFolder();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFOLDER__ULEFT = eINSTANCE.getuFolder_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFOLDER__URIGHT = eINSTANCE.getuFolder_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UFOLDER__UPOINT = eINSTANCE.getuFolder_Upoint();

		/**
		 * The meta object literal for the '{@link filesystem.filesystem_uncertainty.impl.uDriveImpl <em>uDrive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.filesystem_uncertainty.impl.uDriveImpl
		 * @see filesystem.filesystem_uncertainty.impl.Filesystem_uncertaintyPackageImpl#getuDrive()
		 * @generated
		 */
		EClass UDRIVE = eINSTANCE.getuDrive();

		/**
		 * The meta object literal for the '<em><b>Uleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UDRIVE__ULEFT = eINSTANCE.getuDrive_Uleft();

		/**
		 * The meta object literal for the '<em><b>Uright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UDRIVE__URIGHT = eINSTANCE.getuDrive_Uright();

		/**
		 * The meta object literal for the '<em><b>Upoint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UDRIVE__UPOINT = eINSTANCE.getuDrive_Upoint();

	}

} //Filesystem_uncertaintyPackage

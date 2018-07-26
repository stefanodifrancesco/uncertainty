/**
 */
package filesystem.filesystem_uncertainty.impl;

import filesystem.FilesystemPackage;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyFactory;
import filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage;
import filesystem.filesystem_uncertainty.aDrive;
import filesystem.filesystem_uncertainty.aFile;
import filesystem.filesystem_uncertainty.aFilesystem;
import filesystem.filesystem_uncertainty.aFolder;
import filesystem.filesystem_uncertainty.aShortcut;
import filesystem.filesystem_uncertainty.aSync;
import filesystem.filesystem_uncertainty.uDrive;
import filesystem.filesystem_uncertainty.uFile;
import filesystem.filesystem_uncertainty.uFilesystem;
import filesystem.filesystem_uncertainty.uFolder;
import filesystem.filesystem_uncertainty.uShortcut;
import filesystem.filesystem_uncertainty.uSync;

import filesystem.impl.FilesystemPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Filesystem_uncertaintyPackageImpl extends EPackageImpl implements Filesystem_uncertaintyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aFilesystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uFilesystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSyncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uSyncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aShortcutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uShortcutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDriveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uDriveEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Filesystem_uncertaintyPackageImpl() {
		super(eNS_URI, Filesystem_uncertaintyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Filesystem_uncertaintyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Filesystem_uncertaintyPackage init() {
		if (isInited) return (Filesystem_uncertaintyPackage)EPackage.Registry.INSTANCE.getEPackage(Filesystem_uncertaintyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFilesystem_uncertaintyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Filesystem_uncertaintyPackageImpl theFilesystem_uncertaintyPackage = registeredFilesystem_uncertaintyPackage instanceof Filesystem_uncertaintyPackageImpl ? (Filesystem_uncertaintyPackageImpl)registeredFilesystem_uncertaintyPackage : new Filesystem_uncertaintyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FilesystemPackage.eNS_URI);
		FilesystemPackageImpl theFilesystemPackage = (FilesystemPackageImpl)(registeredPackage instanceof FilesystemPackageImpl ? registeredPackage : FilesystemPackage.eINSTANCE);

		// Create package meta-data objects
		theFilesystem_uncertaintyPackage.createPackageContents();
		theFilesystemPackage.createPackageContents();

		// Initialize created meta-data
		theFilesystem_uncertaintyPackage.initializePackageContents();
		theFilesystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFilesystem_uncertaintyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Filesystem_uncertaintyPackage.eNS_URI, theFilesystem_uncertaintyPackage);
		return theFilesystem_uncertaintyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaFilesystem() {
		return aFilesystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuFilesystem() {
		return uFilesystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFilesystem_Uleft() {
		return (EReference)uFilesystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFilesystem_Uright() {
		return (EReference)uFilesystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFilesystem_Upoint() {
		return (EReference)uFilesystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaFile() {
		return aFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuFile() {
		return uFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFile_Uleft() {
		return (EReference)uFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFile_Uright() {
		return (EReference)uFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFile_Upoint() {
		return (EReference)uFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaSync() {
		return aSyncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuSync() {
		return uSyncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuSync_Uleft() {
		return (EReference)uSyncEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuSync_Uright() {
		return (EReference)uSyncEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuSync_Upoint() {
		return (EReference)uSyncEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaShortcut() {
		return aShortcutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuShortcut() {
		return uShortcutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuShortcut_Uleft() {
		return (EReference)uShortcutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuShortcut_Uright() {
		return (EReference)uShortcutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuShortcut_Upoint() {
		return (EReference)uShortcutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaFolder() {
		return aFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaDrive() {
		return aDriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuFolder() {
		return uFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFolder_Uleft() {
		return (EReference)uFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFolder_Uright() {
		return (EReference)uFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuFolder_Upoint() {
		return (EReference)uFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuDrive() {
		return uDriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuDrive_Uleft() {
		return (EReference)uDriveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuDrive_Uright() {
		return (EReference)uDriveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuDrive_Upoint() {
		return (EReference)uDriveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filesystem_uncertaintyFactory getFilesystem_uncertaintyFactory() {
		return (Filesystem_uncertaintyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aFilesystemEClass = createEClass(AFILESYSTEM);

		uFilesystemEClass = createEClass(UFILESYSTEM);
		createEReference(uFilesystemEClass, UFILESYSTEM__ULEFT);
		createEReference(uFilesystemEClass, UFILESYSTEM__URIGHT);
		createEReference(uFilesystemEClass, UFILESYSTEM__UPOINT);

		aFileEClass = createEClass(AFILE);

		uFileEClass = createEClass(UFILE);
		createEReference(uFileEClass, UFILE__ULEFT);
		createEReference(uFileEClass, UFILE__URIGHT);
		createEReference(uFileEClass, UFILE__UPOINT);

		aSyncEClass = createEClass(ASYNC);

		uSyncEClass = createEClass(USYNC);
		createEReference(uSyncEClass, USYNC__ULEFT);
		createEReference(uSyncEClass, USYNC__URIGHT);
		createEReference(uSyncEClass, USYNC__UPOINT);

		aShortcutEClass = createEClass(ASHORTCUT);

		uShortcutEClass = createEClass(USHORTCUT);
		createEReference(uShortcutEClass, USHORTCUT__ULEFT);
		createEReference(uShortcutEClass, USHORTCUT__URIGHT);
		createEReference(uShortcutEClass, USHORTCUT__UPOINT);

		aFolderEClass = createEClass(AFOLDER);

		aDriveEClass = createEClass(ADRIVE);

		uFolderEClass = createEClass(UFOLDER);
		createEReference(uFolderEClass, UFOLDER__ULEFT);
		createEReference(uFolderEClass, UFOLDER__URIGHT);
		createEReference(uFolderEClass, UFOLDER__UPOINT);

		uDriveEClass = createEClass(UDRIVE);
		createEReference(uDriveEClass, UDRIVE__ULEFT);
		createEReference(uDriveEClass, UDRIVE__URIGHT);
		createEReference(uDriveEClass, UDRIVE__UPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FilesystemPackage theFilesystemPackage = (FilesystemPackage)EPackage.Registry.INSTANCE.getEPackage(FilesystemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uFilesystemEClass.getESuperTypes().add(this.getaFilesystem());
		uFileEClass.getESuperTypes().add(this.getaFile());
		uSyncEClass.getESuperTypes().add(this.getaSync());
		uShortcutEClass.getESuperTypes().add(this.getaShortcut());
		uFolderEClass.getESuperTypes().add(this.getaFolder());
		uDriveEClass.getESuperTypes().add(this.getaDrive());

		// Initialize classes, features, and operations; add parameters
		initEClass(aFilesystemEClass, aFilesystem.class, "aFilesystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uFilesystemEClass, uFilesystem.class, "uFilesystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuFilesystem_Uleft(), theFilesystemPackage.getFilesystem(), null, "uleft", null, 0, -1, uFilesystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuFilesystem_Uright(), theFilesystemPackage.getFilesystem(), null, "uright", null, 0, -1, uFilesystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuFilesystem_Upoint(), this.getuFilesystem(), null, "upoint", null, 0, -1, uFilesystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aFileEClass, aFile.class, "aFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uFileEClass, uFile.class, "uFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuFile_Uleft(), theFilesystemPackage.getFile(), null, "uleft", null, 0, -1, uFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuFile_Uright(), theFilesystemPackage.getFile(), null, "uright", null, 0, -1, uFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuFile_Upoint(), this.getuFile(), null, "upoint", null, 0, -1, uFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aSyncEClass, aSync.class, "aSync", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uSyncEClass, uSync.class, "uSync", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuSync_Uleft(), theFilesystemPackage.getSync(), null, "uleft", null, 0, -1, uSync.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuSync_Uright(), theFilesystemPackage.getSync(), null, "uright", null, 0, -1, uSync.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuSync_Upoint(), this.getuSync(), null, "upoint", null, 0, -1, uSync.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aShortcutEClass, aShortcut.class, "aShortcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uShortcutEClass, uShortcut.class, "uShortcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuShortcut_Uleft(), theFilesystemPackage.getShortcut(), null, "uleft", null, 0, -1, uShortcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuShortcut_Uright(), theFilesystemPackage.getShortcut(), null, "uright", null, 0, -1, uShortcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuShortcut_Upoint(), this.getuShortcut(), null, "upoint", null, 0, -1, uShortcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aFolderEClass, aFolder.class, "aFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aDriveEClass, aDrive.class, "aDrive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uFolderEClass, uFolder.class, "uFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuFolder_Uleft(), theFilesystemPackage.getFolder(), null, "uleft", null, 0, -1, uFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuFolder_Uright(), theFilesystemPackage.getFolder(), null, "uright", null, 0, -1, uFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuFolder_Upoint(), this.getuFolder(), null, "upoint", null, 0, -1, uFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uDriveEClass, uDrive.class, "uDrive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuDrive_Uleft(), theFilesystemPackage.getDrive(), null, "uleft", null, 0, -1, uDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuDrive_Uright(), theFilesystemPackage.getDrive(), null, "uright", null, 0, -1, uDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuDrive_Upoint(), this.getuDrive(), null, "upoint", null, 0, -1, uDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Filesystem_uncertaintyPackageImpl

/**
 */
package filesystem.filesystem_uncertainty.impl;

import filesystem.filesystem_uncertainty.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Filesystem_uncertaintyFactoryImpl extends EFactoryImpl implements Filesystem_uncertaintyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Filesystem_uncertaintyFactory init() {
		try {
			Filesystem_uncertaintyFactory theFilesystem_uncertaintyFactory = (Filesystem_uncertaintyFactory)EPackage.Registry.INSTANCE.getEFactory(Filesystem_uncertaintyPackage.eNS_URI);
			if (theFilesystem_uncertaintyFactory != null) {
				return theFilesystem_uncertaintyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Filesystem_uncertaintyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filesystem_uncertaintyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Filesystem_uncertaintyPackage.AFILESYSTEM: return createaFilesystem();
			case Filesystem_uncertaintyPackage.UFILESYSTEM: return createuFilesystem();
			case Filesystem_uncertaintyPackage.AFILE: return createaFile();
			case Filesystem_uncertaintyPackage.UFILE: return createuFile();
			case Filesystem_uncertaintyPackage.ASYNC: return createaSync();
			case Filesystem_uncertaintyPackage.USYNC: return createuSync();
			case Filesystem_uncertaintyPackage.ASHORTCUT: return createaShortcut();
			case Filesystem_uncertaintyPackage.USHORTCUT: return createuShortcut();
			case Filesystem_uncertaintyPackage.AFOLDER: return createaFolder();
			case Filesystem_uncertaintyPackage.ADRIVE: return createaDrive();
			case Filesystem_uncertaintyPackage.UFOLDER: return createuFolder();
			case Filesystem_uncertaintyPackage.UDRIVE: return createuDrive();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aFilesystem createaFilesystem() {
		aFilesystemImpl aFilesystem = new aFilesystemImpl();
		return aFilesystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uFilesystem createuFilesystem() {
		uFilesystemImpl uFilesystem = new uFilesystemImpl();
		return uFilesystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aFile createaFile() {
		aFileImpl aFile = new aFileImpl();
		return aFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uFile createuFile() {
		uFileImpl uFile = new uFileImpl();
		return uFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aSync createaSync() {
		aSyncImpl aSync = new aSyncImpl();
		return aSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uSync createuSync() {
		uSyncImpl uSync = new uSyncImpl();
		return uSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aShortcut createaShortcut() {
		aShortcutImpl aShortcut = new aShortcutImpl();
		return aShortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uShortcut createuShortcut() {
		uShortcutImpl uShortcut = new uShortcutImpl();
		return uShortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aFolder createaFolder() {
		aFolderImpl aFolder = new aFolderImpl();
		return aFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aDrive createaDrive() {
		aDriveImpl aDrive = new aDriveImpl();
		return aDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uFolder createuFolder() {
		uFolderImpl uFolder = new uFolderImpl();
		return uFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uDrive createuDrive() {
		uDriveImpl uDrive = new uDriveImpl();
		return uDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filesystem_uncertaintyPackage getFilesystem_uncertaintyPackage() {
		return (Filesystem_uncertaintyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Filesystem_uncertaintyPackage getPackage() {
		return Filesystem_uncertaintyPackage.eINSTANCE;
	}

} //Filesystem_uncertaintyFactoryImpl

/**
 */
package filesystem.util;

import filesystem.*;

import filesystem.filesystem_uncertainty.aDrive;
import filesystem.filesystem_uncertainty.aFile;
import filesystem.filesystem_uncertainty.aFilesystem;
import filesystem.filesystem_uncertainty.aFolder;
import filesystem.filesystem_uncertainty.aShortcut;
import filesystem.filesystem_uncertainty.aSync;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see filesystem.FilesystemPackage
 * @generated
 */
public class FilesystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FilesystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FilesystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilesystemSwitch<Adapter> modelSwitch =
		new FilesystemSwitch<Adapter>() {
			@Override
			public Adapter caseFilesystem(Filesystem object) {
				return createFilesystemAdapter();
			}
			@Override
			public Adapter caseDrive(Drive object) {
				return createDriveAdapter();
			}
			@Override
			public Adapter caseFolder(Folder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseShortcut(Shortcut object) {
				return createShortcutAdapter();
			}
			@Override
			public Adapter caseSync(Sync object) {
				return createSyncAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseaFilesystem(aFilesystem object) {
				return createaFilesystemAdapter();
			}
			@Override
			public Adapter caseaFile(aFile object) {
				return createaFileAdapter();
			}
			@Override
			public Adapter caseaFolder(aFolder object) {
				return createaFolderAdapter();
			}
			@Override
			public Adapter caseaDrive(aDrive object) {
				return createaDriveAdapter();
			}
			@Override
			public Adapter caseaShortcut(aShortcut object) {
				return createaShortcutAdapter();
			}
			@Override
			public Adapter caseaSync(aSync object) {
				return createaSyncAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link filesystem.Filesystem <em>Filesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.Filesystem
	 * @generated
	 */
	public Adapter createFilesystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.Drive <em>Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.Drive
	 * @generated
	 */
	public Adapter createDriveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.Shortcut <em>Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.Shortcut
	 * @generated
	 */
	public Adapter createShortcutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.Sync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.Sync
	 * @generated
	 */
	public Adapter createSyncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.aFilesystem <em>aFilesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.aFilesystem
	 * @generated
	 */
	public Adapter createaFilesystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.aFile <em>aFile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.aFile
	 * @generated
	 */
	public Adapter createaFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.aFolder <em>aFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.aFolder
	 * @generated
	 */
	public Adapter createaFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.aDrive <em>aDrive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.aDrive
	 * @generated
	 */
	public Adapter createaDriveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.aShortcut <em>aShortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.aShortcut
	 * @generated
	 */
	public Adapter createaShortcutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.aSync <em>aSync</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.aSync
	 * @generated
	 */
	public Adapter createaSyncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FilesystemAdapterFactory

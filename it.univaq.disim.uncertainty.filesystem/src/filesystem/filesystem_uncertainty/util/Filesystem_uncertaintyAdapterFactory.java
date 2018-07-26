/**
 */
package filesystem.filesystem_uncertainty.util;

import filesystem.filesystem_uncertainty.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage
 * @generated
 */
public class Filesystem_uncertaintyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Filesystem_uncertaintyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filesystem_uncertaintyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Filesystem_uncertaintyPackage.eINSTANCE;
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
	protected Filesystem_uncertaintySwitch<Adapter> modelSwitch =
		new Filesystem_uncertaintySwitch<Adapter>() {
			@Override
			public Adapter caseaFilesystem(aFilesystem object) {
				return createaFilesystemAdapter();
			}
			@Override
			public Adapter caseuFilesystem(uFilesystem object) {
				return createuFilesystemAdapter();
			}
			@Override
			public Adapter caseaFile(aFile object) {
				return createaFileAdapter();
			}
			@Override
			public Adapter caseuFile(uFile object) {
				return createuFileAdapter();
			}
			@Override
			public Adapter caseaSync(aSync object) {
				return createaSyncAdapter();
			}
			@Override
			public Adapter caseuSync(uSync object) {
				return createuSyncAdapter();
			}
			@Override
			public Adapter caseaShortcut(aShortcut object) {
				return createaShortcutAdapter();
			}
			@Override
			public Adapter caseuShortcut(uShortcut object) {
				return createuShortcutAdapter();
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
			public Adapter caseuFolder(uFolder object) {
				return createuFolderAdapter();
			}
			@Override
			public Adapter caseuDrive(uDrive object) {
				return createuDriveAdapter();
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
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.uFilesystem <em>uFilesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.uFilesystem
	 * @generated
	 */
	public Adapter createuFilesystemAdapter() {
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
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.uFile <em>uFile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.uFile
	 * @generated
	 */
	public Adapter createuFileAdapter() {
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
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.uSync <em>uSync</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.uSync
	 * @generated
	 */
	public Adapter createuSyncAdapter() {
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
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.uShortcut <em>uShortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.uShortcut
	 * @generated
	 */
	public Adapter createuShortcutAdapter() {
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
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.uFolder <em>uFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.uFolder
	 * @generated
	 */
	public Adapter createuFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filesystem.filesystem_uncertainty.uDrive <em>uDrive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filesystem.filesystem_uncertainty.uDrive
	 * @generated
	 */
	public Adapter createuDriveAdapter() {
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

} //Filesystem_uncertaintyAdapterFactory

/**
 */
package filesystem.filesystem_uncertainty.util;

import filesystem.filesystem_uncertainty.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage
 * @generated
 */
public class Filesystem_uncertaintySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Filesystem_uncertaintyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filesystem_uncertaintySwitch() {
		if (modelPackage == null) {
			modelPackage = Filesystem_uncertaintyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Filesystem_uncertaintyPackage.AFILESYSTEM: {
				aFilesystem aFilesystem = (aFilesystem)theEObject;
				T result = caseaFilesystem(aFilesystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.UFILESYSTEM: {
				uFilesystem uFilesystem = (uFilesystem)theEObject;
				T result = caseuFilesystem(uFilesystem);
				if (result == null) result = caseaFilesystem(uFilesystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.AFILE: {
				aFile aFile = (aFile)theEObject;
				T result = caseaFile(aFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.UFILE: {
				uFile uFile = (uFile)theEObject;
				T result = caseuFile(uFile);
				if (result == null) result = caseaFile(uFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.ASYNC: {
				aSync aSync = (aSync)theEObject;
				T result = caseaSync(aSync);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.USYNC: {
				uSync uSync = (uSync)theEObject;
				T result = caseuSync(uSync);
				if (result == null) result = caseaSync(uSync);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.ASHORTCUT: {
				aShortcut aShortcut = (aShortcut)theEObject;
				T result = caseaShortcut(aShortcut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.USHORTCUT: {
				uShortcut uShortcut = (uShortcut)theEObject;
				T result = caseuShortcut(uShortcut);
				if (result == null) result = caseaShortcut(uShortcut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.AFOLDER: {
				aFolder aFolder = (aFolder)theEObject;
				T result = caseaFolder(aFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.ADRIVE: {
				aDrive aDrive = (aDrive)theEObject;
				T result = caseaDrive(aDrive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.UFOLDER: {
				uFolder uFolder = (uFolder)theEObject;
				T result = caseuFolder(uFolder);
				if (result == null) result = caseaFolder(uFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Filesystem_uncertaintyPackage.UDRIVE: {
				uDrive uDrive = (uDrive)theEObject;
				T result = caseuDrive(uDrive);
				if (result == null) result = caseaDrive(uDrive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aFilesystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aFilesystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaFilesystem(aFilesystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uFilesystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uFilesystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuFilesystem(uFilesystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aFile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaFile(aFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uFile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuFile(uFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aSync</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aSync</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaSync(aSync object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uSync</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uSync</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuSync(uSync object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aShortcut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aShortcut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaShortcut(aShortcut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uShortcut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uShortcut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuShortcut(uShortcut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aFolder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aFolder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaFolder(aFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aDrive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aDrive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaDrive(aDrive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uFolder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uFolder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuFolder(uFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uDrive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uDrive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuDrive(uDrive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Filesystem_uncertaintySwitch

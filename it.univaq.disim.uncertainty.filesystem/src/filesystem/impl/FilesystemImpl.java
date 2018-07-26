/**
 */
package filesystem.impl;

import filesystem.Filesystem;
import filesystem.FilesystemPackage;

import filesystem.filesystem_uncertainty.aDrive;
import filesystem.filesystem_uncertainty.aSync;

import filesystem.filesystem_uncertainty.impl.aFilesystemImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filesystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filesystem.impl.FilesystemImpl#getDrives <em>Drives</em>}</li>
 *   <li>{@link filesystem.impl.FilesystemImpl#getSyncs <em>Syncs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilesystemImpl extends aFilesystemImpl implements Filesystem {
	/**
	 * The cached value of the '{@link #getDrives() <em>Drives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrives()
	 * @generated
	 * @ordered
	 */
	protected EList<aDrive> drives;

	/**
	 * The cached value of the '{@link #getSyncs() <em>Syncs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncs()
	 * @generated
	 * @ordered
	 */
	protected EList<aSync> syncs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilesystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesystemPackage.Literals.FILESYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<aDrive> getDrives() {
		if (drives == null) {
			drives = new EObjectContainmentEList<aDrive>(aDrive.class, this, FilesystemPackage.FILESYSTEM__DRIVES);
		}
		return drives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<aSync> getSyncs() {
		if (syncs == null) {
			syncs = new EObjectContainmentEList<aSync>(aSync.class, this, FilesystemPackage.FILESYSTEM__SYNCS);
		}
		return syncs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesystemPackage.FILESYSTEM__DRIVES:
				return ((InternalEList<?>)getDrives()).basicRemove(otherEnd, msgs);
			case FilesystemPackage.FILESYSTEM__SYNCS:
				return ((InternalEList<?>)getSyncs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilesystemPackage.FILESYSTEM__DRIVES:
				return getDrives();
			case FilesystemPackage.FILESYSTEM__SYNCS:
				return getSyncs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FilesystemPackage.FILESYSTEM__DRIVES:
				getDrives().clear();
				getDrives().addAll((Collection<? extends aDrive>)newValue);
				return;
			case FilesystemPackage.FILESYSTEM__SYNCS:
				getSyncs().clear();
				getSyncs().addAll((Collection<? extends aSync>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FilesystemPackage.FILESYSTEM__DRIVES:
				getDrives().clear();
				return;
			case FilesystemPackage.FILESYSTEM__SYNCS:
				getSyncs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FilesystemPackage.FILESYSTEM__DRIVES:
				return drives != null && !drives.isEmpty();
			case FilesystemPackage.FILESYSTEM__SYNCS:
				return syncs != null && !syncs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FilesystemImpl

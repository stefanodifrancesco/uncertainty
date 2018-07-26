/**
 */
package filesystem.filesystem_uncertainty.impl;

import filesystem.Folder;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage;
import filesystem.filesystem_uncertainty.uFolder;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uFolder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uFolderImpl#getUleft <em>Uleft</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uFolderImpl#getUright <em>Uright</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uFolderImpl#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class uFolderImpl extends aFolderImpl implements uFolder {
	/**
	 * The cached value of the '{@link #getUleft() <em>Uleft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUleft()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> uleft;

	/**
	 * The cached value of the '{@link #getUright() <em>Uright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUright()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> uright;

	/**
	 * The cached value of the '{@link #getUpoint() <em>Upoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<uFolder> upoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Filesystem_uncertaintyPackage.Literals.UFOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getUleft() {
		if (uleft == null) {
			uleft = new EObjectContainmentEList<Folder>(Folder.class, this, Filesystem_uncertaintyPackage.UFOLDER__ULEFT);
		}
		return uleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getUright() {
		if (uright == null) {
			uright = new EObjectContainmentEList<Folder>(Folder.class, this, Filesystem_uncertaintyPackage.UFOLDER__URIGHT);
		}
		return uright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uFolder> getUpoint() {
		if (upoint == null) {
			upoint = new EObjectContainmentEList<uFolder>(uFolder.class, this, Filesystem_uncertaintyPackage.UFOLDER__UPOINT);
		}
		return upoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Filesystem_uncertaintyPackage.UFOLDER__ULEFT:
				return ((InternalEList<?>)getUleft()).basicRemove(otherEnd, msgs);
			case Filesystem_uncertaintyPackage.UFOLDER__URIGHT:
				return ((InternalEList<?>)getUright()).basicRemove(otherEnd, msgs);
			case Filesystem_uncertaintyPackage.UFOLDER__UPOINT:
				return ((InternalEList<?>)getUpoint()).basicRemove(otherEnd, msgs);
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
			case Filesystem_uncertaintyPackage.UFOLDER__ULEFT:
				return getUleft();
			case Filesystem_uncertaintyPackage.UFOLDER__URIGHT:
				return getUright();
			case Filesystem_uncertaintyPackage.UFOLDER__UPOINT:
				return getUpoint();
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
			case Filesystem_uncertaintyPackage.UFOLDER__ULEFT:
				getUleft().clear();
				getUleft().addAll((Collection<? extends Folder>)newValue);
				return;
			case Filesystem_uncertaintyPackage.UFOLDER__URIGHT:
				getUright().clear();
				getUright().addAll((Collection<? extends Folder>)newValue);
				return;
			case Filesystem_uncertaintyPackage.UFOLDER__UPOINT:
				getUpoint().clear();
				getUpoint().addAll((Collection<? extends uFolder>)newValue);
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
			case Filesystem_uncertaintyPackage.UFOLDER__ULEFT:
				getUleft().clear();
				return;
			case Filesystem_uncertaintyPackage.UFOLDER__URIGHT:
				getUright().clear();
				return;
			case Filesystem_uncertaintyPackage.UFOLDER__UPOINT:
				getUpoint().clear();
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
			case Filesystem_uncertaintyPackage.UFOLDER__ULEFT:
				return uleft != null && !uleft.isEmpty();
			case Filesystem_uncertaintyPackage.UFOLDER__URIGHT:
				return uright != null && !uright.isEmpty();
			case Filesystem_uncertaintyPackage.UFOLDER__UPOINT:
				return upoint != null && !upoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //uFolderImpl

/**
 */
package filesystem.filesystem_uncertainty.impl;

import filesystem.Sync;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage;
import filesystem.filesystem_uncertainty.uSync;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uSync</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uSyncImpl#getUleft <em>Uleft</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uSyncImpl#getUright <em>Uright</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uSyncImpl#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class uSyncImpl extends aSyncImpl implements uSync {
	/**
	 * The cached value of the '{@link #getUleft() <em>Uleft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUleft()
	 * @generated
	 * @ordered
	 */
	protected EList<Sync> uleft;

	/**
	 * The cached value of the '{@link #getUright() <em>Uright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUright()
	 * @generated
	 * @ordered
	 */
	protected EList<Sync> uright;

	/**
	 * The cached value of the '{@link #getUpoint() <em>Upoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<uSync> upoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uSyncImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Filesystem_uncertaintyPackage.Literals.USYNC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sync> getUleft() {
		if (uleft == null) {
			uleft = new EObjectContainmentEList<Sync>(Sync.class, this, Filesystem_uncertaintyPackage.USYNC__ULEFT);
		}
		return uleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sync> getUright() {
		if (uright == null) {
			uright = new EObjectContainmentEList<Sync>(Sync.class, this, Filesystem_uncertaintyPackage.USYNC__URIGHT);
		}
		return uright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uSync> getUpoint() {
		if (upoint == null) {
			upoint = new EObjectContainmentEList<uSync>(uSync.class, this, Filesystem_uncertaintyPackage.USYNC__UPOINT);
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
			case Filesystem_uncertaintyPackage.USYNC__ULEFT:
				return ((InternalEList<?>)getUleft()).basicRemove(otherEnd, msgs);
			case Filesystem_uncertaintyPackage.USYNC__URIGHT:
				return ((InternalEList<?>)getUright()).basicRemove(otherEnd, msgs);
			case Filesystem_uncertaintyPackage.USYNC__UPOINT:
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
			case Filesystem_uncertaintyPackage.USYNC__ULEFT:
				return getUleft();
			case Filesystem_uncertaintyPackage.USYNC__URIGHT:
				return getUright();
			case Filesystem_uncertaintyPackage.USYNC__UPOINT:
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
			case Filesystem_uncertaintyPackage.USYNC__ULEFT:
				getUleft().clear();
				getUleft().addAll((Collection<? extends Sync>)newValue);
				return;
			case Filesystem_uncertaintyPackage.USYNC__URIGHT:
				getUright().clear();
				getUright().addAll((Collection<? extends Sync>)newValue);
				return;
			case Filesystem_uncertaintyPackage.USYNC__UPOINT:
				getUpoint().clear();
				getUpoint().addAll((Collection<? extends uSync>)newValue);
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
			case Filesystem_uncertaintyPackage.USYNC__ULEFT:
				getUleft().clear();
				return;
			case Filesystem_uncertaintyPackage.USYNC__URIGHT:
				getUright().clear();
				return;
			case Filesystem_uncertaintyPackage.USYNC__UPOINT:
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
			case Filesystem_uncertaintyPackage.USYNC__ULEFT:
				return uleft != null && !uleft.isEmpty();
			case Filesystem_uncertaintyPackage.USYNC__URIGHT:
				return uright != null && !uright.isEmpty();
			case Filesystem_uncertaintyPackage.USYNC__UPOINT:
				return upoint != null && !upoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //uSyncImpl

/**
 */
package filesystem.filesystem_uncertainty.impl;

import filesystem.Drive;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage;
import filesystem.filesystem_uncertainty.uDrive;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uDrive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uDriveImpl#getUleft <em>Uleft</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uDriveImpl#getUright <em>Uright</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uDriveImpl#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class uDriveImpl extends aDriveImpl implements uDrive {
	/**
	 * The cached value of the '{@link #getUleft() <em>Uleft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUleft()
	 * @generated
	 * @ordered
	 */
	protected EList<Drive> uleft;

	/**
	 * The cached value of the '{@link #getUright() <em>Uright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUright()
	 * @generated
	 * @ordered
	 */
	protected EList<Drive> uright;

	/**
	 * The cached value of the '{@link #getUpoint() <em>Upoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<uDrive> upoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uDriveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Filesystem_uncertaintyPackage.Literals.UDRIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drive> getUleft() {
		if (uleft == null) {
			uleft = new EObjectContainmentEList<Drive>(Drive.class, this, Filesystem_uncertaintyPackage.UDRIVE__ULEFT);
		}
		return uleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drive> getUright() {
		if (uright == null) {
			uright = new EObjectContainmentEList<Drive>(Drive.class, this, Filesystem_uncertaintyPackage.UDRIVE__URIGHT);
		}
		return uright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uDrive> getUpoint() {
		if (upoint == null) {
			upoint = new EObjectResolvingEList<uDrive>(uDrive.class, this, Filesystem_uncertaintyPackage.UDRIVE__UPOINT);
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
			case Filesystem_uncertaintyPackage.UDRIVE__ULEFT:
				return ((InternalEList<?>)getUleft()).basicRemove(otherEnd, msgs);
			case Filesystem_uncertaintyPackage.UDRIVE__URIGHT:
				return ((InternalEList<?>)getUright()).basicRemove(otherEnd, msgs);
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
			case Filesystem_uncertaintyPackage.UDRIVE__ULEFT:
				return getUleft();
			case Filesystem_uncertaintyPackage.UDRIVE__URIGHT:
				return getUright();
			case Filesystem_uncertaintyPackage.UDRIVE__UPOINT:
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
			case Filesystem_uncertaintyPackage.UDRIVE__ULEFT:
				getUleft().clear();
				getUleft().addAll((Collection<? extends Drive>)newValue);
				return;
			case Filesystem_uncertaintyPackage.UDRIVE__URIGHT:
				getUright().clear();
				getUright().addAll((Collection<? extends Drive>)newValue);
				return;
			case Filesystem_uncertaintyPackage.UDRIVE__UPOINT:
				getUpoint().clear();
				getUpoint().addAll((Collection<? extends uDrive>)newValue);
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
			case Filesystem_uncertaintyPackage.UDRIVE__ULEFT:
				getUleft().clear();
				return;
			case Filesystem_uncertaintyPackage.UDRIVE__URIGHT:
				getUright().clear();
				return;
			case Filesystem_uncertaintyPackage.UDRIVE__UPOINT:
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
			case Filesystem_uncertaintyPackage.UDRIVE__ULEFT:
				return uleft != null && !uleft.isEmpty();
			case Filesystem_uncertaintyPackage.UDRIVE__URIGHT:
				return uright != null && !uright.isEmpty();
			case Filesystem_uncertaintyPackage.UDRIVE__UPOINT:
				return upoint != null && !upoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //uDriveImpl

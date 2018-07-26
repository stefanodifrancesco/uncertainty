/**
 */
package filesystem.filesystem_uncertainty.impl;

import filesystem.Shortcut;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyPackage;
import filesystem.filesystem_uncertainty.uShortcut;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uShortcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uShortcutImpl#getUleft <em>Uleft</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uShortcutImpl#getUright <em>Uright</em>}</li>
 *   <li>{@link filesystem.filesystem_uncertainty.impl.uShortcutImpl#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class uShortcutImpl extends aShortcutImpl implements uShortcut {
	/**
	 * The cached value of the '{@link #getUleft() <em>Uleft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUleft()
	 * @generated
	 * @ordered
	 */
	protected EList<Shortcut> uleft;

	/**
	 * The cached value of the '{@link #getUright() <em>Uright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUright()
	 * @generated
	 * @ordered
	 */
	protected EList<Shortcut> uright;

	/**
	 * The cached value of the '{@link #getUpoint() <em>Upoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<uShortcut> upoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uShortcutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Filesystem_uncertaintyPackage.Literals.USHORTCUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shortcut> getUleft() {
		if (uleft == null) {
			uleft = new EObjectContainmentEList<Shortcut>(Shortcut.class, this, Filesystem_uncertaintyPackage.USHORTCUT__ULEFT);
		}
		return uleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shortcut> getUright() {
		if (uright == null) {
			uright = new EObjectContainmentEList<Shortcut>(Shortcut.class, this, Filesystem_uncertaintyPackage.USHORTCUT__URIGHT);
		}
		return uright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uShortcut> getUpoint() {
		if (upoint == null) {
			upoint = new EObjectContainmentEList<uShortcut>(uShortcut.class, this, Filesystem_uncertaintyPackage.USHORTCUT__UPOINT);
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
			case Filesystem_uncertaintyPackage.USHORTCUT__ULEFT:
				return ((InternalEList<?>)getUleft()).basicRemove(otherEnd, msgs);
			case Filesystem_uncertaintyPackage.USHORTCUT__URIGHT:
				return ((InternalEList<?>)getUright()).basicRemove(otherEnd, msgs);
			case Filesystem_uncertaintyPackage.USHORTCUT__UPOINT:
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
			case Filesystem_uncertaintyPackage.USHORTCUT__ULEFT:
				return getUleft();
			case Filesystem_uncertaintyPackage.USHORTCUT__URIGHT:
				return getUright();
			case Filesystem_uncertaintyPackage.USHORTCUT__UPOINT:
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
			case Filesystem_uncertaintyPackage.USHORTCUT__ULEFT:
				getUleft().clear();
				getUleft().addAll((Collection<? extends Shortcut>)newValue);
				return;
			case Filesystem_uncertaintyPackage.USHORTCUT__URIGHT:
				getUright().clear();
				getUright().addAll((Collection<? extends Shortcut>)newValue);
				return;
			case Filesystem_uncertaintyPackage.USHORTCUT__UPOINT:
				getUpoint().clear();
				getUpoint().addAll((Collection<? extends uShortcut>)newValue);
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
			case Filesystem_uncertaintyPackage.USHORTCUT__ULEFT:
				getUleft().clear();
				return;
			case Filesystem_uncertaintyPackage.USHORTCUT__URIGHT:
				getUright().clear();
				return;
			case Filesystem_uncertaintyPackage.USHORTCUT__UPOINT:
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
			case Filesystem_uncertaintyPackage.USHORTCUT__ULEFT:
				return uleft != null && !uleft.isEmpty();
			case Filesystem_uncertaintyPackage.USHORTCUT__URIGHT:
				return uright != null && !uright.isEmpty();
			case Filesystem_uncertaintyPackage.USHORTCUT__UPOINT:
				return upoint != null && !upoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //uShortcutImpl

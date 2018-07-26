/**
 */
package filesystem.filesystem_uncertainty.tests;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyFactory;
import filesystem.filesystem_uncertainty.uDrive;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uDrive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uDriveTest extends aDriveTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uDriveTest.class);
	}

	/**
	 * Constructs a new uDrive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uDriveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uDrive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uDrive getFixture() {
		return (uDrive)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Filesystem_uncertaintyFactory.eINSTANCE.createuDrive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //uDriveTest

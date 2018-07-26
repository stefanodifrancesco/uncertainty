/**
 */
package filesystem.filesystem_uncertainty.tests;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyFactory;
import filesystem.filesystem_uncertainty.aDrive;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>aDrive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class aDriveTest extends TestCase {

	/**
	 * The fixture for this aDrive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected aDrive fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(aDriveTest.class);
	}

	/**
	 * Constructs a new aDrive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aDriveTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this aDrive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(aDrive fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this aDrive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected aDrive getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Filesystem_uncertaintyFactory.eINSTANCE.createaDrive());
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

} //aDriveTest

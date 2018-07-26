/**
 */
package filesystem.tests;

import filesystem.FilesystemFactory;
import filesystem.Sync;

import filesystem.filesystem_uncertainty.tests.aSyncTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sync</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncTest extends aSyncTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SyncTest.class);
	}

	/**
	 * Constructs a new Sync test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sync test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sync getFixture() {
		return (Sync)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FilesystemFactory.eINSTANCE.createSync());
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

} //SyncTest

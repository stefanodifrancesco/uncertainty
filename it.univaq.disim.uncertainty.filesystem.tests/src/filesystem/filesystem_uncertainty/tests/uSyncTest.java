/**
 */
package filesystem.filesystem_uncertainty.tests;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyFactory;
import filesystem.filesystem_uncertainty.uSync;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uSync</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uSyncTest extends aSyncTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uSyncTest.class);
	}

	/**
	 * Constructs a new uSync test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uSyncTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uSync test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uSync getFixture() {
		return (uSync)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Filesystem_uncertaintyFactory.eINSTANCE.createuSync());
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

} //uSyncTest

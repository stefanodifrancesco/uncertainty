/**
 */
package filesystem.filesystem_uncertainty.tests;

import filesystem.filesystem_uncertainty.Filesystem_uncertaintyFactory;
import filesystem.filesystem_uncertainty.uFile;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uFile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uFileTest extends aFileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uFileTest.class);
	}

	/**
	 * Constructs a new uFile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uFileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uFile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uFile getFixture() {
		return (uFile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Filesystem_uncertaintyFactory.eINSTANCE.createuFile());
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

} //uFileTest

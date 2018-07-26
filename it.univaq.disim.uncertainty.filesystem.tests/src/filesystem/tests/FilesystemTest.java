/**
 */
package filesystem.tests;

import filesystem.Filesystem;
import filesystem.FilesystemFactory;

import filesystem.filesystem_uncertainty.tests.aFilesystemTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Filesystem</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilesystemTest extends aFilesystemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FilesystemTest.class);
	}

	/**
	 * Constructs a new Filesystem test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Filesystem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Filesystem getFixture() {
		return (Filesystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FilesystemFactory.eINSTANCE.createFilesystem());
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

} //FilesystemTest

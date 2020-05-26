package org.rulez.magwas.zenta.model.handmade;

import org.junit.Test;

public class ZentaDiagramModelRegression0Test {

	public static boolean debug = false;

	@Test
	public void test0001() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0001"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject4 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1"
			);
		} catch (
				java.lang.IllegalArgumentException
				| java.lang.StringIndexOutOfBoundsException e
		) {
			// Expected exception.
		}
	}

	@Test
	public void test0002() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0002"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet((byte) -1, 0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature ID-1 is not a valid feature ID"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0003() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0003"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.notify.NotificationChain notificationChain1 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain2 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0004() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0004"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean6 = zentaDiagramModel0.eVirtualIsSet((short) 1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
	}

	@Test
	public void test0005() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0005"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eDynamicGet('#', false, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0006() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0006"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
	}

	@Test
	public void test0007() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0007"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.eclipse.emf.common.notify.NotificationChain notificationChain3 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain4 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain3);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0008() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0008"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IFolder iFolder7 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder8 = null;
		zentaDiagramModel0.move(iFolder7, iFolder8);
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
	}

	@Test
	public void test0009() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0009"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0
					.eOpenGet(eStructuralFeature6, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0010() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0010"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1"
			);
		} catch (
				java.lang.IllegalArgumentException
				| java.lang.StringIndexOutOfBoundsException e
		) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
	}

	@Test
	public void test0011() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0011"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature3 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		java.lang.Object obj8 = zentaDiagramModel4.getAdapter(0L);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str9 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature3, zentaDiagramModel4
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj8);
	}

	@Test
	public void test0012() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0012"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass10 = zentaDiagramModel7.eClass();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eDynamicSet(eStructuralFeature6, zentaDiagramModel7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(eClass10);
	}

	@Test
	public void test0013() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0013"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		java.lang.Object obj10 = zentaDiagramModel6.getAdapter(0L);
		int int11 = zentaDiagramModel6.getLineWidth();
		org.eclipse.emf.common.notify.NotificationChain notificationChain13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain14 = zentaDiagramModel0
					.eInverseAdd(zentaDiagramModel6, 0, notificationChain13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -11 out of bounds for length 0"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(obj10);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
	}

	@Test
	public void test0014() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0014"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj6 = zentaDiagramModel0.eVirtualGet('a', 100.0d);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass3);
	}

	@Test
	public void test0015() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0015"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
	}

	@Test
	public void test0016() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0016"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0017() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0017"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		org.rulez.magwas.zenta.model.UndoState undoState8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.UndoState undoState9 = zentaDiagramModel0
					.delete(undoState8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
	}

	@Test
	public void test0018() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0018"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setLineWidth((short) 0);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eOpenSet(eStructuralFeature7, zentaDiagramModel8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
	}

	@Test
	public void test0019() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0019"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain10 = zentaDiagramModel0
					.eInverseAdd(zentaDiagramModel4, '4', notificationChain9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
	}

	@Test
	public void test0020() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0020"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset(eStructuralFeature4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0021() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0021"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature3 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj4 = zentaDiagramModel0
					.eGet(eStructuralFeature3);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0022() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0022"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean14 = zentaDiagramModel0.eVirtualIsSet((byte) -1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
	}

	@Test
	public void test0023() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0023"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		org.eclipse.emf.common.util.URI uRI14 = null;
		zentaDiagramModel5.eSetProxyURI(uRI14);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList16 = zentaDiagramModel5
					.eCrossReferences();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
	}

	@Test
	public void test0024() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0024"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.common.notify.NotificationChain notificationChain5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain6 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
	}

	@Test
	public void test0025() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0025"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eGet(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0026() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0026"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.common.notify.NotificationChain notificationChain4 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain5 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
	}

	@Test
	public void test0027() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0027"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		int int3 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.common.notify.NotificationChain notificationChain4 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain5 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
	}

	@Test
	public void test0028() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0028"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj14 = zentaDiagramModel5.eVirtualGet((short) 10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
	}

	@Test
	public void test0029() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0029"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting5 = zentaDiagramModel0
					.eSetting(eStructuralFeature4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
	}

	@Test
	public void test0030() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0030"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int14 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
	}

	@Test
	public void test0031() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0031"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj5 = zentaDiagramModel0.eVirtualGet((short) 10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
	}

	@Test
	public void test0032() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0032"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel8 = zentaDiagramModel5
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str9 = zentaDiagramModel0
					.eURIFragmentSegment(eStructuralFeature4, iDiagramModel8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass3);
		org.junit.Assert.assertNotNull(iDiagramModel8);
	}

	@Test
	public void test0033() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0033"
			);
		int int0 = org.rulez.magwas.zenta.model.IDiagramModel.CONNECTION_ROUTER_BENDPOINT;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
	}

	@Test
	public void test0034() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0034"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		java.lang.String str7 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eOpenGet(eStructuralFeature8, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert
				.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
	}

	@Test
	public void test0035() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0035"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.EOperation eOperation7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int8 = zentaDiagramModel0.eDerivedOperationID(eOperation7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(adapterList6);
	}

	@Test
	public void test0036() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0036"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain10 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0037() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0037"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0.eVirtualGet((byte) 0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
	}

	@Test
	public void test0038() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0038"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0
					.eGet(eStructuralFeature9, false, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0039() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0039"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.ecore.EOperation eOperation5 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		java.lang.Object obj10 = zentaDiagramModel6.getAdapter(0L);
		int int11 = zentaDiagramModel6.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList12 = zentaDiagramModel6
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj13 = zentaDiagramModel0
					.eInvoke(eOperation5, adapterList12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj10);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
		org.junit.Assert.assertNotNull(adapterList12);
	}

	@Test
	public void test0040() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0040"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj5 = zentaDiagramModel0.eVirtualGet(0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
	}

	@Test
	public void test0041() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0041"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Class<?> wildcardClass5 = eStructuralFeature4.getClass();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStructuralFeature4);
	}

	@Test
	public void test0042() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0042"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		java.lang.String str14 = zentaDiagramModel5.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore19 = zentaDiagramModel16
				.eStore();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel5.eDynamicSet((byte) 10, zentaDiagramModel16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'viewpoint' is not a valid changeable feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
		org.junit.Assert.assertNull(eStore19);
	}

	@Test
	public void test0043() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0043"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
	}

	@Test
	public void test0044() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0044"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		java.lang.String str3 = zentaDiagramModel0.getId();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset(eStructuralFeature4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(str3);
	}

	@Test
	public void test0045() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0045"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature17 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore21 = zentaDiagramModel18
				.eStore();
		org.eclipse.emf.common.notify.Notification notification22 = null;
		zentaDiagramModel18.eNotify(notification22);
		zentaDiagramModel18.setName("hi!");
		int int26 = zentaDiagramModel18.getViewpoint();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel12.eDynamicSet(eStructuralFeature17, int26);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert.assertNull(eStore21);
		org.junit.Assert
				.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
	}

	@Test
	public void test0046() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0046"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.Object obj12 = null;
		java.lang.Object obj13 = zentaDiagramModel0.getAdapter(obj12);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		int int18 = zentaDiagramModel15.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal23 = zentaDiagramModel19
				.eInternalResource();
		java.lang.String str24 = zentaDiagramModel19.getDocumentation();
		boolean boolean25 = zentaDiagramModel15.eContains(zentaDiagramModel19);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str26 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature14, zentaDiagramModel15
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(obj13);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert.assertNull(internal23);
		org.junit.Assert.assertEquals(
				"'" + str24 + "' != '" + "hi!" + "'", str24, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean25 + "' != '" + false + "'", boolean25 == false
		);
	}

	@Test
	public void test0047() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0047"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore15 = zentaDiagramModel12
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList16 = zentaDiagramModel12
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj17 = zentaDiagramModel0
					.eDynamicInvoke((-1), adapterList16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNull(eStore15);
		org.junit.Assert.assertNotNull(adapterList16);
	}

	@Test
	public void test0048() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0048"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature3 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		java.lang.Object obj8 = zentaDiagramModel4.getAdapter(0L);
		int int9 = zentaDiagramModel4.getLineWidth();
		java.lang.String str10 = zentaDiagramModel4.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList11 = zentaDiagramModel4
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass15 = zentaDiagramModel12.eClass();
		zentaDiagramModel4.eSetClass(eClass15);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet(eStructuralFeature3, zentaDiagramModel4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj8);
		org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
		org.junit.Assert.assertEquals(
				"'" + str10 + "' != '" + "hi!" + "'", str10, "hi!"
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList11);
		org.junit.Assert.assertNotNull(eClass15);
	}

	@Test
	public void test0049() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0049"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		org.eclipse.emf.common.util.URI uRI14 = null;
		zentaDiagramModel5.eSetProxyURI(uRI14);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean17 = zentaDiagramModel5
					.eOpenIsSet(eStructuralFeature16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
	}

	@Test
	public void test0050() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0050"
			);
		int int0 = org.rulez.magwas.zenta.model.IDiagramModel.CONNECTION_ROUTER_MANHATTAN;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
	}

	@Test
	public void test0051() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0051"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		org.eclipse.emf.common.util.URI uRI14 = null;
		zentaDiagramModel5.eSetProxyURI(uRI14);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel17 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel17.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore20 = zentaDiagramModel17
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList21 = zentaDiagramModel17
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj22 = zentaDiagramModel5
					.eVirtualSet((short) -1, adapterList21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert.assertNull(eStore20);
		org.junit.Assert.assertNotNull(adapterList21);
	}

	@Test
	public void test0052() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0052"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.common.notify.Notification notification8 = null;
		zentaDiagramModel0.eNotify(notification8);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
	}

	@Test
	public void test0053() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0053"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel5.eSetStore(eStore14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
	}

	@Test
	public void test0054() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0054"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.common.notify.Notification notification8 = null;
		zentaDiagramModel0.eNotify(notification8);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		int int14 = zentaDiagramModel11.eContainerFeatureID();
		java.lang.String str15 = zentaDiagramModel11.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		int int19 = zentaDiagramModel16.eContainerFeatureID();
		java.lang.String str20 = zentaDiagramModel16.getName();
		zentaDiagramModel11.setAdapter(zentaDiagramModel16, 1L);
		java.lang.String str23 = zentaDiagramModel16.getId();
		int int24 = zentaDiagramModel16.getViewpoint();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet(eStructuralFeature10, zentaDiagramModel16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert
				.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
		org.junit.Assert
				.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
		org.junit.Assert
				.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
		org.junit.Assert.assertNull(str23);
		org.junit.Assert
				.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
	}

	@Test
	public void test0055() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0055"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		org.rulez.magwas.zenta.model.IFolder iFolder17 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder18 = null;
		zentaDiagramModel12.move(iFolder17, iFolder18);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
	}

	@Test
	public void test0056() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0056"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore16 = zentaDiagramModel13
				.eStore();
		org.eclipse.emf.common.notify.Notification notification17 = null;
		zentaDiagramModel13.eNotify(notification17);
		java.lang.String str19 = zentaDiagramModel13.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel20 = zentaDiagramModel13
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eDynamicSet(eStructuralFeature12, zentaDiagramModel13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(eStore16);
		org.junit.Assert.assertNull(str19);
		org.junit.Assert.assertNotNull(iDiagramModel20);
	}

	@Test
	public void test0057() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0057"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineColor("");
		org.rulez.magwas.zenta.model.IFolder iFolder5 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder6 = null;
		zentaDiagramModel0.move(iFolder5, iFolder6);
	}

	@Test
	public void test0058() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0058"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.Object obj12 = null;
		java.lang.Object obj13 = zentaDiagramModel0.getAdapter(obj12);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting15 = zentaDiagramModel0
					.eSetting(eStructuralFeature14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(obj13);
	}

	@Test
	public void test0059() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0059"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		zentaDiagramModel5.eUnset((byte) 10);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		java.lang.Object obj18 = zentaDiagramModel14.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject19 = zentaDiagramModel14
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList20 = zentaDiagramModel14
				.eContents();
		org.eclipse.emf.common.notify.NotificationChain notificationChain22 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain23 = zentaDiagramModel5
					.eInverseRemove(
							zentaDiagramModel14, (short) 0, notificationChain22
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -11 out of bounds for length 0"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(obj18);
		org.junit.Assert.assertNull(internalEObject19);
		org.junit.Assert.assertNotNull(eObjectList20);
	}

	@Test
	public void test0060() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0060"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting8 = zentaDiagramModel0
					.eSetting(eStructuralFeature7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
	}

	@Test
	public void test0061() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0061"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		int int17 = zentaDiagramModel12.eContainerFeatureID();
		zentaDiagramModel12.setLineWidth(0);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature20 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj23 = zentaDiagramModel12
					.eGet(eStructuralFeature20, true, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
	}

	@Test
	public void test0062() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0062"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.common.notify.Notification notification8 = null;
		zentaDiagramModel0.eNotify(notification8);
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean13 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
	}

	@Test
	public void test0063() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0063"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean13 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList14 = zentaDiagramModel0
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean13 + "' != '" + false + "'", boolean13 == false
		);
		org.junit.Assert.assertNotNull(eObjectList14);
	}

	@Test
	public void test0064() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0064"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.Object obj12 = null;
		java.lang.Object obj13 = zentaDiagramModel0.getAdapter(obj12);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int15 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(obj13);
	}

	@Test
	public void test0065() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0065"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		java.lang.String str16 = zentaDiagramModel12.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel17 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel17.setDocumentation("hi!");
		int int20 = zentaDiagramModel17.eContainerFeatureID();
		java.lang.String str21 = zentaDiagramModel17.getName();
		zentaDiagramModel12.setAdapter(zentaDiagramModel17, 1L);
		java.lang.String str24 = zentaDiagramModel17.getId();
		int int25 = zentaDiagramModel17.getViewpoint();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str26 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature11, zentaDiagramModel17
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert
				.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
		org.junit.Assert
				.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
		org.junit.Assert
				.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
		org.junit.Assert.assertNull(str24);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
	}

	@Test
	public void test0066() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0066"
			);
		int int0 = org.eclipse.emf.ecore.impl.EObjectImpl.ELAST_EOBJECT_FLAG;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
	}

	@Test
	public void test0067() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0067"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		zentaDiagramModel0.checkId("");
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0.eVirtualGet(2);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
	}

	@Test
	public void test0068() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0068"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
	}

	@Test
	public void test0069() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0069"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor7 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore12 = zentaDiagramModel9
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList13 = zentaDiagramModel9
				.eAdapters();
		java.lang.Object obj14 = zentaDiagramModel0
				.eInvoke((short) 0, adapterList13);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.check();
			org.junit.Assert.fail(
					"Expected exception of type org.rulez.magwas.zenta.model.ModelConsistencyException; message: id cannot be null: org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel@6dc42b0 (name: , id: null, lineWidth: 1, lineColor: null, documentation: hi!, connectionRouterType: 0) (viewpoint: 0)"
			);
		} catch (org.rulez.magwas.zenta.model.ModelConsistencyException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor7);
		org.junit.Assert.assertNull(eStore12);
		org.junit.Assert.assertNotNull(adapterList13);
		org.junit.Assert.assertNotNull(obj14);
	}

	@Test
	public void test0070() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0070"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj15 = zentaDiagramModel5.eVirtualGet((short) 10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
	}

	@Test
	public void test0071() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0071"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EOperation eOperation4 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList10 = zentaDiagramModel5
				.eContents();
		int int11 = zentaDiagramModel5.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		java.lang.Object obj16 = zentaDiagramModel12.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject17 = zentaDiagramModel12
				.eInternalContainer();
		boolean boolean18 = zentaDiagramModel12.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor19 = zentaDiagramModel12
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore24 = zentaDiagramModel21
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList25 = zentaDiagramModel21
				.eAdapters();
		java.lang.Object obj26 = zentaDiagramModel12
				.eInvoke((short) 0, adapterList25);
		java.lang.Object obj27 = zentaDiagramModel5.getAdapter(adapterList25);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj28 = zentaDiagramModel0
					.eInvoke(eOperation4, adapterList25);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNotNull(eObjectList10);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertNull(obj16);
		org.junit.Assert.assertNull(internalEObject17);
		org.junit.Assert.assertTrue(
				"'" + boolean18 + "' != '" + false + "'", boolean18 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor19);
		org.junit.Assert.assertNull(eStore24);
		org.junit.Assert.assertNotNull(adapterList25);
		org.junit.Assert.assertNotNull(obj26);
		org.junit.Assert.assertNull(obj27);
	}

	@Test
	public void test0072() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0072"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		zentaDiagramModel0.setId("hi!");
		org.eclipse.emf.ecore.EOperation eOperation13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int14 = zentaDiagramModel0.eDerivedOperationID(eOperation13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0073() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0073"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EOperation eOperation6 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		int int10 = zentaDiagramModel7.eContainerFeatureID();
		java.lang.String str11 = zentaDiagramModel7.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		java.lang.String str16 = zentaDiagramModel12.getName();
		zentaDiagramModel7.setAdapter(zentaDiagramModel12, 1L);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList19 = zentaDiagramModel12
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj20 = zentaDiagramModel0
					.eInvoke(eOperation6, adapterList19);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
		org.junit.Assert
				.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert
				.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
		org.junit.Assert.assertNotNull(adapterList19);
	}

	@Test
	public void test0074() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0074"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj11 = null; // flaky:
											// zentaDiagramModel0.eGet((int)
											// (byte) -1, false, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0075() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0075"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		zentaDiagramModel0.checkId("");
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain10 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
	}

	@Test
	public void test0076() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0076"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset(eStructuralFeature9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
	}

	@Test
	public void test0077() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0077"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eGet(eStructuralFeature7, true, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
	}

	@Test
	public void test0078() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0078"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
// flaky:             zentaDiagramModel0.eUnset((int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
	}

	@Test
	public void test0079() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0079"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int8 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
	}

	@Test
	public void test0080() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0080"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor10 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean12 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(eObjectItor10);
	}

	@Test
	public void test0081() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0081"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setLineWidth((short) 0);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj15 = zentaDiagramModel0
					.eVirtualGet((byte) 10, zentaDiagramModel12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0082() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0082"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EOperation eOperation7 = null;
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eInvoke(eOperation7, adapterList8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
	}

	@Test
	public void test0083() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0083"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting10 = zentaDiagramModel0
					.eSetting(eStructuralFeature9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
	}

	@Test
	public void test0084() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0084"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject12 = zentaDiagramModel4
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
	}

	@Test
	public void test0085() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0085"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj14 = zentaDiagramModel5
					.eDynamicGet(eStructuralFeature12, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
	}

	@Test
	public void test0086() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0086"
			);
		int int0 = org.rulez.magwas.zenta.model.IDiagramModel.CONNECTION_ROUTER_SHORTEST_PATH;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
	}

	@Test
	public void test0087() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0087"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
	}

	@Test
	public void test0088() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0088"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset((-1));
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0089() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0089"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EOperation eOperation3 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int4 = zentaDiagramModel0.eDerivedOperationID(eOperation3);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0090() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0090"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor3 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel10 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel10.setDocumentation("hi!");
		int int13 = zentaDiagramModel10.eContainerFeatureID();
		java.lang.String str14 = zentaDiagramModel10.getName();
		zentaDiagramModel5.setAdapter(zentaDiagramModel10, 1L);
		int int17 = zentaDiagramModel5.eContainerFeatureID();
		boolean boolean18 = zentaDiagramModel5.eIsProxy();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList19 = zentaDiagramModel5
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eDynamicSet(eStructuralFeature4, zentaDiagramModel5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eObjectItor3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean18 + "' != '" + false + "'", boolean18 == false
		);
		org.junit.Assert.assertNotNull(eObjectList19);
	}

	@Test
	public void test0091() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0091"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		zentaDiagramModel0.setLineWidth((-1));
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0
					.eGet(eStructuralFeature11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain8);
	}

	@Test
	public void test0092() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0092"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		java.lang.String str17 = zentaDiagramModel12.getName();
		org.eclipse.emf.common.notify.NotificationChain notificationChain18 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain19 = zentaDiagramModel12
					.eBasicRemoveFromContainer(notificationChain18);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
	}

	@Test
	public void test0093() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0093"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.ecore.EReference eReference5 = zentaDiagramModel0
				.eContainmentFeature();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet(0, 52);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'zentaModel' is not a valid changeable feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eReference5);
	}

	@Test
	public void test0094() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0094"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0.eVirtualUnset(1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
	}

	@Test
	public void test0095() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0095"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0
					.eVirtualUnset((short) 10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
	}

	@Test
	public void test0096() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0096"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean6 = zentaDiagramModel0.eIsSet(eStructuralFeature5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
	}

	@Test
	public void test0097() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0097"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean12 = false; // flaky: zentaDiagramModel0.eIsSet((int)
										// (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0098() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0098"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		zentaDiagramModel0.eSetDeliver(true);
		java.lang.Class<?> wildcardClass7 = zentaDiagramModel0.getClass();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
		org.junit.Assert.assertNotNull(wildcardClass7);
	}

	@Test
	public void test0099() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0099"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI6 = null;
		zentaDiagramModel5.eSetProxyURI(uRI6);
		zentaDiagramModel5.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList10 = zentaDiagramModel5
				.eAdapters();
		java.lang.Object obj11 = zentaDiagramModel0.eInvoke(4, adapterList10);
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean13 = zentaDiagramModel0.eVirtualIsSet(' ');
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNotNull(adapterList10);
		org.junit.Assert.assertNull(obj11);
	}

	@Test
	public void test0100() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0100"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0.eVirtualUnset('a');
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(eObjectItor6);
	}

	@Test
	public void test0101() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0101"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0
				.eContainer();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0
					.eGet(eStructuralFeature6, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eObject5);
	}

	@Test
	public void test0102() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0102"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int7 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertNull(internalEObject5);
	}

	@Test
	public void test0103() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0103"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.eNotificationRequired();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj13 = zentaDiagramModel0
					.eVirtualUnset((short) -1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + false + "'", boolean11 == false
		);
	}

	@Test
	public void test0104() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0104"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.prepareDelete();
		org.rulez.magwas.zenta.model.IFolder iFolder11 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder12 = null;
		zentaDiagramModel0.move(iFolder11, iFolder12);
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(undoState10);
	}

	@Test
	public void test0105() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0105"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		java.lang.Object obj13 = zentaDiagramModel9.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject14 = zentaDiagramModel9
				.eInternalContainer();
		boolean boolean15 = zentaDiagramModel9.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor16 = zentaDiagramModel9
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore21 = zentaDiagramModel18
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList22 = zentaDiagramModel18
				.eAdapters();
		java.lang.Object obj23 = zentaDiagramModel9
				.eInvoke((short) 0, adapterList22);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj24 = zentaDiagramModel0
					.eDynamicInvoke(10, adapterList22);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(obj13);
		org.junit.Assert.assertNull(internalEObject14);
		org.junit.Assert.assertTrue(
				"'" + boolean15 + "' != '" + false + "'", boolean15 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor16);
		org.junit.Assert.assertNull(eStore21);
		org.junit.Assert.assertNotNull(adapterList22);
		org.junit.Assert.assertNotNull(obj23);
	}

	@Test
	public void test0106() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0106"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0.eVirtualGet(100);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
	}

	@Test
	public void test0107() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0107"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource14 = zentaDiagramModel11
				.eResource();
		zentaDiagramModel11.checkId("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eDynamicSet(eStructuralFeature10, zentaDiagramModel11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert.assertNull(resource14);
	}

	@Test
	public void test0108() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0108"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.Object obj12 = null;
		java.lang.Object obj13 = zentaDiagramModel0.getAdapter(obj12);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean15 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(obj13);
	}

	@Test
	public void test0109() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0109"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eOpenGet(eStructuralFeature8, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(adapterList6);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
	}

	@Test
	public void test0110() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0110"
			);
		int int0 = org.eclipse.emf.ecore.InternalEObject.EOPPOSITE_FEATURE_BASE;
		org.junit.Assert
				.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
	}

	@Test
	public void test0111() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0111"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		zentaDiagramModel0.setConnectionRouterType('4');
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
	}

	@Test
	public void test0112() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0112"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting7 = zentaDiagramModel0
					.eSetting(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNotNull(eClass4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
	}

	@Test
	public void test0113() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0113"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject4 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0114() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0114"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		int int13 = zentaDiagramModel0.getLineWidth();
		zentaDiagramModel0.checkId("");
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj17 = zentaDiagramModel0.eVirtualUnset((byte) 1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
	}

	@Test
	public void test0115() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0115"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean4 = zentaDiagramModel0.eNotificationRequired();
		boolean boolean5 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.EObject eObject6 = zentaDiagramModel0.getCopy();
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean4 + "' != '" + false + "'", boolean4 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
		org.junit.Assert.assertNotNull(eObject6);
	}

	@Test
	public void test0116() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0116"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.util.URI uRI6 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList14 = zentaDiagramModel8
				.eAdapters();
		java.lang.Object obj15 = zentaDiagramModel0.eInvoke(0, adapterList14);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel19 = zentaDiagramModel16
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass20 = zentaDiagramModel16.eClass();
		zentaDiagramModel0.eSetClass(eClass20);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature22 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenSet(eStructuralFeature22, (-1.0f));
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(uRI6);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertNotNull(adapterList14);
		org.junit.Assert.assertNotNull(obj15);
		org.junit.Assert.assertNotNull(iDiagramModel19);
		org.junit.Assert.assertNotNull(eClass20);
	}

	@Test
	public void test0117() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0117"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting14 = zentaDiagramModel0
					.eSetting(eStructuralFeature13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
	}

	@Test
	public void test0118() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0118"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj6 = zentaDiagramModel0
					.eGet(eStructuralFeature4, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
	}

	@Test
	public void test0119() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0119"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor10 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean12 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(eObjectItor10);
	}

	@Test
	public void test0120() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0120"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj14 = zentaDiagramModel5
					.eVirtualUnset((byte) 100);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
	}

	@Test
	public void test0121() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0121"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		boolean boolean12 = zentaDiagramModel8.eNotificationRequired();
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel0
				.eBasicSetContainer(
						zentaDiagramModel8, (short) 0, notificationChain14
				);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.IZentaModel iZentaModel16 = zentaDiagramModel8
					.getZentaModel();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
		org.junit.Assert.assertNull(notificationChain15);
	}

	@Test
	public void test0122() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0122"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		org.eclipse.emf.ecore.InternalEObject.EStore eStore6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0123() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0123"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eOpenGet(eStructuralFeature7, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
	}

	@Test
	public void test0124() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0124"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject8 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertNotNull(eObjectList6);
	}

	@Test
	public void test0125() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0125"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore12 = zentaDiagramModel9
				.eStore();
		org.eclipse.emf.common.notify.Notification notification13 = null;
		zentaDiagramModel9.eNotify(notification13);
		zentaDiagramModel9.setName("hi!");
		int int17 = zentaDiagramModel9.getViewpoint();
		zentaDiagramModel9.setName("hi!");
		zentaDiagramModel9.setId("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel22 = zentaDiagramModel9
				.getDiagramModel();
		zentaDiagramModel9.eSetDeliver(false);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str25 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature8, zentaDiagramModel9
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(eStore12);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel22);
	}

	@Test
	public void test0126() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0126"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		java.lang.Class<?> wildcardClass8 = zentaDiagramModel0.getClass();
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNotNull(wildcardClass8);
	}

	@Test
	public void test0127() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0127"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj7 = zentaDiagramModel0.eVirtualUnset(10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertNull(internalEObject5);
	}

	@Test
	public void test0128() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0128"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		zentaDiagramModel0.setId("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.eSetDeliver(false);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel16 = zentaDiagramModel0
				.getDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj20 = null; // flaky:
											// zentaDiagramModel0.eGet((int)
											// (byte) 100, true, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertNotNull(iDiagramModel16);
	}

	@Test
	public void test0129() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0129"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		java.lang.Object obj17 = zentaDiagramModel13.getAdapter(0L);
		int int18 = zentaDiagramModel13.getLineWidth();
		java.lang.String str19 = zentaDiagramModel13.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal20 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain21 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain22 = zentaDiagramModel13
				.eSetResource(internal20, notificationChain21);
		org.rulez.magwas.zenta.model.UndoState undoState23 = zentaDiagramModel13
				.prepareDelete();
		org.rulez.magwas.zenta.model.UndoState undoState24 = zentaDiagramModel0
				.delete(undoState23);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert.assertNull(obj17);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
		org.junit.Assert.assertEquals(
				"'" + str19 + "' != '" + "hi!" + "'", str19, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain22);
		org.junit.Assert.assertNotNull(undoState23);
	}

	@Test
	public void test0130() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0130"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.ecore.EReference eReference7 = zentaDiagramModel0
				.eContainmentFeature();
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertNotNull(eObjectList6);
		org.junit.Assert.assertNull(eReference7);
	}

	@Test
	public void test0131() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0131"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.NotificationChain notificationChain5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain6 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
	}

	@Test
	public void test0132() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0132"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0.eVirtualGet((byte) 1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
	}

	@Test
	public void test0133() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0133"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		boolean boolean5 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean7 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNotNull(eClass4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
	}

	@Test
	public void test0134() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0134"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		java.lang.String str8 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset(eStructuralFeature9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
	}

	@Test
	public void test0135() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0135"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		zentaDiagramModel0.setDocumentation("");
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean10 = zentaDiagramModel0.eIsSet(0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
	}

	@Test
	public void test0136() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0136"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		zentaDiagramModel0.setAdapter(zentaDiagramModel7, zentaDiagramModel15);
		org.rulez.magwas.zenta.model.IFolder iFolder20 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder21 = null;
		zentaDiagramModel7.move(iFolder20, iFolder21);
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNull(eStore18);
	}

	@Test
	public void test0137() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0137"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		zentaDiagramModel0.checkId("");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean10 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
	}

	@Test
	public void test0138() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0138"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str11 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature6, zentaDiagramModel7
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertNull(eStore10);
	}

	@Test
	public void test0139() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0139"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = zentaDiagramModel0
				.eDirectResource();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI14 = null;
		zentaDiagramModel13.eSetProxyURI(uRI14);
		zentaDiagramModel13.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList18 = zentaDiagramModel13
				.eAdapters();
		java.lang.Object obj19 = zentaDiagramModel8.eInvoke(4, adapterList18);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj20 = zentaDiagramModel0
					.eDynamicInvoke((short) 1, adapterList18);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: No InvocationDelegate registered to provide an eInvoke implementation for setAdapter"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(internal6);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertNotNull(adapterList18);
		org.junit.Assert.assertNull(obj19);
	}

	@Test
	public void test0140() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0140"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		java.lang.Object obj8 = zentaDiagramModel4.getAdapter(0L);
		int int9 = zentaDiagramModel4.getLineWidth();
		java.lang.String str10 = zentaDiagramModel4.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal11 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain12 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain13 = zentaDiagramModel4
				.eSetResource(internal11, notificationChain12);
		org.rulez.magwas.zenta.model.UndoState undoState14 = zentaDiagramModel4
				.prepareDelete();
		org.rulez.magwas.zenta.model.UndoState undoState15 = zentaDiagramModel0
				.delete(undoState14);
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNull(obj8);
		org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
		org.junit.Assert.assertEquals(
				"'" + str10 + "' != '" + "hi!" + "'", str10, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain13);
		org.junit.Assert.assertNotNull(undoState14);
	}

	@Test
	public void test0141() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0141"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList11 = zentaDiagramModel0
				.eContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList18 = zentaDiagramModel13
				.eContents();
		int int19 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel20 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel20.setDocumentation("hi!");
		java.lang.Object obj24 = zentaDiagramModel20.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject25 = zentaDiagramModel20
				.eInternalContainer();
		boolean boolean26 = zentaDiagramModel20.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor27 = zentaDiagramModel20
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel29 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel29.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore32 = zentaDiagramModel29
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList33 = zentaDiagramModel29
				.eAdapters();
		java.lang.Object obj34 = zentaDiagramModel20
				.eInvoke((short) 0, adapterList33);
		java.lang.Object obj35 = zentaDiagramModel13.getAdapter(adapterList33);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj36 = zentaDiagramModel0
					.eDynamicInvoke(100, adapterList33);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNotNull(eObjectList11);
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNotNull(eObjectList18);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
		org.junit.Assert.assertNull(obj24);
		org.junit.Assert.assertNull(internalEObject25);
		org.junit.Assert.assertTrue(
				"'" + boolean26 + "' != '" + false + "'", boolean26 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor27);
		org.junit.Assert.assertNull(eStore32);
		org.junit.Assert.assertNotNull(adapterList33);
		org.junit.Assert.assertNotNull(obj34);
		org.junit.Assert.assertNull(obj35);
	}

	@Test
	public void test0142() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0142"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		java.lang.Object obj13 = zentaDiagramModel9.getAdapter(0L);
		int int14 = zentaDiagramModel9.getLineWidth();
		java.lang.String str15 = zentaDiagramModel9.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal16 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain17 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain18 = zentaDiagramModel9
				.eSetResource(internal16, notificationChain17);
		org.rulez.magwas.zenta.model.UndoState undoState19 = zentaDiagramModel9
				.prepareDelete();
		org.rulez.magwas.zenta.model.UndoState undoState20 = zentaDiagramModel0
				.delete(undoState19);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(obj13);
		org.junit.Assert
				.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
		org.junit.Assert.assertEquals(
				"'" + str15 + "' != '" + "hi!" + "'", str15, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain18);
		org.junit.Assert.assertNotNull(undoState19);
	}

	@Test
	public void test0143() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0143"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject7 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertNull(internalEObject5);
	}

	@Test
	public void test0144() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0144"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean9 = zentaDiagramModel0.eVirtualIsSet((short) 100);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
	}

	@Test
	public void test0145() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0145"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel10 = zentaDiagramModel7
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass11 = zentaDiagramModel7.eClass();
		zentaDiagramModel0.eSetClass(eClass11);
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(eObjectItor6);
		org.junit.Assert.assertNotNull(iDiagramModel10);
		org.junit.Assert.assertNotNull(eClass11);
	}

	@Test
	public void test0146() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0146"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		boolean boolean6 = zentaDiagramModel0.hasDiagramReferences();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass10 = zentaDiagramModel7.eClass();
		boolean boolean11 = zentaDiagramModel7.eDeliver();
		boolean boolean12 = zentaDiagramModel0.eContains(zentaDiagramModel7);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(eClass10);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
	}

	@Test
	public void test0147() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0147"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.ecore.EReference eReference5 = zentaDiagramModel0
				.eContainmentFeature();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj7 = zentaDiagramModel0.eVirtualUnset(10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eReference5);
	}

	@Test
	public void test0148() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0148"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal5 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = zentaDiagramModel0
				.eSetResource(internal5, notificationChain6);
		org.rulez.magwas.zenta.model.UndoState undoState8 = zentaDiagramModel0
				.delete();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert.assertNull(notificationChain7);
	}

	@Test
	public void test0149() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0149"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		zentaDiagramModel0.setId("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.eSetDeliver(false);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj18 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature16, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel13);
	}

	@Test
	public void test0150() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0150"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal12 = zentaDiagramModel8
				.eInternalResource();
		java.lang.String str13 = zentaDiagramModel8.getDocumentation();
		boolean boolean14 = zentaDiagramModel8.isChecked();
		zentaDiagramModel8.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel17 = zentaDiagramModel8
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eDynamicSet(eStructuralFeature7, zentaDiagramModel8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertNull(internal12);
		org.junit.Assert.assertEquals(
				"'" + str13 + "' != '" + "hi!" + "'", str13, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + false + "'", boolean14 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel17);
	}

	@Test
	public void test0151() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0151"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		zentaDiagramModel0.checkId("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		int int9 = zentaDiagramModel6.eContainerFeatureID();
		java.lang.String str10 = zentaDiagramModel6.getName();
		int int11 = zentaDiagramModel6.getViewpoint();
		org.eclipse.emf.common.notify.NotificationChain notificationChain13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain14 = zentaDiagramModel0
					.eInverseRemove(
							zentaDiagramModel6, (short) -1, notificationChain13
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
		org.junit.Assert
				.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
	}

	@Test
	public void test0152() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0152"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		int int12 = zentaDiagramModel7.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList13 = zentaDiagramModel7
				.eAdapters();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel14 = zentaDiagramModel7
				.findDiagramModel();
		java.lang.String str15 = zentaDiagramModel7.getLineColor();
		org.eclipse.emf.common.notify.NotificationChain notificationChain17 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain18 = zentaDiagramModel0
					.eInverseRemove(zentaDiagramModel7, 2, notificationChain17);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(obj11);
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
		org.junit.Assert.assertNotNull(adapterList13);
		org.junit.Assert.assertNotNull(iDiagramModel14);
		org.junit.Assert.assertNull(str15);
	}

	@Test
	public void test0153() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0153"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj13 = zentaDiagramModel0
					.eOpenGet(eStructuralFeature11, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
	}

	@Test
	public void test0154() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0154"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		org.eclipse.emf.ecore.EOperation eOperation9 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel10 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel10.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore13 = zentaDiagramModel10
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList14 = zentaDiagramModel10
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj15 = zentaDiagramModel0
					.eInvoke(eOperation9, adapterList14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain8);
		org.junit.Assert.assertNull(eStore13);
		org.junit.Assert.assertNotNull(adapterList14);
	}

	@Test
	public void test0155() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0155"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		zentaDiagramModel0.eSetDeliver(true);
		boolean boolean7 = zentaDiagramModel0.eDeliver();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + true + "'", boolean7 == true
		);
	}

	@Test
	public void test0156() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0156"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int9 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
	}

	@Test
	public void test0157() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0157"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		java.lang.String str7 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		java.lang.String str14 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal15 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain16 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain17 = zentaDiagramModel8
				.eSetResource(internal15, notificationChain16);
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = zentaDiagramModel8
				.eInternalResource();
		zentaDiagramModel8.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel21 = zentaDiagramModel8
				.findDiagramModel();
		java.lang.String str22 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature23 = zentaDiagramModel8
				.eContainingFeature();
		boolean boolean24 = zentaDiagramModel8.isDeleted();
		org.eclipse.emf.ecore.EObject eObject25 = zentaDiagramModel0
				.eResolveProxy(zentaDiagramModel8);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature26 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int27 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature26);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert
				.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain17);
		org.junit.Assert.assertNull(internal18);
		org.junit.Assert.assertNotNull(iDiagramModel21);
		org.junit.Assert.assertEquals(
				"'" + str22 + "' != '" + "hi!" + "'", str22, "hi!"
		);
		org.junit.Assert.assertNull(eStructuralFeature23);
		org.junit.Assert.assertTrue(
				"'" + boolean24 + "' != '" + true + "'", boolean24 == true
		);
		org.junit.Assert.assertNotNull(eObject25);
	}

	@Test
	public void test0158() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0158"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		boolean boolean5 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj7 = zentaDiagramModel0
					.eGet(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + true + "'", boolean5 == true
		);
	}

	@Test
	public void test0159() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0159"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.common.notify.Notification notification8 = null;
		zentaDiagramModel0.eNotify(notification8);
		zentaDiagramModel0.setName("hi!");
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj15 = zentaDiagramModel0
					.eGet(eStructuralFeature13, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
	}

	@Test
	public void test0160() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0160"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		boolean boolean5 = zentaDiagramModel0.hasDiagramReferences();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		int int10 = zentaDiagramModel7.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal11 = zentaDiagramModel7
				.eInternalResource();
		java.lang.String str12 = zentaDiagramModel7.getDocumentation();
		boolean boolean13 = zentaDiagramModel7.isChecked();
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel16 = zentaDiagramModel7
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eOpenSet(eStructuralFeature6, zentaDiagramModel7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
		org.junit.Assert.assertNull(internal11);
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean13 + "' != '" + false + "'", boolean13 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel16);
	}

	@Test
	public void test0161() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0161"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean13 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList14 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature15 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj17 = zentaDiagramModel0
					.eGet(eStructuralFeature15, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean13 + "' != '" + false + "'", boolean13 == false
		);
		org.junit.Assert.assertNotNull(eObjectList14);
	}

	@Test
	public void test0162() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0162"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		zentaDiagramModel5.setLineWidth(0);
		zentaDiagramModel5.setLineColor("");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature21 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		java.lang.Object obj26 = zentaDiagramModel22.getAdapter(0L);
		int int27 = zentaDiagramModel22.getLineWidth();
		java.lang.String str28 = zentaDiagramModel22.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal29 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain30 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain31 = zentaDiagramModel22
				.eSetResource(internal29, notificationChain30);
		org.eclipse.emf.ecore.resource.Resource.Internal internal32 = zentaDiagramModel22
				.eInternalResource();
		zentaDiagramModel22.setName("");
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel5
					.eOpenSet(eStructuralFeature21, zentaDiagramModel22);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert.assertNull(obj26);
		org.junit.Assert
				.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
		org.junit.Assert.assertEquals(
				"'" + str28 + "' != '" + "hi!" + "'", str28, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain31);
		org.junit.Assert.assertNull(internal32);
	}

	@Test
	public void test0163() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0163"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList13 = zentaDiagramModel8
				.eContents();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel14 = zentaDiagramModel8
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eDynamicSet(eStructuralFeature7, zentaDiagramModel8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert.assertNotNull(eObjectList13);
		org.junit.Assert.assertNotNull(iDiagramModel14);
	}

	@Test
	public void test0164() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0164"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		boolean boolean6 = zentaDiagramModel0.hasDiagramReferences();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass10 = zentaDiagramModel7.eClass();
		boolean boolean11 = zentaDiagramModel7.eDeliver();
		boolean boolean12 = zentaDiagramModel0.eContains(zentaDiagramModel7);
		org.eclipse.emf.common.notify.NotificationChain notificationChain13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain14 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(eClass10);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
	}

	@Test
	public void test0165() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0165"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0
					.eDynamicGet(' ', true, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0166() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0166"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.initId();
		org.rulez.magwas.zenta.model.IFolder iFolder11 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder12 = null;
		zentaDiagramModel0.move(iFolder11, iFolder12);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
	}

	@Test
	public void test0167() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0167"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean10 = zentaDiagramModel9.isDeleted();
		org.eclipse.emf.ecore.EObject eObject11 = zentaDiagramModel9.getCopy();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str12 = zentaDiagramModel0
					.eURIFragmentSegment(eStructuralFeature8, eObject11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + true + "'", boolean10 == true
		);
		org.junit.Assert.assertNotNull(eObject11);
	}

	@Test
	public void test0168() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0168"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		boolean boolean12 = zentaDiagramModel8.eNotificationRequired();
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel0
				.eBasicSetContainer(
						zentaDiagramModel8, (short) 0, notificationChain14
				);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int17 = zentaDiagramModel8
					.eDerivedStructuralFeatureID(eStructuralFeature16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
		org.junit.Assert.assertNull(notificationChain15);
	}

	@Test
	public void test0169() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0169"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature17 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting18 = zentaDiagramModel5
					.eSetting(eStructuralFeature17);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
	}

	@Test
	public void test0170() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0170"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		int int10 = zentaDiagramModel7.eContainerFeatureID();
		java.lang.String str11 = zentaDiagramModel7.getName();
		int int12 = zentaDiagramModel7.getViewpoint();
		zentaDiagramModel7.eSetDeliver(true);
		org.eclipse.emf.common.notify.Notification notification15 = null;
		zentaDiagramModel7.eNotify(notification15);
		zentaDiagramModel7.setName("hi!");
		int int19 = zentaDiagramModel7.eContainerFeatureID();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicSet(eStructuralFeature6, int19);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
		org.junit.Assert
				.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
	}

	@Test
	public void test0171() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0171"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI6 = null;
		zentaDiagramModel5.eSetProxyURI(uRI6);
		zentaDiagramModel5.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList10 = zentaDiagramModel5
				.eAdapters();
		java.lang.Object obj11 = zentaDiagramModel0.eInvoke(4, adapterList10);
		org.eclipse.emf.common.notify.NotificationChain notificationChain12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain13 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNotNull(adapterList10);
		org.junit.Assert.assertNull(obj11);
	}

	@Test
	public void test0172() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0172"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		int int17 = zentaDiagramModel12.eContainerFeatureID();
		zentaDiagramModel12.setLineWidth(0);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature20 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setDocumentation("hi!");
		int int24 = zentaDiagramModel21.eContainerFeatureID();
		java.lang.String str25 = zentaDiagramModel21.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel26 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel26.setDocumentation("hi!");
		int int29 = zentaDiagramModel26.eContainerFeatureID();
		java.lang.String str30 = zentaDiagramModel26.getName();
		zentaDiagramModel21.setAdapter(zentaDiagramModel26, 1L);
		java.lang.String str33 = zentaDiagramModel26.getId();
		int int34 = zentaDiagramModel26.getViewpoint();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList35 = zentaDiagramModel26
				.getProperties();
		org.eclipse.emf.ecore.EReference eReference36 = zentaDiagramModel26
				.eContainmentFeature();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel37 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI38 = null;
		zentaDiagramModel37.eSetProxyURI(uRI38);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel40 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel40.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass43 = zentaDiagramModel40.eClass();
		zentaDiagramModel37.eSetClass(eClass43);
		zentaDiagramModel26.eSetClass(eClass43);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str46 = zentaDiagramModel12.eURIFragmentSegment(
					eStructuralFeature20, zentaDiagramModel26
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
		org.junit.Assert
				.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
		org.junit.Assert
				.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
		org.junit.Assert.assertNull(str33);
		org.junit.Assert
				.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
		org.junit.Assert.assertNotNull(iPropertyList35);
		org.junit.Assert.assertNull(eReference36);
		org.junit.Assert.assertNotNull(eClass43);
	}

	@Test
	public void test0173() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0173"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineColor("");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		int int9 = zentaDiagramModel6.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI12 = null;
		zentaDiagramModel11.eSetProxyURI(uRI12);
		zentaDiagramModel11.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList16 = zentaDiagramModel11
				.eAdapters();
		java.lang.Object obj17 = zentaDiagramModel6.eInvoke(4, adapterList16);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj18 = zentaDiagramModel0
					.eDynamicInvoke((short) 100, adapterList16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
		org.junit.Assert.assertNotNull(adapterList16);
		org.junit.Assert.assertNull(obj17);
	}

	@Test
	public void test0174() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0174"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		int int18 = zentaDiagramModel15.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal23 = zentaDiagramModel19
				.eInternalResource();
		java.lang.String str24 = zentaDiagramModel19.getDocumentation();
		boolean boolean25 = zentaDiagramModel15.eContains(zentaDiagramModel19);
		boolean boolean26 = zentaDiagramModel15.isDeleted();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel27 = zentaDiagramModel15
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str28 = zentaDiagramModel5.eURIFragmentSegment(
					eStructuralFeature14, zentaDiagramModel15
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert.assertNull(internal23);
		org.junit.Assert.assertEquals(
				"'" + str24 + "' != '" + "hi!" + "'", str24, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean25 + "' != '" + false + "'", boolean25 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean26 + "' != '" + true + "'", boolean26 == true
		);
		org.junit.Assert.assertNotNull(iDiagramModel27);
	}

	@Test
	public void test0175() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0175"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		int int8 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.Class<?> wildcardClass9 = zentaDiagramModel0.getClass();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNotNull(wildcardClass9);
	}

	@Test
	public void test0176() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0176"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.EOperation eOperation7 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList13 = zentaDiagramModel8
				.eContents();
		int int14 = zentaDiagramModel8.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		java.lang.Object obj19 = zentaDiagramModel15.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject20 = zentaDiagramModel15
				.eInternalContainer();
		boolean boolean21 = zentaDiagramModel15.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor22 = zentaDiagramModel15
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel24 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel24.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore27 = zentaDiagramModel24
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList28 = zentaDiagramModel24
				.eAdapters();
		java.lang.Object obj29 = zentaDiagramModel15
				.eInvoke((short) 0, adapterList28);
		java.lang.Object obj30 = zentaDiagramModel8.getAdapter(adapterList28);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj31 = zentaDiagramModel0
					.eInvoke(eOperation7, adapterList28);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert.assertNotNull(eObjectList13);
		org.junit.Assert
				.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
		org.junit.Assert.assertNull(obj19);
		org.junit.Assert.assertNull(internalEObject20);
		org.junit.Assert.assertTrue(
				"'" + boolean21 + "' != '" + false + "'", boolean21 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor22);
		org.junit.Assert.assertNull(eStore27);
		org.junit.Assert.assertNotNull(adapterList28);
		org.junit.Assert.assertNotNull(obj29);
		org.junit.Assert.assertNull(obj30);
	}

	@Test
	public void test0177() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0177"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		org.eclipse.emf.common.util.URI uRI14 = null;
		zentaDiagramModel5.eSetProxyURI(uRI14);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor16 = zentaDiagramModel5
				.eAllContents();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert.assertNotNull(eObjectItor16);
	}

	@Test
	public void test0178() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0178"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		zentaDiagramModel0.setAdapter(zentaDiagramModel7, zentaDiagramModel15);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature20 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI22 = null;
		zentaDiagramModel21.eSetProxyURI(uRI22);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel24 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel24.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass27 = zentaDiagramModel24.eClass();
		zentaDiagramModel21.eSetClass(eClass27);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel29 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel29.setDocumentation("hi!");
		int int32 = zentaDiagramModel29.eContainerFeatureID();
		boolean boolean33 = zentaDiagramModel29.eNotificationRequired();
		org.eclipse.emf.common.notify.NotificationChain notificationChain35 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain36 = zentaDiagramModel21
				.eBasicSetContainer(
						zentaDiagramModel29, (short) 0, notificationChain35
				);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel15
					.eOpenSet(eStructuralFeature20, zentaDiagramModel21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNull(eStore18);
		org.junit.Assert.assertNotNull(eClass27);
		org.junit.Assert
				.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean33 + "' != '" + false + "'", boolean33 == false
		);
		org.junit.Assert.assertNull(notificationChain36);
	}

	@Test
	public void test0179() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0179"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		boolean boolean5 = zentaDiagramModel0.hasDiagramReferences();
		org.eclipse.emf.ecore.EOperation eOperation6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int7 = zentaDiagramModel0.eDerivedOperationID(eOperation6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
	}

	@Test
	public void test0180() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0180"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		zentaDiagramModel5.eUnset((byte) 10);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel26 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel26.setDocumentation("hi!");
		int int29 = zentaDiagramModel26.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject30 = zentaDiagramModel19
				.eResolveProxy(zentaDiagramModel26);
		java.lang.String str31 = zentaDiagramModel26.getName();
		org.eclipse.emf.ecore.EObject eObject32 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel26);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature33 = null;
		java.lang.Object obj34 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel5.eSet(eStructuralFeature33, obj34);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
		org.junit.Assert.assertNotNull(eObject30);
		org.junit.Assert
				.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
		org.junit.Assert.assertNotNull(eObject32);
	}

	@Test
	public void test0181() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0181"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.ecore.EObject eObject4 = zentaDiagramModel0
				.eContainer();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.check();
			org.junit.Assert.fail(
					"Expected exception of type org.rulez.magwas.zenta.model.ModelConsistencyException; message: id cannot be null: org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel@43254d8e (name: , id: null, lineWidth: 1, lineColor: null, documentation: hi!, connectionRouterType: 0) (viewpoint: 0)"
			);
		} catch (org.rulez.magwas.zenta.model.ModelConsistencyException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertNull(eObject4);
	}

	@Test
	public void test0182() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0182"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		boolean boolean6 = zentaDiagramModel0.eIsSet((short) 10);
		boolean boolean7 = zentaDiagramModel0.eDeliver();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		java.lang.String str14 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList15 = zentaDiagramModel8
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass19 = zentaDiagramModel16.eClass();
		zentaDiagramModel8.eSetClass(eClass19);
		zentaDiagramModel0.eSetClass(eClass19);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature22 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature22);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNotNull(eClass4);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + true + "'", boolean7 == true
		);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList15);
		org.junit.Assert.assertNotNull(eClass19);
	}

	@Test
	public void test0183() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0183"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = zentaDiagramModel0
				.eContainingFeature();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = zentaDiagramModel0
				.eContainingFeature();
		zentaDiagramModel0.setDocumentation("");
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(eStructuralFeature9);
		org.junit.Assert.assertNull(eStructuralFeature10);
	}

	@Test
	public void test0184() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0184"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.common.notify.Notification notification8 = null;
		zentaDiagramModel0.eNotify(notification8);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature10, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
	}

	@Test
	public void test0185() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0185"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting9 = zentaDiagramModel0
					.eSetting(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
	}

	@Test
	public void test0186() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0186"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		zentaDiagramModel5.eUnset((byte) 10);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean15 = zentaDiagramModel5
					.eDynamicIsSet(eStructuralFeature14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
	}

	@Test
	public void test0187() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0187"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		int int13 = zentaDiagramModel7.getViewpoint();
		int int14 = zentaDiagramModel7.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		int int18 = zentaDiagramModel15.eContainerFeatureID();
		java.lang.String str19 = zentaDiagramModel15.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel20 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel20.setDocumentation("hi!");
		int int23 = zentaDiagramModel20.eContainerFeatureID();
		java.lang.String str24 = zentaDiagramModel20.getName();
		zentaDiagramModel15.setAdapter(zentaDiagramModel20, 1L);
		java.lang.String str27 = zentaDiagramModel20.getId();
		int int28 = zentaDiagramModel20.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel29 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel29.setDocumentation("hi!");
		int int32 = zentaDiagramModel29.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal33 = zentaDiagramModel29
				.eInternalResource();
		java.lang.String str34 = zentaDiagramModel29.getDocumentation();
		boolean boolean35 = zentaDiagramModel29.isChecked();
		zentaDiagramModel29.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel38 = zentaDiagramModel29
				.findDiagramModel();
		zentaDiagramModel7.setAdapter(zentaDiagramModel20, zentaDiagramModel29);
		org.rulez.magwas.zenta.model.UndoState undoState40 = zentaDiagramModel20
				.prepareDelete();
		org.rulez.magwas.zenta.model.UndoState undoState41 = zentaDiagramModel0
				.delete(undoState40);
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(adapterList6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
		org.junit.Assert
				.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
		org.junit.Assert
				.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
		org.junit.Assert
				.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
		org.junit.Assert.assertNull(str27);
		org.junit.Assert
				.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
		org.junit.Assert
				.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
		org.junit.Assert.assertNull(internal33);
		org.junit.Assert.assertEquals(
				"'" + str34 + "' != '" + "hi!" + "'", str34, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean35 + "' != '" + false + "'", boolean35 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel38);
		org.junit.Assert.assertNotNull(undoState40);
	}

	@Test
	public void test0188() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0188"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel11 = zentaDiagramModel7
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eDynamicSet(eStructuralFeature6, iDiagramModel11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNotNull(iDiagramModel11);
	}

	@Test
	public void test0189() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0189"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		zentaDiagramModel0.setId("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj16 = zentaDiagramModel0
					.eDynamicGet((byte) 100, false, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0190() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0190"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean14 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
	}

	@Test
	public void test0191() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0191"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		int int4 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EOperation eOperation5 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		int int9 = zentaDiagramModel6.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI12 = null;
		zentaDiagramModel11.eSetProxyURI(uRI12);
		zentaDiagramModel11.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList16 = zentaDiagramModel11
				.eAdapters();
		java.lang.Object obj17 = zentaDiagramModel6.eInvoke(4, adapterList16);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj18 = zentaDiagramModel0
					.eInvoke(eOperation5, adapterList16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
		org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
		org.junit.Assert.assertNotNull(adapterList16);
		org.junit.Assert.assertNull(obj17);
	}

	@Test
	public void test0192() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0192"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature8, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
	}

	@Test
	public void test0193() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0193"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean4 = zentaDiagramModel0.eNotificationRequired();
		boolean boolean5 = zentaDiagramModel0.isChecked();
		java.lang.String str6 = zentaDiagramModel0.toString();
		java.lang.Object obj8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0.eVirtualGet('a', obj8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean4 + "' != '" + false + "'", boolean4 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
	}

	@Test
	public void test0194() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0194"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.getDiagramModel();
		iDiagramModel9.checkName("hi!");
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
	}

	@Test
	public void test0195() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0195"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal5 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = zentaDiagramModel0
				.eSetResource(internal5, notificationChain6);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature8, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert.assertNull(notificationChain7);
	}

	@Test
	public void test0196() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0196"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList4 = zentaDiagramModel0
				.getProperties();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		int int9 = zentaDiagramModel6.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI12 = null;
		zentaDiagramModel11.eSetProxyURI(uRI12);
		zentaDiagramModel11.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList16 = zentaDiagramModel11
				.eAdapters();
		java.lang.Object obj17 = zentaDiagramModel6.eInvoke(4, adapterList16);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj18 = zentaDiagramModel0
					.eDynamicInvoke((byte) 10, adapterList16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass3);
		org.junit.Assert.assertNotNull(iPropertyList4);
		org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
		org.junit.Assert.assertNotNull(adapterList16);
		org.junit.Assert.assertNull(obj17);
	}

	@Test
	public void test0197() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0197"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean4 = zentaDiagramModel0.eNotificationRequired();
		boolean boolean5 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.ecore.EOperation eOperation8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int9 = zentaDiagramModel0.eDerivedOperationID(eOperation8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean4 + "' != '" + false + "'", boolean4 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
	}

	@Test
	public void test0198() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0198"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.eclipse.emf.ecore.resource.Resource resource33 = zentaDiagramModel22
				.eResource();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean35 = false; // flaky:
										// zentaDiagramModel22.eIsSet(100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNull(resource33);
	}

	@Test
	public void test0199() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0199"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature3 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj6 = zentaDiagramModel0
					.eGet(eStructuralFeature3, true, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0200() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0200"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eGet(eStructuralFeature7, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
	}

	@Test
	public void test0201() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0201"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		java.lang.Object obj9 = zentaDiagramModel5.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject10 = zentaDiagramModel5
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList11 = zentaDiagramModel5
				.eContents();
		java.lang.Object obj12 = zentaDiagramModel0.getAdapter(eObjectList11);
		java.lang.String str13 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		int int18 = zentaDiagramModel15.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel20 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI21 = null;
		zentaDiagramModel20.eSetProxyURI(uRI21);
		zentaDiagramModel20.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList25 = zentaDiagramModel20
				.eAdapters();
		java.lang.Object obj26 = zentaDiagramModel15.eInvoke(4, adapterList25);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj27 = zentaDiagramModel0
					.eDynamicInvoke(0, adapterList25);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: No InvocationDelegate registered to provide an eInvoke implementation for getAdapter"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStructuralFeature4);
		org.junit.Assert.assertNull(obj9);
		org.junit.Assert.assertNull(internalEObject10);
		org.junit.Assert.assertNotNull(eObjectList11);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert.assertEquals(
				"'" + str13 + "' != '" + "hi!" + "'", str13, "hi!"
		);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
		org.junit.Assert.assertNotNull(adapterList25);
		org.junit.Assert.assertNull(obj26);
	}

	@Test
	public void test0202() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0202"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.eNotificationRequired();
		org.eclipse.emf.ecore.EReference eReference12 = zentaDiagramModel0
				.eContainmentFeature();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore16 = zentaDiagramModel13
				.eStore();
		org.eclipse.emf.common.notify.Notification notification17 = null;
		zentaDiagramModel13.eNotify(notification17);
		int int19 = zentaDiagramModel13.getViewpoint();
		org.eclipse.emf.common.notify.NotificationChain notificationChain21 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain22 = zentaDiagramModel0
					.eInverseAdd(
							zentaDiagramModel13, (byte) 1, notificationChain21
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + false + "'", boolean11 == false
		);
		org.junit.Assert.assertNull(eReference12);
		org.junit.Assert.assertNull(eStore16);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
	}

	@Test
	public void test0203() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0203"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean1 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EObject eObject2 = zentaDiagramModel0.getCopy();
		java.lang.Class<?> wildcardClass3 = eObject2.getClass();
		org.junit.Assert.assertTrue(
				"'" + boolean1 + "' != '" + true + "'", boolean1 == true
		);
		org.junit.Assert.assertNotNull(eObject2);
		org.junit.Assert.assertNotNull(wildcardClass3);
	}

	@Test
	public void test0204() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0204"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		org.eclipse.emf.ecore.EReference eReference6 = zentaDiagramModel0
				.eContainmentFeature();
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertNull(eReference6);
	}

	@Test
	public void test0205() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0205"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.util.URI uRI6 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList14 = zentaDiagramModel8
				.eAdapters();
		java.lang.Object obj15 = zentaDiagramModel0.eInvoke(0, adapterList14);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel19 = zentaDiagramModel16
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass20 = zentaDiagramModel16.eClass();
		zentaDiagramModel0.eSetClass(eClass20);
		org.eclipse.emf.ecore.resource.Resource.Internal internal22 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList24 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj25 = zentaDiagramModel0
					.eInvoke((short) 10, adapterList24);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(uRI6);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertNotNull(adapterList14);
		org.junit.Assert.assertNotNull(obj15);
		org.junit.Assert.assertNotNull(iDiagramModel19);
		org.junit.Assert.assertNotNull(eClass20);
		org.junit.Assert.assertNull(internal22);
	}

	@Test
	public void test0206() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0206"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		java.lang.Object obj9 = zentaDiagramModel5.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject10 = zentaDiagramModel5
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList11 = zentaDiagramModel5
				.eContents();
		java.lang.Object obj12 = zentaDiagramModel0.getAdapter(eObjectList11);
		java.lang.String str13 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean15 = zentaDiagramModel0.eIsSet(eStructuralFeature14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStructuralFeature4);
		org.junit.Assert.assertNull(obj9);
		org.junit.Assert.assertNull(internalEObject10);
		org.junit.Assert.assertNotNull(eObjectList11);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert.assertEquals(
				"'" + str13 + "' != '" + "hi!" + "'", str13, "hi!"
		);
	}

	@Test
	public void test0207() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0207"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.common.notify.NotificationChain notificationChain3 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain4 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain3);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0208() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0208"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean14 = zentaDiagramModel0.eIsSet(eStructuralFeature13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
	}

	@Test
	public void test0209() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0209"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		boolean boolean12 = zentaDiagramModel8.eNotificationRequired();
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel0
				.eBasicSetContainer(
						zentaDiagramModel8, (short) 0, notificationChain14
				);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore19 = zentaDiagramModel16
				.eStore();
		org.eclipse.emf.common.notify.Notification notification20 = null;
		zentaDiagramModel16.eNotify(notification20);
		java.lang.String str22 = zentaDiagramModel16.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel23 = zentaDiagramModel16
				.findDiagramModel();
		boolean boolean24 = zentaDiagramModel16.isDeleted();
		boolean boolean25 = zentaDiagramModel0.eContains(zentaDiagramModel16);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature26 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj28 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature26, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
		org.junit.Assert.assertNull(notificationChain15);
		org.junit.Assert.assertNull(eStore19);
		org.junit.Assert.assertNull(str22);
		org.junit.Assert.assertNotNull(iDiagramModel23);
		org.junit.Assert.assertTrue(
				"'" + boolean24 + "' != '" + true + "'", boolean24 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean25 + "' != '" + false + "'", boolean25 == false
		);
	}

	@Test
	public void test0210() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0210"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		int int33 = zentaDiagramModel22.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature34 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj36 = zentaDiagramModel22
					.eOpenGet(eStructuralFeature34, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert
				.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
	}

	@Test
	public void test0211() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0211"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		zentaDiagramModel0.checkId("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore9 = zentaDiagramModel6
				.eStore();
		org.eclipse.emf.common.notify.Notification notification10 = null;
		zentaDiagramModel6.eNotify(notification10);
		int int12 = zentaDiagramModel6.getViewpoint();
		int int13 = zentaDiagramModel6.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		java.lang.String str26 = zentaDiagramModel19.getId();
		int int27 = zentaDiagramModel19.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel28 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel28.setDocumentation("hi!");
		int int31 = zentaDiagramModel28.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal32 = zentaDiagramModel28
				.eInternalResource();
		java.lang.String str33 = zentaDiagramModel28.getDocumentation();
		boolean boolean34 = zentaDiagramModel28.isChecked();
		zentaDiagramModel28.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel37 = zentaDiagramModel28
				.findDiagramModel();
		zentaDiagramModel6.setAdapter(zentaDiagramModel19, zentaDiagramModel28);
		org.rulez.magwas.zenta.model.UndoState undoState39 = zentaDiagramModel19
				.prepareDelete();
		org.rulez.magwas.zenta.model.UndoState undoState40 = zentaDiagramModel0
				.delete(undoState39);
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertNull(eStore9);
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert.assertNull(str26);
		org.junit.Assert
				.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
		org.junit.Assert
				.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
		org.junit.Assert.assertNull(internal32);
		org.junit.Assert.assertEquals(
				"'" + str33 + "' != '" + "hi!" + "'", str33, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean34 + "' != '" + false + "'", boolean34 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel37);
		org.junit.Assert.assertNotNull(undoState39);
	}

	@Test
	public void test0212() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0212"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean8 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(adapterList6);
	}

	@Test
	public void test0213() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0213"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor7 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore12 = zentaDiagramModel9
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList13 = zentaDiagramModel9
				.eAdapters();
		java.lang.Object obj14 = zentaDiagramModel0
				.eInvoke((short) 0, adapterList13);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI17 = null;
		zentaDiagramModel16.eSetProxyURI(uRI17);
		zentaDiagramModel16.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList21 = zentaDiagramModel16
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj22 = zentaDiagramModel0
					.eInvoke('#', adapterList21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor7);
		org.junit.Assert.assertNull(eStore12);
		org.junit.Assert.assertNotNull(adapterList13);
		org.junit.Assert.assertNotNull(obj14);
		org.junit.Assert.assertNotNull(adapterList21);
	}

	@Test
	public void test0214() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0214"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean8 = zentaDiagramModel0.eIsSet(eStructuralFeature7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
	}

	@Test
	public void test0215() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0215"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.ecore.EReference eReference7 = zentaDiagramModel0
				.eContainmentFeature();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet(eStructuralFeature8, 100.0f);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertNotNull(eObjectList6);
		org.junit.Assert.assertNull(eReference7);
	}

	@Test
	public void test0216() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0216"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		boolean boolean12 = zentaDiagramModel8.eNotificationRequired();
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel0
				.eBasicSetContainer(
						zentaDiagramModel8, (short) 0, notificationChain14
				);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel17 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel17.setDocumentation("hi!");
		java.lang.Object obj21 = zentaDiagramModel17.getAdapter(0L);
		int int22 = zentaDiagramModel17.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList23 = zentaDiagramModel17
				.eAdapters();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel24 = zentaDiagramModel17
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel8.eSet(eStructuralFeature16, zentaDiagramModel17);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
		org.junit.Assert.assertNull(notificationChain15);
		org.junit.Assert.assertNull(obj21);
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
		org.junit.Assert.assertNotNull(adapterList23);
		org.junit.Assert.assertNotNull(iDiagramModel24);
	}

	@Test
	public void test0217() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0217"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean11 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
	}

	@Test
	public void test0218() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0218"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		int int6 = zentaDiagramModel0.getViewpoint();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject8 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
	}

	@Test
	public void test0219() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0219"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
	}

	@Test
	public void test0220() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0220"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean4 = zentaDiagramModel0.eNotificationRequired();
		boolean boolean5 = zentaDiagramModel0.isChecked();
		java.lang.String str6 = zentaDiagramModel0.toString();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0
					.eVirtualUnset((byte) 100);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean4 + "' != '" + false + "'", boolean4 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
	}

	@Test
	public void test0221() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0221"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor10 = zentaDiagramModel0
				.eAllContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0.eVirtualGet(52);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(eObjectItor10);
	}

	@Test
	public void test0222() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0222"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		boolean boolean12 = zentaDiagramModel8.eNotificationRequired();
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel0
				.eBasicSetContainer(
						zentaDiagramModel8, (short) 0, notificationChain14
				);
		zentaDiagramModel8.setDocumentation("hi!");
		zentaDiagramModel8.initId();
		org.eclipse.emf.ecore.EObject eObject19 = zentaDiagramModel8
				.eContainer();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject21 = zentaDiagramModel8
					.eObjectForURIFragmentSegment("");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1"
			);
		} catch (
				java.lang.IllegalArgumentException
				| java.lang.StringIndexOutOfBoundsException e
		) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
		org.junit.Assert.assertNull(notificationChain15);
		org.junit.Assert.assertNull(eObject19);
	}

	@Test
	public void test0223() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0223"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		org.eclipse.emf.common.util.URI uRI17 = null;
		zentaDiagramModel5.eSetProxyURI(uRI17);
		org.eclipse.emf.common.notify.NotificationChain notificationChain19 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain20 = zentaDiagramModel5
					.eBasicRemoveFromContainerFeature(notificationChain19);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
	}

	@Test
	public void test0224() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0224"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		zentaDiagramModel5.eUnset((byte) 10);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel26 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel26.setDocumentation("hi!");
		int int29 = zentaDiagramModel26.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject30 = zentaDiagramModel19
				.eResolveProxy(zentaDiagramModel26);
		java.lang.String str31 = zentaDiagramModel26.getName();
		org.eclipse.emf.ecore.EObject eObject32 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel26);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature33 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean34 = zentaDiagramModel5
					.eOpenIsSet(eStructuralFeature33);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
		org.junit.Assert.assertNotNull(eObject30);
		org.junit.Assert
				.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
		org.junit.Assert.assertNotNull(eObject32);
	}

	@Test
	public void test0225() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0225"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature15 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		int int19 = zentaDiagramModel16.eContainerFeatureID();
		java.lang.String str20 = zentaDiagramModel16.getName();
		int int21 = zentaDiagramModel16.getViewpoint();
		org.eclipse.emf.common.util.URI uRI22 = zentaDiagramModel16.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel24 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel24.setDocumentation("hi!");
		java.lang.Object obj28 = zentaDiagramModel24.getAdapter(0L);
		int int29 = zentaDiagramModel24.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList30 = zentaDiagramModel24
				.eAdapters();
		java.lang.Object obj31 = zentaDiagramModel16.eInvoke(0, adapterList30);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet(eStructuralFeature15, adapterList30);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
		org.junit.Assert
				.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert.assertNull(uRI22);
		org.junit.Assert.assertNull(obj28);
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
		org.junit.Assert.assertNotNull(adapterList30);
		org.junit.Assert.assertNotNull(obj31);
	}

	@Test
	public void test0226() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0226"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.UndoState undoState13 = zentaDiagramModel0
				.prepareDelete();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
		org.junit.Assert.assertNotNull(undoState13);
	}

	@Test
	public void test0227() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0227"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature33 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel22.eUnset(eStructuralFeature33);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
	}

	@Test
	public void test0228() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0228"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList11 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.common.notify.NotificationChain notificationChain12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain13 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNotNull(eObjectList11);
	}

	@Test
	public void test0229() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0229"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str8 = zentaDiagramModel0.getLineColor();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject10 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1"
			);
		} catch (
				java.lang.IllegalArgumentException
				| java.lang.StringIndexOutOfBoundsException e
		) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(adapterList6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertNull(str8);
	}

	@Test
	public void test0230() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0230"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		zentaDiagramModel0.setLineWidth((-1));
		int int11 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.URI uRI12 = null;
		zentaDiagramModel0.eSetProxyURI(uRI12);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting15 = zentaDiagramModel0
					.eSetting(eStructuralFeature14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain8);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
	}

	@Test
	public void test0231() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0231"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		zentaDiagramModel5.eUnset((byte) 10);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj15 = zentaDiagramModel5
					.eGet(eStructuralFeature14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
	}

	@Test
	public void test0232() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0232"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		java.lang.Class<?> wildcardClass5 = zentaDiagramModel0.getClass();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(wildcardClass5);
	}

	@Test
	public void test0233() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0233"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		zentaDiagramModel0.setAdapter(zentaDiagramModel7, zentaDiagramModel15);
		boolean boolean20 = zentaDiagramModel15.eDeliver();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel15.eDynamicUnset((short) 0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNull(eStore18);
		org.junit.Assert.assertTrue(
				"'" + boolean20 + "' != '" + true + "'", boolean20 == true
		);
	}

	@Test
	public void test0234() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0234"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean10 = zentaDiagramModel0.eVirtualIsSet((byte) 10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
	}

	@Test
	public void test0235() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0235"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		zentaDiagramModel0.setLineWidth((-1));
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		java.lang.Object obj16 = zentaDiagramModel12.getAdapter(0L);
		int int17 = zentaDiagramModel12.getLineWidth();
		java.lang.String str18 = zentaDiagramModel12.getId();
		boolean boolean19 = zentaDiagramModel12.isChecked();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str20 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature11, zentaDiagramModel12
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain8);
		org.junit.Assert.assertNull(obj16);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
		org.junit.Assert.assertNull(str18);
		org.junit.Assert.assertTrue(
				"'" + boolean19 + "' != '" + false + "'", boolean19 == false
		);
	}

	@Test
	public void test0236() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0236"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		boolean boolean6 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting8 = zentaDiagramModel0
					.eSetting(eStructuralFeature7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
	}

	@Test
	public void test0237() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0237"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		java.lang.String str3 = zentaDiagramModel0.getId();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj6 = zentaDiagramModel0
					.eDynamicInvoke(0, adapterList5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: No InvocationDelegate registered to provide an eInvoke implementation for getAdapter"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(str3);
	}

	@Test
	public void test0238() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0238"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		zentaDiagramModel0.checkId("");
		org.eclipse.emf.ecore.EOperation eOperation9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int10 = zentaDiagramModel0.eDerivedOperationID(eOperation9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
	}

	@Test
	public void test0239() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0239"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		zentaDiagramModel0.setId("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.eSetDeliver(false);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj18 = zentaDiagramModel0
					.eGet(eStructuralFeature16, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel13);
	}

	@Test
	public void test0240() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0240"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0.eVirtualGet(100);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertNotNull(eObjectList6);
	}

	@Test
	public void test0241() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0241"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean16 = zentaDiagramModel0.eDynamicIsSet(0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
	}

	@Test
	public void test0242() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0242"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		boolean boolean5 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean7 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + true + "'", boolean5 == true
		);
	}

	@Test
	public void test0243() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0243"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		boolean boolean7 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + true + "'", boolean7 == true
		);
	}

	@Test
	public void test0244() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0244"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.ecore.EObject eObject4 = zentaDiagramModel0
				.eContainer();
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int7 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertNull(eObject4);
		org.junit.Assert.assertNull(internalEObject5);
	}

	@Test
	public void test0245() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0245"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		java.lang.String str7 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList8 = zentaDiagramModel0
				.getProperties();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj11 = zentaDiagramModel0
					.eGet(eStructuralFeature9, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert
				.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
		org.junit.Assert.assertNotNull(iPropertyList8);
	}

	@Test
	public void test0246() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0246"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
	}

	@Test
	public void test0247() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0247"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineColor("");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		java.lang.Object obj9 = zentaDiagramModel5.getAdapter(0L);
		int int10 = zentaDiagramModel5.getLineWidth();
		java.lang.String str11 = zentaDiagramModel5.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal12 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain13 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = zentaDiagramModel5
				.eSetResource(internal12, notificationChain13);
		java.lang.Object obj18 = zentaDiagramModel5.eGet(2, false, false);
		java.lang.Object obj19 = zentaDiagramModel0.getAdapter(false);
		zentaDiagramModel0.eSetDeliver(false);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.check();
			org.junit.Assert.fail(
					"Expected exception of type org.rulez.magwas.zenta.model.ModelConsistencyException; message: id cannot be null: org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel@3202bb2b (name: , id: null, lineWidth: 1, lineColor: , documentation: , connectionRouterType: 0) (viewpoint: 0)"
			);
		} catch (org.rulez.magwas.zenta.model.ModelConsistencyException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj9);
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
		org.junit.Assert.assertEquals(
				"'" + str11 + "' != '" + "hi!" + "'", str11, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain14);
		org.junit.Assert.assertNull(obj18);
		org.junit.Assert.assertNull(obj19);
	}

	@Test
	public void test0248() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0248"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.NotificationChain notificationChain5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain6 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
	}

	@Test
	public void test0249() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0249"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject7 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1"
			);
		} catch (
				java.lang.IllegalArgumentException
				| java.lang.StringIndexOutOfBoundsException e
		) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
	}

	@Test
	public void test0250() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0250"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(eObjectItor6);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
	}

	@Test
	public void test0251() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0251"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		boolean boolean3 = zentaDiagramModel0.eIsProxy();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj7 = zentaDiagramModel0
					.eDynamicGet('4', true, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue(
				"'" + boolean3 + "' != '" + false + "'", boolean3 == false
		);
	}

	@Test
	public void test0252() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0252"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj11 = zentaDiagramModel0
					.eDynamicGet((byte) 100, false, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
	}

	@Test
	public void test0253() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0253"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		boolean boolean5 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + true + "'", boolean5 == true
		);
		org.junit.Assert.assertNull(notificationChain8);
	}

	@Test
	public void test0254() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0254"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
	}

	@Test
	public void test0255() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0255"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		zentaDiagramModel0.setLineWidth((-1));
		int int11 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.ecore.EOperation eOperation12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int13 = zentaDiagramModel0.eDerivedOperationID(eOperation12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain8);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
	}

	@Test
	public void test0256() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0256"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		zentaDiagramModel0.setId("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.eSetDeliver(false);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel16 = zentaDiagramModel0
				.getDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore21 = zentaDiagramModel18
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList22 = zentaDiagramModel18
				.eAdapters();
		boolean boolean23 = zentaDiagramModel18.eDeliver();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicSet(4, zentaDiagramModel18);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'lineWidth' is not a valid changeable feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertNotNull(iDiagramModel16);
		org.junit.Assert.assertNull(eStore21);
		org.junit.Assert.assertNotNull(adapterList22);
		org.junit.Assert.assertTrue(
				"'" + boolean23 + "' != '" + true + "'", boolean23 == true
		);
	}

	@Test
	public void test0257() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0257"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean16 = zentaDiagramModel0.eVirtualIsSet('#');
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
	}

	@Test
	public void test0258() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0258"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		boolean boolean6 = zentaDiagramModel0.eIsSet((short) 10);
		boolean boolean7 = zentaDiagramModel0.eDeliver();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		java.lang.String str14 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList15 = zentaDiagramModel8
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass19 = zentaDiagramModel16.eClass();
		zentaDiagramModel8.eSetClass(eClass19);
		zentaDiagramModel0.eSetClass(eClass19);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature22 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean23 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature22);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNotNull(eClass4);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + true + "'", boolean7 == true
		);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList15);
		org.junit.Assert.assertNotNull(eClass19);
	}

	@Test
	public void test0259() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0259"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EObject eObject9 = zentaDiagramModel0
				.eContainer();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel10 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel10.setDocumentation("hi!");
		java.lang.Object obj14 = zentaDiagramModel10.getAdapter(0L);
		int int15 = zentaDiagramModel10.getLineWidth();
		java.lang.String str16 = zentaDiagramModel10.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal17 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain18 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain19 = zentaDiagramModel10
				.eSetResource(internal17, notificationChain18);
		org.rulez.magwas.zenta.model.UndoState undoState20 = zentaDiagramModel10
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel24 = zentaDiagramModel21
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass25 = zentaDiagramModel21.eClass();
		zentaDiagramModel10.eSetClass(eClass25);
		zentaDiagramModel0.eSetClass(eClass25);
		boolean boolean28 = zentaDiagramModel0.isTemplate();
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNull(eObject9);
		org.junit.Assert.assertNull(obj14);
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
		org.junit.Assert.assertEquals(
				"'" + str16 + "' != '" + "hi!" + "'", str16, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain19);
		org.junit.Assert.assertNotNull(undoState20);
		org.junit.Assert.assertNotNull(iDiagramModel24);
		org.junit.Assert.assertNotNull(eClass25);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
	}

	@Test
	public void test0260() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0260"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor11 = zentaDiagramModel4
				.eAllContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel4.eUnset(eStructuralFeature12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor11);
	}

	@Test
	public void test0261() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0261"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel18 = zentaDiagramModel15
				.findDiagramModel();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore19 = zentaDiagramModel15
				.eStore();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel5
					.eOpenSet(eStructuralFeature14, zentaDiagramModel15);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel18);
		org.junit.Assert.assertNull(eStore19);
	}

	@Test
	public void test0262() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0262"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str8 = zentaDiagramModel0.getLineColor();
		java.lang.String str9 = zentaDiagramModel0.getDocumentation();
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(adapterList6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertNull(str8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
	}

	@Test
	public void test0263() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0263"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject9 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
	}

	@Test
	public void test0264() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0264"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EObject eObject9 = zentaDiagramModel0
				.eContainer();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel10 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel10.setDocumentation("hi!");
		int int13 = zentaDiagramModel10.eContainerFeatureID();
		java.lang.String str14 = zentaDiagramModel10.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		int int18 = zentaDiagramModel15.eContainerFeatureID();
		java.lang.String str19 = zentaDiagramModel15.getName();
		zentaDiagramModel10.setAdapter(zentaDiagramModel15, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject26 = zentaDiagramModel15
				.eResolveProxy(zentaDiagramModel22);
		zentaDiagramModel15.setLineWidth(0);
		zentaDiagramModel15.setLineColor("");
		java.lang.String str31 = zentaDiagramModel15.toString();
		org.eclipse.emf.common.notify.NotificationChain notificationChain33 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain34 = zentaDiagramModel0
					.eInverseRemove(
							zentaDiagramModel15, (byte) 0, notificationChain33
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -11 out of bounds for length 0"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNull(eObject9);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
		org.junit.Assert
				.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNotNull(eObject26);
	}

	@Test
	public void test0265() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0265"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		boolean boolean5 = zentaDiagramModel0.isTemplate();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		java.lang.Object obj10 = zentaDiagramModel6.getAdapter(0L);
		int int11 = zentaDiagramModel6.getLineWidth();
		java.lang.String str12 = zentaDiagramModel6.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		java.lang.Object obj17 = zentaDiagramModel13.getAdapter(0L);
		int int18 = zentaDiagramModel13.getLineWidth();
		java.lang.String str19 = zentaDiagramModel13.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList20 = zentaDiagramModel13
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass24 = zentaDiagramModel21.eClass();
		zentaDiagramModel13.eSetClass(eClass24);
		zentaDiagramModel6.eSetClass(eClass24);
		zentaDiagramModel0.eSetClass(eClass24);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel28 = zentaDiagramModel0
				.findDiagramModel();
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
		org.junit.Assert.assertNull(obj10);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
		org.junit.Assert.assertNull(obj17);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
		org.junit.Assert.assertEquals(
				"'" + str19 + "' != '" + "hi!" + "'", str19, "hi!"
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList20);
		org.junit.Assert.assertNotNull(eClass24);
		org.junit.Assert.assertNotNull(iDiagramModel28);
	}

	@Test
	public void test0266() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0266"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean4 = zentaDiagramModel0.eNotificationRequired();
		boolean boolean5 = zentaDiagramModel0.isChecked();
		java.lang.String str6 = zentaDiagramModel0.toString();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject8 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1"
			);
		} catch (
				java.lang.IllegalArgumentException
				| java.lang.StringIndexOutOfBoundsException e
		) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean4 + "' != '" + false + "'", boolean4 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
	}

	@Test
	public void test0267() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0267"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		zentaDiagramModel5.eUnset((byte) 10);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel26 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel26.setDocumentation("hi!");
		int int29 = zentaDiagramModel26.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject30 = zentaDiagramModel19
				.eResolveProxy(zentaDiagramModel26);
		java.lang.String str31 = zentaDiagramModel26.getName();
		org.eclipse.emf.ecore.EObject eObject32 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel26);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature33 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean34 = zentaDiagramModel26
					.eDynamicIsSet(eStructuralFeature33);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
		org.junit.Assert.assertNotNull(eObject30);
		org.junit.Assert
				.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
		org.junit.Assert.assertNotNull(eObject32);
	}

	@Test
	public void test0268() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0268"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		zentaDiagramModel0.setAdapter(zentaDiagramModel7, zentaDiagramModel15);
		java.lang.String str20 = zentaDiagramModel15.getDocumentation();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.IFolder iFolder21 = zentaDiagramModel15
					.getParentFolder();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNull(eStore18);
		org.junit.Assert.assertEquals(
				"'" + str20 + "' != '" + "hi!" + "'", str20, "hi!"
		);
	}

	@Test
	public void test0269() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0269"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = zentaDiagramModel0
				.eContainingFeature();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int11 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(eStructuralFeature9);
	}

	@Test
	public void test0270() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0270"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel14 = zentaDiagramModel11
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass15 = zentaDiagramModel11.eClass();
		zentaDiagramModel0.eSetClass(eClass15);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor17 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature18 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean19 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature18);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(undoState10);
		org.junit.Assert.assertNotNull(iDiagramModel14);
		org.junit.Assert.assertNotNull(eClass15);
		org.junit.Assert.assertNotNull(eObjectItor17);
	}

	@Test
	public void test0271() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0271"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature15 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature15);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
	}

	@Test
	public void test0272() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0272"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.findDiagramModel();
		zentaDiagramModel0.setDocumentation("");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList18 = zentaDiagramModel13
				.eContents();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel19 = zentaDiagramModel13
				.findDiagramModel();
		zentaDiagramModel13.setName("");
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicSet(eStructuralFeature12, "");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNotNull(eObjectList18);
		org.junit.Assert.assertNotNull(iDiagramModel19);
	}

	@Test
	public void test0273() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0273"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		java.lang.String str14 = zentaDiagramModel5.getName();
		zentaDiagramModel5.setDocumentation("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature17 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		java.lang.Object obj22 = zentaDiagramModel18.getAdapter(0L);
		int int23 = zentaDiagramModel18.getLineWidth();
		java.lang.String str24 = zentaDiagramModel18.getDocumentation();
		zentaDiagramModel18.checkId("");
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel5.eSet(eStructuralFeature17, "");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
		org.junit.Assert.assertNull(obj22);
		org.junit.Assert
				.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
		org.junit.Assert.assertEquals(
				"'" + str24 + "' != '" + "hi!" + "'", str24, "hi!"
		);
	}

	@Test
	public void test0274() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0274"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		zentaDiagramModel5.setLineWidth(0);
		zentaDiagramModel5.setName("hi!");
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
	}

	@Test
	public void test0275() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0275"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0.getCopy();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass9 = zentaDiagramModel6.eClass();
		boolean boolean10 = zentaDiagramModel6.eDeliver();
		zentaDiagramModel6.setDocumentation("");
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel0
					.eInverseAdd(zentaDiagramModel6, 52, notificationChain14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(eObject5);
		org.junit.Assert.assertNotNull(eClass9);
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + true + "'", boolean10 == true
		);
	}

	@Test
	public void test0276() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0276"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean4 = zentaDiagramModel0.eNotificationRequired();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor5 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean7 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean4 + "' != '" + false + "'", boolean4 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor5);
	}

	@Test
	public void test0277() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0277"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj5 = zentaDiagramModel0.eVirtualGet(10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
	}

	@Test
	public void test0278() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0278"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		java.lang.String str7 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		java.lang.String str14 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal15 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain16 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain17 = zentaDiagramModel8
				.eSetResource(internal15, notificationChain16);
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = zentaDiagramModel8
				.eInternalResource();
		zentaDiagramModel8.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel21 = zentaDiagramModel8
				.findDiagramModel();
		java.lang.String str22 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature23 = zentaDiagramModel8
				.eContainingFeature();
		boolean boolean24 = zentaDiagramModel8.isDeleted();
		org.eclipse.emf.ecore.EObject eObject25 = zentaDiagramModel0
				.eResolveProxy(zentaDiagramModel8);
		org.eclipse.emf.ecore.EOperation eOperation26 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int27 = zentaDiagramModel8.eDerivedOperationID(eOperation26);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert
				.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain17);
		org.junit.Assert.assertNull(internal18);
		org.junit.Assert.assertNotNull(iDiagramModel21);
		org.junit.Assert.assertEquals(
				"'" + str22 + "' != '" + "hi!" + "'", str22, "hi!"
		);
		org.junit.Assert.assertNull(eStructuralFeature23);
		org.junit.Assert.assertTrue(
				"'" + boolean24 + "' != '" + true + "'", boolean24 == true
		);
		org.junit.Assert.assertNotNull(eObject25);
	}

	@Test
	public void test0279() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0279"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		zentaDiagramModel0.checkDocumentation("hi!");
		zentaDiagramModel0.checkDocumentation("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eOpenGet(eStructuralFeature8, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0280() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0280"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		int int33 = zentaDiagramModel22.getViewpoint();
		org.eclipse.emf.common.util.URI uRI34 = zentaDiagramModel22.eProxyURI();
		java.lang.String str35 = zentaDiagramModel22.toString();
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert
				.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
		org.junit.Assert.assertNull(uRI34);
	}

	@Test
	public void test0281() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0281"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.eNotificationRequired();
		org.eclipse.emf.common.util.URI uRI12 = null;
		zentaDiagramModel0.eSetProxyURI(uRI12);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean15 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + false + "'", boolean11 == false
		);
	}

	@Test
	public void test0282() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0282"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0
					.eGet((byte) 0, false, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain8);
	}

	@Test
	public void test0283() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0283"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setLineColor("hi!");
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		boolean boolean9 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean11 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean9 + "' != '" + true + "'", boolean9 == true
		);
	}

	@Test
	public void test0284() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0284"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EObject eObject8 = zentaDiagramModel0
				.eContainer();
		zentaDiagramModel0.setId("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj14 = zentaDiagramModel0
					.eDynamicGet((byte) 0, false, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(eObject8);
	}

	@Test
	public void test0285() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0285"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EObject eObject8 = zentaDiagramModel0
				.eContainer();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj11 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature9, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(eObject8);
	}

	@Test
	public void test0286() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0286"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.UndoState undoState12 = zentaDiagramModel0
				.prepareDelete();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNotNull(undoState12);
	}

	@Test
	public void test0287() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0287"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0.getCopy();
		org.rulez.magwas.zenta.model.IFolder iFolder6 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder7 = null;
		zentaDiagramModel0.move(iFolder6, iFolder7);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
		org.junit.Assert.assertNotNull(eObject5);
	}

	@Test
	public void test0288() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0288"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor8 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel10 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI11 = null;
		zentaDiagramModel10.eSetProxyURI(uRI11);
		zentaDiagramModel10.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList15 = zentaDiagramModel10
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj16 = zentaDiagramModel0
					.eDynamicInvoke(4, adapterList15);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(eObjectItor6);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor8);
		org.junit.Assert.assertNotNull(adapterList15);
	}

	@Test
	public void test0289() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0289"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		zentaDiagramModel0.setAdapter(zentaDiagramModel7, zentaDiagramModel15);
		boolean boolean20 = zentaDiagramModel15.eDeliver();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI23 = null;
		zentaDiagramModel22.eSetProxyURI(uRI23);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel25 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel25.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass28 = zentaDiagramModel25.eClass();
		zentaDiagramModel22.eSetClass(eClass28);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel30 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel30.setDocumentation("hi!");
		int int33 = zentaDiagramModel30.eContainerFeatureID();
		boolean boolean34 = zentaDiagramModel30.eNotificationRequired();
		org.eclipse.emf.common.notify.NotificationChain notificationChain36 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain37 = zentaDiagramModel22
				.eBasicSetContainer(
						zentaDiagramModel30, (short) 0, notificationChain36
				);
		boolean boolean38 = zentaDiagramModel30.eNotificationRequired();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj39 = zentaDiagramModel15
					.eVirtualSet('a', boolean38);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNull(eStore18);
		org.junit.Assert.assertTrue(
				"'" + boolean20 + "' != '" + true + "'", boolean20 == true
		);
		org.junit.Assert.assertNotNull(eClass28);
		org.junit.Assert
				.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean34 + "' != '" + false + "'", boolean34 == false
		);
		org.junit.Assert.assertNull(notificationChain37);
		org.junit.Assert.assertTrue(
				"'" + boolean38 + "' != '" + false + "'", boolean38 == false
		);
	}

	@Test
	public void test0290() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0290"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.check();
			org.junit.Assert.fail(
					"Expected exception of type org.rulez.magwas.zenta.model.ModelConsistencyException; message: id cannot be null: org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel@5525afdb (name: , id: null, lineWidth: 1, lineColor: null, documentation: hi!, connectionRouterType: 0) (viewpoint: 0)"
			);
		} catch (org.rulez.magwas.zenta.model.ModelConsistencyException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
	}

	@Test
	public void test0291() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0291"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		java.lang.Object obj8 = zentaDiagramModel4.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject9 = zentaDiagramModel4
				.eInternalContainer();
		boolean boolean10 = zentaDiagramModel4.isChecked();
		boolean boolean11 = zentaDiagramModel4.isTemplate();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0
					.eVirtualGet(10, boolean11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj8);
		org.junit.Assert.assertNull(internalEObject9);
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + false + "'", boolean11 == false
		);
	}

	@Test
	public void test0292() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0292"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		boolean boolean15 = zentaDiagramModel0.isTemplate();
		java.lang.String str16 = zentaDiagramModel0.getDocumentation();
		int int17 = zentaDiagramModel0.getLineWidth();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean19 = zentaDiagramModel0.eDynamicIsSet(10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean15 + "' != '" + false + "'", boolean15 == false
		);
		org.junit.Assert.assertEquals(
				"'" + str16 + "' != '" + "hi!" + "'", str16, "hi!"
		);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
	}

	@Test
	public void test0293() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0293"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		zentaDiagramModel0.setName("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject9 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1"
			);
		} catch (
				java.lang.IllegalArgumentException
				| java.lang.StringIndexOutOfBoundsException e
		) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertNull(internalEObject5);
	}

	@Test
	public void test0294() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0294"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		org.eclipse.emf.ecore.resource.Resource.Internal internal5 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		int int12 = zentaDiagramModel7.getLineWidth();
		java.lang.String str13 = zentaDiagramModel7.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList14 = zentaDiagramModel7
				.getChildren();
		zentaDiagramModel7.setId("hi!");
		zentaDiagramModel7.setName("hi!");
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList19 = zentaDiagramModel7
				.getChildren();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eOpenSet(eStructuralFeature6, zentaDiagramModel7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStructuralFeature4);
		org.junit.Assert.assertNull(internal5);
		org.junit.Assert.assertNull(obj11);
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
		org.junit.Assert.assertEquals(
				"'" + str13 + "' != '" + "hi!" + "'", str13, "hi!"
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList14);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList19);
	}

	@Test
	public void test0295() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0295"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		zentaDiagramModel0.setName("");
		int int15 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel0
				.eContainer();
		org.eclipse.emf.ecore.EReference eReference17 = zentaDiagramModel0
				.eContainmentFeature();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean19 = false; // flaky: zentaDiagramModel0.eIsSet(52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNull(eObject16);
		org.junit.Assert.assertNull(eReference17);
	}

	@Test
	public void test0296() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0296"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		java.lang.String str17 = zentaDiagramModel12.getName();
		org.eclipse.emf.ecore.EObject eObject18 = zentaDiagramModel12
				.eContainer();
		int int19 = zentaDiagramModel12.getLineWidth();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(eObject18);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
	}

	@Test
	public void test0297() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0297"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
	}

	@Test
	public void test0298() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0298"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel14 = zentaDiagramModel11
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass15 = zentaDiagramModel11.eClass();
		zentaDiagramModel0.eSetClass(eClass15);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor17 = zentaDiagramModel0
				.eAllContents();
		zentaDiagramModel0.setViewpoint(52);
		org.eclipse.emf.common.notify.Notification notification20 = null;
		zentaDiagramModel0.eNotify(notification20);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj25 = null; // flaky:
											// zentaDiagramModel0.eGet((int) '
											// ', false, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(undoState10);
		org.junit.Assert.assertNotNull(iDiagramModel14);
		org.junit.Assert.assertNotNull(eClass15);
		org.junit.Assert.assertNotNull(eObjectItor17);
	}

	@Test
	public void test0299() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0299"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject12 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'i!' is not a valid feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0300() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0300"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		int int10 = zentaDiagramModel7.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal11 = zentaDiagramModel7
				.eInternalResource();
		org.rulez.magwas.zenta.model.UndoState undoState12 = zentaDiagramModel7
				.prepareDelete();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet((byte) 1, zentaDiagramModel7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.ClassCastException; message: class org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel cannot be cast to class java.lang.String (org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')"
			);
		} catch (java.lang.ClassCastException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStructuralFeature4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
		org.junit.Assert.assertNull(internal11);
		org.junit.Assert.assertNotNull(undoState12);
	}

	@Test
	public void test0301() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0301"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		org.eclipse.emf.ecore.InternalEObject internalEObject17 = zentaDiagramModel12
				.eInternalContainer();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore21 = zentaDiagramModel18
				.eStore();
		org.eclipse.emf.common.notify.Notification notification22 = null;
		zentaDiagramModel18.eNotify(notification22);
		java.lang.String str24 = zentaDiagramModel18.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel25 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel25.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore28 = zentaDiagramModel25
				.eStore();
		org.eclipse.emf.common.notify.Notification notification29 = null;
		zentaDiagramModel25.eNotify(notification29);
		zentaDiagramModel25.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel33 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel33.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore36 = zentaDiagramModel33
				.eStore();
		zentaDiagramModel18
				.setAdapter(zentaDiagramModel25, zentaDiagramModel33);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel38 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel38.setDocumentation("hi!");
		int int41 = zentaDiagramModel38.eContainerFeatureID();
		java.lang.String str42 = zentaDiagramModel38.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList43 = zentaDiagramModel38
				.eContents();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel44 = zentaDiagramModel38
				.findDiagramModel();
		org.eclipse.emf.common.notify.NotificationChain notificationChain46 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain47 = zentaDiagramModel33
				.eBasicSetContainer(
						zentaDiagramModel38, (short) 100, notificationChain46
				);
		org.eclipse.emf.common.notify.NotificationChain notificationChain49 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain50 = zentaDiagramModel12
					.eInverseAdd(zentaDiagramModel33, 'a', notificationChain49);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert.assertNull(internalEObject17);
		org.junit.Assert.assertNull(eStore21);
		org.junit.Assert.assertNull(str24);
		org.junit.Assert.assertNull(eStore28);
		org.junit.Assert.assertNull(eStore36);
		org.junit.Assert
				.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
		org.junit.Assert
				.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
		org.junit.Assert.assertNotNull(eObjectList43);
		org.junit.Assert.assertNotNull(iDiagramModel44);
		org.junit.Assert.assertNull(notificationChain47);
	}

	@Test
	public void test0302() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0302"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		boolean boolean5 = zentaDiagramModel0.hasDiagramReferences();
		org.eclipse.emf.common.notify.NotificationChain notificationChain6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain7 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
	}

	@Test
	public void test0303() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0303"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.eclipse.emf.ecore.resource.Resource resource33 = zentaDiagramModel22
				.eResource();
		org.eclipse.emf.common.notify.NotificationChain notificationChain34 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain35 = zentaDiagramModel22
					.eDynamicBasicRemoveFromContainer(notificationChain34);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNull(resource33);
	}

	@Test
	public void test0304() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0304"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		zentaDiagramModel0.setId("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.eSetDeliver(false);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel16 = zentaDiagramModel0
				.getDiagramModel();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature17 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj19 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature17, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertNotNull(iDiagramModel16);
	}

	@Test
	public void test0305() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0305"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.ecore.InternalEObject internalEObject7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain10 = zentaDiagramModel0
				.eBasicSetContainer(
						internalEObject7, (short) 1, notificationChain9
				);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		java.lang.Object obj15 = zentaDiagramModel11.getAdapter(0L);
		int int16 = zentaDiagramModel11.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor17 = zentaDiagramModel11
				.eAllContents();
		org.eclipse.emf.common.notify.NotificationChain notificationChain19 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain20 = zentaDiagramModel0
					.eInverseAdd(zentaDiagramModel11, 1, notificationChain19);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNull(notificationChain10);
		org.junit.Assert.assertNull(obj15);
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
		org.junit.Assert.assertNotNull(eObjectItor17);
	}

	@Test
	public void test0306() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0306"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		zentaDiagramModel0.setName("");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature15 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj16 = zentaDiagramModel0
					.eGet(eStructuralFeature15);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
	}

	@Test
	public void test0307() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0307"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.common.util.URI uRI7 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		int int12 = zentaDiagramModel9.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI15 = null;
		zentaDiagramModel14.eSetProxyURI(uRI15);
		zentaDiagramModel14.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList19 = zentaDiagramModel14
				.eAdapters();
		java.lang.Object obj20 = zentaDiagramModel9.eInvoke(4, adapterList19);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj21 = zentaDiagramModel0
					.eInvoke(10, adapterList19);
			org.junit.Assert.fail(
					"Expected exception of type org.eclipse.emf.common.util.BasicEList.BasicIndexOutOfBoundsException; message: index=0, size=0"
			);
		} catch (java.lang.IndexOutOfBoundsException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(eObjectItor6);
		org.junit.Assert.assertNull(uRI7);
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert.assertNotNull(adapterList19);
		org.junit.Assert.assertNull(obj20);
	}

	@Test
	public void test0308() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0308"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		java.lang.String str5 = zentaDiagramModel0.getLineColor();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(str5);
	}

	@Test
	public void test0309() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0309"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor7 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore12 = zentaDiagramModel9
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList13 = zentaDiagramModel9
				.eAdapters();
		java.lang.Object obj14 = zentaDiagramModel0
				.eInvoke((short) 0, adapterList13);
		org.eclipse.emf.common.notify.Notification notification15 = null;
		zentaDiagramModel0.eNotify(notification15);
		boolean boolean18 = zentaDiagramModel0.eIsSet((byte) 1);
		org.eclipse.emf.common.util.URI uRI19 = null;
		zentaDiagramModel0.eSetProxyURI(uRI19);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList21 = zentaDiagramModel0
					.eCrossReferences();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor7);
		org.junit.Assert.assertNull(eStore12);
		org.junit.Assert.assertNotNull(adapterList13);
		org.junit.Assert.assertNotNull(obj14);
		org.junit.Assert.assertTrue(
				"'" + boolean18 + "' != '" + false + "'", boolean18 == false
		);
	}

	@Test
	public void test0310() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0310"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.eclipse.emf.ecore.resource.Resource resource33 = zentaDiagramModel22
				.eResource();
		zentaDiagramModel22.setDocumentation("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj37 = zentaDiagramModel22.eVirtualUnset(4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNull(resource33);
	}

	@Test
	public void test0311() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0311"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		boolean boolean5 = zentaDiagramModel0.eDeliver();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj7 = zentaDiagramModel0.eVirtualGet((byte) 0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + true + "'", boolean5 == true
		);
	}

	@Test
	public void test0312() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0312"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		java.lang.String str8 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean10 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
	}

	@Test
	public void test0313() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0313"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		zentaDiagramModel5.setName("");
		java.lang.String str19 = zentaDiagramModel5.getLineColor();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert.assertNull(str19);
	}

	@Test
	public void test0314() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0314"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		org.rulez.magwas.zenta.model.IFolder iFolder9 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder10 = null;
		zentaDiagramModel0.move(iFolder9, iFolder10);
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
	}

	@Test
	public void test0315() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0315"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		int int8 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore12 = zentaDiagramModel9
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList13 = zentaDiagramModel9
				.eAdapters();
		java.lang.Object obj14 = zentaDiagramModel0
				.getAdapter(zentaDiagramModel9);
		org.eclipse.emf.ecore.EOperation eOperation15 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		int int19 = zentaDiagramModel16.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI22 = null;
		zentaDiagramModel21.eSetProxyURI(uRI22);
		zentaDiagramModel21.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList26 = zentaDiagramModel21
				.eAdapters();
		java.lang.Object obj27 = zentaDiagramModel16.eInvoke(4, adapterList26);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj28 = zentaDiagramModel0
					.eInvoke(eOperation15, adapterList26);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNull(eStore12);
		org.junit.Assert.assertNotNull(adapterList13);
		org.junit.Assert.assertNull(obj14);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
		org.junit.Assert.assertNotNull(adapterList26);
		org.junit.Assert.assertNull(obj27);
	}

	@Test
	public void test0316() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0316"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.util.URI uRI6 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList14 = zentaDiagramModel8
				.eAdapters();
		java.lang.Object obj15 = zentaDiagramModel0.eInvoke(0, adapterList14);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel19 = zentaDiagramModel16
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass20 = zentaDiagramModel16.eClass();
		zentaDiagramModel0.eSetClass(eClass20);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI23 = null;
		zentaDiagramModel22.eSetProxyURI(uRI23);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel25 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel25.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass28 = zentaDiagramModel25.eClass();
		zentaDiagramModel22.eSetClass(eClass28);
		boolean boolean30 = zentaDiagramModel0.eContains(zentaDiagramModel22);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature31 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean32 = zentaDiagramModel22
					.eDynamicIsSet(eStructuralFeature31);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(uRI6);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertNotNull(adapterList14);
		org.junit.Assert.assertNotNull(obj15);
		org.junit.Assert.assertNotNull(iDiagramModel19);
		org.junit.Assert.assertNotNull(eClass20);
		org.junit.Assert.assertNotNull(eClass28);
		org.junit.Assert.assertTrue(
				"'" + boolean30 + "' != '" + false + "'", boolean30 == false
		);
	}

	@Test
	public void test0317() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0317"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		java.lang.String str7 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		java.lang.String str14 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal15 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain16 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain17 = zentaDiagramModel8
				.eSetResource(internal15, notificationChain16);
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = zentaDiagramModel8
				.eInternalResource();
		zentaDiagramModel8.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel21 = zentaDiagramModel8
				.findDiagramModel();
		java.lang.String str22 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature23 = zentaDiagramModel8
				.eContainingFeature();
		boolean boolean24 = zentaDiagramModel8.isDeleted();
		org.eclipse.emf.ecore.EObject eObject25 = zentaDiagramModel0
				.eResolveProxy(zentaDiagramModel8);
		zentaDiagramModel8.setLineColor("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean29 = false; // flaky: zentaDiagramModel8.eIsSet(52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert
				.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain17);
		org.junit.Assert.assertNull(internal18);
		org.junit.Assert.assertNotNull(iDiagramModel21);
		org.junit.Assert.assertEquals(
				"'" + str22 + "' != '" + "hi!" + "'", str22, "hi!"
		);
		org.junit.Assert.assertNull(eStructuralFeature23);
		org.junit.Assert.assertTrue(
				"'" + boolean24 + "' != '" + true + "'", boolean24 == true
		);
		org.junit.Assert.assertNotNull(eObject25);
	}

	@Test
	public void test0318() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0318"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		int int17 = zentaDiagramModel12.getViewpoint();
		org.eclipse.emf.ecore.EOperation eOperation18 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		int int24 = zentaDiagramModel19.getViewpoint();
		org.eclipse.emf.common.util.URI uRI25 = zentaDiagramModel19.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel27 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel27.setDocumentation("hi!");
		java.lang.Object obj31 = zentaDiagramModel27.getAdapter(0L);
		int int32 = zentaDiagramModel27.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList33 = zentaDiagramModel27
				.eAdapters();
		java.lang.Object obj34 = zentaDiagramModel19.eInvoke(0, adapterList33);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj35 = zentaDiagramModel12
					.eInvoke(eOperation18, adapterList33);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
		org.junit.Assert.assertNull(uRI25);
		org.junit.Assert.assertNull(obj31);
		org.junit.Assert
				.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
		org.junit.Assert.assertNotNull(adapterList33);
		org.junit.Assert.assertNotNull(obj34);
	}

	@Test
	public void test0319() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0319"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		zentaDiagramModel0.setLineWidth((-1));
		int int11 = zentaDiagramModel0.getLineWidth();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		int int21 = zentaDiagramModel18.eContainerFeatureID();
		java.lang.String str22 = zentaDiagramModel18.getName();
		zentaDiagramModel13.setAdapter(zentaDiagramModel18, 1L);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList25 = zentaDiagramModel18
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj26 = zentaDiagramModel0
					.eInvoke(97, adapterList25);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain8);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
		org.junit.Assert.assertNotNull(adapterList25);
	}

	@Test
	public void test0320() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0320"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		boolean boolean6 = zentaDiagramModel0.hasDiagramReferences();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eGet(eStructuralFeature7, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
	}

	@Test
	public void test0321() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0321"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		java.lang.Object obj9 = zentaDiagramModel5.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject10 = zentaDiagramModel5
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList11 = zentaDiagramModel5
				.eContents();
		java.lang.Object obj12 = zentaDiagramModel0.getAdapter(eObjectList11);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset(eStructuralFeature13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStructuralFeature4);
		org.junit.Assert.assertNull(obj9);
		org.junit.Assert.assertNull(internalEObject10);
		org.junit.Assert.assertNotNull(eObjectList11);
		org.junit.Assert.assertNull(obj12);
	}

	@Test
	public void test0322() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0322"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		org.eclipse.emf.ecore.EClass eClass12 = zentaDiagramModel8.eClass();
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel0
					.eInverseRemove(
							zentaDiagramModel8, (short) 100, notificationChain14
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertNotNull(eClass12);
	}

	@Test
	public void test0323() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0323"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI6 = null;
		zentaDiagramModel5.eSetProxyURI(uRI6);
		zentaDiagramModel5.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList10 = zentaDiagramModel5
				.eAdapters();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		java.lang.Object obj15 = zentaDiagramModel11.getAdapter(0L);
		int int16 = zentaDiagramModel11.getLineWidth();
		java.lang.String str17 = zentaDiagramModel11.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain19 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain20 = zentaDiagramModel11
				.eSetResource(internal18, notificationChain19);
		java.lang.Object obj24 = zentaDiagramModel11.eGet(2, false, false);
		org.eclipse.emf.common.notify.Notification notification25 = null;
		zentaDiagramModel11.eNotify(notification25);
		org.eclipse.emf.ecore.EObject eObject27 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel11);
		// The following exception was thrown during execution in test
		// generation
		try {
// flaky:             zentaDiagramModel0.eSet(97, (java.lang.Object) zentaDiagramModel11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertNotNull(adapterList10);
		org.junit.Assert.assertNull(obj15);
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
		org.junit.Assert.assertEquals(
				"'" + str17 + "' != '" + "hi!" + "'", str17, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain20);
		org.junit.Assert.assertNull(obj24);
		org.junit.Assert.assertNotNull(eObject27);
	}

	@Test
	public void test0324() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0324"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel10 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel10.setDocumentation("hi!");
		int int13 = zentaDiagramModel10.eContainerFeatureID();
		java.lang.String str14 = zentaDiagramModel10.getName();
		zentaDiagramModel5.setAdapter(zentaDiagramModel10, 1L);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList17 = zentaDiagramModel10
				.eAdapters();
		java.lang.Object obj18 = zentaDiagramModel0
				.eInvoke((short) 1, adapterList17);
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
		org.junit.Assert.assertNotNull(adapterList17);
		org.junit.Assert.assertEquals(
				"'" + obj18 + "' != '" + false + "'", obj18, false
		);
	}

	@Test
	public void test0325() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0325"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		boolean boolean5 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
	}

	@Test
	public void test0326() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0326"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel10 = zentaDiagramModel7
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass11 = zentaDiagramModel7.eClass();
		boolean boolean13 = zentaDiagramModel7.eIsSet((short) 10);
		boolean boolean14 = zentaDiagramModel7.eDeliver();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		java.lang.Object obj19 = zentaDiagramModel15.getAdapter(0L);
		int int20 = zentaDiagramModel15.getLineWidth();
		java.lang.String str21 = zentaDiagramModel15.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList22 = zentaDiagramModel15
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel23 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel23.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass26 = zentaDiagramModel23.eClass();
		zentaDiagramModel15.eSetClass(eClass26);
		zentaDiagramModel7.eSetClass(eClass26);
		zentaDiagramModel0.eSetClass(eClass26);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature30 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel31 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel31.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore34 = zentaDiagramModel31
				.eStore();
		org.eclipse.emf.common.notify.Notification notification35 = null;
		zentaDiagramModel31.eNotify(notification35);
		int int37 = zentaDiagramModel31.getViewpoint();
		int int38 = zentaDiagramModel31.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel39 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel39.setDocumentation("hi!");
		int int42 = zentaDiagramModel39.eContainerFeatureID();
		java.lang.String str43 = zentaDiagramModel39.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel44 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel44.setDocumentation("hi!");
		int int47 = zentaDiagramModel44.eContainerFeatureID();
		java.lang.String str48 = zentaDiagramModel44.getName();
		zentaDiagramModel39.setAdapter(zentaDiagramModel44, 1L);
		java.lang.String str51 = zentaDiagramModel44.getId();
		int int52 = zentaDiagramModel44.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel53 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel53.setDocumentation("hi!");
		int int56 = zentaDiagramModel53.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal57 = zentaDiagramModel53
				.eInternalResource();
		java.lang.String str58 = zentaDiagramModel53.getDocumentation();
		boolean boolean59 = zentaDiagramModel53.isChecked();
		zentaDiagramModel53.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel62 = zentaDiagramModel53
				.findDiagramModel();
		zentaDiagramModel31
				.setAdapter(zentaDiagramModel44, zentaDiagramModel53);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet(eStructuralFeature30, zentaDiagramModel53);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel10);
		org.junit.Assert.assertNotNull(eClass11);
		org.junit.Assert.assertTrue(
				"'" + boolean13 + "' != '" + false + "'", boolean13 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertNull(obj19);
		org.junit.Assert
				.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
		org.junit.Assert.assertEquals(
				"'" + str21 + "' != '" + "hi!" + "'", str21, "hi!"
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList22);
		org.junit.Assert.assertNotNull(eClass26);
		org.junit.Assert.assertNull(eStore34);
		org.junit.Assert
				.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
		org.junit.Assert
				.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
		org.junit.Assert
				.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
		org.junit.Assert
				.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
		org.junit.Assert
				.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
		org.junit.Assert
				.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
		org.junit.Assert.assertNull(str51);
		org.junit.Assert
				.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
		org.junit.Assert
				.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
		org.junit.Assert.assertNull(internal57);
		org.junit.Assert.assertEquals(
				"'" + str58 + "' != '" + "hi!" + "'", str58, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean59 + "' != '" + false + "'", boolean59 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel62);
	}

	@Test
	public void test0327() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0327"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.getId();
		zentaDiagramModel0.checkDocumentation("");
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNull(str4);
	}

	@Test
	public void test0328() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0328"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EObject eObject9 = zentaDiagramModel0
				.eContainer();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel10 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel10.setDocumentation("hi!");
		java.lang.Object obj14 = zentaDiagramModel10.getAdapter(0L);
		int int15 = zentaDiagramModel10.getLineWidth();
		java.lang.String str16 = zentaDiagramModel10.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal17 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain18 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain19 = zentaDiagramModel10
				.eSetResource(internal17, notificationChain18);
		org.rulez.magwas.zenta.model.UndoState undoState20 = zentaDiagramModel10
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel24 = zentaDiagramModel21
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass25 = zentaDiagramModel21.eClass();
		zentaDiagramModel10.eSetClass(eClass25);
		zentaDiagramModel0.eSetClass(eClass25);
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean29 = zentaDiagramModel0.eVirtualIsSet(52);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNull(eObject9);
		org.junit.Assert.assertNull(obj14);
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
		org.junit.Assert.assertEquals(
				"'" + str16 + "' != '" + "hi!" + "'", str16, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain19);
		org.junit.Assert.assertNotNull(undoState20);
		org.junit.Assert.assertNotNull(iDiagramModel24);
		org.junit.Assert.assertNotNull(eClass25);
	}

	@Test
	public void test0329() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0329"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = zentaDiagramModel0
				.eDirectResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = zentaDiagramModel12
				.eContainingFeature();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj17 = zentaDiagramModel0
					.eVirtualGet((short) -1, eStructuralFeature16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(internal7);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNull(eStructuralFeature16);
	}

	@Test
	public void test0330() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0330"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel14 = zentaDiagramModel11
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass15 = zentaDiagramModel11.eClass();
		zentaDiagramModel0.eSetClass(eClass15);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor17 = zentaDiagramModel0
				.eAllContents();
		zentaDiagramModel0.setViewpoint(52);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature20 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean21 = zentaDiagramModel0.eIsSet(eStructuralFeature20);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(undoState10);
		org.junit.Assert.assertNotNull(iDiagramModel14);
		org.junit.Assert.assertNotNull(eClass15);
		org.junit.Assert.assertNotNull(eObjectItor17);
	}

	@Test
	public void test0331() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0331"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		boolean boolean6 = zentaDiagramModel0.hasDiagramReferences();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int8 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
	}

	@Test
	public void test0332() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0332"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.isDeleted();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI13 = null;
		zentaDiagramModel12.eSetProxyURI(uRI13);
		zentaDiagramModel12.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList17 = zentaDiagramModel12
				.eAdapters();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		java.lang.Object obj22 = zentaDiagramModel18.getAdapter(0L);
		int int23 = zentaDiagramModel18.getLineWidth();
		java.lang.String str24 = zentaDiagramModel18.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal25 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain26 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain27 = zentaDiagramModel18
				.eSetResource(internal25, notificationChain26);
		java.lang.Object obj31 = zentaDiagramModel18.eGet(2, false, false);
		org.eclipse.emf.common.notify.Notification notification32 = null;
		zentaDiagramModel18.eNotify(notification32);
		org.eclipse.emf.ecore.EObject eObject34 = zentaDiagramModel12
				.eResolveProxy(zentaDiagramModel18);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel35 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel35.setDocumentation("hi!");
		int int38 = zentaDiagramModel35.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal39 = zentaDiagramModel35
				.eInternalResource();
		java.lang.String str40 = zentaDiagramModel35.getDocumentation();
		boolean boolean41 = zentaDiagramModel35.isChecked();
		zentaDiagramModel35.setName("hi!");
		int int44 = zentaDiagramModel35.getConnectionRouterType();
		zentaDiagramModel0.setAdapter(zentaDiagramModel18, zentaDiagramModel35);
		zentaDiagramModel0.setViewpoint(4);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
		org.junit.Assert.assertNotNull(adapterList17);
		org.junit.Assert.assertNull(obj22);
		org.junit.Assert
				.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
		org.junit.Assert.assertEquals(
				"'" + str24 + "' != '" + "hi!" + "'", str24, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain27);
		org.junit.Assert.assertNull(obj31);
		org.junit.Assert.assertNotNull(eObject34);
		org.junit.Assert
				.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
		org.junit.Assert.assertNull(internal39);
		org.junit.Assert.assertEquals(
				"'" + str40 + "' != '" + "hi!" + "'", str40, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean41 + "' != '" + false + "'", boolean41 == false
		);
		org.junit.Assert
				.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
	}

	@Test
	public void test0333() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0333"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		java.lang.String str5 = zentaDiagramModel0.getId();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		int int10 = zentaDiagramModel7.eContainerFeatureID();
		java.lang.String str11 = zentaDiagramModel7.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList12 = zentaDiagramModel7
				.eContents();
		int int13 = zentaDiagramModel7.getViewpoint();
		zentaDiagramModel7.checkId("");
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str16 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature6, zentaDiagramModel7
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertNull(str5);
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
		org.junit.Assert
				.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
		org.junit.Assert.assertNotNull(eObjectList12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
	}

	@Test
	public void test0334() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0334"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.isDeleted();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel12 = zentaDiagramModel0
				.findDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel26 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel26.setDocumentation("hi!");
		int int29 = zentaDiagramModel26.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject30 = zentaDiagramModel19
				.eResolveProxy(zentaDiagramModel26);
		org.eclipse.emf.common.util.URI uRI31 = null;
		zentaDiagramModel19.eSetProxyURI(uRI31);
		zentaDiagramModel0.eSet((short) 1, uRI31);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature34 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean35 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature34);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
		org.junit.Assert.assertNotNull(iDiagramModel12);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
		org.junit.Assert.assertNotNull(eObject30);
	}

	@Test
	public void test0335() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0335"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		zentaDiagramModel0.setConnectionRouterType('4');
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj11 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature9, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0336() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0336"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
				.eSetResource(internal6, notificationChain7);
		zentaDiagramModel0.setLineWidth((-1));
		int int11 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.URI uRI12 = null;
		zentaDiagramModel0.eSetProxyURI(uRI12);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.IFolder iFolder14 = zentaDiagramModel0
					.getParentFolder();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain8);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
	}

	@Test
	public void test0337() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0337"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		zentaDiagramModel0.setConnectionRouterType('4');
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj11 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature9, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0338() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0338"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
	}

	@Test
	public void test0339() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0339"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.eclipse.emf.ecore.resource.Resource resource33 = zentaDiagramModel22
				.eResource();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel34 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel34.setDocumentation("hi!");
		java.lang.Object obj38 = zentaDiagramModel34.getAdapter(0L);
		int int39 = zentaDiagramModel34.getLineWidth();
		java.lang.String str40 = zentaDiagramModel34.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal41 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain42 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain43 = zentaDiagramModel34
				.eSetResource(internal41, notificationChain42);
		org.rulez.magwas.zenta.model.UndoState undoState44 = zentaDiagramModel34
				.prepareDelete();
		org.rulez.magwas.zenta.model.UndoState undoState45 = zentaDiagramModel22
				.delete(undoState44);
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNull(resource33);
		org.junit.Assert.assertNull(obj38);
		org.junit.Assert
				.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
		org.junit.Assert.assertEquals(
				"'" + str40 + "' != '" + "hi!" + "'", str40, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain43);
		org.junit.Assert.assertNotNull(undoState44);
	}

	@Test
	public void test0340() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0340"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EObject eObject9 = zentaDiagramModel0
				.eContainer();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean11 = zentaDiagramModel0.eIsSet(eStructuralFeature10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNull(eObject9);
	}

	@Test
	public void test0341() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0341"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		java.lang.String str5 = zentaDiagramModel0.getId();
		org.eclipse.emf.ecore.EReference eReference6 = zentaDiagramModel0
				.eContainmentFeature();
		org.rulez.magwas.zenta.model.IFolder iFolder7 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder8 = null;
		zentaDiagramModel0.move(iFolder7, iFolder8);
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertNull(str5);
		org.junit.Assert.assertNull(eReference6);
	}

	@Test
	public void test0342() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0342"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
	}

	@Test
	public void test0343() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0343"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.URI uRI4 = null;
		zentaDiagramModel0.eSetProxyURI(uRI4);
		zentaDiagramModel0.checkDocumentation("");
		zentaDiagramModel0.setLineColor("");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0344() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0344"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.util.URI uRI6 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList14 = zentaDiagramModel8
				.eAdapters();
		java.lang.Object obj15 = zentaDiagramModel0.eInvoke(0, adapterList14);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel19 = zentaDiagramModel16
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass20 = zentaDiagramModel16.eClass();
		zentaDiagramModel0.eSetClass(eClass20);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI23 = null;
		zentaDiagramModel22.eSetProxyURI(uRI23);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel25 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel25.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass28 = zentaDiagramModel25.eClass();
		zentaDiagramModel22.eSetClass(eClass28);
		boolean boolean30 = zentaDiagramModel0.eContains(zentaDiagramModel22);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature31 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj32 = zentaDiagramModel22
					.eGet(eStructuralFeature31);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(uRI6);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertNotNull(adapterList14);
		org.junit.Assert.assertNotNull(obj15);
		org.junit.Assert.assertNotNull(iDiagramModel19);
		org.junit.Assert.assertNotNull(eClass20);
		org.junit.Assert.assertNotNull(eClass28);
		org.junit.Assert.assertTrue(
				"'" + boolean30 + "' != '" + false + "'", boolean30 == false
		);
	}

	@Test
	public void test0345() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0345"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		boolean boolean6 = zentaDiagramModel0.eIsSet((short) 10);
		boolean boolean7 = zentaDiagramModel0.eDeliver();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0.eVirtualGet((byte) 10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNotNull(eClass4);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + true + "'", boolean7 == true
		);
	}

	@Test
	public void test0346() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0346"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj7 = zentaDiagramModel0.eVirtualUnset(' ');
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
	}

	@Test
	public void test0347() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0347"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.eContainerFeatureID();
		zentaDiagramModel0.setLineColor("");
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
	}

	@Test
	public void test0348() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0348"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str14 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList15 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int17 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNotNull(eObjectList15);
	}

	@Test
	public void test0349() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0349"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		boolean boolean15 = zentaDiagramModel0.isTemplate();
		java.lang.String str16 = zentaDiagramModel0.getDocumentation();
		int int17 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature18 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj20 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature18, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean15 + "' != '" + false + "'", boolean15 == false
		);
		org.junit.Assert.assertEquals(
				"'" + str16 + "' != '" + "hi!" + "'", str16, "hi!"
		);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
	}

	@Test
	public void test0350() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0350"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor10 = zentaDiagramModel0
				.eAllContents();
		zentaDiagramModel0.setChecked(false);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean14 = zentaDiagramModel13.isDeleted();
		org.eclipse.emf.ecore.EObject eObject15 = zentaDiagramModel13.getCopy();
		boolean boolean16 = zentaDiagramModel13.hasDiagramReferences();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore17 = zentaDiagramModel13
				.eStore();
		org.eclipse.emf.common.notify.NotificationChain notificationChain19 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain20 = zentaDiagramModel0
					.eInverseRemove(
							zentaDiagramModel13, '#', notificationChain19
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(eObjectItor10);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertNotNull(eObject15);
		org.junit.Assert.assertTrue(
				"'" + boolean16 + "' != '" + false + "'", boolean16 == false
		);
		org.junit.Assert.assertNull(eStore17);
	}

	@Test
	public void test0351() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0351"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature3 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature3);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0352() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0352"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.util.URI uRI6 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList14 = zentaDiagramModel8
				.eAdapters();
		java.lang.Object obj15 = zentaDiagramModel0.eInvoke(0, adapterList14);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel19 = zentaDiagramModel16
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass20 = zentaDiagramModel16.eClass();
		zentaDiagramModel0.eSetClass(eClass20);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI23 = null;
		zentaDiagramModel22.eSetProxyURI(uRI23);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel25 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel25.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass28 = zentaDiagramModel25.eClass();
		zentaDiagramModel22.eSetClass(eClass28);
		boolean boolean30 = zentaDiagramModel0.eContains(zentaDiagramModel22);
		boolean boolean31 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature32 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel33 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel33.setDocumentation("hi!");
		int int36 = zentaDiagramModel33.eContainerFeatureID();
		java.lang.String str37 = zentaDiagramModel33.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel38 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel38.setDocumentation("hi!");
		int int41 = zentaDiagramModel38.eContainerFeatureID();
		java.lang.String str42 = zentaDiagramModel38.getName();
		zentaDiagramModel33.setAdapter(zentaDiagramModel38, 1L);
		java.lang.Object obj45 = null;
		java.lang.Object obj46 = zentaDiagramModel33.getAdapter(obj45);
		java.lang.String str47 = zentaDiagramModel33.getName();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str48 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature32, zentaDiagramModel33
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(uRI6);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertNotNull(adapterList14);
		org.junit.Assert.assertNotNull(obj15);
		org.junit.Assert.assertNotNull(iDiagramModel19);
		org.junit.Assert.assertNotNull(eClass20);
		org.junit.Assert.assertNotNull(eClass28);
		org.junit.Assert.assertTrue(
				"'" + boolean30 + "' != '" + false + "'", boolean30 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean31 + "' != '" + false + "'", boolean31 == false
		);
		org.junit.Assert
				.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
		org.junit.Assert
				.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
		org.junit.Assert
				.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
		org.junit.Assert
				.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
		org.junit.Assert.assertNull(obj46);
		org.junit.Assert
				.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
	}

	@Test
	public void test0353() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0353"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0.getCopy();
		zentaDiagramModel0.initId();
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(eObject5);
	}

	@Test
	public void test0354() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0354"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		zentaDiagramModel0.setAdapter(zentaDiagramModel7, zentaDiagramModel15);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature20 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI22 = null;
		zentaDiagramModel21.eSetProxyURI(uRI22);
		zentaDiagramModel21.setLineWidth((short) -1);
		boolean boolean26 = zentaDiagramModel21.eNotificationRequired();
		org.eclipse.emf.ecore.EClass eClass27 = zentaDiagramModel21.eClass();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel7
					.eOpenSet(eStructuralFeature20, zentaDiagramModel21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNull(eStore18);
		org.junit.Assert.assertTrue(
				"'" + boolean26 + "' != '" + false + "'", boolean26 == false
		);
		org.junit.Assert.assertNotNull(eClass27);
	}

	@Test
	public void test0355() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0355"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setLineColor("hi!");
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		zentaDiagramModel0.setDocumentation("");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean12 = zentaDiagramModel0
					.eDynamicIsSet(eStructuralFeature11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
	}

	@Test
	public void test0356() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0356"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj5 = zentaDiagramModel0
					.eGet(eStructuralFeature4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass3);
	}

	@Test
	public void test0357() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0357"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		boolean boolean7 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain10 = zentaDiagramModel0
				.eSetResource(internal8, notificationChain9);
		org.eclipse.emf.common.notify.NotificationChain notificationChain11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain12 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
		org.junit.Assert.assertNull(notificationChain10);
	}

	@Test
	public void test0358() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0358"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		boolean boolean6 = zentaDiagramModel0.eNotificationRequired();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eGet(eStructuralFeature7, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
	}

	@Test
	public void test0359() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0359"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		zentaDiagramModel0.setName("");
		int int15 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel0
				.eContainer();
		zentaDiagramModel0.checkDocumentation("hi!");
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj22 = zentaDiagramModel0
					.eDynamicGet((byte) 10, false, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNull(eObject16);
	}

	@Test
	public void test0360() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0360"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.Object obj12 = null;
		java.lang.Object obj13 = zentaDiagramModel0.getAdapter(obj12);
		java.lang.String str14 = zentaDiagramModel0.getName();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature15 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature15);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(obj13);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
	}

	@Test
	public void test0361() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0361"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.isDeleted();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel12 = zentaDiagramModel0
				.findDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel26 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel26.setDocumentation("hi!");
		int int29 = zentaDiagramModel26.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject30 = zentaDiagramModel19
				.eResolveProxy(zentaDiagramModel26);
		org.eclipse.emf.common.util.URI uRI31 = null;
		zentaDiagramModel19.eSetProxyURI(uRI31);
		zentaDiagramModel0.eSet((short) 1, uRI31);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList34 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature35 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel36 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel36.setDocumentation("hi!");
		int int39 = zentaDiagramModel36.eContainerFeatureID();
		java.lang.String str40 = zentaDiagramModel36.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel41 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel41.setDocumentation("hi!");
		int int44 = zentaDiagramModel41.eContainerFeatureID();
		java.lang.String str45 = zentaDiagramModel41.getName();
		zentaDiagramModel36.setAdapter(zentaDiagramModel41, 1L);
		java.lang.Object obj48 = null;
		java.lang.Object obj49 = zentaDiagramModel36.getAdapter(obj48);
		java.lang.String str50 = zentaDiagramModel36.getName();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSet(eStructuralFeature35, str50);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
		org.junit.Assert.assertNotNull(iDiagramModel12);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
		org.junit.Assert.assertNotNull(eObject30);
		org.junit.Assert.assertNotNull(eObjectList34);
		org.junit.Assert
				.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
		org.junit.Assert
				.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
		org.junit.Assert
				.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
		org.junit.Assert
				.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
		org.junit.Assert.assertNull(obj49);
		org.junit.Assert
				.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
	}

	@Test
	public void test0362() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0362"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj13 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature11, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
	}

	@Test
	public void test0363() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0363"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		org.eclipse.emf.ecore.resource.Resource.Internal internal5 = zentaDiagramModel0
				.eInternalResource();
		boolean boolean6 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStructuralFeature4);
		org.junit.Assert.assertNull(internal5);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
	}

	@Test
	public void test0364() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0364"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj15 = zentaDiagramModel0.eVirtualGet((byte) 10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
	}

	@Test
	public void test0365() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0365"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		boolean boolean6 = zentaDiagramModel0.eIsSet((short) 10);
		zentaDiagramModel0.checkId("");
		java.lang.Class<?> wildcardClass9 = zentaDiagramModel0.getClass();
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNotNull(eClass4);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(wildcardClass9);
	}

	@Test
	public void test0366() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0366"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.EOperation eOperation7 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList20 = zentaDiagramModel13
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj21 = zentaDiagramModel0
					.eInvoke(eOperation7, adapterList20);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNotNull(adapterList20);
	}

	@Test
	public void test0367() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0367"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal5 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = zentaDiagramModel0
				.eSetResource(internal5, notificationChain6);
		boolean boolean8 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.resource.Resource.Internal internal9 = zentaDiagramModel0
				.eInternalResource();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel10 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel10.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore13 = zentaDiagramModel10
				.eStore();
		org.eclipse.emf.common.notify.Notification notification14 = null;
		zentaDiagramModel10.eNotify(notification14);
		zentaDiagramModel10.setName("hi!");
		int int18 = zentaDiagramModel10.getViewpoint();
		org.eclipse.emf.ecore.EObject eObject19 = zentaDiagramModel10
				.eContainer();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore20 = zentaDiagramModel10
				.eStore();
		org.eclipse.emf.common.notify.NotificationChain notificationChain22 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain23 = zentaDiagramModel0
				.eBasicSetContainer(zentaDiagramModel10, 2, notificationChain22);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.IFolder iFolder24 = zentaDiagramModel10
					.getParentFolder();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert.assertNull(notificationChain7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + false + "'", boolean8 == false
		);
		org.junit.Assert.assertNull(internal9);
		org.junit.Assert.assertNull(eStore13);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
		org.junit.Assert.assertNull(eObject19);
		org.junit.Assert.assertNull(eStore20);
		org.junit.Assert.assertNull(notificationChain23);
	}

	@Test
	public void test0368() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0368"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean1 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EObject eObject2 = zentaDiagramModel0.getCopy();
		boolean boolean3 = zentaDiagramModel0.hasDiagramReferences();
		zentaDiagramModel0.setLineColor("");
		org.junit.Assert.assertTrue(
				"'" + boolean1 + "' != '" + true + "'", boolean1 == true
		);
		org.junit.Assert.assertNotNull(eObject2);
		org.junit.Assert.assertTrue(
				"'" + boolean3 + "' != '" + false + "'", boolean3 == false
		);
	}

	@Test
	public void test0369() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0369"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		zentaDiagramModel0.checkName("");
		org.eclipse.emf.ecore.InternalEObject internalEObject17 = zentaDiagramModel0
				.eInternalContainer();
		zentaDiagramModel0.setId("hi!");
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertNull(internalEObject17);
	}

	@Test
	public void test0370() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0370"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setId("hi!");
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList12 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel17 = zentaDiagramModel14
				.findDiagramModel();
		java.lang.String str18 = zentaDiagramModel14.getId();
		zentaDiagramModel14.checkDocumentation("");
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList21 = zentaDiagramModel14
				.eContents();
		zentaDiagramModel14.setConnectionRouterType((byte) 100);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel24 = zentaDiagramModel14
				.getDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eDynamicSet(eStructuralFeature13, zentaDiagramModel14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList12);
		org.junit.Assert.assertNotNull(iDiagramModel17);
		org.junit.Assert.assertNull(str18);
		org.junit.Assert.assertNotNull(eObjectList21);
		org.junit.Assert.assertNotNull(iDiagramModel24);
	}

	@Test
	public void test0371() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0371"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.getId();
		zentaDiagramModel0.checkDocumentation("");
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eContents();
		zentaDiagramModel0.setConnectionRouterType((byte) 100);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel10 = zentaDiagramModel0
				.getDiagramModel();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel11 = zentaDiagramModel0
				.getDiagramModel();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNull(str4);
		org.junit.Assert.assertNotNull(eObjectList7);
		org.junit.Assert.assertNotNull(iDiagramModel10);
		org.junit.Assert.assertNotNull(iDiagramModel11);
	}

	@Test
	public void test0372() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0372"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.getId();
		zentaDiagramModel0.checkDocumentation("");
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eGet(eStructuralFeature8, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNull(str4);
		org.junit.Assert.assertNotNull(eObjectList7);
	}

	@Test
	public void test0373() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0373"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.IZentaModel iZentaModel9 = zentaDiagramModel0
					.getZentaModel();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
	}

	@Test
	public void test0374() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0374"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setId("hi!");
		int int10 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.checkName("");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		java.lang.Object obj17 = zentaDiagramModel13.getAdapter(0L);
		int int18 = zentaDiagramModel13.getLineWidth();
		java.lang.String str19 = zentaDiagramModel13.getId();
		boolean boolean20 = zentaDiagramModel13.eDeliver();
		boolean boolean21 = zentaDiagramModel0.eContains(zentaDiagramModel13);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature22 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj25 = zentaDiagramModel13
					.eGet(eStructuralFeature22, false, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
		org.junit.Assert.assertNull(obj17);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
		org.junit.Assert.assertNull(str19);
		org.junit.Assert.assertTrue(
				"'" + boolean20 + "' != '" + true + "'", boolean20 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean21 + "' != '" + false + "'", boolean21 == false
		);
	}

	@Test
	public void test0375() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0375"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eVirtualUnset((short) -1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(eObjectList7);
	}

	@Test
	public void test0376() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0376"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		zentaDiagramModel0.eSetDeliver(false);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		int int14 = zentaDiagramModel11.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI17 = null;
		zentaDiagramModel16.eSetProxyURI(uRI17);
		zentaDiagramModel16.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList21 = zentaDiagramModel16
				.eAdapters();
		java.lang.Object obj22 = zentaDiagramModel11.eInvoke(4, adapterList21);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj23 = zentaDiagramModel0
					.eDynamicInvoke(100, adapterList21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
		org.junit.Assert
				.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
		org.junit.Assert.assertNotNull(adapterList21);
		org.junit.Assert.assertNull(obj22);
	}

	@Test
	public void test0377() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0377"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		org.eclipse.emf.common.notify.Notification notification8 = null;
		zentaDiagramModel0.eNotify(notification8);
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.prepareDelete();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNotNull(undoState10);
	}

	@Test
	public void test0378() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0378"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		boolean boolean3 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj5 = zentaDiagramModel0
					.eGet(eStructuralFeature4);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue(
				"'" + boolean3 + "' != '" + false + "'", boolean3 == false
		);
	}

	@Test
	public void test0379() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0379"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		int int17 = zentaDiagramModel12.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore21 = zentaDiagramModel18
				.eStore();
		org.eclipse.emf.common.notify.Notification notification22 = null;
		zentaDiagramModel18.eNotify(notification22);
		int int24 = zentaDiagramModel18.getViewpoint();
		int int25 = zentaDiagramModel18.eContainerFeatureID();
		java.lang.Object obj26 = zentaDiagramModel12
				.getAdapter(zentaDiagramModel18);
		boolean boolean27 = zentaDiagramModel12.hasDiagramReferences();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.IFolder iFolder28 = zentaDiagramModel12
					.getParentFolder();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert.assertNull(eStore21);
		org.junit.Assert
				.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(obj26);
		org.junit.Assert.assertTrue(
				"'" + boolean27 + "' != '" + false + "'", boolean27 == false
		);
	}

	@Test
	public void test0380() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0380"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean13 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.ecore.resource.Resource.Internal internal14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain16 = zentaDiagramModel0
				.eSetResource(internal14, notificationChain15);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject18 = zentaDiagramModel0
					.eObjectForURIFragmentSegment("");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1"
			);
		} catch (
				java.lang.IllegalArgumentException
				| java.lang.StringIndexOutOfBoundsException e
		) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean13 + "' != '" + false + "'", boolean13 == false
		);
		org.junit.Assert.assertNull(notificationChain16);
	}

	@Test
	public void test0381() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0381"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		org.rulez.magwas.zenta.model.UndoState undoState5 = zentaDiagramModel0
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		int int12 = zentaDiagramModel7.getLineWidth();
		java.lang.String str13 = zentaDiagramModel7.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain16 = zentaDiagramModel7
				.eSetResource(internal14, notificationChain15);
		org.eclipse.emf.ecore.resource.Resource.Internal internal17 = zentaDiagramModel7
				.eInternalResource();
		zentaDiagramModel7.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel20 = zentaDiagramModel7
				.findDiagramModel();
		java.lang.String str21 = zentaDiagramModel7.getDocumentation();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList22 = zentaDiagramModel7
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj23 = zentaDiagramModel0
					.eVirtualGet(1, zentaDiagramModel7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert.assertNotNull(undoState5);
		org.junit.Assert.assertNull(obj11);
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
		org.junit.Assert.assertEquals(
				"'" + str13 + "' != '" + "hi!" + "'", str13, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain16);
		org.junit.Assert.assertNull(internal17);
		org.junit.Assert.assertNotNull(iDiagramModel20);
		org.junit.Assert.assertEquals(
				"'" + str21 + "' != '" + "hi!" + "'", str21, "hi!"
		);
		org.junit.Assert.assertNotNull(eObjectList22);
	}

	@Test
	public void test0382() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0382"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel14 = zentaDiagramModel11
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass15 = zentaDiagramModel11.eClass();
		zentaDiagramModel0.eSetClass(eClass15);
		boolean boolean17 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature18 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean19 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature18);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(undoState10);
		org.junit.Assert.assertNotNull(iDiagramModel14);
		org.junit.Assert.assertNotNull(eClass15);
		org.junit.Assert.assertTrue(
				"'" + boolean17 + "' != '" + true + "'", boolean17 == true
		);
	}

	@Test
	public void test0383() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0383"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = zentaDiagramModel0
				.eContainingFeature();
		org.eclipse.emf.common.util.URI uRI10 = zentaDiagramModel0.eProxyURI();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList11 = zentaDiagramModel0
				.getProperties();
		boolean boolean12 = zentaDiagramModel0.eNotificationRequired();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(eStructuralFeature9);
		org.junit.Assert.assertNull(uRI10);
		org.junit.Assert.assertNotNull(iPropertyList11);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
	}

	@Test
	public void test0384() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0384"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.rulez.magwas.zenta.model.UndoState undoState33 = zentaDiagramModel13
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel34 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel34.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass37 = zentaDiagramModel34.eClass();
		zentaDiagramModel13.eSetClass(eClass37);
		org.eclipse.emf.ecore.InternalEObject internalEObject39 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EObject eObject40 = zentaDiagramModel13
					.eResolveProxy(internalEObject39);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNotNull(undoState33);
		org.junit.Assert.assertNotNull(eClass37);
	}

	@Test
	public void test0385() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0385"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		java.lang.String str14 = zentaDiagramModel5.getName();
		zentaDiagramModel5.setDocumentation("hi!");
		org.eclipse.emf.ecore.EReference eReference17 = zentaDiagramModel5
				.eContainmentFeature();
		org.rulez.magwas.zenta.model.IFolder iFolder18 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder19 = null;
		zentaDiagramModel5.move(iFolder18, iFolder19);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
		org.junit.Assert.assertNull(eReference17);
	}

	@Test
	public void test0386() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0386"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.rulez.magwas.zenta.model.UndoState undoState33 = zentaDiagramModel13
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel34 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel34.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass37 = zentaDiagramModel34.eClass();
		zentaDiagramModel13.eSetClass(eClass37);
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.IFolder iFolder39 = zentaDiagramModel13
					.getParentFolder();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNotNull(undoState33);
		org.junit.Assert.assertNotNull(eClass37);
	}

	@Test
	public void test0387() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0387"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource9 = zentaDiagramModel6
				.eResource();
		org.eclipse.emf.ecore.EObject eObject10 = zentaDiagramModel6
				.eContainer();
		org.eclipse.emf.ecore.EObject eObject11 = zentaDiagramModel0
				.eResolveProxy(zentaDiagramModel6);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean13 = zentaDiagramModel0.eIsSet(eStructuralFeature12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertNull(resource9);
		org.junit.Assert.assertNull(eObject10);
		org.junit.Assert.assertNotNull(eObject11);
	}

	@Test
	public void test0388() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0388"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		boolean boolean33 = zentaDiagramModel22.isDeleted();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature34 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel22.eOpenUnset(eStructuralFeature34);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertTrue(
				"'" + boolean33 + "' != '" + true + "'", boolean33 == true
		);
	}

	@Test
	public void test0389() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0389"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		java.lang.String str8 = zentaDiagramModel0.getDocumentation();
		// The following exception was thrown during execution in test
		// generation
		try {
			org.rulez.magwas.zenta.model.IFolder iFolder9 = zentaDiagramModel0
					.getParentFolder();
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
	}

	@Test
	public void test0390() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0390"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.UndoState undoState7 = zentaDiagramModel0
				.prepareDelete();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj9 = zentaDiagramModel0
					.eGet(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
		org.junit.Assert.assertNotNull(undoState7);
	}

	@Test
	public void test0391() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0391"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor8 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.findDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		java.lang.Object obj15 = zentaDiagramModel11.getAdapter(0L);
		int int16 = zentaDiagramModel11.getLineWidth();
		java.lang.String str17 = zentaDiagramModel11.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain19 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain20 = zentaDiagramModel11
				.eSetResource(internal18, notificationChain19);
		org.eclipse.emf.ecore.resource.Resource.Internal internal21 = zentaDiagramModel11
				.eInternalResource();
		zentaDiagramModel11.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel24 = zentaDiagramModel11
				.findDiagramModel();
		java.lang.String str25 = zentaDiagramModel11.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature26 = zentaDiagramModel11
				.eContainingFeature();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj27 = zentaDiagramModel0
					.eVirtualGet(1, zentaDiagramModel11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(eObjectItor6);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor8);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert.assertNull(obj15);
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
		org.junit.Assert.assertEquals(
				"'" + str17 + "' != '" + "hi!" + "'", str17, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain20);
		org.junit.Assert.assertNull(internal21);
		org.junit.Assert.assertNotNull(iDiagramModel24);
		org.junit.Assert.assertEquals(
				"'" + str25 + "' != '" + "hi!" + "'", str25, "hi!"
		);
		org.junit.Assert.assertNull(eStructuralFeature26);
	}

	@Test
	public void test0392() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0392"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		java.lang.String str5 = zentaDiagramModel0.getId();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.check();
			org.junit.Assert.fail(
					"Expected exception of type org.rulez.magwas.zenta.model.ModelConsistencyException; message: id cannot be null: org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel@3bb990a0 (name: , id: null, lineWidth: -1, lineColor: null, documentation: , connectionRouterType: 0) (viewpoint: 0)"
			);
		} catch (org.rulez.magwas.zenta.model.ModelConsistencyException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(str5);
	}

	@Test
	public void test0393() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0393"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		boolean boolean4 = zentaDiagramModel0.eDeliver();
		zentaDiagramModel0.setDocumentation("");
		boolean boolean7 = zentaDiagramModel0.isChecked();
		org.junit.Assert.assertNotNull(eClass3);
		org.junit.Assert.assertTrue(
				"'" + boolean4 + "' != '" + true + "'", boolean4 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
	}

	@Test
	public void test0394() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0394"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel4.hasDiagramReferences();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		java.lang.Object obj13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel4.eDynamicSet(eStructuralFeature12, obj13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + false + "'", boolean11 == false
		);
	}

	@Test
	public void test0395() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0395"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList22 = zentaDiagramModel13
				.getProperties();
		java.lang.Object obj23 = zentaDiagramModel0.getAdapter(iPropertyList22);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature24 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature24);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert.assertNotNull(iPropertyList22);
		org.junit.Assert.assertNull(obj23);
	}

	@Test
	public void test0396() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0396"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		zentaDiagramModel0.setAdapter(zentaDiagramModel7, zentaDiagramModel15);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setDocumentation("hi!");
		int int24 = zentaDiagramModel21.eContainerFeatureID();
		java.lang.String str25 = zentaDiagramModel21.getName();
		int int26 = zentaDiagramModel21.getViewpoint();
		org.eclipse.emf.common.util.URI uRI27 = zentaDiagramModel21.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel29 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel29.setDocumentation("hi!");
		java.lang.Object obj33 = zentaDiagramModel29.getAdapter(0L);
		int int34 = zentaDiagramModel29.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList35 = zentaDiagramModel29
				.eAdapters();
		java.lang.Object obj36 = zentaDiagramModel21.eInvoke(0, adapterList35);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj37 = zentaDiagramModel15
					.eInvoke(' ', adapterList35);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNull(eStore18);
		org.junit.Assert
				.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
		org.junit.Assert
				.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
		org.junit.Assert
				.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
		org.junit.Assert.assertNull(uRI27);
		org.junit.Assert.assertNull(obj33);
		org.junit.Assert
				.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
		org.junit.Assert.assertNotNull(adapterList35);
		org.junit.Assert.assertNotNull(obj36);
	}

	@Test
	public void test0397() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0397"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		java.lang.Class<?> wildcardClass7 = zentaDiagramModel0.getClass();
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNotNull(wildcardClass7);
	}

	@Test
	public void test0398() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0398"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel4.check();
			org.junit.Assert.fail(
					"Expected exception of type org.rulez.magwas.zenta.model.ModelConsistencyException; message: id cannot be null: org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel@133ca2b3 (name: , id: null, lineWidth: 1, lineColor: null, documentation: hi!, connectionRouterType: 0) (viewpoint: 0)"
			);
		} catch (org.rulez.magwas.zenta.model.ModelConsistencyException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
	}

	@Test
	public void test0399() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0399"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList14 = zentaDiagramModel5
				.getProperties();
		org.eclipse.emf.ecore.EReference eReference15 = zentaDiagramModel5
				.eContainmentFeature();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj18 = zentaDiagramModel5
					.eOpenGet(eStructuralFeature16, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert.assertNotNull(iPropertyList14);
		org.junit.Assert.assertNull(eReference15);
	}

	@Test
	public void test0400() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0400"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.eclipse.emf.ecore.EClass eClass33 = zentaDiagramModel0.eClass();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel35 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel35.setDocumentation("hi!");
		int int38 = zentaDiagramModel35.eContainerFeatureID();
		java.lang.String str39 = zentaDiagramModel35.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel40 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel40.setDocumentation("hi!");
		int int43 = zentaDiagramModel40.eContainerFeatureID();
		java.lang.String str44 = zentaDiagramModel40.getName();
		zentaDiagramModel35.setAdapter(zentaDiagramModel40, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel47 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel47.setDocumentation("hi!");
		int int50 = zentaDiagramModel47.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject51 = zentaDiagramModel40
				.eResolveProxy(zentaDiagramModel47);
		zentaDiagramModel40.setLineWidth(0);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj54 = zentaDiagramModel0
					.eVirtualSet(' ', zentaDiagramModel40);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNotNull(eClass33);
		org.junit.Assert
				.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
		org.junit.Assert
				.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
		org.junit.Assert
				.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
		org.junit.Assert
				.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
		org.junit.Assert
				.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
		org.junit.Assert.assertNotNull(eObject51);
	}

	@Test
	public void test0401() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0401"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		java.lang.Object obj13 = zentaDiagramModel0.eGet(2, false, false);
		org.eclipse.emf.common.notify.Notification notification14 = null;
		zentaDiagramModel0.eNotify(notification14);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = zentaDiagramModel0
				.eContainingFeature();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel17 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel17.setDocumentation("hi!");
		int int20 = zentaDiagramModel17.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setDocumentation("hi!");
		int int24 = zentaDiagramModel21.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal25 = zentaDiagramModel21
				.eInternalResource();
		java.lang.String str26 = zentaDiagramModel21.getDocumentation();
		boolean boolean27 = zentaDiagramModel17.eContains(zentaDiagramModel21);
		boolean boolean28 = zentaDiagramModel17.isDeleted();
		org.eclipse.emf.ecore.EReference eReference29 = zentaDiagramModel17
				.eContainmentFeature();
		int int30 = zentaDiagramModel17.eContainerFeatureID();
		org.eclipse.emf.common.notify.NotificationChain notificationChain32 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain33 = zentaDiagramModel0
					.eInverseAdd(
							zentaDiagramModel17, (short) 100,
							notificationChain32
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(obj13);
		org.junit.Assert.assertNull(eStructuralFeature16);
		org.junit.Assert
				.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
		org.junit.Assert
				.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
		org.junit.Assert.assertNull(internal25);
		org.junit.Assert.assertEquals(
				"'" + str26 + "' != '" + "hi!" + "'", str26, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean27 + "' != '" + false + "'", boolean27 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + true + "'", boolean28 == true
		);
		org.junit.Assert.assertNull(eReference29);
		org.junit.Assert
				.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
	}

	@Test
	public void test0402() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0402"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineColor("");
		org.rulez.magwas.zenta.model.UndoState undoState5 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test0403() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0403"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		int int26 = zentaDiagramModel14.eContainerFeatureID();
		int int27 = zentaDiagramModel14.getLineWidth();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicSet(10, zentaDiagramModel14);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'viewpoint' is not a valid changeable feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
		org.junit.Assert
				.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
	}

	@Test
	public void test0404() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0404"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		boolean boolean5 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean7 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + true + "'", boolean5 == true
		);
	}

	@Test
	public void test0405() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0405"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel20 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel20.setDocumentation("hi!");
		int int23 = zentaDiagramModel20.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject24 = zentaDiagramModel13
				.eResolveProxy(zentaDiagramModel20);
		org.eclipse.emf.common.notify.NotificationChain notificationChain26 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain27 = zentaDiagramModel0
				.eBasicSetContainer(
						zentaDiagramModel20, '4', notificationChain26
				);
		org.eclipse.emf.ecore.EOperation eOperation28 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int29 = zentaDiagramModel20.eDerivedOperationID(eOperation28);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert
				.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
		org.junit.Assert.assertNotNull(eObject24);
		org.junit.Assert.assertNull(notificationChain27);
	}

	@Test
	public void test0406() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0406"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
	}

	@Test
	public void test0407() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0407"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = zentaDiagramModel0
				.eDirectResource();
		org.eclipse.emf.ecore.EObject eObject8 = zentaDiagramModel0
				.eContainer();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean10 = zentaDiagramModel0.eIsSet(eStructuralFeature9);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(internal7);
		org.junit.Assert.assertNull(eObject8);
	}

	@Test
	public void test0408() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0408"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		java.lang.String str7 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		java.lang.String str14 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal15 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain16 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain17 = zentaDiagramModel8
				.eSetResource(internal15, notificationChain16);
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = zentaDiagramModel8
				.eInternalResource();
		zentaDiagramModel8.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel21 = zentaDiagramModel8
				.findDiagramModel();
		java.lang.String str22 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature23 = zentaDiagramModel8
				.eContainingFeature();
		boolean boolean24 = zentaDiagramModel8.isDeleted();
		org.eclipse.emf.ecore.EObject eObject25 = zentaDiagramModel0
				.eResolveProxy(zentaDiagramModel8);
		java.lang.String str26 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature27 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel8.eDynamicUnset(eStructuralFeature27);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert
				.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain17);
		org.junit.Assert.assertNull(internal18);
		org.junit.Assert.assertNotNull(iDiagramModel21);
		org.junit.Assert.assertEquals(
				"'" + str22 + "' != '" + "hi!" + "'", str22, "hi!"
		);
		org.junit.Assert.assertNull(eStructuralFeature23);
		org.junit.Assert.assertTrue(
				"'" + boolean24 + "' != '" + true + "'", boolean24 == true
		);
		org.junit.Assert.assertNotNull(eObject25);
		org.junit.Assert.assertEquals(
				"'" + str26 + "' != '" + "hi!" + "'", str26, "hi!"
		);
	}

	@Test
	public void test0409() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0409"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor7 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore12 = zentaDiagramModel9
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList13 = zentaDiagramModel9
				.eAdapters();
		java.lang.Object obj14 = zentaDiagramModel0
				.eInvoke((short) 0, adapterList13);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature15 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		int int19 = zentaDiagramModel16.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal20 = zentaDiagramModel16
				.eInternalResource();
		java.lang.String str21 = zentaDiagramModel16.getDocumentation();
		boolean boolean22 = zentaDiagramModel16.isChecked();
		zentaDiagramModel16.setName("hi!");
		int int25 = zentaDiagramModel16.getConnectionRouterType();
		boolean boolean26 = zentaDiagramModel16.isTemplate();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str27 = zentaDiagramModel0.eURIFragmentSegment(
					eStructuralFeature15, zentaDiagramModel16
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor7);
		org.junit.Assert.assertNull(eStore12);
		org.junit.Assert.assertNotNull(adapterList13);
		org.junit.Assert.assertNotNull(obj14);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
		org.junit.Assert.assertNull(internal20);
		org.junit.Assert.assertEquals(
				"'" + str21 + "' != '" + "hi!" + "'", str21, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean22 + "' != '" + false + "'", boolean22 == false
		);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean26 + "' != '" + false + "'", boolean26 == false
		);
	}

	@Test
	public void test0410() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0410"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		int int6 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject12 = zentaDiagramModel7
				.eInternalContainer();
		boolean boolean13 = zentaDiagramModel7.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor14 = zentaDiagramModel7
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore19 = zentaDiagramModel16
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList20 = zentaDiagramModel16
				.eAdapters();
		java.lang.Object obj21 = zentaDiagramModel7
				.eInvoke((short) 0, adapterList20);
		java.lang.Object obj22 = zentaDiagramModel0.getAdapter(adapterList20);
		int int23 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature24 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj26 = zentaDiagramModel0
					.eOpenGet(eStructuralFeature24, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertNull(obj11);
		org.junit.Assert.assertNull(internalEObject12);
		org.junit.Assert.assertTrue(
				"'" + boolean13 + "' != '" + false + "'", boolean13 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor14);
		org.junit.Assert.assertNull(eStore19);
		org.junit.Assert.assertNotNull(adapterList20);
		org.junit.Assert.assertNotNull(obj21);
		org.junit.Assert.assertNull(obj22);
		org.junit.Assert
				.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
	}

	@Test
	public void test0411() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0411"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor10 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.ecore.EClass eClass11 = zentaDiagramModel0.eClass();
		java.lang.String str12 = zentaDiagramModel0.getLineColor();
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(eObjectItor10);
		org.junit.Assert.assertNotNull(eClass11);
		org.junit.Assert.assertNull(str12);
	}

	@Test
	public void test0412() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0412"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList5 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(adapterList5);
		org.junit.Assert.assertNotNull(eObjectList6);
	}

	@Test
	public void test0413() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0413"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean9 = false; // flaky: zentaDiagramModel0.eIsSet(35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
	}

	@Test
	public void test0414() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0414"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.URI uRI4 = null;
		zentaDiagramModel0.eSetProxyURI(uRI4);
		org.eclipse.emf.common.util.URI uRI6 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = zentaDiagramModel8
				.eContainingFeature();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		java.lang.Object obj17 = zentaDiagramModel13.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject18 = zentaDiagramModel13
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList19 = zentaDiagramModel13
				.eContents();
		java.lang.Object obj20 = zentaDiagramModel8.getAdapter(eObjectList19);
		java.lang.String str21 = zentaDiagramModel8.getDocumentation();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicSet(10, str21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'viewpoint' is not a valid changeable feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(uRI6);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertNull(eStructuralFeature12);
		org.junit.Assert.assertNull(obj17);
		org.junit.Assert.assertNull(internalEObject18);
		org.junit.Assert.assertNotNull(eObjectList19);
		org.junit.Assert.assertNull(obj20);
		org.junit.Assert.assertEquals(
				"'" + str21 + "' != '" + "hi!" + "'", str21, "hi!"
		);
	}

	@Test
	public void test0415() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0415"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		zentaDiagramModel0.checkName("");
		org.eclipse.emf.ecore.InternalEObject internalEObject17 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean18 = zentaDiagramModel0.isTemplate();
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertNull(internalEObject17);
		org.junit.Assert.assertTrue(
				"'" + boolean18 + "' != '" + false + "'", boolean18 == false
		);
	}

	@Test
	public void test0416() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0416"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList5 = zentaDiagramModel0
				.eAdapters();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		java.lang.Object obj10 = zentaDiagramModel6.getAdapter(0L);
		int int11 = zentaDiagramModel6.getLineWidth();
		java.lang.String str12 = zentaDiagramModel6.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal13 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel6
				.eSetResource(internal13, notificationChain14);
		java.lang.Object obj19 = zentaDiagramModel6.eGet(2, false, false);
		org.eclipse.emf.common.notify.Notification notification20 = null;
		zentaDiagramModel6.eNotify(notification20);
		org.eclipse.emf.ecore.EObject eObject22 = zentaDiagramModel0
				.eResolveProxy(zentaDiagramModel6);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature23 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel24 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel24.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore27 = zentaDiagramModel24
				.eStore();
		org.eclipse.emf.common.notify.Notification notification28 = null;
		zentaDiagramModel24.eNotify(notification28);
		int int30 = zentaDiagramModel24.getViewpoint();
		int int31 = zentaDiagramModel24.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel32 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel32.setDocumentation("hi!");
		int int35 = zentaDiagramModel32.eContainerFeatureID();
		java.lang.String str36 = zentaDiagramModel32.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel37 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel37.setDocumentation("hi!");
		int int40 = zentaDiagramModel37.eContainerFeatureID();
		java.lang.String str41 = zentaDiagramModel37.getName();
		zentaDiagramModel32.setAdapter(zentaDiagramModel37, 1L);
		java.lang.String str44 = zentaDiagramModel37.getId();
		int int45 = zentaDiagramModel37.getViewpoint();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList46 = zentaDiagramModel37
				.getProperties();
		java.lang.Object obj47 = zentaDiagramModel24
				.getAdapter(iPropertyList46);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList48 = zentaDiagramModel24
				.getChildren();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str49 = zentaDiagramModel6.eURIFragmentSegment(
					eStructuralFeature23, zentaDiagramModel24
			);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(adapterList5);
		org.junit.Assert.assertNull(obj10);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain15);
		org.junit.Assert.assertNull(obj19);
		org.junit.Assert.assertNotNull(eObject22);
		org.junit.Assert.assertNull(eStore27);
		org.junit.Assert
				.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
		org.junit.Assert
				.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
		org.junit.Assert
				.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
		org.junit.Assert
				.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
		org.junit.Assert
				.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
		org.junit.Assert
				.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
		org.junit.Assert.assertNull(str44);
		org.junit.Assert
				.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
		org.junit.Assert.assertNotNull(iPropertyList46);
		org.junit.Assert.assertNull(obj47);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList48);
	}

	@Test
	public void test0417() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0417"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList5 = zentaDiagramModel0
				.eAdapters();
		zentaDiagramModel0.checkName("");
		boolean boolean8 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature9 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj11 = zentaDiagramModel0
					.eOpenGet(eStructuralFeature9, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(adapterList5);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + false + "'", boolean8 == false
		);
	}

	@Test
	public void test0418() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0418"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList5 = zentaDiagramModel0
				.eAdapters();
		zentaDiagramModel0.setId("hi!");
		org.junit.Assert.assertNotNull(adapterList5);
	}

	@Test
	public void test0419() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0419"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.getDiagramModel();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature8, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
	}

	@Test
	public void test0420() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0420"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		boolean boolean5 = zentaDiagramModel0.eNotificationRequired();
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel0.eClass();
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
		org.junit.Assert.assertNotNull(eClass6);
	}

	@Test
	public void test0421() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0421"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal5 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = zentaDiagramModel0
				.eSetResource(internal5, notificationChain6);
		boolean boolean8 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.resource.Resource.Internal internal9 = zentaDiagramModel0
				.eInternalResource();
		java.lang.Object obj13 = zentaDiagramModel0.eGet(4, true, false);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature14 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		java.lang.Object obj19 = zentaDiagramModel15.getAdapter(0L);
		int int20 = zentaDiagramModel15.getLineWidth();
		java.lang.String str21 = zentaDiagramModel15.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal22 = zentaDiagramModel15
				.eDirectResource();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList23 = zentaDiagramModel15
				.getChildren();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eOpenSet(eStructuralFeature14, iDiagramModelObjectList23);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert.assertNull(notificationChain7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + false + "'", boolean8 == false
		);
		org.junit.Assert.assertNull(internal9);
		org.junit.Assert
				.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
		org.junit.Assert.assertNull(obj19);
		org.junit.Assert
				.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
		org.junit.Assert.assertEquals(
				"'" + str21 + "' != '" + "hi!" + "'", str21, "hi!"
		);
		org.junit.Assert.assertNull(internal22);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList23);
	}

	@Test
	public void test0422() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0422"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel4 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel4);
	}

	@Test
	public void test0423() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0423"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.rulez.magwas.zenta.model.UndoState undoState33 = zentaDiagramModel13
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel34 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel34.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass37 = zentaDiagramModel34.eClass();
		zentaDiagramModel13.eSetClass(eClass37);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature39 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel40 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel40.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel43 = zentaDiagramModel40
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass44 = zentaDiagramModel40.eClass();
		boolean boolean45 = zentaDiagramModel40.eIsProxy();
		zentaDiagramModel40.setId("");
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel13.eSet(eStructuralFeature39, "");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNotNull(undoState33);
		org.junit.Assert.assertNotNull(eClass37);
		org.junit.Assert.assertNotNull(iDiagramModel43);
		org.junit.Assert.assertNotNull(eClass44);
		org.junit.Assert.assertTrue(
				"'" + boolean45 + "' != '" + false + "'", boolean45 == false
		);
	}

	@Test
	public void test0424() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0424"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		zentaDiagramModel0.setChecked(true);
		org.eclipse.emf.common.notify.NotificationChain notificationChain5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain6 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
	}

	@Test
	public void test0425() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0425"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		int int12 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean13 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.ecore.resource.Resource.Internal internal14 = zentaDiagramModel0
				.eDirectResource();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature15 = null;
		org.eclipse.emf.ecore.EObject eObject16 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.String str17 = zentaDiagramModel0
					.eURIFragmentSegment(eStructuralFeature15, eObject16);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean13 + "' != '" + false + "'", boolean13 == false
		);
		org.junit.Assert.assertNull(internal14);
	}

	@Test
	public void test0426() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0426"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.String str12 = zentaDiagramModel5.getId();
		int int13 = zentaDiagramModel5.getViewpoint();
		java.lang.String str14 = zentaDiagramModel5.getName();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj16 = zentaDiagramModel5.eVirtualGet('a');
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(str12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
	}

	@Test
	public void test0427() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0427"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		java.lang.String str7 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		java.lang.String str14 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal15 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain16 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain17 = zentaDiagramModel8
				.eSetResource(internal15, notificationChain16);
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = zentaDiagramModel8
				.eInternalResource();
		zentaDiagramModel8.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel21 = zentaDiagramModel8
				.findDiagramModel();
		java.lang.String str22 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature23 = zentaDiagramModel8
				.eContainingFeature();
		boolean boolean24 = zentaDiagramModel8.isDeleted();
		org.eclipse.emf.ecore.EObject eObject25 = zentaDiagramModel0
				.eResolveProxy(zentaDiagramModel8);
		java.lang.String str26 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore27 = zentaDiagramModel8
				.eStore();
		boolean boolean29 = zentaDiagramModel8.eIsSet((short) 10);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature30 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.ecore.EStructuralFeature.Setting setting31 = zentaDiagramModel8
					.eSetting(eStructuralFeature30);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert
				.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain17);
		org.junit.Assert.assertNull(internal18);
		org.junit.Assert.assertNotNull(iDiagramModel21);
		org.junit.Assert.assertEquals(
				"'" + str22 + "' != '" + "hi!" + "'", str22, "hi!"
		);
		org.junit.Assert.assertNull(eStructuralFeature23);
		org.junit.Assert.assertTrue(
				"'" + boolean24 + "' != '" + true + "'", boolean24 == true
		);
		org.junit.Assert.assertNotNull(eObject25);
		org.junit.Assert.assertEquals(
				"'" + str26 + "' != '" + "hi!" + "'", str26, "hi!"
		);
		org.junit.Assert.assertNull(eStore27);
		org.junit.Assert.assertTrue(
				"'" + boolean29 + "' != '" + false + "'", boolean29 == false
		);
	}

	@Test
	public void test0428() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0428"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		int int17 = zentaDiagramModel12.getViewpoint();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor18 = zentaDiagramModel12
				.eAllContents();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert.assertNotNull(eObjectItor18);
	}

	@Test
	public void test0429() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0429"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		java.lang.Object obj12 = null;
		java.lang.Object obj13 = zentaDiagramModel0.getAdapter(obj12);
		java.lang.String str14 = zentaDiagramModel0.getName();
		org.eclipse.emf.ecore.InternalEObject internalEObject15 = zentaDiagramModel0
				.eInternalContainer();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicSet((byte) 0, (short) -1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'zentaModel' is not a valid changeable feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert.assertNull(obj13);
		org.junit.Assert
				.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
		org.junit.Assert.assertNull(internalEObject15);
	}

	@Test
	public void test0430() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0430"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		boolean boolean15 = zentaDiagramModel0.isTemplate();
		java.lang.String str16 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature17 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj19 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature17, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean15 + "' != '" + false + "'", boolean15 == false
		);
		org.junit.Assert.assertEquals(
				"'" + str16 + "' != '" + "hi!" + "'", str16, "hi!"
		);
	}

	@Test
	public void test0431() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0431"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setLineColor("hi!");
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		boolean boolean9 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EOperation eOperation10 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		int int14 = zentaDiagramModel11.eContainerFeatureID();
		java.lang.String str15 = zentaDiagramModel11.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList16 = zentaDiagramModel11
				.eContents();
		int int17 = zentaDiagramModel11.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel18 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel18.setDocumentation("hi!");
		java.lang.Object obj22 = zentaDiagramModel18.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject23 = zentaDiagramModel18
				.eInternalContainer();
		boolean boolean24 = zentaDiagramModel18.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor25 = zentaDiagramModel18
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel27 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel27.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore30 = zentaDiagramModel27
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList31 = zentaDiagramModel27
				.eAdapters();
		java.lang.Object obj32 = zentaDiagramModel18
				.eInvoke((short) 0, adapterList31);
		java.lang.Object obj33 = zentaDiagramModel11.getAdapter(adapterList31);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj34 = zentaDiagramModel0
					.eInvoke(eOperation10, adapterList31);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean9 + "' != '" + true + "'", boolean9 == true
		);
		org.junit.Assert
				.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
		org.junit.Assert
				.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
		org.junit.Assert.assertNotNull(eObjectList16);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert.assertNull(obj22);
		org.junit.Assert.assertNull(internalEObject23);
		org.junit.Assert.assertTrue(
				"'" + boolean24 + "' != '" + false + "'", boolean24 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor25);
		org.junit.Assert.assertNull(eStore30);
		org.junit.Assert.assertNotNull(adapterList31);
		org.junit.Assert.assertNotNull(obj32);
		org.junit.Assert.assertNull(obj33);
	}

	@Test
	public void test0432() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0432"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.getDiagramModel();
		boolean boolean10 = zentaDiagramModel0.eNotificationRequired();
		int int11 = zentaDiagramModel0.getConnectionRouterType();
		boolean boolean12 = zentaDiagramModel0.hasDiagramReferences();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		java.lang.Object obj18 = zentaDiagramModel14.getAdapter(0L);
		int int19 = zentaDiagramModel14.getLineWidth();
		java.lang.String str20 = zentaDiagramModel14.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore24 = zentaDiagramModel21
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList25 = zentaDiagramModel21
				.eAdapters();
		boolean boolean26 = zentaDiagramModel21.eDeliver();
		java.lang.Object obj27 = zentaDiagramModel14
				.getAdapter(zentaDiagramModel21);
		zentaDiagramModel14.setViewpoint((short) 10);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj30 = zentaDiagramModel0
					.eVirtualGet(4, (short) 10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
		org.junit.Assert.assertNull(obj18);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
		org.junit.Assert.assertNull(str20);
		org.junit.Assert.assertNull(eStore24);
		org.junit.Assert.assertNotNull(adapterList25);
		org.junit.Assert.assertTrue(
				"'" + boolean26 + "' != '" + true + "'", boolean26 == true
		);
		org.junit.Assert.assertNull(obj27);
	}

	@Test
	public void test0433() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0433"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean1 = zentaDiagramModel0.isDeleted();
		java.lang.String str2 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.notify.NotificationChain notificationChain3 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain4 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain3);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue(
				"'" + boolean1 + "' != '" + true + "'", boolean1 == true
		);
		org.junit.Assert
				.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
	}

	@Test
	public void test0434() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0434"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		java.lang.String str5 = zentaDiagramModel0.getLineColor();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj7 = zentaDiagramModel0
					.eGet(eStructuralFeature6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(str5);
	}

	@Test
	public void test0435() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0435"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList10 = zentaDiagramModel0
				.eAdapters();
		zentaDiagramModel0.setLineWidth(10);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset(97);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(adapterList10);
	}

	@Test
	public void test0436() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0436"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor10 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.ecore.EClass eClass11 = zentaDiagramModel0.eClass();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		java.lang.Object obj17 = zentaDiagramModel13.getAdapter(0L);
		int int18 = zentaDiagramModel13.getLineWidth();
		java.lang.String str19 = zentaDiagramModel13.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal20 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain21 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain22 = zentaDiagramModel13
				.eSetResource(internal20, notificationChain21);
		org.eclipse.emf.ecore.resource.Resource.Internal internal23 = zentaDiagramModel13
				.eInternalResource();
		zentaDiagramModel13.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel26 = zentaDiagramModel13
				.findDiagramModel();
		boolean boolean27 = zentaDiagramModel13.isDeleted();
		zentaDiagramModel13.checkName("");
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList30 = zentaDiagramModel13
				.getChildren();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eOpenSet(eStructuralFeature12, iDiagramModelObjectList30);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(eObjectItor10);
		org.junit.Assert.assertNotNull(eClass11);
		org.junit.Assert.assertNull(obj17);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
		org.junit.Assert.assertEquals(
				"'" + str19 + "' != '" + "hi!" + "'", str19, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain22);
		org.junit.Assert.assertNull(internal23);
		org.junit.Assert.assertNotNull(iDiagramModel26);
		org.junit.Assert.assertTrue(
				"'" + boolean27 + "' != '" + true + "'", boolean27 == true
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList30);
	}

	@Test
	public void test0437() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0437"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		boolean boolean5 = zentaDiagramModel0.eNotificationRequired();
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel0.eClass();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean8 = zentaDiagramModel0.eVirtualIsSet(0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
		org.junit.Assert.assertNotNull(eClass6);
	}

	@Test
	public void test0438() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0438"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor10 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		java.lang.Object obj15 = zentaDiagramModel11.getAdapter(0L);
		int int16 = zentaDiagramModel11.getLineWidth();
		java.lang.String str17 = zentaDiagramModel11.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain19 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain20 = zentaDiagramModel11
				.eSetResource(internal18, notificationChain19);
		org.eclipse.emf.ecore.resource.Resource.Internal internal21 = zentaDiagramModel11
				.eInternalResource();
		zentaDiagramModel11.setName("");
		zentaDiagramModel11.setName("");
		org.eclipse.emf.common.notify.NotificationChain notificationChain27 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain28 = zentaDiagramModel0
					.eInverseRemove(
							zentaDiagramModel11, (byte) 1, notificationChain27
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(eObjectItor10);
		org.junit.Assert.assertNull(obj15);
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
		org.junit.Assert.assertEquals(
				"'" + str17 + "' != '" + "hi!" + "'", str17, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain20);
		org.junit.Assert.assertNull(internal21);
	}

	@Test
	public void test0439() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0439"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		boolean boolean6 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = zentaDiagramModel0
				.eContainingFeature();
		org.junit.Assert.assertNull(resource3);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(eStructuralFeature7);
	}

	@Test
	public void test0440() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0440"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList5 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean8 = zentaDiagramModel0.eDynamicIsSet(0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(adapterList5);
		org.junit.Assert.assertNotNull(eObjectList6);
	}

	@Test
	public void test0441() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0441"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel4 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.common.notify.Notification notification5 = null;
		zentaDiagramModel0.eNotify(notification5);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor7 = zentaDiagramModel0
				.eAllContents();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel4);
		org.junit.Assert.assertNotNull(eObjectItor7);
	}

	@Test
	public void test0442() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0442"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.isDeleted();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel12 = zentaDiagramModel0
				.findDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel26 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel26.setDocumentation("hi!");
		int int29 = zentaDiagramModel26.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject30 = zentaDiagramModel19
				.eResolveProxy(zentaDiagramModel26);
		org.eclipse.emf.common.util.URI uRI31 = null;
		zentaDiagramModel19.eSetProxyURI(uRI31);
		zentaDiagramModel0.eSet((short) 1, uRI31);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList34 = zentaDiagramModel0
				.eContents();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature35 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int36 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature35);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
		org.junit.Assert.assertNotNull(iDiagramModel12);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
		org.junit.Assert.assertNotNull(eObject30);
		org.junit.Assert.assertNotNull(eObjectList34);
	}

	@Test
	public void test0443() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0443"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.eNotificationRequired();
		org.eclipse.emf.ecore.EReference eReference12 = zentaDiagramModel0
				.eContainmentFeature();
		zentaDiagramModel0.checkDocumentation("");
		zentaDiagramModel0.initId();
		boolean boolean16 = zentaDiagramModel0.eIsProxy();
		boolean boolean17 = zentaDiagramModel0.eIsProxy();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature18 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj19 = zentaDiagramModel0
					.eGet(eStructuralFeature18);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + false + "'", boolean11 == false
		);
		org.junit.Assert.assertNull(eReference12);
		org.junit.Assert.assertTrue(
				"'" + boolean16 + "' != '" + false + "'", boolean16 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean17 + "' != '" + false + "'", boolean17 == false
		);
	}

	@Test
	public void test0444() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0444"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		zentaDiagramModel0.setChecked(false);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		java.lang.Object obj15 = zentaDiagramModel11.getAdapter(0L);
		int int16 = zentaDiagramModel11.getLineWidth();
		java.lang.String str17 = zentaDiagramModel11.getDocumentation();
		zentaDiagramModel11.checkId("");
		boolean boolean20 = zentaDiagramModel0.eContains(zentaDiagramModel11);
		org.eclipse.emf.ecore.EOperation eOperation21 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI23 = null;
		zentaDiagramModel22.eSetProxyURI(uRI23);
		zentaDiagramModel22.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList27 = zentaDiagramModel22
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj28 = zentaDiagramModel11
					.eInvoke(eOperation21, adapterList27);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(obj15);
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
		org.junit.Assert.assertEquals(
				"'" + str17 + "' != '" + "hi!" + "'", str17, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean20 + "' != '" + false + "'", boolean20 == false
		);
		org.junit.Assert.assertNotNull(adapterList27);
	}

	@Test
	public void test0445() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0445"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		boolean boolean33 = zentaDiagramModel22.isDeleted();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel34 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel34.setDocumentation("hi!");
		java.lang.Object obj38 = zentaDiagramModel34.getAdapter(0L);
		int int39 = zentaDiagramModel34.getLineWidth();
		boolean boolean40 = zentaDiagramModel34.isChecked();
		org.eclipse.emf.common.notify.NotificationChain notificationChain42 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain43 = zentaDiagramModel22
					.eInverseAdd(zentaDiagramModel34, 100, notificationChain42);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertTrue(
				"'" + boolean33 + "' != '" + true + "'", boolean33 == true
		);
		org.junit.Assert.assertNull(obj38);
		org.junit.Assert
				.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
		org.junit.Assert.assertTrue(
				"'" + boolean40 + "' != '" + false + "'", boolean40 == false
		);
	}

	@Test
	public void test0446() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0446"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.initId();
		org.eclipse.emf.ecore.resource.Resource.Internal internal11 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain12 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain13 = zentaDiagramModel0
				.eSetResource(internal11, notificationChain12);
		int int14 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EOperation eOperation15 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		int int19 = zentaDiagramModel16.eContainerFeatureID();
		java.lang.String str20 = zentaDiagramModel16.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setDocumentation("hi!");
		int int24 = zentaDiagramModel21.eContainerFeatureID();
		java.lang.String str25 = zentaDiagramModel21.getName();
		zentaDiagramModel16.setAdapter(zentaDiagramModel21, 1L);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList28 = zentaDiagramModel21
				.eAdapters();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj29 = zentaDiagramModel0
					.eInvoke(eOperation15, adapterList28);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert.assertNull(notificationChain13);
		org.junit.Assert
				.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
		org.junit.Assert
				.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
		org.junit.Assert
				.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
		org.junit.Assert
				.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
		org.junit.Assert.assertNotNull(adapterList28);
	}

	@Test
	public void test0447() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0447"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.isDeleted();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel12 = zentaDiagramModel0
				.findDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		java.lang.String str23 = zentaDiagramModel19.getName();
		zentaDiagramModel14.setAdapter(zentaDiagramModel19, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel26 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel26.setDocumentation("hi!");
		int int29 = zentaDiagramModel26.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject30 = zentaDiagramModel19
				.eResolveProxy(zentaDiagramModel26);
		org.eclipse.emf.common.util.URI uRI31 = null;
		zentaDiagramModel19.eSetProxyURI(uRI31);
		zentaDiagramModel0.eSet((short) 1, uRI31);
		org.eclipse.emf.ecore.resource.Resource.Internal internal34 = zentaDiagramModel0
				.eInternalResource();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
		org.junit.Assert.assertNotNull(iDiagramModel12);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert
				.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert
				.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
		org.junit.Assert
				.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
		org.junit.Assert.assertNotNull(eObject30);
		org.junit.Assert.assertNull(internal34);
	}

	@Test
	public void test0448() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0448"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		int int9 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList10 = zentaDiagramModel0
				.eContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore15 = zentaDiagramModel12
				.eStore();
		org.eclipse.emf.common.notify.Notification notification16 = null;
		zentaDiagramModel12.eNotify(notification16);
		int int18 = zentaDiagramModel12.getViewpoint();
		int int19 = zentaDiagramModel12.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel20 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel20.setDocumentation("hi!");
		int int23 = zentaDiagramModel20.eContainerFeatureID();
		java.lang.String str24 = zentaDiagramModel20.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel25 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel25.setDocumentation("hi!");
		int int28 = zentaDiagramModel25.eContainerFeatureID();
		java.lang.String str29 = zentaDiagramModel25.getName();
		zentaDiagramModel20.setAdapter(zentaDiagramModel25, 1L);
		java.lang.String str32 = zentaDiagramModel25.getId();
		int int33 = zentaDiagramModel25.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel34 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel34.setDocumentation("hi!");
		int int37 = zentaDiagramModel34.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal38 = zentaDiagramModel34
				.eInternalResource();
		java.lang.String str39 = zentaDiagramModel34.getDocumentation();
		boolean boolean40 = zentaDiagramModel34.isChecked();
		zentaDiagramModel34.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel43 = zentaDiagramModel34
				.findDiagramModel();
		zentaDiagramModel12
				.setAdapter(zentaDiagramModel25, zentaDiagramModel34);
		org.eclipse.emf.ecore.resource.Resource resource45 = zentaDiagramModel34
				.eResource();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel47 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel47.setDocumentation("hi!");
		java.lang.Object obj51 = zentaDiagramModel47.getAdapter(0L);
		int int52 = zentaDiagramModel47.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList53 = zentaDiagramModel47
				.eAdapters();
		java.lang.Object obj54 = zentaDiagramModel34.eInvoke(0, adapterList53);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj55 = zentaDiagramModel0
					.eInvoke((-1), adapterList53);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
		org.junit.Assert.assertNotNull(eObjectList10);
		org.junit.Assert.assertNull(eStore15);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
		org.junit.Assert
				.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
		org.junit.Assert
				.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
		org.junit.Assert
				.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
		org.junit.Assert
				.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
		org.junit.Assert
				.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
		org.junit.Assert.assertNull(str32);
		org.junit.Assert
				.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
		org.junit.Assert
				.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
		org.junit.Assert.assertNull(internal38);
		org.junit.Assert.assertEquals(
				"'" + str39 + "' != '" + "hi!" + "'", str39, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean40 + "' != '" + false + "'", boolean40 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel43);
		org.junit.Assert.assertNull(resource45);
		org.junit.Assert.assertNull(obj51);
		org.junit.Assert
				.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
		org.junit.Assert.assertNotNull(adapterList53);
		org.junit.Assert.assertNotNull(obj54);
	}

	@Test
	public void test0449() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0449"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal5 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = zentaDiagramModel0
				.eSetResource(internal5, notificationChain6);
		boolean boolean8 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.resource.Resource.Internal internal9 = zentaDiagramModel0
				.eInternalResource();
		boolean boolean10 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicUnset(eStructuralFeature11);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert.assertNull(notificationChain7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + false + "'", boolean8 == false
		);
		org.junit.Assert.assertNull(internal9);
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + true + "'", boolean10 == true
		);
	}

	@Test
	public void test0450() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0450"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel14 = zentaDiagramModel11
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass15 = zentaDiagramModel11.eClass();
		zentaDiagramModel0.eSetClass(eClass15);
		java.lang.String str17 = zentaDiagramModel0.toString();
		java.lang.String str18 = zentaDiagramModel0.toString();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean20 = false; // flaky: zentaDiagramModel0.eIsSet((int)
										// '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(undoState10);
		org.junit.Assert.assertNotNull(iDiagramModel14);
		org.junit.Assert.assertNotNull(eClass15);
	}

	@Test
	public void test0451() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0451"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.initId();
		boolean boolean11 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int13 = zentaDiagramModel0
					.eDerivedStructuralFeatureID(eStructuralFeature12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
	}

	@Test
	public void test0452() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0452"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.eclipse.emf.ecore.resource.Resource resource33 = zentaDiagramModel22
				.eResource();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor34 = zentaDiagramModel22
				.eAllContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean36 = zentaDiagramModel22.eDynamicIsSet(35);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNull(resource33);
		org.junit.Assert.assertNotNull(eObjectItor34);
	}

	@Test
	public void test0453() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0453"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		org.eclipse.emf.ecore.EObject eObject16 = zentaDiagramModel5
				.eResolveProxy(zentaDiagramModel12);
		zentaDiagramModel5.setLineWidth(0);
		zentaDiagramModel5.setLineColor("");
		zentaDiagramModel5.setChecked(false);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
		org.junit.Assert
				.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
		org.junit.Assert.assertNotNull(eObject16);
	}

	@Test
	public void test0454() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0454"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.toString();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		java.lang.Object obj10 = zentaDiagramModel6.getAdapter(0L);
		int int11 = zentaDiagramModel6.getLineWidth();
		java.lang.String str12 = zentaDiagramModel6.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal13 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel6
				.eSetResource(internal13, notificationChain14);
		org.eclipse.emf.ecore.resource.Resource.Internal internal16 = zentaDiagramModel6
				.eInternalResource();
		zentaDiagramModel6.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel19 = zentaDiagramModel6
				.findDiagramModel();
		java.lang.String str20 = zentaDiagramModel6.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature21 = zentaDiagramModel6
				.eContainingFeature();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj22 = zentaDiagramModel0
					.eVirtualGet(97, eStructuralFeature21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNull(obj10);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain15);
		org.junit.Assert.assertNull(internal16);
		org.junit.Assert.assertNotNull(iDiagramModel19);
		org.junit.Assert.assertEquals(
				"'" + str20 + "' != '" + "hi!" + "'", str20, "hi!"
		);
		org.junit.Assert.assertNull(eStructuralFeature21);
	}

	@Test
	public void test0455() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0455"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.getDiagramModel();
		boolean boolean10 = zentaDiagramModel0.eNotificationRequired();
		int int11 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eSetStore(eStore12);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
	}

	@Test
	public void test0456() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0456"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.InternalEObject internalEObject6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eBasicSetContainer(internalEObject6, '#', notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eDirectResource();
		zentaDiagramModel0.setLineColor("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean14 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
	}

	@Test
	public void test0457() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0457"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		zentaDiagramModel0.checkName("");
		org.eclipse.emf.ecore.InternalEObject internalEObject17 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature18 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj20 = zentaDiagramModel0
					.eGet(eStructuralFeature18, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertNull(internalEObject17);
	}

	@Test
	public void test0458() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0458"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setLineWidth((short) 0);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor10 = zentaDiagramModel7
				.eAllContents();
		java.lang.String str11 = zentaDiagramModel7.getDocumentation();
		org.eclipse.emf.common.notify.NotificationChain notificationChain13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain14 = zentaDiagramModel0
					.eInverseAdd(
							zentaDiagramModel7, (byte) 100, notificationChain13
					);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor10);
		org.junit.Assert
				.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
	}

	@Test
	public void test0459() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0459"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setId("hi!");
		int int10 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(false);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature13 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean14 = zentaDiagramModel0.eIsSet(eStructuralFeature13);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
	}

	@Test
	public void test0460() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0460"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.getId();
		zentaDiagramModel0.checkDocumentation("");
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eContents();
		zentaDiagramModel0.setConnectionRouterType((byte) 100);
		org.eclipse.emf.common.notify.NotificationChain notificationChain10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain11 = zentaDiagramModel0
					.eBasicRemoveFromContainer(notificationChain10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNull(str4);
		org.junit.Assert.assertNotNull(eObjectList7);
	}

	@Test
	public void test0461() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0461"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str8 = zentaDiagramModel0.getLineColor();
		org.rulez.magwas.zenta.model.IFolder iFolder9 = null;
		org.rulez.magwas.zenta.model.IFolder iFolder10 = null;
		zentaDiagramModel0.move(iFolder9, iFolder10);
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(adapterList6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertNull(str8);
	}

	@Test
	public void test0462() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0462"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.getDiagramModel();
		boolean boolean10 = zentaDiagramModel0.eNotificationRequired();
		int int11 = zentaDiagramModel0.getConnectionRouterType();
		boolean boolean12 = zentaDiagramModel0.hasDiagramReferences();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature17 = zentaDiagramModel13
				.eContainingFeature();
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = zentaDiagramModel13
				.eInternalResource();
		boolean boolean19 = zentaDiagramModel13.isTemplate();
		org.eclipse.emf.common.notify.NotificationChain notificationChain21 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain22 = zentaDiagramModel0
					.eInverseRemove(zentaDiagramModel13, 52, notificationChain21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert.assertNull(eStructuralFeature17);
		org.junit.Assert.assertNull(internal18);
		org.junit.Assert.assertTrue(
				"'" + boolean19 + "' != '" + false + "'", boolean19 == false
		);
	}

	@Test
	public void test0463() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0463"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel0
				.eInternalResource();
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(eObjectItor6);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
		org.junit.Assert.assertNull(internal8);
	}

	@Test
	public void test0464() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0464"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		boolean boolean6 = zentaDiagramModel0.eNotificationRequired();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		java.lang.String str14 = zentaDiagramModel8.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList15 = zentaDiagramModel8
				.getChildren();
		zentaDiagramModel8.setId("hi!");
		int int18 = zentaDiagramModel8.getViewpoint();
		zentaDiagramModel8.eSetDeliver(false);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0
					.eOpenSet(eStructuralFeature7, zentaDiagramModel8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertEquals(
				"'" + str14 + "' != '" + "hi!" + "'", str14, "hi!"
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList15);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
	}

	@Test
	public void test0465() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0465"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel4
				.eInternalResource();
		java.lang.String str9 = zentaDiagramModel4.getDocumentation();
		boolean boolean10 = zentaDiagramModel0.eContains(zentaDiagramModel4);
		boolean boolean11 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EReference eReference12 = zentaDiagramModel0
				.eContainmentFeature();
		zentaDiagramModel0.checkName("");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature15 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			boolean boolean16 = zentaDiagramModel0
					.eOpenIsSet(eStructuralFeature15);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNull(internal8);
		org.junit.Assert
				.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + true + "'", boolean11 == true
		);
		org.junit.Assert.assertNull(eReference12);
	}

	@Test
	public void test0466() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0466"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.ecore.resource.Resource.Internal internal10 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel13 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean14 = zentaDiagramModel0.isDeleted();
		zentaDiagramModel0.checkName("");
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList17 = zentaDiagramModel0
				.getChildren();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj19 = zentaDiagramModel0
					.eVirtualUnset((short) -1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNull(internal10);
		org.junit.Assert.assertNotNull(iDiagramModel13);
		org.junit.Assert.assertTrue(
				"'" + boolean14 + "' != '" + true + "'", boolean14 == true
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList17);
	}

	@Test
	public void test0467() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0467"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel3 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel3.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel3.eClass();
		zentaDiagramModel0.eSetClass(eClass6);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		boolean boolean12 = zentaDiagramModel8.eNotificationRequired();
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = zentaDiagramModel0
				.eBasicSetContainer(
						zentaDiagramModel8, (short) 0, notificationChain14
				);
		boolean boolean16 = zentaDiagramModel8.eNotificationRequired();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList17 = zentaDiagramModel8
				.getChildren();
		org.eclipse.emf.ecore.EOperation eOperation18 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			int int19 = zentaDiagramModel8.eDerivedOperationID(eOperation18);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eClass6);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
		org.junit.Assert.assertNull(notificationChain15);
		org.junit.Assert.assertTrue(
				"'" + boolean16 + "' != '" + false + "'", boolean16 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList17);
	}

	@Test
	public void test0468() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0468"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature6 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0
					.eGet(eStructuralFeature6, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(iDiagramModel3);
		org.junit.Assert.assertNotNull(eClass4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
	}

	@Test
	public void test0469() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0469"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineColor("");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		java.lang.Object obj9 = zentaDiagramModel5.getAdapter(0L);
		int int10 = zentaDiagramModel5.getLineWidth();
		java.lang.String str11 = zentaDiagramModel5.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal12 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain13 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain14 = zentaDiagramModel5
				.eSetResource(internal12, notificationChain13);
		java.lang.Object obj18 = zentaDiagramModel5.eGet(2, false, false);
		java.lang.Object obj19 = zentaDiagramModel0.getAdapter(false);
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj23 = zentaDiagramModel0.eGet(0, true, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj9);
		org.junit.Assert
				.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
		org.junit.Assert.assertEquals(
				"'" + str11 + "' != '" + "hi!" + "'", str11, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain14);
		org.junit.Assert.assertNull(obj18);
		org.junit.Assert.assertNull(obj19);
	}

	@Test
	public void test0470() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0470"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel6 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenUnset(eStructuralFeature7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
		org.junit.Assert.assertNotNull(iDiagramModel6);
	}

	@Test
	public void test0471() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0471"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean8 = zentaDiagramModel0.eDeliver();
		zentaDiagramModel0.setConnectionRouterType(0);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj14 = zentaDiagramModel0
					.eGet(eStructuralFeature11, true, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
	}

	@Test
	public void test0472() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0472"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		zentaDiagramModel0.setName("hi!");
		int int8 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EObject eObject9 = zentaDiagramModel0
				.eContainer();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel10 = zentaDiagramModel0
				.getDiagramModel();
		zentaDiagramModel0.setDocumentation("");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal18 = zentaDiagramModel14
				.eInternalResource();
		java.lang.String str19 = zentaDiagramModel14.getDocumentation();
		boolean boolean20 = zentaDiagramModel14.isChecked();
		zentaDiagramModel14.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature23 = zentaDiagramModel14
				.eContainingFeature();
		int int24 = zentaDiagramModel14.getConnectionRouterType();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj25 = zentaDiagramModel0.eVirtualSet(100, int24);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
		org.junit.Assert.assertNull(eObject9);
		org.junit.Assert.assertNotNull(iDiagramModel10);
		org.junit.Assert
				.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
		org.junit.Assert.assertNull(internal18);
		org.junit.Assert.assertEquals(
				"'" + str19 + "' != '" + "hi!" + "'", str19, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean20 + "' != '" + false + "'", boolean20 == false
		);
		org.junit.Assert.assertNull(eStructuralFeature23);
		org.junit.Assert
				.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
	}

	@Test
	public void test0473() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0473"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal5 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain6 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = zentaDiagramModel0
				.eSetResource(internal5, notificationChain6);
		boolean boolean8 = zentaDiagramModel0.hasDiagramReferences();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert.assertNull(notificationChain7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + false + "'", boolean8 == false
		);
	}

	@Test
	public void test0474() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0474"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass11 = zentaDiagramModel8.eClass();
		zentaDiagramModel0.eSetClass(eClass11);
		java.lang.Class<?> wildcardClass13 = eClass11.getClass();
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
		org.junit.Assert.assertNotNull(eClass11);
		org.junit.Assert.assertNotNull(wildcardClass13);
	}

	@Test
	public void test0475() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0475"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = zentaDiagramModel0
				.eDirectResource();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0.eVirtualGet((short) 1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(internal6);
	}

	@Test
	public void test0476() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0476"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		int int6 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject12 = zentaDiagramModel7
				.eInternalContainer();
		boolean boolean13 = zentaDiagramModel7.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor14 = zentaDiagramModel7
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore19 = zentaDiagramModel16
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList20 = zentaDiagramModel16
				.eAdapters();
		java.lang.Object obj21 = zentaDiagramModel7
				.eInvoke((short) 0, adapterList20);
		java.lang.Object obj22 = zentaDiagramModel0.getAdapter(adapterList20);
		int int23 = zentaDiagramModel0.getViewpoint();
		java.lang.String str24 = zentaDiagramModel0.getLineColor();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertNotNull(eObjectList5);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertNull(obj11);
		org.junit.Assert.assertNull(internalEObject12);
		org.junit.Assert.assertTrue(
				"'" + boolean13 + "' != '" + false + "'", boolean13 == false
		);
		org.junit.Assert.assertNotNull(eObjectItor14);
		org.junit.Assert.assertNull(eStore19);
		org.junit.Assert.assertNotNull(adapterList20);
		org.junit.Assert.assertNotNull(obj21);
		org.junit.Assert.assertNull(obj22);
		org.junit.Assert
				.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
		org.junit.Assert.assertNull(str24);
	}

	@Test
	public void test0477() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0477"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		int int7 = zentaDiagramModel4.eContainerFeatureID();
		org.eclipse.emf.ecore.EClass eClass8 = zentaDiagramModel4.eClass();
		zentaDiagramModel0.eSetClass(eClass8);
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert.assertNotNull(eClass8);
	}

	@Test
	public void test0478() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0478"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor3 = zentaDiagramModel0
				.eAllContents();
		java.lang.String str4 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature5 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj6 = zentaDiagramModel0
					.eGet(eStructuralFeature5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(eObjectItor3);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
	}

	@Test
	public void test0479() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0479"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		zentaDiagramModel0.setName("hi!");
		boolean boolean8 = zentaDiagramModel0.eNotificationRequired();
		java.lang.Object obj10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj11 = zentaDiagramModel0
					.eVirtualSet((-1), obj10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + false + "'", boolean8 == false
		);
	}

	@Test
	public void test0480() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0480"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.findDiagramModel();
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj12 = zentaDiagramModel0
					.eDynamicGet(0, true, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNotNull(iDiagramModel7);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
	}

	@Test
	public void test0481() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0481"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eUnset(eStructuralFeature8);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNotNull(eObjectItor6);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
	}

	@Test
	public void test0482() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0482"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.rulez.magwas.zenta.model.UndoState undoState33 = zentaDiagramModel13
				.prepareDelete();
		org.eclipse.emf.ecore.InternalEObject internalEObject34 = zentaDiagramModel13
				.eInternalContainer();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature35 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj37 = zentaDiagramModel13
					.eOpenGet(eStructuralFeature35, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNotNull(undoState33);
		org.junit.Assert.assertNull(internalEObject34);
	}

	@Test
	public void test0483() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0483"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.prepareDelete();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel14 = zentaDiagramModel11
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass15 = zentaDiagramModel11.eClass();
		zentaDiagramModel0.eSetClass(eClass15);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor17 = zentaDiagramModel0
				.eAllContents();
		zentaDiagramModel0.setViewpoint(52);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel20 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel20.setDocumentation("hi!");
		int int23 = zentaDiagramModel20.eContainerFeatureID();
		java.lang.String str24 = zentaDiagramModel20.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel25 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel25.setDocumentation("hi!");
		int int28 = zentaDiagramModel25.eContainerFeatureID();
		java.lang.String str29 = zentaDiagramModel25.getName();
		zentaDiagramModel20.setAdapter(zentaDiagramModel25, 1L);
		java.lang.String str32 = zentaDiagramModel20.getDocumentation();
		org.rulez.magwas.zenta.model.UndoState undoState33 = zentaDiagramModel20
				.prepareDelete();
		org.rulez.magwas.zenta.model.UndoState undoState34 = zentaDiagramModel0
				.delete(undoState33);
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(undoState10);
		org.junit.Assert.assertNotNull(iDiagramModel14);
		org.junit.Assert.assertNotNull(eClass15);
		org.junit.Assert.assertNotNull(eObjectItor17);
		org.junit.Assert
				.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
		org.junit.Assert
				.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
		org.junit.Assert
				.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
		org.junit.Assert
				.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
		org.junit.Assert.assertEquals(
				"'" + str32 + "' != '" + "hi!" + "'", str32, "hi!"
		);
		org.junit.Assert.assertNotNull(undoState33);
	}

	@Test
	public void test0484() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0484"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		org.eclipse.emf.common.util.URI uRI1 = null;
		zentaDiagramModel0.eSetProxyURI(uRI1);
		zentaDiagramModel0.setLineWidth((short) -1);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList5 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj8 = zentaDiagramModel0.eVirtualGet('a');
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(adapterList5);
		org.junit.Assert.assertNotNull(eObjectList6);
	}

	@Test
	public void test0485() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0485"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		zentaDiagramModel0.eSetDeliver(true);
		boolean boolean7 = zentaDiagramModel0.hasDiagramReferences();
		zentaDiagramModel0.setLineWidth(' ');
		org.eclipse.emf.common.notify.NotificationChain notificationChain10 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain11 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain10);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStore4);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
	}

	@Test
	public void test0486() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0486"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = zentaDiagramModel0
				.eDirectResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setName("");
		zentaDiagramModel0.eSetDeliver(false);
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(internal7);
		org.junit.Assert.assertNull(internal8);
	}

	@Test
	public void test0487() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0487"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		boolean boolean5 = zentaDiagramModel0.isTemplate();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		java.lang.Object obj10 = zentaDiagramModel6.getAdapter(0L);
		int int11 = zentaDiagramModel6.getLineWidth();
		java.lang.String str12 = zentaDiagramModel6.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		java.lang.Object obj17 = zentaDiagramModel13.getAdapter(0L);
		int int18 = zentaDiagramModel13.getLineWidth();
		java.lang.String str19 = zentaDiagramModel13.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList20 = zentaDiagramModel13
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass24 = zentaDiagramModel21.eClass();
		zentaDiagramModel13.eSetClass(eClass24);
		zentaDiagramModel6.eSetClass(eClass24);
		zentaDiagramModel0.eSetClass(eClass24);
		org.eclipse.emf.common.notify.NotificationChain notificationChain28 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain29 = zentaDiagramModel0
					.eDynamicBasicRemoveFromContainer(notificationChain28);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNotNull(adapterList4);
		org.junit.Assert.assertTrue(
				"'" + boolean5 + "' != '" + false + "'", boolean5 == false
		);
		org.junit.Assert.assertNull(obj10);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
		org.junit.Assert.assertEquals(
				"'" + str12 + "' != '" + "hi!" + "'", str12, "hi!"
		);
		org.junit.Assert.assertNull(obj17);
		org.junit.Assert
				.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
		org.junit.Assert.assertEquals(
				"'" + str19 + "' != '" + "hi!" + "'", str19, "hi!"
		);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList20);
		org.junit.Assert.assertNotNull(eClass24);
	}

	@Test
	public void test0488() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0488"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.resource.Resource resource7 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj10 = zentaDiagramModel0
					.eGet(eStructuralFeature8, false);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNull(internalEObject5);
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNull(resource7);
	}

	@Test
	public void test0489() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0489"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.rulez.magwas.zenta.model.UndoState undoState33 = zentaDiagramModel13
				.prepareDelete();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel13.eUnset((short) 0);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: The feature 'zentaModel' is not a valid changeable feature"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNotNull(undoState33);
	}

	@Test
	public void test0490() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0490"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.common.util.URI uRI6 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		int int13 = zentaDiagramModel8.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList14 = zentaDiagramModel8
				.eAdapters();
		java.lang.Object obj15 = zentaDiagramModel0.eInvoke(0, adapterList14);
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature16 = zentaDiagramModel0
				.eContainingFeature();
		org.eclipse.emf.common.util.URI uRI17 = zentaDiagramModel0.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		int int22 = zentaDiagramModel19.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal23 = zentaDiagramModel19
				.eInternalResource();
		org.eclipse.emf.ecore.resource.Resource.Internal internal24 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain25 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain26 = zentaDiagramModel19
				.eSetResource(internal24, notificationChain25);
		boolean boolean27 = zentaDiagramModel19.isChecked();
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eDynamicSet('#', boolean27);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(uRI6);
		org.junit.Assert.assertNull(obj12);
		org.junit.Assert
				.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
		org.junit.Assert.assertNotNull(adapterList14);
		org.junit.Assert.assertNotNull(obj15);
		org.junit.Assert.assertNull(eStructuralFeature16);
		org.junit.Assert.assertNull(uRI17);
		org.junit.Assert
				.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
		org.junit.Assert.assertNull(internal23);
		org.junit.Assert.assertNull(notificationChain26);
		org.junit.Assert.assertTrue(
				"'" + boolean27 + "' != '" + false + "'", boolean27 == false
		);
	}

	@Test
	public void test0491() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0491"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel9 = zentaDiagramModel0
				.getDiagramModel();
		boolean boolean10 = zentaDiagramModel0.eNotificationRequired();
		boolean boolean11 = zentaDiagramModel0.isChecked();
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(internal4);
		org.junit.Assert
				.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
		org.junit.Assert.assertTrue(
				"'" + boolean6 + "' != '" + false + "'", boolean6 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel9);
		org.junit.Assert.assertTrue(
				"'" + boolean10 + "' != '" + false + "'", boolean10 == false
		);
		org.junit.Assert.assertTrue(
				"'" + boolean11 + "' != '" + false + "'", boolean11 == false
		);
	}

	@Test
	public void test0492() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0492"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setId("hi!");
		zentaDiagramModel0.setName("hi!");
		boolean boolean12 = zentaDiagramModel0.eIsProxy();
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj14 = zentaDiagramModel0.eVirtualUnset(100);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNotNull(iDiagramModelObjectList7);
		org.junit.Assert.assertTrue(
				"'" + boolean12 + "' != '" + false + "'", boolean12 == false
		);
	}

	@Test
	public void test0493() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0493"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel4 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.common.notify.Notification notification5 = null;
		zentaDiagramModel0.eNotify(notification5);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		int int12 = zentaDiagramModel7.getLineWidth();
		java.lang.String str13 = zentaDiagramModel7.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal14 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain15 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain16 = zentaDiagramModel7
				.eSetResource(internal14, notificationChain15);
		org.eclipse.emf.ecore.resource.Resource.Internal internal17 = zentaDiagramModel7
				.eInternalResource();
		zentaDiagramModel7.setName("");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel20 = zentaDiagramModel7
				.findDiagramModel();
		boolean boolean21 = zentaDiagramModel7.isDeleted();
		boolean boolean22 = zentaDiagramModel7.isTemplate();
		java.lang.String str23 = zentaDiagramModel7.getDocumentation();
		org.eclipse.emf.common.notify.NotificationChain notificationChain25 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain26 = zentaDiagramModel0
					.eInverseRemove(zentaDiagramModel7, 0, notificationChain25);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -11 out of bounds for length 0"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNotNull(iDiagramModel4);
		org.junit.Assert.assertNull(obj11);
		org.junit.Assert
				.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
		org.junit.Assert.assertEquals(
				"'" + str13 + "' != '" + "hi!" + "'", str13, "hi!"
		);
		org.junit.Assert.assertNull(notificationChain16);
		org.junit.Assert.assertNull(internal17);
		org.junit.Assert.assertNotNull(iDiagramModel20);
		org.junit.Assert.assertTrue(
				"'" + boolean21 + "' != '" + true + "'", boolean21 == true
		);
		org.junit.Assert.assertTrue(
				"'" + boolean22 + "' != '" + false + "'", boolean22 == false
		);
		org.junit.Assert.assertEquals(
				"'" + str23 + "' != '" + "hi!" + "'", str23, "hi!"
		);
	}

	@Test
	public void test0494() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0494"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		boolean boolean7 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.ecore.resource.Resource.Internal internal8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain10 = zentaDiagramModel0
				.eSetResource(internal8, notificationChain9);
		java.lang.Class<?> wildcardClass11 = zentaDiagramModel0.getClass();
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertTrue(
				"'" + boolean7 + "' != '" + false + "'", boolean7 == false
		);
		org.junit.Assert.assertNull(notificationChain10);
		org.junit.Assert.assertNotNull(wildcardClass11);
	}

	@Test
	public void test0495() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0495"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setLineColor("hi!");
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		zentaDiagramModel0.setDocumentation("");
		org.rulez.magwas.zenta.model.UndoState undoState11 = zentaDiagramModel0
				.prepareDelete();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature12 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj14 = zentaDiagramModel0
					.eDynamicGet(eStructuralFeature12, true);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertNotNull(iDiagramModelObjectList5);
		org.junit.Assert.assertTrue(
				"'" + boolean8 + "' != '" + true + "'", boolean8 == true
		);
		org.junit.Assert.assertNotNull(undoState11);
	}

	@Test
	public void test0496() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0496"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		int int6 = zentaDiagramModel0.getViewpoint();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel13.getId();
		int int21 = zentaDiagramModel13.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal26 = zentaDiagramModel22
				.eInternalResource();
		java.lang.String str27 = zentaDiagramModel22.getDocumentation();
		boolean boolean28 = zentaDiagramModel22.isChecked();
		zentaDiagramModel22.setName("hi!");
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel31 = zentaDiagramModel22
				.findDiagramModel();
		zentaDiagramModel0.setAdapter(zentaDiagramModel13, zentaDiagramModel22);
		org.eclipse.emf.ecore.resource.Resource resource33 = zentaDiagramModel22
				.eResource();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor34 = zentaDiagramModel22
				.eAllContents();
		java.lang.Object obj36 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			java.lang.Object obj37 = zentaDiagramModel22
					.eVirtualSet(' ', obj36);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.UnsupportedOperationException; message: null"
			);
		} catch (java.lang.UnsupportedOperationException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
		org.junit.Assert
				.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
		org.junit.Assert
				.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
		org.junit.Assert
				.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
		org.junit.Assert
				.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
		org.junit.Assert.assertNull(str20);
		org.junit.Assert
				.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
		org.junit.Assert
				.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
		org.junit.Assert.assertNull(internal26);
		org.junit.Assert.assertEquals(
				"'" + str27 + "' != '" + "hi!" + "'", str27, "hi!"
		);
		org.junit.Assert.assertTrue(
				"'" + boolean28 + "' != '" + false + "'", boolean28 == false
		);
		org.junit.Assert.assertNotNull(iDiagramModel31);
		org.junit.Assert.assertNull(resource33);
		org.junit.Assert.assertNotNull(eObjectItor34);
	}

	@Test
	public void test0497() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0497"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.notify.Notification notification4 = null;
		zentaDiagramModel0.eNotify(notification4);
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.notify.Notification notification11 = null;
		zentaDiagramModel7.eNotify(notification11);
		zentaDiagramModel7.setName("hi!");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		zentaDiagramModel0.setAdapter(zentaDiagramModel7, zentaDiagramModel15);
		java.lang.String str20 = zentaDiagramModel15.getDocumentation();
		org.eclipse.emf.common.notify.NotificationChain notificationChain21 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain22 = zentaDiagramModel15
					.eBasicRemoveFromContainer(notificationChain21);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(eStore3);
		org.junit.Assert.assertNull(str6);
		org.junit.Assert.assertNull(eStore10);
		org.junit.Assert.assertNull(eStore18);
		org.junit.Assert.assertEquals(
				"'" + str20 + "' != '" + "hi!" + "'", str20, "hi!"
		);
	}

	@Test
	public void test0498() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0498"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain8 = null;
		org.eclipse.emf.common.notify.NotificationChain notificationChain9 = zentaDiagramModel0
				.eSetResource(internal7, notificationChain8);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList10 = zentaDiagramModel0
				.eAdapters();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature11 = null;
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore15 = zentaDiagramModel12
				.eStore();
		org.eclipse.emf.common.notify.Notification notification16 = null;
		zentaDiagramModel12.eNotify(notification16);
		zentaDiagramModel12.setName("hi!");
		int int20 = zentaDiagramModel12.getViewpoint();
		org.eclipse.emf.ecore.EObject eObject21 = zentaDiagramModel12
				.eContainer();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel22 = zentaDiagramModel12
				.getDiagramModel();
		zentaDiagramModel12.setDocumentation("");
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.eOpenSet(eStructuralFeature11, "");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNull(obj4);
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
		org.junit.Assert
				.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
		org.junit.Assert.assertNull(notificationChain9);
		org.junit.Assert.assertNotNull(adapterList10);
		org.junit.Assert.assertNull(eStore15);
		org.junit.Assert
				.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
		org.junit.Assert.assertNull(eObject21);
		org.junit.Assert.assertNotNull(iDiagramModel22);
	}

	@Test
	public void test0499() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0499"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		java.lang.Object obj9 = zentaDiagramModel5.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject10 = zentaDiagramModel5
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList11 = zentaDiagramModel5
				.eContents();
		java.lang.Object obj12 = zentaDiagramModel0.getAdapter(eObjectList11);
		zentaDiagramModel0.setViewpoint((short) 100);
		// The following exception was thrown during execution in test
		// generation
		try {
			zentaDiagramModel0.check();
			org.junit.Assert.fail(
					"Expected exception of type org.rulez.magwas.zenta.model.ModelConsistencyException; message: id cannot be null: org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel@556f661b (name: , id: null, lineWidth: 1, lineColor: null, documentation: hi!, connectionRouterType: 0) (viewpoint: 100)"
			);
		} catch (org.rulez.magwas.zenta.model.ModelConsistencyException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert.assertNull(eStructuralFeature4);
		org.junit.Assert.assertNull(obj9);
		org.junit.Assert.assertNull(internalEObject10);
		org.junit.Assert.assertNotNull(eObjectList11);
		org.junit.Assert.assertNull(obj12);
	}

	@Test
	public void test0500() throws Throwable {
		if (debug)
			System.out.format(
					"%n%s%n", "ZentaDiagramModelRegressionTest0.test0500"
			);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = zentaDiagramModel0
				.eInternalResource();
		org.eclipse.emf.common.notify.NotificationChain notificationChain7 = null;
		// The following exception was thrown during execution in test
		// generation
		try {
			org.eclipse.emf.common.notify.NotificationChain notificationChain8 = zentaDiagramModel0
					.eBasicRemoveFromContainerFeature(notificationChain7);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: null"
			);
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
		org.junit.Assert
				.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
		org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
		org.junit.Assert.assertNull(internal6);
	}
}

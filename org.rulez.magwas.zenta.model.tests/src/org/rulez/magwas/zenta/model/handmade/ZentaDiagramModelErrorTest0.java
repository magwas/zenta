package org.rulez.magwas.zenta.model.handmade;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Tag("ErrorTest")
public class ZentaDiagramModelErrorTest0 {

	public static boolean debug = false;

	@Test
	public void test001() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test001");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState5 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test002() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test002");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean5 = zentaDiagramModel0.eIsSet('4');
	}

	@Test
	public void test003() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test003");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj7 = zentaDiagramModel0.eDynamicGet('a', true, true);
	}

	@Test
	public void test004() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test004");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj7 = zentaDiagramModel0.eGet(100, false, false);
	}

	@Test
	public void test005() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test005");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset((byte) 100);
	}

	@Test
	public void test006() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test006");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean6 = zentaDiagramModel0.eDynamicIsSet((byte) 100);
	}

	@Test
	public void test007() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test007");
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
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList19 = zentaDiagramModel15
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj20 = zentaDiagramModel0
				.eDynamicInvoke((byte) 100, adapterList19);
	}

	@Test
	public void test008() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test008");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel11 = zentaDiagramModel4
				.getZentaModel();
	}

	@Test
	public void test009() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test009");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList15 = zentaDiagramModel5
				.eCrossReferences();
	}

	@Test
	public void test010() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test010");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicSet((-1), 1L);
	}

	@Test
	public void test011() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test011");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel4 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel4.setDocumentation("hi!");
		java.lang.Object obj8 = zentaDiagramModel4.getAdapter(0L);
		int int9 = zentaDiagramModel4.getLineWidth();
		java.lang.String str10 = zentaDiagramModel4.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList11 = zentaDiagramModel4
				.getChildren();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eSet('a', zentaDiagramModel4);
	}

	@Test
	public void test012() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test012");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel17 = zentaDiagramModel5
				.getZentaModel();
	}

	@Test
	public void test013() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test013");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList12 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test014() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test014");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean5 = zentaDiagramModel0.eIsSet((byte) -1);
	}

	@Test
	public void test015() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test015");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		zentaDiagramModel0.checkId("");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel9 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test016() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test016");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		int int4 = zentaDiagramModel0.getConnectionRouterType();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState5 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test017() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test017");
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
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		int int17 = zentaDiagramModel14.eContainerFeatureID();
		java.lang.String str18 = zentaDiagramModel14.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList19 = zentaDiagramModel14
				.eContents();
		int int20 = zentaDiagramModel14.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel21 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel21.setDocumentation("hi!");
		java.lang.Object obj25 = zentaDiagramModel21.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject26 = zentaDiagramModel21
				.eInternalContainer();
		boolean boolean27 = zentaDiagramModel21.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor28 = zentaDiagramModel21
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel30 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel30.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore33 = zentaDiagramModel30
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList34 = zentaDiagramModel30
				.eAdapters();
		java.lang.Object obj35 = zentaDiagramModel21
				.eInvoke((short) 0, adapterList34);
		java.lang.Object obj36 = zentaDiagramModel14.getAdapter(adapterList34);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj37 = zentaDiagramModel0.eInvoke('#', adapterList34);
	}

	@Test
	public void test018() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test018");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset('a');
	}

	@Test
	public void test019() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test019");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test020() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test020");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel6 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test021() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test021");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj9 = zentaDiagramModel0
				.eGet((byte) 100, false, true);
	}

	@Test
	public void test022() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test022");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		int int12 = zentaDiagramModel7.getLineWidth();
		java.lang.String str13 = zentaDiagramModel7.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList14 = zentaDiagramModel7
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass18 = zentaDiagramModel15.eClass();
		zentaDiagramModel7.eSetClass(eClass18);
		zentaDiagramModel0.eSetClass(eClass18);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicSet((byte) 100, "hi!");
	}

	@Test
	public void test023() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test023");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList12 = zentaDiagramModel5
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel13 = zentaDiagramModel5
				.getZentaModel();
	}

	@Test
	public void test024() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test024");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		java.lang.Object obj10 = zentaDiagramModel6.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject11 = zentaDiagramModel6
				.eInternalContainer();
		boolean boolean12 = zentaDiagramModel6.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor13 = zentaDiagramModel6
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore18 = zentaDiagramModel15
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList19 = zentaDiagramModel15
				.eAdapters();
		java.lang.Object obj20 = zentaDiagramModel6
				.eInvoke((short) 0, adapterList19);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj21 = zentaDiagramModel0
				.eDynamicInvoke((byte) 10, adapterList19);
	}

	@Test
	public void test025() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test025");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel5.eDynamicUnset((byte) 1);
	}

	@Test
	public void test026() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test026");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor3 = zentaDiagramModel0
				.eAllContents();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean5 = zentaDiagramModel0.eIsSet((byte) -1);
	}

	@Test
	public void test027() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test027");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		int int12 = zentaDiagramModel7.getLineWidth();
		java.lang.String str13 = zentaDiagramModel7.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList14 = zentaDiagramModel7
				.getChildren();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel15 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel15.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass18 = zentaDiagramModel15.eClass();
		zentaDiagramModel7.eSetClass(eClass18);
		zentaDiagramModel0.eSetClass(eClass18);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean22 = zentaDiagramModel0.eIsSet(0);
	}

	@Test
	public void test028() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test028");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean13 = zentaDiagramModel4.eIsSet(0);
	}

	@Test
	public void test029() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test029");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		int int7 = zentaDiagramModel0.getViewpoint();
		org.eclipse.emf.ecore.EReference eReference8 = zentaDiagramModel0
				.eContainmentFeature();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList9 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test030() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test030");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean6 = zentaDiagramModel0.eIsSet('a');
	}

	@Test
	public void test031() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test031");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		int int7 = zentaDiagramModel0.getViewpoint();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean9 = zentaDiagramModel0.eDynamicIsSet((byte) -1);
	}

	@Test
	public void test032() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test032");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder5 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test033() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test033");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj14 = zentaDiagramModel0.eDynamicGet(4, true, true);
	}

	@Test
	public void test034() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test034");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		boolean boolean6 = zentaDiagramModel0.hasDiagramReferences();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		int int12 = zentaDiagramModel9.eContainerFeatureID();
		java.lang.String str13 = zentaDiagramModel9.getName();
		int int14 = zentaDiagramModel9.getViewpoint();
		org.eclipse.emf.common.util.URI uRI15 = zentaDiagramModel9.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel17 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel17.setDocumentation("hi!");
		java.lang.Object obj21 = zentaDiagramModel17.getAdapter(0L);
		int int22 = zentaDiagramModel17.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList23 = zentaDiagramModel17
				.eAdapters();
		java.lang.Object obj24 = zentaDiagramModel9.eInvoke(0, adapterList23);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj25 = zentaDiagramModel0
				.eInvoke((byte) -1, adapterList23);
	}

	@Test
	public void test035() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test035");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.getId();
		zentaDiagramModel0.checkDocumentation("");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean8 = zentaDiagramModel0.eIsSet((short) 100);
	}

	@Test
	public void test036() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test036");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.common.util.URI uRI7 = zentaDiagramModel0.eProxyURI();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset('#');
	}

	@Test
	public void test037() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test037");
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
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor12 = zentaDiagramModel0
				.eAllContents();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj16 = zentaDiagramModel0
				.eDynamicGet((short) -1, true, true);
	}

	@Test
	public void test038() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test038");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel16 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test039() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test039");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean4 = zentaDiagramModel0.eNotificationRequired();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel5 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test040() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test040");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		zentaDiagramModel0.eSetDeliver(true);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj10 = zentaDiagramModel0.eGet((short) 0, true, true);
	}

	@Test
	public void test041() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test041");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel4 = zentaDiagramModel0
				.findDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel6 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel6.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore9 = zentaDiagramModel6
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList10 = zentaDiagramModel6
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj11 = zentaDiagramModel0
				.eDynamicInvoke((-1), adapterList10);
	}

	@Test
	public void test042() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test042");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean14 = zentaDiagramModel0.eDynamicIsSet(100);
	}

	@Test
	public void test043() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test043");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		org.eclipse.emf.common.util.URI uRI7 = zentaDiagramModel0.eProxyURI();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset((byte) -1);
	}

	@Test
	public void test044() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test044");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj24 = zentaDiagramModel11
				.eDynamicGet('a', true, false);
	}

	@Test
	public void test045() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test045");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test046() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test046");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj14 = zentaDiagramModel0
				.eDynamicGet((byte) 10, true, true);
	}

	@Test
	public void test047() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test047");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		boolean boolean6 = zentaDiagramModel0.hasDiagramReferences();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(0);
	}

	@Test
	public void test048() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test048");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj7 = zentaDiagramModel0.eGet(0, true, false);
	}

	@Test
	public void test049() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test049");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState9 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test050() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test050");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.getDiagramModel();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState8 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test051() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test051");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		int int7 = zentaDiagramModel0.getViewpoint();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eUnset(35);
	}

	@Test
	public void test052() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test052");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		boolean boolean6 = zentaDiagramModel0.hasDiagramReferences();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean8 = zentaDiagramModel0.eIsSet(100);
	}

	@Test
	public void test053() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test053");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test054() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test054");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel7 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test055() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test055");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder4 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test056() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test056");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setLineColor("hi!");
		boolean boolean8 = zentaDiagramModel0.isDeleted();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean10 = zentaDiagramModel0.eDynamicIsSet((short) 100);
	}

	@Test
	public void test057() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test057");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean1 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EObject eObject2 = zentaDiagramModel0.getCopy();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel3 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test058() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test058");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState4 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test059() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test059");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel5.eDynamicUnset(' ');
	}

	@Test
	public void test060() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test060");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(4);
	}

	@Test
	public void test061() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test061");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(52);
	}

	@Test
	public void test062() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test062");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		boolean boolean5 = zentaDiagramModel0.hasDiagramReferences();
		zentaDiagramModel0.setDocumentation("");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		int int12 = zentaDiagramModel9.eContainerFeatureID();
		java.lang.String str13 = zentaDiagramModel9.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList14 = zentaDiagramModel9
				.eContents();
		int int15 = zentaDiagramModel9.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel16 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel16.setDocumentation("hi!");
		java.lang.Object obj20 = zentaDiagramModel16.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject21 = zentaDiagramModel16
				.eInternalContainer();
		boolean boolean22 = zentaDiagramModel16.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor23 = zentaDiagramModel16
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel25 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel25.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore28 = zentaDiagramModel25
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList29 = zentaDiagramModel25
				.eAdapters();
		java.lang.Object obj30 = zentaDiagramModel16
				.eInvoke((short) 0, adapterList29);
		java.lang.Object obj31 = zentaDiagramModel9.getAdapter(adapterList29);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj32 = zentaDiagramModel0.eInvoke('a', adapterList29);
	}

	@Test
	public void test063() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test063");
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
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		java.lang.Object obj23 = zentaDiagramModel19.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList24 = zentaDiagramModel19
				.getChildren();
		java.lang.String str25 = zentaDiagramModel19.getDocumentation();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel5.eDynamicSet(' ', str25);
	}

	@Test
	public void test064() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test064");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0.getCopy();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder6 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test065() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test065");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		int int8 = zentaDiagramModel0.eContainerFeatureID();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList9 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test066() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test066");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean15 = zentaDiagramModel0.eDynamicIsSet('a');
	}

	@Test
	public void test067() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test067");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		boolean boolean7 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("");
		org.eclipse.emf.ecore.EObject eObject10 = zentaDiagramModel0.getCopy();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eUnset(100);
	}

	@Test
	public void test068() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test068");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		zentaDiagramModel0.eSetDeliver(true);
		boolean boolean7 = zentaDiagramModel0.hasDiagramReferences();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState8 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test069() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test069");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean8 = zentaDiagramModel0.eIsSet(0);
	}

	@Test
	public void test070() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test070");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		boolean boolean6 = zentaDiagramModel0.isChecked();
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj21 = zentaDiagramModel0
				.eDynamicInvoke((byte) 100, adapterList20);
	}

	@Test
	public void test071() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test071");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel6 = zentaDiagramModel0
				.findDiagramModel();
		zentaDiagramModel0.setName("");
		boolean boolean9 = zentaDiagramModel0.eDeliver();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder10 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test072() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test072");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel7 = zentaDiagramModel0
				.getDiagramModel();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal12 = zentaDiagramModel8
				.eInternalResource();
		org.rulez.magwas.zenta.model.UndoState undoState13 = zentaDiagramModel8
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState14 = zentaDiagramModel0
				.delete(undoState13);
	}

	@Test
	public void test073() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test073");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder14 = zentaDiagramModel5
				.getParentFolder();
	}

	@Test
	public void test074() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test074");
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
		org.eclipse.emf.ecore.EObject eObject13 = zentaDiagramModel0
				.eContainer();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj17 = zentaDiagramModel0
				.eDynamicGet(10, false, false);
	}

	@Test
	public void test075() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test075");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		zentaDiagramModel0.setId("");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj10 = zentaDiagramModel0
				.eDynamicGet((short) 100, true, false);
	}

	@Test
	public void test076() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test076");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj15 = zentaDiagramModel0.eGet(' ', false, true);
	}

	@Test
	public void test077() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test077");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		zentaDiagramModel0.setId("");
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = zentaDiagramModel0
				.eDirectResource();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj11 = zentaDiagramModel0
				.eGet((short) -1, false, false);
	}

	@Test
	public void test078() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test078");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean14 = zentaDiagramModel0.eIsSet((byte) 0);
	}

	@Test
	public void test079() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test079");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		boolean boolean5 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel0.eClass();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test080() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test080");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean1 = zentaDiagramModel0.isDeleted();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean3 = zentaDiagramModel0.eDynamicIsSet((short) 100);
	}

	@Test
	public void test081() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test081");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.ecore.EObject eObject7 = zentaDiagramModel0.getCopy();
		int int8 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList9 = zentaDiagramModel0
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test082() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test082");
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
		zentaDiagramModel0.setName("hi!");
		boolean boolean14 = zentaDiagramModel0.isTemplate();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList15 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test083() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test083");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList11 = zentaDiagramModel7
				.eAdapters();
		boolean boolean12 = zentaDiagramModel7.eDeliver();
		java.lang.Object obj13 = zentaDiagramModel0
				.getAdapter(zentaDiagramModel7);
		org.eclipse.emf.ecore.EClass eClass14 = zentaDiagramModel7.eClass();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList15 = zentaDiagramModel7
				.eCrossReferences();
	}

	@Test
	public void test084() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test084");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj16 = zentaDiagramModel0
				.eDynamicGet('#', false, true);
	}

	@Test
	public void test085() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test085");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder16 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test086() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test086");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(35);
	}

	@Test
	public void test087() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test087");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		boolean boolean4 = zentaDiagramModel0.eDeliver();
		zentaDiagramModel0.setDocumentation("");
		boolean boolean7 = zentaDiagramModel0.isChecked();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean9 = zentaDiagramModel0.eDynamicIsSet((byte) 10);
	}

	@Test
	public void test088() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test088");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		int int7 = zentaDiagramModel0.getViewpoint();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eUnset('4');
	}

	@Test
	public void test089() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test089");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0.getCopy();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource10 = zentaDiagramModel7
				.eResource();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel12 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel12.setDocumentation("hi!");
		int int15 = zentaDiagramModel12.eContainerFeatureID();
		java.lang.String str16 = zentaDiagramModel12.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel17 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel17.setDocumentation("hi!");
		int int20 = zentaDiagramModel17.eContainerFeatureID();
		java.lang.String str21 = zentaDiagramModel17.getName();
		zentaDiagramModel12.setAdapter(zentaDiagramModel17, 1L);
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList24 = zentaDiagramModel17
				.eAdapters();
		java.lang.Object obj25 = zentaDiagramModel7
				.eInvoke((short) 1, adapterList24);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj26 = zentaDiagramModel0
				.eDynamicInvoke((short) 100, adapterList24);
	}

	@Test
	public void test090() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test090");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore10 = zentaDiagramModel7
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList11 = zentaDiagramModel7
				.eAdapters();
		boolean boolean12 = zentaDiagramModel7.eDeliver();
		java.lang.Object obj13 = zentaDiagramModel0
				.getAdapter(zentaDiagramModel7);
		zentaDiagramModel0.setViewpoint((short) 10);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList16 = zentaDiagramModel0
				.getProperties();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState17 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test091() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test091");
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
		org.eclipse.emf.ecore.InternalEObject internalEObject13 = zentaDiagramModel5
				.eInternalContainer();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList14 = zentaDiagramModel5
				.eCrossReferences();
	}

	@Test
	public void test092() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test092");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		java.lang.String str7 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList8 = zentaDiagramModel0
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj12 = zentaDiagramModel0.eDynamicGet(1, true, false);
	}

	@Test
	public void test093() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test093");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean6 = zentaDiagramModel0.eDynamicIsSet((short) 1);
	}

	@Test
	public void test094() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test094");
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
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel24 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel24.setDocumentation("hi!");
		int int27 = zentaDiagramModel24.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal28 = zentaDiagramModel24
				.eInternalResource();
		org.rulez.magwas.zenta.model.UndoState undoState29 = zentaDiagramModel24
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState30 = zentaDiagramModel0
				.delete(undoState29);
	}

	@Test
	public void test095() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test095");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel5.eDynamicUnset((short) 1);
	}

	@Test
	public void test096() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test096");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		boolean boolean6 = zentaDiagramModel0.hasDiagramReferences();
		int int7 = zentaDiagramModel0.getConnectionRouterType();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel8 = zentaDiagramModel0
				.getDiagramModel();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean10 = zentaDiagramModel0.eDynamicIsSet(52);
	}

	@Test
	public void test097() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test097");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		java.lang.String str3 = zentaDiagramModel0.getId();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj7 = zentaDiagramModel0
				.eGet((short) 100, true, false);
	}

	@Test
	public void test098() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test098");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel6 = zentaDiagramModel0
				.findDiagramModel();
		zentaDiagramModel0.setName("");
		boolean boolean9 = zentaDiagramModel0.eDeliver();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test099() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test099");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.getId();
		zentaDiagramModel0.checkDocumentation("");
		boolean boolean7 = zentaDiagramModel0.isDeleted();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		java.lang.Object obj13 = zentaDiagramModel9.getAdapter(0L);
		int int14 = zentaDiagramModel9.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList15 = zentaDiagramModel9
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj16 = zentaDiagramModel0
				.eDynamicInvoke(35, adapterList15);
	}

	@Test
	public void test100() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test100");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		java.lang.String str5 = zentaDiagramModel0.getId();
		zentaDiagramModel0.setId("");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset((byte) 10);
	}

	@Test
	public void test101() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test101");
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
		zentaDiagramModel12.checkId("");
		zentaDiagramModel12.setId("hi!");
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor22 = zentaDiagramModel12
				.eAllContents();
		boolean boolean23 = zentaDiagramModel12.isTemplate();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel24 = zentaDiagramModel12
				.getDiagramModel();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel12.eDynamicUnset((short) -1);
	}

	@Test
	public void test102() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test102");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		boolean boolean4 = zentaDiagramModel0.eIsProxy();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eUnset(52);
	}

	@Test
	public void test103() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test103");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean1 = zentaDiagramModel0.isDeleted();
		java.lang.String str2 = zentaDiagramModel0.getDocumentation();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eUnset(' ');
	}

	@Test
	public void test104() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test104");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		int int5 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean9 = zentaDiagramModel0.eDynamicIsSet((short) 10);
	}

	@Test
	public void test105() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test105");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eUnset((byte) 100);
	}

	@Test
	public void test106() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test106");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EReference eReference6 = zentaDiagramModel0
				.eContainmentFeature();
		zentaDiagramModel0.setDocumentation("hi!");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder9 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test107() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test107");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.ecore.EObject eObject5 = zentaDiagramModel0.getCopy();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean7 = zentaDiagramModel0.eIsSet((short) -1);
	}

	@Test
	public void test108() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test108");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		zentaDiagramModel0.eSetDeliver(true);
		boolean boolean7 = zentaDiagramModel0.hasDiagramReferences();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder8 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test109() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test109");
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
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList14 = zentaDiagramModel5
				.getProperties();
		zentaDiagramModel5.setLineWidth(10);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel5.eDynamicUnset((byte) 100);
	}

	@Test
	public void test110() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test110");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder28 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test111() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test111");
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
		boolean boolean21 = zentaDiagramModel5.hasDiagramReferences();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean23 = zentaDiagramModel5.eDynamicIsSet(35);
	}

	@Test
	public void test112() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test112");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList7 = zentaDiagramModel0
				.getChildren();
		java.lang.String str8 = zentaDiagramModel0.toString();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj12 = zentaDiagramModel0
				.eDynamicGet((byte) -1, true, true);
	}

	@Test
	public void test113() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test113");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getDocumentation();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset((short) 0);
	}

	@Test
	public void test114() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test114");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList6 = zentaDiagramModel0
				.eContents();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		zentaDiagramModel8.setAdapter(zentaDiagramModel13, 1L);
		java.lang.String str20 = zentaDiagramModel8.getDocumentation();
		org.rulez.magwas.zenta.model.UndoState undoState21 = zentaDiagramModel8
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState22 = zentaDiagramModel0
				.delete(undoState21);
	}

	@Test
	public void test115() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test115");
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
		zentaDiagramModel5.checkDocumentation("");
		java.lang.String str23 = zentaDiagramModel5.getDocumentation();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel24 = zentaDiagramModel5
				.getZentaModel();
	}

	@Test
	public void test116() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test116");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean1 = zentaDiagramModel0.isDeleted();
		org.eclipse.emf.ecore.EObject eObject2 = zentaDiagramModel0.getCopy();
		java.lang.String str3 = zentaDiagramModel0.getId();
		boolean boolean4 = zentaDiagramModel0.eIsProxy();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test117() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test117");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		boolean boolean5 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.ecore.EClass eClass6 = zentaDiagramModel0.eClass();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eContents();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel8 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test118() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test118");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.getId();
		zentaDiagramModel0.checkDocumentation("");
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eContents();
		int int8 = zentaDiagramModel0.getViewpoint();
		zentaDiagramModel0.eSetDeliver(true);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean12 = zentaDiagramModel0.eDynamicIsSet(10);
	}

	@Test
	public void test119() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test119");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		zentaDiagramModel0.eSetDeliver(true);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		int int11 = zentaDiagramModel8.eContainerFeatureID();
		java.lang.String str12 = zentaDiagramModel8.getName();
		java.lang.Class<?> wildcardClass13 = zentaDiagramModel8.getClass();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eSet('a', wildcardClass13);
	}

	@Test
	public void test120() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test120");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean24 = zentaDiagramModel0.eDynamicIsSet((short) -1);
	}

	@Test
	public void test121() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test121");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList6 = zentaDiagramModel0
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder7 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test122() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test122");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		zentaDiagramModel0.checkDocumentation("hi!");
		boolean boolean6 = zentaDiagramModel0.eNotificationRequired();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		java.lang.Object obj11 = zentaDiagramModel7.getAdapter(0L);
		int int12 = zentaDiagramModel7.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor13 = zentaDiagramModel7
				.eAllContents();
		zentaDiagramModel7.eSetDeliver(false);
		org.rulez.magwas.zenta.model.UndoState undoState16 = zentaDiagramModel7
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState17 = zentaDiagramModel0
				.delete(undoState16);
	}

	@Test
	public void test123() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test123");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EReference eReference6 = zentaDiagramModel0
				.eContainmentFeature();
		zentaDiagramModel0.setDocumentation("hi!");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj12 = zentaDiagramModel0
				.eDynamicGet(' ', false, true);
	}

	@Test
	public void test124() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test124");
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
		int int28 = zentaDiagramModel0.getViewpoint();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList29 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test125() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test125");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		boolean boolean4 = zentaDiagramModel0.eNotificationRequired();
		boolean boolean5 = zentaDiagramModel0.isChecked();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel7 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel7.setDocumentation("hi!");
		int int10 = zentaDiagramModel7.eContainerFeatureID();
		java.lang.String str11 = zentaDiagramModel7.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList12 = zentaDiagramModel7
				.eContents();
		int int13 = zentaDiagramModel7.getViewpoint();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel14 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel14.setDocumentation("hi!");
		java.lang.Object obj18 = zentaDiagramModel14.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject19 = zentaDiagramModel14
				.eInternalContainer();
		boolean boolean20 = zentaDiagramModel14.isChecked();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor21 = zentaDiagramModel14
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel23 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel23.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore26 = zentaDiagramModel23
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList27 = zentaDiagramModel23
				.eAdapters();
		java.lang.Object obj28 = zentaDiagramModel14
				.eInvoke((short) 0, adapterList27);
		java.lang.Object obj29 = zentaDiagramModel7.getAdapter(adapterList27);
		java.lang.Object obj30 = zentaDiagramModel0
				.eInvoke((short) 1, adapterList27);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(2);
	}

	@Test
	public void test126() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test126");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		zentaDiagramModel0.setLineWidth((short) 1);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setLineWidth((short) 0);
		java.lang.String str11 = zentaDiagramModel8.getId();
		org.rulez.magwas.zenta.model.UndoState undoState12 = zentaDiagramModel8
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState13 = zentaDiagramModel0
				.delete(undoState12);
	}

	@Test
	public void test127() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test127");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.ecore.EObject eObject4 = zentaDiagramModel0
				.eContainer();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean6 = zentaDiagramModel0.eDynamicIsSet(97);
	}

	@Test
	public void test128() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test128");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean15 = zentaDiagramModel0.eIsSet(100);
	}

	@Test
	public void test129() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test129");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState5 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test130() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test130");
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
		boolean boolean15 = zentaDiagramModel5.isTemplate();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj19 = zentaDiagramModel5.eGet('4', false, false);
	}

	@Test
	public void test131() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test131");
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
		org.eclipse.emf.ecore.InternalEObject.EStore eStore23 = zentaDiagramModel0
				.eStore();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset((byte) 0);
	}

	@Test
	public void test132() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test132");
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
		boolean boolean11 = zentaDiagramModel0.isChecked();
		boolean boolean12 = zentaDiagramModel0.isDeleted();
		int int13 = zentaDiagramModel0.getLineWidth();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean15 = zentaDiagramModel0.eIsSet((-1));
	}

	@Test
	public void test133() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test133");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.ecore.InternalEObject internalEObject5 = zentaDiagramModel0
				.eInternalContainer();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState7 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test134() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test134");
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
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor12 = zentaDiagramModel0
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel13 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel13.setDocumentation("hi!");
		int int16 = zentaDiagramModel13.eContainerFeatureID();
		java.lang.String str17 = zentaDiagramModel13.getName();
		int int18 = zentaDiagramModel13.getViewpoint();
		org.eclipse.emf.common.util.URI uRI19 = zentaDiagramModel13.eProxyURI();
		zentaDiagramModel13.setConnectionRouterType((-1));
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel22 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel22.setDocumentation("hi!");
		int int25 = zentaDiagramModel22.eContainerFeatureID();
		java.lang.String str26 = zentaDiagramModel22.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel27 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel27.setDocumentation("hi!");
		int int30 = zentaDiagramModel27.eContainerFeatureID();
		java.lang.String str31 = zentaDiagramModel27.getName();
		zentaDiagramModel22.setAdapter(zentaDiagramModel27, 1L);
		java.lang.String str34 = zentaDiagramModel22.getDocumentation();
		org.rulez.magwas.zenta.model.UndoState undoState35 = zentaDiagramModel22
				.prepareDelete();
		zentaDiagramModel0.setAdapter((-1), zentaDiagramModel22);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(35);
	}

	@Test
	public void test135() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test135");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		java.lang.String str5 = zentaDiagramModel0.getName();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = zentaDiagramModel0
				.eInternalResource();
		boolean boolean7 = zentaDiagramModel0.isChecked();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList8 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test136() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test136");
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
		org.eclipse.emf.ecore.InternalEObject.EStore eStore19 = zentaDiagramModel5
				.eStore();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList20 = zentaDiagramModel5
				.eCrossReferences();
	}

	@Test
	public void test137() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test137");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj27 = zentaDiagramModel0
				.eDynamicInvoke(97, adapterList25);
	}

	@Test
	public void test138() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test138");
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
		org.rulez.magwas.zenta.model.UndoState undoState19 = zentaDiagramModel12
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj23 = zentaDiagramModel12
				.eDynamicGet((byte) -1, true, false);
	}

	@Test
	public void test139() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test139");
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
		zentaDiagramModel12.checkId("");
		zentaDiagramModel12.setId("hi!");
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor22 = zentaDiagramModel12
				.eAllContents();
		boolean boolean23 = zentaDiagramModel12.isTemplate();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel24 = zentaDiagramModel12
				.getDiagramModel();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean26 = zentaDiagramModel12.eIsSet((short) -1);
	}

	@Test
	public void test140() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test140");
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
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList14 = zentaDiagramModel5
				.getProperties();
		zentaDiagramModel5.setLineWidth(10);
		org.eclipse.emf.ecore.EObject eObject17 = zentaDiagramModel5
				.eContainer();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel5.eUnset((short) 100);
	}

	@Test
	public void test141() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test141");
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
		org.rulez.magwas.zenta.model.UndoState undoState22 = zentaDiagramModel0
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList23 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test142() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test142");
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
		zentaDiagramModel5.checkDocumentation("");
		java.lang.String str23 = zentaDiagramModel5.getDocumentation();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState24 = zentaDiagramModel5
				.delete();
	}

	@Test
	public void test143() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test143");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature4 = zentaDiagramModel0
				.eContainingFeature();
		zentaDiagramModel0.setId("");
		org.eclipse.emf.ecore.resource.Resource.Internal internal7 = zentaDiagramModel0
				.eDirectResource();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean9 = zentaDiagramModel0.eDynamicIsSet((short) -1);
	}

	@Test
	public void test144() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test144");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(10);
	}

	@Test
	public void test145() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test145");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean14 = zentaDiagramModel0.eDynamicIsSet((short) -1);
	}

	@Test
	public void test146() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test146");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel12 = zentaDiagramModel4
				.getZentaModel();
	}

	@Test
	public void test147() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test147");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList15 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test148() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test148");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		java.lang.String str5 = zentaDiagramModel0.getName();
		zentaDiagramModel0.checkDocumentation("");
		zentaDiagramModel0.checkDocumentation("hi!");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test149() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test149");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList13 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test150() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test150");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		java.lang.String str5 = zentaDiagramModel0.getDocumentation();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList7 = zentaDiagramModel0
				.eContents();
		zentaDiagramModel0.initId();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState9 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test151() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test151");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass4 = zentaDiagramModel0.eClass();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		org.eclipse.emf.ecore.EReference eReference6 = zentaDiagramModel0
				.eContainmentFeature();
		zentaDiagramModel0.setDocumentation("hi!");
		org.rulez.magwas.zenta.model.UndoState undoState9 = zentaDiagramModel0
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList10 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test152() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test152");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		boolean boolean7 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("");
		org.eclipse.emf.ecore.EObject eObject10 = zentaDiagramModel0.getCopy();
		zentaDiagramModel0.checkId("");
		java.lang.String str13 = zentaDiagramModel0.getDocumentation();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean15 = zentaDiagramModel0.eIsSet('4');
	}

	@Test
	public void test153() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test153");
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
		int int22 = zentaDiagramModel0.getConnectionRouterType();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel23 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test154() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test154");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.getId();
		zentaDiagramModel0.checkDocumentation("");
		boolean boolean7 = zentaDiagramModel0.isDeleted();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		java.lang.Object obj13 = zentaDiagramModel9.getAdapter(0L);
		java.lang.String str14 = zentaDiagramModel9.getName();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList15 = zentaDiagramModel9
				.getChildren();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eSet(52, iDiagramModelObjectList15);
	}

	@Test
	public void test155() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test155");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		java.lang.String str5 = zentaDiagramModel0.getName();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = zentaDiagramModel0
				.eInternalResource();
		zentaDiagramModel0.setLineWidth(10);
		org.eclipse.emf.ecore.EObject eObject9 = zentaDiagramModel0.getCopy();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj13 = zentaDiagramModel0
				.eDynamicGet('a', true, true);
	}

	@Test
	public void test156() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test156");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		int int6 = zentaDiagramModel0.getLineWidth();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore8 = zentaDiagramModel0
				.eStore();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel9 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel9.setDocumentation("hi!");
		java.lang.Object obj13 = zentaDiagramModel9.getAdapter(0L);
		int int14 = zentaDiagramModel9.getLineWidth();
		java.lang.String str15 = zentaDiagramModel9.getName();
		org.rulez.magwas.zenta.model.UndoState undoState16 = zentaDiagramModel9
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState17 = zentaDiagramModel0
				.delete(undoState16);
	}

	@Test
	public void test157() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test157");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		boolean boolean4 = zentaDiagramModel0.hasDiagramReferences();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean6 = zentaDiagramModel0.eDynamicIsSet((short) 1);
	}

	@Test
	public void test158() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test158");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean5 = zentaDiagramModel0.eDynamicIsSet(97);
	}

	@Test
	public void test159() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test159");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		zentaDiagramModel0.checkId("hi!");
		zentaDiagramModel0.setName("hi!");
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = zentaDiagramModel0
				.eContainingFeature();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList9 = zentaDiagramModel0
				.getProperties();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState10 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test160() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test160");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset((short) -1);
	}

	@Test
	public void test161() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test161");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		org.eclipse.emf.ecore.resource.Resource.Internal internal4 = zentaDiagramModel0
				.eInternalResource();
		int int5 = zentaDiagramModel0.getConnectionRouterType();
		int int6 = zentaDiagramModel0.getLineWidth();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj11 = zentaDiagramModel0
				.eDynamicGet(' ', true, false);
	}

	@Test
	public void test162() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test162");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel5 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel5.setDocumentation("hi!");
		int int8 = zentaDiagramModel5.eContainerFeatureID();
		java.lang.String str9 = zentaDiagramModel5.getName();
		zentaDiagramModel0.setAdapter(zentaDiagramModel5, 1L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList12 = zentaDiagramModel0
				.getChildren();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(97);
	}

	@Test
	public void test163() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test163");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.InternalEObject.EStore eStore3 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList4 = zentaDiagramModel0
				.eAdapters();
		java.lang.String str5 = zentaDiagramModel0.getId();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel6 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test164() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test164");
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
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj14 = zentaDiagramModel0
				.eDynamicGet((short) 100, true, false);
	}

	@Test
	public void test165() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test165");
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
		boolean boolean11 = zentaDiagramModel0.isChecked();
		boolean boolean12 = zentaDiagramModel0.isDeleted();
		int int13 = zentaDiagramModel0.getLineWidth();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset(0);
	}

	@Test
	public void test166() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test166");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		java.lang.String str6 = zentaDiagramModel0.getId();
		boolean boolean7 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setName("");
		org.eclipse.emf.ecore.EObject eObject10 = zentaDiagramModel0.getCopy();
		org.rulez.magwas.zenta.model.UndoState undoState11 = zentaDiagramModel0
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IFolder iFolder12 = zentaDiagramModel0
				.getParentFolder();
	}

	@Test
	public void test167() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test167");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList4 = zentaDiagramModel0
				.eContents();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.IZentaModel iZentaModel5 = zentaDiagramModel0
				.getZentaModel();
	}

	@Test
	public void test168() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test168");
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
		boolean boolean14 = zentaDiagramModel0.eDeliver();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList15 = zentaDiagramModel0
				.getChildren();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean17 = zentaDiagramModel0.eDynamicIsSet((short) -1);
	}

	@Test
	public void test169() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test169");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		zentaDiagramModel0.setConnectionRouterType('4');
		int int8 = zentaDiagramModel0.getViewpoint();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList9 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test170() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test170");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		boolean boolean6 = zentaDiagramModel0.isChecked();
		zentaDiagramModel0.setChecked(false);
		zentaDiagramModel0.setViewpoint((byte) 0);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj14 = zentaDiagramModel0
				.eDynamicGet('#', true, true);
	}

	@Test
	public void test171() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test171");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel3 = zentaDiagramModel0
				.findDiagramModel();
		java.lang.String str4 = zentaDiagramModel0.toString();
		zentaDiagramModel0.setId("hi!");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean8 = zentaDiagramModel0.eDynamicIsSet('#');
	}

	@Test
	public void test172() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test172");
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
		org.eclipse.emf.ecore.EObject eObject23 = zentaDiagramModel0
				.eContainer();
		org.eclipse.emf.ecore.EObject eObject24 = zentaDiagramModel0.getCopy();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eDynamicUnset((byte) 100);
	}

	@Test
	public void test173() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test173");
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
		org.eclipse.emf.ecore.InternalEObject.EStore eStore13 = zentaDiagramModel0
				.eStore();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState14 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test174() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test174");
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
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList11 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList12 = zentaDiagramModel0
				.eAdapters();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList13 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test175() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test175");
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
		zentaDiagramModel26.eUnset(10);
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean36 = zentaDiagramModel26.eDynamicIsSet((short) 1);
	}

	@Test
	public void test176() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test176");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		boolean boolean1 = zentaDiagramModel0.isDeleted();
		java.lang.String str2 = zentaDiagramModel0.getDocumentation();
		java.lang.String str3 = zentaDiagramModel0.toString();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState4 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test177() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test177");
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
		org.rulez.magwas.zenta.model.UndoState undoState9 = zentaDiagramModel0
				.prepareDelete();
		java.lang.String str10 = zentaDiagramModel0.getLineColor();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		int int14 = zentaDiagramModel11.eContainerFeatureID();
		java.lang.String str15 = zentaDiagramModel11.getName();
		int int16 = zentaDiagramModel11.getViewpoint();
		org.eclipse.emf.common.util.URI uRI17 = zentaDiagramModel11.eProxyURI();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel19 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel19.setDocumentation("hi!");
		java.lang.Object obj23 = zentaDiagramModel19.getAdapter(0L);
		int int24 = zentaDiagramModel19.getLineWidth();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.common.notify.Adapter> adapterList25 = zentaDiagramModel19
				.eAdapters();
		java.lang.Object obj26 = zentaDiagramModel11.eInvoke(0, adapterList25);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel27 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel27.setLineWidth((short) 0);
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel30 = zentaDiagramModel27
				.findDiagramModel();
		org.eclipse.emf.ecore.EClass eClass31 = zentaDiagramModel27.eClass();
		zentaDiagramModel11.eSetClass(eClass31);
		zentaDiagramModel0.eSetClass(eClass31);
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel35 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel35.setDocumentation("hi!");
		java.lang.Object obj39 = zentaDiagramModel35.getAdapter(0L);
		int int40 = zentaDiagramModel35.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor41 = zentaDiagramModel35
				.eAllContents();
		boolean boolean42 = zentaDiagramModel35.isTemplate();
		boolean boolean43 = zentaDiagramModel35.isChecked();
		int int44 = zentaDiagramModel35.getLineWidth();
		int int45 = zentaDiagramModel35.getViewpoint();
		zentaDiagramModel35.setName("hi!");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eSet((short) 100, "hi!");
	}

	@Test
	public void test178() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test178");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		int int3 = zentaDiagramModel0.eContainerFeatureID();
		java.lang.String str4 = zentaDiagramModel0.getName();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList5 = zentaDiagramModel0
				.eContents();
		org.rulez.magwas.zenta.model.IDiagramModel iDiagramModel6 = zentaDiagramModel0
				.findDiagramModel();
		org.eclipse.emf.ecore.InternalEObject internalEObject7 = zentaDiagramModel0
				.eInternalContainer();
		java.lang.String str8 = zentaDiagramModel0.getDocumentation();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList9 = zentaDiagramModel0
				.getChildren();
		org.eclipse.emf.ecore.InternalEObject internalEObject10 = zentaDiagramModel0
				.eInternalContainer();
		zentaDiagramModel0.checkId("");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj16 = zentaDiagramModel0
				.eDynamicGet('a', false, false);
	}

	@Test
	public void test179() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test179");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList5 = zentaDiagramModel0
				.getChildren();
		zentaDiagramModel0.setDocumentation("");
		org.rulez.magwas.zenta.model.UndoState undoState8 = zentaDiagramModel0
				.prepareDelete();
		zentaDiagramModel0.eSet((byte) 10, (-1));
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj15 = zentaDiagramModel0.eGet('4', true, false);
	}

	@Test
	public void test180() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test180");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setLineWidth((short) 0);
		org.eclipse.emf.ecore.EClass eClass3 = zentaDiagramModel0.eClass();
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IProperty> iPropertyList4 = zentaDiagramModel0
				.getProperties();
		java.lang.Object obj8 = zentaDiagramModel0.eGet((short) 1, false, true);
		boolean boolean9 = zentaDiagramModel0.isTemplate();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel11 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel11.setDocumentation("hi!");
		java.lang.Object obj15 = zentaDiagramModel11.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList16 = zentaDiagramModel11
				.getChildren();
		zentaDiagramModel11.setDocumentation("");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel0.eSet(97, "");
	}

	@Test
	public void test181() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test181");
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
		zentaDiagramModel12.checkId("");
		zentaDiagramModel12.setId("hi!");
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor22 = zentaDiagramModel12
				.eAllContents();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel24 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel24.setDocumentation("hi!");
		java.lang.Object obj28 = zentaDiagramModel24.getAdapter(0L);
		zentaDiagramModel24.setDocumentation("hi!");
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		zentaDiagramModel12.eDynamicSet((byte) 100, zentaDiagramModel24);
	}

	@Test
	public void test182() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test182");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor6 = zentaDiagramModel0
				.eAllContents();
		boolean boolean7 = zentaDiagramModel0.isTemplate();
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eObjectItor8 = zentaDiagramModel0
				.eAllContents();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		java.lang.Object obj12 = zentaDiagramModel0
				.eDynamicGet('4', false, true);
	}

	@Test
	public void test183() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test183");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		zentaDiagramModel0.checkId("hi!");
		zentaDiagramModel0.setLineWidth('4');
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> eObjectList8 = zentaDiagramModel0
				.eCrossReferences();
	}

	@Test
	public void test184() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test184");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		int int5 = zentaDiagramModel0.getLineWidth();
		zentaDiagramModel0.setConnectionRouterType('4');
		org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature8 = zentaDiagramModel0
				.eContainingFeature();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		boolean boolean10 = zentaDiagramModel0.eDynamicIsSet(10);
	}

	@Test
	public void test185() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test185");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		org.eclipse.emf.ecore.resource.Resource resource3 = zentaDiagramModel0
				.eResource();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore4 = zentaDiagramModel0
				.eStore();
		org.eclipse.emf.ecore.InternalEObject.EStore eStore5 = zentaDiagramModel0
				.eStore();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState6 = zentaDiagramModel0
				.delete();
	}

	@Test
	public void test186() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "ZentaDiagramModelErrorTest0.test186");
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel0 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel0.setDocumentation("hi!");
		java.lang.Object obj4 = zentaDiagramModel0.getAdapter(0L);
		java.lang.String str5 = zentaDiagramModel0.getName();
		org.eclipse.emf.ecore.resource.Resource.Internal internal6 = zentaDiagramModel0
				.eInternalResource();
		boolean boolean7 = zentaDiagramModel0.isChecked();
		org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel zentaDiagramModel8 = new org.rulez.magwas.zenta.model.handmade.ZentaDiagramModel();
		zentaDiagramModel8.setDocumentation("hi!");
		java.lang.Object obj12 = zentaDiagramModel8.getAdapter(0L);
		org.eclipse.emf.common.util.EList<org.rulez.magwas.zenta.model.IDiagramModelObject> iDiagramModelObjectList13 = zentaDiagramModel8
				.getChildren();
		zentaDiagramModel8.setDocumentation("");
		org.rulez.magwas.zenta.model.UndoState undoState16 = zentaDiagramModel8
				.prepareDelete();
		// during test generation this statement threw an exception of type
		// java.lang.NullPointerException in error
		org.rulez.magwas.zenta.model.UndoState undoState17 = zentaDiagramModel0
				.delete(undoState16);
	}
}

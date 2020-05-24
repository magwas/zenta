package com.kodekonveyor.zenta.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ModelConsistencyException;
import org.rulez.magwas.zenta.model.handmade.RelationClass;

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;
import com.kodekonveyor.exception.ThrowableTester;

@TestedService("IBasicRelationship")
@TestedBehaviour("exception interface")

public class IBasicRelationshipCheckTest {

	@Test
	@DisplayName("if the id exists, it does not throw an exception")
	void test1() {
		RelationClass relationship = RelationClassTestData.get();
		relationship.check();
	}

	@Test
	@DisplayName("if the id is null, it does throw a ModelConsistencyException")
	void test2() {
		ThrowableTester.assertThrows(
				() -> RelationClassTestData.getIdNull().check()
		).assertException(ModelConsistencyException.class);
	}

	@Test
	@DisplayName(
		"if the id is null, the exception message contains 'id cannot be null'"
	)
	void test3() {
		ThrowableTester.assertThrows(
				() -> RelationClassTestData.getIdNull().check()
		).assertMessageMatches("id cannot be null.*");
	}

	@Test
	@DisplayName(
		"if the documentation is null, it does throw a ModelConsistencyException"
	)
	void test4() {
		ThrowableTester.assertThrows(
				() -> RelationClassTestData.getDocumentationNull().check()
		).assertException(ModelConsistencyException.class);
	}

	@Test
	@DisplayName(
		"if the documentation is null, the exception message is 'documentation cannot be null'"
	)
	void test5() {
		ThrowableTester.assertThrows(
				() -> RelationClassTestData.getDocumentationNull().check()
		).assertMessageMatches("documentation cannot be null.*");
	}

	@Test
	@DisplayName(
		"if the name is null, it does throw a ModelConsistencyException"
	)
	void test6() {
		ThrowableTester.assertThrows(
				() -> RelationClassTestData.getNameNull().check()
		).assertException(ModelConsistencyException.class);
	}

	@Test
	@DisplayName(
		"if the name is null, the exception message is 'documentation cannot be null'"
	)
	void test7() {
		IBasicRelationship nameNull = RelationClassTestData.getNameNull();
		ThrowableTester.assertThrows(() -> {
			nameNull.check();
		}).assertMessageMatches("name cannot be null.*");
	}

	@Test
	@DisplayName(
		"if the source is null, it does throw a ModelConsistencyException"
	)
	void test8() {
		ThrowableTester.assertThrows(
				() -> RelationClassTestData.getSourceNull().check()
		).assertException(ModelConsistencyException.class);
	}

	@Test
	@DisplayName(
		"if the source is null, the exception message is 'source cannot be null'"
	)
	void test9() {
		IBasicRelationship nameNull = RelationClassTestData.getSourceNull();
		ThrowableTester.assertThrows(() -> {
			nameNull.check();
		}).assertMessageMatches("source cannot be null.*");
	}

	@Test
	@DisplayName(
		"if the target is null, it does throw a ModelConsistencyException"
	)
	void test10() {
		ThrowableTester.assertThrows(
				() -> RelationClassTestData.getTargetNull().check()
		).assertException(ModelConsistencyException.class);
	}

	@Test
	@DisplayName(
		"if the target is null, the exception message is 'target cannot be null'"
	)
	void test11() {
		IBasicRelationship nameNull = RelationClassTestData.getTargetNull();
		ThrowableTester.assertThrows(() -> {
			nameNull.check();
		}).assertMessageMatches("target cannot be null.*");
	}

}

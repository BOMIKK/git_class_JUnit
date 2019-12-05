package se.maven.example;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//FunctionGroup1Test에 해당하는것 만 하겠다.
@IncludeCategory(FunctionGroup1Test.class)
//모든 테스트 다함
@SuiteClasses({ AppTest.class, SimpleCalculatorTest.class, WeiredAddInSimpleCalculatorTest.class })
public class AllTests {}

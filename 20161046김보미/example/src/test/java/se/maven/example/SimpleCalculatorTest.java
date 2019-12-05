package se.maven.example;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class SimpleCalculatorTest {
	SimpleCalculator calc;
	// before (테스트 클래스가 실행될 떄 ) 와 after(모든 테스트 메소드가 실행된 후)는 한번 씩만 실행 
	@BeforeClass
	public static void setUpBeforeClass() {System.out.println("Test class Started(setUpClass)");	}
	
	@AfterClass
	public static void tearDownAfterClass() {System.out.println("Test class Started(tearDownClass)");}

	//그냥before after는 테스트 메소드 할때마다?
	@Before//순서 1.before 2.test 3.after 
	public void setUp() {
		System.out.println("Test Started(setUp)");
		calc=new SimpleCalculator();	
	}
	
	@After //테스트가 실행 된후에 마지막에 하는 것 
	public void tearDown() {
		System.out.println("Test Finished(tearDown)");
	}
	
	
	
	@Test//꼭 붙여야 함 ->테스트 자동 실행 (Run as => JUnit Test)
	@Category(FunctionGroup1Test.class)
	public void testAdd() throws Exception{
		SimpleCalculator calc=new SimpleCalculator();
		calc.add(10, 20);
		assertEquals(30,calc.getResult());//30 과 똑같은지 비교 assertEquals 
	}
	
	@Test
	@Category(FunctionGroup2Test.class)
	public void testSub() {
		SimpleCalculator calc=new SimpleCalculator();
		calc.sub(10, 20);
		assertEquals(-10,calc.getResult());
	}
	
	@Test
	public void testInc() {
		SimpleCalculator calc=new SimpleCalculator();
		calc.inc(10);
		assertEquals(10,calc.getResult());
	}
	@Test(expected=InvalidArgumentException.class)
	public void testAddWithNegativeArgument()throws Exception{
		calc.addWithPositiveArgs(10, -20);
	}
	
}

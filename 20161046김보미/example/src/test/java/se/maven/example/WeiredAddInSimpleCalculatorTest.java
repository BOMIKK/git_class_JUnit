package se.maven.example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)

public class WeiredAddInSimpleCalculatorTest {
	//(2) 테스트  데이터를 담을 속성을 선언함
	private int value1;
	private int value2;
	private int expected;
	
	
	//(1)테스트 데이ㅌㅓ를 생성하는 부분 작성
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
			{30,10,20},//expected, value1 ,value2
			{0,0,0},
			{100,5,7}
		});
	}
	
	//(3) 테스트 데이터를 받아들이는 생성자 작성
	public WeiredAddInSimpleCalculatorTest(int expected,int value1,int value2) {
		this.expected=expected;
		this.value1=value1;
		this.value2=value2;
		
	}
	
	//(4)테스트 메소드 만들기,데이터 개 수만큼 테스트?
	@Test
	public void testWeiredAdd() {
		SimpleCalculator calc=new SimpleCalculator();
		calc.weiredAdd(value1, value2);
		assertEquals(expected,calc.getResult());
	}

}

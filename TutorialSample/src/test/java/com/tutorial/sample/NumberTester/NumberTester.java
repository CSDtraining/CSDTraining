/**
 * 
 */
package com.tutorial.sample.NumberTester;
import org.junit.*;

import com.tutorial.sample.numberexample.numberexample;
/**
 * @author P776306
 *
 */
public class NumberTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void TestaddNumbers(){
		int result;
		numberexample num1 = new numberexample();
		result = num1.AddNumber(10, 20);
		
		Assert.assertEquals(30,result);
	}
	
	@Test
	public void TestFindGreaterNumber(){
		int expected;
		int result;
		int first = 10;
		int second = 30;
		expected = 30;
		numberexample num1 = new numberexample();
		result = num1.FindGreaterNumber(first, second);
		
		Assert.assertEquals(expected, result);
	}
	
}

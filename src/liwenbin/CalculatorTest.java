package liwenbin;

import static org.junit.Assert.*; 

 import org.junit.After; 
 import org.junit.Assert; 
 import org.junit.Before; 
 import org.junit.BeforeClass; 
 import org.junit.Test; 
 

 
 public class CalculatorTest { 
 

 	@BeforeClass 
 	public static void setUpBeforeClass() throws Exception { 
 	} 
 
 	@Before 
 	public void setUp() throws Exception { 
 	} 
 

 	@After 
 	public void tearDown() throws Exception { 
 	} 
 
	 @Test  
	 public void testAdd() 
	    { 
	        Calculator calculator = new Calculator(); 
	        int result = calculator.add(1, 2); 
	        // 判断方法的返回结果 
	        Assert.assertEquals(3, result);// 第一个参数是期望值，第二个参数是要验证的值 
	    } 
	 @Test  
	 public void testSubtract() 
	    { 
	        Calculator calculator = new Calculator(); 
	        int result = calculator.subtract(1, 2); 
	        // 判断方法的返回结果 
	        Assert.assertEquals(-1, result);// 第一个参数是期望值，第二个参数是要验证的值 

    } 
	 @Test  
	 public void testMultiply() 
	    { 
	        Calculator calculator = new Calculator(); 
	        int result = calculator.multiply(2, 3); 
	        // 判断方法的返回结果 
	        Assert.assertEquals(6, result);// 第一个参数是期望值，第二个参数是要验证的值 

    } 
	 @Test  
	 public void testDivide() 
	    { 
	        Calculator calculator = new Calculator(); 
	        int result = calculator.divide(12, 3); 
	        // 判断方法的返回结果 
	        Assert.assertEquals(4, result);// 第一个参数是期望值，第二个参数是要验证的值 

    } 

 
} 

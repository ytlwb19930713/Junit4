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
	        // �жϷ����ķ��ؽ�� 
	        Assert.assertEquals(3, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ 
	    } 
	 @Test  
	 public void testSubtract() 
	    { 
	        Calculator calculator = new Calculator(); 
	        int result = calculator.subtract(1, 2); 
	        // �жϷ����ķ��ؽ�� 
	        Assert.assertEquals(-1, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ 

    } 
	 @Test  
	 public void testMultiply() 
	    { 
	        Calculator calculator = new Calculator(); 
	        int result = calculator.multiply(2, 3); 
	        // �жϷ����ķ��ؽ�� 
	        Assert.assertEquals(6, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ 

    } 
	 @Test  
	 public void testDivide() 
	    { 
	        Calculator calculator = new Calculator(); 
	        int result = calculator.divide(12, 3); 
	        // �жϷ����ķ��ؽ�� 
	        Assert.assertEquals(4, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ 

    } 

 
} 

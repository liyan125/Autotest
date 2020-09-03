package com.course.testng;

import org.testng.annotations.*;

public class basicAnnonation {
    @Test
    public void testcase1() {
        System.out.println("这是测试用例1");
    }
    @Test
    public void testcase2(){
        System.out.println("这个是测试用例2");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("这是在测试方法之前运行的");
    }

    @AfterMethod
    public void aftermethod(){
            System.out.println("这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("这是在类运行之前运行的");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("这是在类运行之后运行的");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite测试套件");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite测试套件");
    }

}

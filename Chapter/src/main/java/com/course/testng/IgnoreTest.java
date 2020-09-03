package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void test1(){
        System.out.println("Ignore1 test");
    }
    @Test(enabled = false)
    public void test2(){
        System.out.println("Ignore2 test");
    }
    @Test(enabled = true)
    public void test3(){
        System.out.println("Ignore3 test");
    }
}

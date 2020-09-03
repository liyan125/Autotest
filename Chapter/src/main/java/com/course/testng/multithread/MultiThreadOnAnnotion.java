package com.course.testng.multithread;

import org.testng.annotations.Test;

import java.io.PrintStream;

import static java.lang.System.out;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 5,threadPoolSize = 3, timeOut = 1000)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id :%s%n", Thread.currentThread().getId());
    }
}

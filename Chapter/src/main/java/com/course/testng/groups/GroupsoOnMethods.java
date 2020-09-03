package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsoOnMethods {

    //服务端
    @Test(groups="server")
    public void test1(){
        System.out.println("服务端1111");
    }
    @Test(groups="server")
    public void test2(){
        System.out.println("服务端2222");
    }

    //客户端
    @Test(groups="client")
    public void test3(){
        System.out.println("客户端3333");
    }
    @Test(groups="client")
    public void test4(){
        System.out.println("客户端4444");
    }

    @BeforeGroups("server")
    public void beforegroupsonserver(){
        System.out.println("服务端测试之前运行");
    }

    @AfterGroups("server")
    public void aftergroupsonserver(){
        System.out.println("服务端测试之后运行");
    }
}

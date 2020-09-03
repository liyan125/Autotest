package com.course.testng.paramter;

import jdk.internal.org.objectweb.asm.commons.Method;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = " + name + ";age =" + age);
    }

    @DataProvider(name="data")
        public Object[][] providerdata() {
        Object[][] o = new Object[][]{
                {"zhangsan",12},
                {"lisi",10},
                {"wanger",20}
       };
        return o;
    }

    @Test(dataProvider = "medata")
    public void test1(String name,int age){
        System.out.println("test1方法 name = " + name + ";age =" + age);
    }

    @Test(dataProvider = "medata")
    public void test2(String name,int age){
       System.out.println("test2方法 name = " + name + ";age =" + age);
    }

    @DataProvider(name="medata")
    public Object[][] meDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",21},
                    {"lisi",22}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"zhangsan",31},
                    {"lisi",32}
            };
        }
        return result;
    }


}

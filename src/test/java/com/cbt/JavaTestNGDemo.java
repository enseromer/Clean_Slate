package com.cbt;


import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaTestNGDemo {



    @Test
    public void test1(){
        String a = "A";
        String b = "A";
        Assert.assertEquals(a,b);


    }

    @Test
    public void test2() {
        String str1 = "apple";
        String str2 = "apple";
        Assert.assertEquals(str1,str2);

    }
    @Test
    public void test3(){
        String str1 = "AADF";
        String str2 = "AA";
        Assert.assertTrue(str1.contains(str2));
    }

    @Test
    public void test4(){
        Assert.assertFalse(false);
    }
}
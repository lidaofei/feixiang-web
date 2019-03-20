package com.feixiang.demo;

import org.junit.Assert;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lidaofei on 2019/2/22.
 */

public class Test {

    @org.junit.Test
    public void test(){
        TestModel tm = new TestModel();
        BeanWrapper bw = new BeanWrapperImpl(tm);
        bw.setPropertyValue("ifGood","on");
        System.out.println(tm.getIfGood());
    }

    @org.junit.Test
    public void test2(){
        TestModel tm = new TestModel();
        BeanWrapperImpl bw = new BeanWrapperImpl(false);
        bw.setWrappedInstance(tm);
        bw.setPropertyValue("ifGood","1");
        System.out.println(tm.getIfGood());
    }

    @org.junit.Test
    public void test3(){
        TestModel tm = new TestModel();
        BeanWrapperImpl bw = new BeanWrapperImpl(tm);
        bw.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
        bw.setPropertyValue("birthday",1550805320L);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(tm.getBirthday()));
    }

    /**
     * 断言
     */
    @org.junit.Test
    public void test4(){
        //junit 断言，用于判断结果是否相等
        /*
        String str1 = "1";
        String str2 = "2";
        String str3 = "3";
        Assert.assertArrayEquals("不相等",str1.toCharArray(),str3.toCharArray());
        Assert.assertArrayEquals("不相等",str1.toCharArray(),str2.toCharArray());
        */

        //
        assert true : "为假";
        assert false : "为假";
    }
}

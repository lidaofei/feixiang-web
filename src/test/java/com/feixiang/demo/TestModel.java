package com.feixiang.demo;

import java.util.Date;

/**
 * Created by lidaofei on 2019/2/22.
 */
public class TestModel {

    private Long id;
    private String name;
    private Integer age;
    private Date birthday;
    private Boolean ifGood;
    private String key1;
    private String key2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getIfGood() {
        return ifGood;
    }

    public void setIfGood(Boolean ifGood) {
        this.ifGood = ifGood;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }
}

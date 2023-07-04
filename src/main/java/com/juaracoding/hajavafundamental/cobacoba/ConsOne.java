package com.juaracoding.hajavafundamental.cobacoba;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/4/2023 8:01 PM
@Last Modified 7/4/2023 8:01 PM
Version 1.0
*/

public class ConsOne {

    private String name;
    private Integer value;

    public ConsOne(){}
    public ConsOne(String name, Integer value){
        this.name = name;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

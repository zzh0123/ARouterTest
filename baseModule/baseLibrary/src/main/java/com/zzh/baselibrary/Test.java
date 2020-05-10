package com.zzh.baselibrary;


import java.io.Serializable;

/**
 * Author: zzhh
 * Date: 2020/5/10 20:13
 * Description: test
 */
public class Test implements Serializable{

    public String name1;
    public String name2;

    public Test(){

    }
    public Test(String name1, String name2){
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}

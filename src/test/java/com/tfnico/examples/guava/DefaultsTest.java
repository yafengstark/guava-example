package com.tfnico.examples.guava;


import com.google.common.base.Defaults;
import org.junit.Test;

// 默认值
public class DefaultsTest {

    @Test
    public void test(){
        Defaults.defaultValue(boolean.class);
//        boolean.class                         //返回false
//        char.class                            //返回'\0'
//        byte.class                            //返回(byte)0
//        short.class                           //返回(short)0
//        int.class                             //返回0
//        long.class                            //返回0L
//        float.class                           //返回0f
//        double.class                          //返回0d
//        non-primitive types                   //返回null

    }
}

package com.tfnico.examples.guava;

import com.google.common.base.Objects;
import org.junit.Test;

public class ObjectsTest {

    @Test
    public void test(){
        Objects.equal("a", "a"); // returns true
        Objects.equal(null, "a"); // returns false
        Objects.equal("a", null); // returns false
        Objects.equal(null, null); // returns true

//        Objects.hashCode(Object...)
//        Objects.hashCode(field1, field2, ..., fieldn)

//        Objects.toStringHelper(Persion.class)
//                .add("name", this.name)
//                .add("age", this.age)
//                .toString();

    }

    @Test
    public void compare(){
//        Ints.compare(int a, int b)
//        Longs.compare(long a, long b)
//        Shorts.compare(short a, short b)
//        Doubles.compare(double a, double b)
//        Floats.compare(float a, floab b)
//        Booleans.compare(boolean a, boolean b)
//        Chars.compare(char a, char b)
    }
}

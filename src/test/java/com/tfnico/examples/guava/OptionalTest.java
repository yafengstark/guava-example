package com.tfnico.examples.guava;

import com.google.common.base.Optional;
import org.junit.Assert;
import org.junit.Test;

/**
 * Optional代替null
 *
 */
public class OptionalTest {

    // 确定抛出的异常类型
    @Test(expected = IllegalStateException.class)
    public void howToUse() {

        Cake cake = null;

        Optional<Cake> possbile = Optional.fromNullable(cake); //将一个T的实例转换为Optional对象(T可以为空)
        boolean present = possbile.isPresent();//若Optional包含的T实例不为null，则返回true；若T实例为null，返回false

        Assert.assertFalse(present);

        Assert.assertNull(possbile.orNull());//若Optional包含的T实例不为null, 返回T; 否则, 返回null

        // 会抛出异常
        Cake t = possbile.get();
    }

    @Test
    public void howToUse2() {

        Customer customer = new Customer(1, "top");

        Optional<Customer> possbile = Optional.of(customer); //将一个T的实例转换为Optional对象(T可以为空)

        boolean present = possbile.isPresent();//若Optional包含的T实例不为null，则返回true；若T实例为null，返回false
        Assert.assertTrue(present);

        Assert.assertNotNull(possbile.orNull());//若Optional包含的T实例不为null, 返回T; 否则, 返回null


    }
}

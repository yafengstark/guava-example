package com.tfnico.examples.guava;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class PreconditionsTest {

    @Test(expected = IllegalArgumentException.class)
    public void test(){
        // 检查boolean是否为真
// 失败时抛出 IllegalArgumentException

        boolean args = false;

        Preconditions.checkArgument(args, "参数错误");
    }
}

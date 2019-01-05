package com.ssss.utils;

import java.util.Random;

/**
 * @author ：sss
 * @Date ：Created in 22:21 2018/12/6
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     * @return
     */
    public static synchronized String genUniquekey() {
        Random random = new Random();

        System.currentTimeMillis();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}

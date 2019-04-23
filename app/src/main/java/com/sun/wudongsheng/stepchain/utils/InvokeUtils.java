package com.sun.wudongsheng.stepchain.utils;

/**
 * Copyright (C), 2016-2019, 未来酒店
 * File: InvokeUtils.java
 * Author: wds_sun
 * Date: 2019/4/23 下午3:03
 * Description: ${DESCRIPTION}
 */
public class InvokeUtils {
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

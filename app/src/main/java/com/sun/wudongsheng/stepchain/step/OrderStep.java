package com.sun.wudongsheng.stepchain.step;

/**
 * Copyright (C), 2016-2019, 京杭不止大运河
 * File: OrderStep.java
 * Author: wds_sun
 * Date: 2019/4/22 下午5:09
 * Description: ${DESCRIPTION}
 */
public abstract class OrderStep implements IStep{
    private int order=0;

    @Override
    public void setOrder(int order) {
        this.order=order;
    }

    @Override
    public int getOrder() {
        return this.order;
    }
}

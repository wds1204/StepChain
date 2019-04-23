package com.sun.wudongsheng.stepchain.step.impl;


import com.sun.wudongsheng.stepchain.step.IStep;
import com.sun.wudongsheng.stepchain.step.OrderStep;
import com.sun.wudongsheng.stepchain.step.StepChain;
import com.sun.wudongsheng.stepchain.step.StepContext;

/**
 * Copyright (C), 2016-2019, 未来酒店
 * File: FinishStep.java
 * Author: wds_sun
 * Date: 2019/4/22 下午5:56
 * Description: ${DESCRIPTION}
 */
public class FinishStep extends OrderStep {
    @Override
    public void process(IStep caller, StepChain stepChain, StepContext context) {
        System.out.println("结束");
    }
}

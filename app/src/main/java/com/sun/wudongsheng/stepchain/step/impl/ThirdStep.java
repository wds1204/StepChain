package com.sun.wudongsheng.stepchain.step.impl;


import com.sun.wudongsheng.stepchain.step.IStep;
import com.sun.wudongsheng.stepchain.step.OrderStep;
import com.sun.wudongsheng.stepchain.step.StepChain;
import com.sun.wudongsheng.stepchain.step.StepContext;
import com.sun.wudongsheng.stepchain.utils.InvokeUtils;

/**
 * Copyright (C), 2016-2019, 未来酒店
 * File: ThirdStep.java
 * Author: wds_sun
 * Date: 2019/4/22 下午5:55
 * Description: ${DESCRIPTION}
 */
public class ThirdStep extends OrderStep {
    @Override
    public void process(IStep caller, StepChain stepChain, StepContext context) {
        System.out.println("执行步骤三");
        InvokeUtils.sleep(1000);
        stepChain.process(this,stepChain,context);
    }
}

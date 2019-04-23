package com.sun.wudongsheng.stepchain.step;


import com.sun.wudongsheng.stepchain.step.impl.FinishStep;
import com.sun.wudongsheng.stepchain.step.impl.FirstStep;
import com.sun.wudongsheng.stepchain.step.impl.SecStep;
import com.sun.wudongsheng.stepchain.step.impl.ThirdStep;

/**
 * Copyright (C), 2016-2019, 京杭不止大运河
 * File: StepMain.java
 * Author: wds_sun
 * Date: 2019/4/22 下午5:58
 * Description: ${DESCRIPTION}
 */
public class StepMain {
    public static void main(String[] args) {
        StepChain stepChain = new StepChain();
        StepContext context = new StepContext();
        stepChain.addStep(new FirstStep());
        stepChain.addStep(new SecStep());
        stepChain.addStep(new ThirdStep());
        stepChain.addStep(new FinishStep());
        stepChain.process(null,stepChain,context);
    }
}

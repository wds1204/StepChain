package com.sun.wudongsheng.stepchain.step;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2016-2019, 京杭不止大运河
 * File: StepChain1.java
 * Author: wds_sun
 * Date: 2019/4/22 下午5:14
 * Description: ${处理步骤链}
 */
public class StepChain implements IStep {
    private int addIndex = 0;
    private List<IStep> steps = new ArrayList<>();

    private volatile int index = 0;


    public void addStep(IStep iStep) {
        steps.add(iStep);
        iStep.setOrder(addIndex++);
    }


    @Override
    public void process(IStep caller, StepChain stepChain, StepContext context) {
        if (context.isFinish()) {
             index = steps.size()-1;
            steps.get(index).process(caller,stepChain,context);
        } else {
            if (index == steps.size()) return;
            IStep iStep = steps.get(index);
            if (caller != null && iStep.getOrder() <= caller.getOrder()) return;
            index++;
            iStep.process(caller, stepChain, context);
        }
    }

    @Override
    public void setOrder(int order) {

    }

    @Override
    public int getOrder() {
        return 0;
    }
}

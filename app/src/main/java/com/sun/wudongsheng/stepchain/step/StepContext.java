package com.sun.wudongsheng.stepchain.step;

/**
 * Copyright (C), 2016-2019, 京杭不止大运河
 * File: StepContext.java
 * Author: wds_sun
 * Date: 2019/4/23 上午11:33
 * Description: ${DESCRIPTION}
 */
public class StepContext {
    private boolean isFinish=false;

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}

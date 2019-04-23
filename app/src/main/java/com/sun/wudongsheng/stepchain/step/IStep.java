package com.sun.wudongsheng.stepchain.step;


/**
 * Copyright (C), 2016-2019, 未来酒店
 * File: IStep1.java
 * Author: wds_sun
 * Date: 2019/4/22 下午5:06
 * Description: ${DESCRIPTION}
 */
public interface IStep {
    /**
     *  执行当前步骤
     *
     * @param caller 调用者上一步
     * @param stepChain
     * @param context
     */
    void process(IStep caller, StepChain stepChain, StepContext context);

    /**
     * 记录当前步骤
     * @param order
     */
    void setOrder(int order);

    /**
     * 获取当前步骤
     * @return
     */
    int getOrder();
}

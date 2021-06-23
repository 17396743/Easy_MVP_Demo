package com.example.myapplication.model;

import com.example.myapplication.contart.Contrat;

/**
 * @作者 幻雨之秋
 * @创建时间 2021/6/22 21:22
 */
public class Model implements Contrat.IModel {

    /**
     * 获取数据源的地方
     *
     * @param iView
     */
    @Override
    public void button(Contrat.IView iView) {

        String one = "我是数据，来获取我！";

        /**
         * 调用方法里的接口，接收获取的数据
         */
        iView.button(one);

    }
}

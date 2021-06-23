package com.example.myapplication.contart;

/**
 * @作者 幻雨之秋
 * @创建时间 2021/6/22 21:18
 */
public interface Contrat {
    /**
     * V层接口，用于绑定与获取数据
     */
    interface IView {
        void button(String one);
    }

    /**
     * P层接口，用于创建P层的方法。
     */
    interface IPresenter {
        void PData();
    }

    /**
     * M层接口，用于获取数据
     */
    interface IModel {
        void button(IView iView);
    }

}

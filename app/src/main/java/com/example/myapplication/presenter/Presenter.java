package com.example.myapplication.presenter;

import com.example.myapplication.contart.Contrat;
import com.example.myapplication.model.Model;

/**
 * @作者 幻雨之秋
 * @创建时间 2021/6/22 21:23
 */
public class Presenter implements Contrat.IPresenter {

    /**
     * 自定义接口  M层
     */
    public Contrat.IModel model;
    /**
     * 自定义接口 V层
     */
    public Contrat.IView view;

    /**
     * 调用P层 用。
     *
     * @param view
     */
    public Presenter(Contrat.IView view) {
        this.view = view;
        this.model = new Model();
    }


    /**
     * 交互数据用。此方法从接口中创建。
     */
    @Override
    public void PData() {
        model.button(new Contrat.IView() {
            @Override
            public void button(String one) {
                view.button(one);
            }
        });
    }
}

package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.contart.Contrat;
import com.example.myapplication.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements Contrat.IView {

    /**
     *
     * 首先是我最最喜欢的一句话，也是对不要过度设计的一种诠释。
     * -- 先实现，再重构吧。直接考虑代码不臃肿得话，不知道什么时候才能写好了。 --
     *
     * 本人当初学习的时候，是看的这篇文章理解mvp的。
     * 链接：http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0202/2397.html
     */

    /**
     * 按钮点击
     */
    private Button one;
    /**
     * 文字显示
     */
    private TextView two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 存放组件
         */
        initView();
        /**
         * 存放一些点击监听或网络请求什么的。
         */
        initData();
    }

    public void initView() {
        /**
         * 按钮点击
         */
        one = findViewById(R.id.button);
        /**
         * 文字显示
         */
        two = findViewById(R.id.tv_one);
    }

    public void initData() {
        /**
         * 点击监听
         */
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 点击后，调用P层的这个类和方法。
                 */
                new Presenter(MainActivity.this).PData();
            }
        });


    }

    /**
     * 获取从P层返回的数据信息
     *
     * @param one
     */
    @Override
    public void button(String one) {
        /**
         * 显示指定信息
         */
        two.setText(one);
    }
}

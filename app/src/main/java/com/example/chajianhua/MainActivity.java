package com.example.chajianhua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.util.JumpUtil;
import com.example.moduleone.MoMainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainActivity extends BaseActivity {

    @BindView(R.id.am_btn_module1)
    Button amBtnModule1;
    @BindView(R.id.am_btn_module2)
    Button amBtnModule2;
    @BindView(R.id.am_btn_module3)
    Button amBtnModule3;
    @BindView(R.id.am_btn_module4)
    Button amBtnModule4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.am_btn_module1, R.id.am_btn_module2, R.id.am_btn_module3, R.id.am_btn_module4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.am_btn_module1:
                System.out.println("======click1======");
                Intent intent = new Intent();
                intent.setClass(this, MoMainActivity.class);
                startActivity(intent);

                break;
            case R.id.am_btn_module2:
//                ARouter.getInstance()
//                        .build(JumpUtil.HomeActivity) //页面的String值
////                .withString("key",s) //附带参数
//                        .navigation();
//                ARouter.getInstance().build("/test/home").navigation();
                ARouter.getInstance().build("/main/test1Activity").navigation();
                break;
            case R.id.am_btn_module3:
                break;
            case R.id.am_btn_module4:
                break;
            default:
                break;
        }
    }
}

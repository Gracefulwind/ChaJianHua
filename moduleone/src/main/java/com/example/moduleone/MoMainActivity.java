package com.example.moduleone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.baselibrary.util.JumpUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.internal.DebouncingOnClickListener;

@Route(path = JumpUtil.PageModuleOne.START_ACTIVITY)
public class MoMainActivity extends AppCompatActivity {

    @BindView(R2.id.mo_am_btn_module1)
    Button amBtnModule1;
    @BindView(R2.id.am_btn_module2)
    Button amBtnModule2;
    private View btn1;
    @BindView(R2.id.mo_am_btn_module3)
    Button amBtnModule3;
    @BindView(R2.id.mo_am_btn_module4)
    Button amBtnModule4;

    @Autowired(name = "key")
    String text = "NULL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moduleone_activity_main);
        ButterKnife.bind(this);
        //如果没有带@Autowired的参数，那么field会被赋值null，注意初始化
        ARouter.getInstance().inject(this);
        System.out.println("==========================");
        System.out.println("==========================");
        btn1 = findViewById(R.id.mo_am_btn_module1);
        amBtnModule4.setText(text);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("======go Home======");
//            }
//        });
//        System.out.println("==========================");
//        System.out.println("==========================");
//        DebouncingOnClickListener test = new DebouncingOnClickListener() {
//
//            @Override
//            public void doClick(View v) {
//                System.out.println("~~===~~");
//                System.out.println("=========");
//                System.out.println("~~===~~");
//            }
//        };
//        //出错似乎在这个listener上
//        amBtnModule2.setOnClickListener(test);
//
//        System.out.println("~~==ok=~~");
//        System.out.println("~~==end=~~");

    }

//
//    @OnClick({R2.id.am_btn_module2})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.am_btn_module2:
//                System.out.println("======go Home======");
//
//                break;
//            default:
//                break;
//        }
//    }

    @OnClick({R2.id.mo_am_btn_module1, R2.id.am_btn_module2, R2.id.mo_am_btn_module3, R2.id.mo_am_btn_module4})
    public void onViewClicked(View view) {
        //模块不能使用switch，因为模块没有资源，这些被认为是变量

        int id = view.getId();
        if (id == R.id.mo_am_btn_module1) {
            this.finish();
            System.out.println("======go Home======");
//                Resource IDs can not be used in a switch statement in Android library
        } else if (id == R.id.am_btn_module2) {

        } else if (id == R.id.mo_am_btn_module3) {
        } else if (id == R.id.mo_am_btn_module4) {
        }
    }

}

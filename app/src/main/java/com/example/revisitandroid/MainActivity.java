package com.example.revisitandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.revisitandroid.adapter.DevTestAdapter;
import com.example.revisitandroid.bean.DemoListBean;
import com.example.revisitandroid.supter.BaseActivity;
import com.example.revisitandroid.views.Custom_Systrace_Test_Activity;
import com.example.revisitandroid.views.MMAP_Test_Activity;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    public static final String MMAP_TEST = "MMAP_TEST";
    public static final String SYSTRACE_TEST = "SYSTRACE_TEST";

    private ArrayList<DemoListBean> mDevTestListBeans = new ArrayList<DemoListBean>();

    private DevTestAdapter mTestAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.dev_test_lv);
        mTestAdapter = new DevTestAdapter();
        listView.setAdapter(mTestAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!mDevTestListBeans.isEmpty()) {
                    String itemType = mDevTestListBeans.get(position).getItemType();
                    switch (itemType) {
                        case MMAP_TEST: {
                            MMAP_Test_Activity.start(MainActivity.this);
                        }
                        break;

                        case SYSTRACE_TEST:{
                            Custom_Systrace_Test_Activity.start(MainActivity.this);
                        }



                        default:
                            break;

                    }
                }
            }
        });

        setDataList();
    }

    private void setDataList() {
        {
            DemoListBean devTestListBean = new DemoListBean();
            devTestListBean.setItemType(MMAP_TEST);
            devTestListBean.setItemName("MMAP测试");
            devTestListBean.setShowBtn(false);
            mDevTestListBeans.add(devTestListBean);
        }


        {
            DemoListBean devTestListBean = new DemoListBean();
            devTestListBean.setItemType(SYSTRACE_TEST);
            devTestListBean.setItemName("Systrace测试");
            devTestListBean.setShowBtn(false);
            mDevTestListBeans.add(devTestListBean);
        }

        if (mTestAdapter != null) {
            mTestAdapter.setData(mDevTestListBeans);
        }

    }


}
package com.example.revisitandroid.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.revisitandroid.R;
import com.example.revisitandroid.adapter.DevTestAdapter;
import com.example.revisitandroid.bean.DemoListBean;
import com.example.revisitandroid.supter.BaseActivity;

import java.util.ArrayList;

public class MMAP_Test_Activity extends BaseActivity {


    public static void start(Context context){
        Intent intent = new Intent(context,MMAP_Test_Activity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmap);
        setTitle("MMAP测试");

    }



}
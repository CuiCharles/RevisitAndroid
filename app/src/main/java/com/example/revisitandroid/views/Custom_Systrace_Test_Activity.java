package com.example.revisitandroid.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;

import androidx.annotation.Nullable;

import com.example.revisitandroid.R;
import com.example.revisitandroid.supter.BaseActivity;

public class Custom_Systrace_Test_Activity extends BaseActivity {


    public static void start(Context context){
        Intent intent = new Intent(context,Custom_Systrace_Test_Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Trace.beginSection("Charles_Cui_Test_Trace");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_systrace);
        setTitle("Systrace测试");

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Trace.endSection();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}

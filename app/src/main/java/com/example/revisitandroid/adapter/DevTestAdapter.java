package com.example.revisitandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.revisitandroid.R;
import com.example.revisitandroid.bean.DemoListBean;
import com.example.revisitandroid.supter.BaseListViewAdapter;



public class DevTestAdapter extends BaseListViewAdapter<DemoListBean> {
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TestViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new TestViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_demo_name_layout,parent,false);
            viewHolder.title = convertView.findViewById(R.id.title_test);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (TestViewHolder) convertView.getTag();
        }

        viewHolder.title.setText(getData().get(position).getItemName());


        return convertView;
    }

    private class TestViewHolder{
        TextView title;
    }
}

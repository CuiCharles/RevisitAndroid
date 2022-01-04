package com.example.revisitandroid.supter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseListViewAdapter<T> extends BaseAdapter {

    protected List<T> mData;
    protected int checkPosition=-1;

    public int getCheckPosition() {
        return checkPosition;
    }

    public void setCheckPosition(int checkPosition) {
        this.checkPosition = checkPosition;
    }

    public BaseListViewAdapter() {
        mData=new ArrayList<>();
    }

    public BaseListViewAdapter(List<T> data) {
        mData = data;
    }

    public List<T> getData() {
        return mData;
    }

    public void setData(List<T> data) {
        if (data==null){
            return;
        }
        if (mData==null){
            mData=new ArrayList<>();
        }
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }
    public void addData(List<T> data) {
        if (data==null||data.size()<=0){
            return;
        }
        if (mData==null){
            mData=new ArrayList<>();
        }
        mData.addAll(data);
        notifyDataSetChanged();
    }

    public void addItemData(T itemData){
        if (mData==null){
            mData=new ArrayList<>();
        }
        mData.add(itemData);
        this.notifyDataSetChanged();
    }

    public void deleteItemData(int position){
        if (mData==null){
            mData=new ArrayList<>();
        }
        if (position<mData.size()){
            mData.remove(position);
        }
        checkPosition=-1;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent) ;
}

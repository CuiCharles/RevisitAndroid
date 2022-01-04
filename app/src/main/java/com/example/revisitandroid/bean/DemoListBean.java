package com.example.revisitandroid.bean;

import java.io.Serializable;


public class DemoListBean implements Serializable {
    private String itemType="";
    private String itemName="";
    private String itemDes="";
    //调试开关是否开启
    private boolean currentState=false;
    //是否展示调试按钮
    private boolean isShowBtn=true;

    public boolean isShowBtn() {
        return isShowBtn;
    }

    public void setShowBtn(boolean showBtn) {
        isShowBtn = showBtn;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }

    public boolean isCurrentState() {
        return currentState;
    }

    public void setCurrentState(boolean currentState) {
        this.currentState = currentState;
    }
}

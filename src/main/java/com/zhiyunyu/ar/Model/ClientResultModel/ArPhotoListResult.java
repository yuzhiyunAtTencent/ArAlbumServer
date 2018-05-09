package com.zhiyunyu.ar.Model.ClientResultModel;

import com.zhiyunyu.ar.Model.ArPhoto;

import java.util.List;

public class ArPhotoListResult {
    private  String code;
    private  String msg;
    private List<ArPhoto> data;

    public ArPhotoListResult() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ArPhoto> getData() {
        return data;
    }

    public void setData(List<ArPhoto> data) {
        this.data = data;
    }
}

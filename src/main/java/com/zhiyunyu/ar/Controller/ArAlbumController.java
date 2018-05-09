package com.zhiyunyu.ar.Controller;

import com.zhiyunyu.ar.Model.ClientResultModel.ArPhotoListResult;
import com.zhiyunyu.ar.Repository.ArPhotoRepository;
import com.zhiyunyu.ar.Model.ArPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yuzhiyun on 2018-04-30.
 */
@RestController
public class ArAlbumController {

    /**
     * @Autowired 代表自动装配，省略了gettter,setter,spring自动生成bean并注入
     */
    @Autowired
    private ArPhotoRepository arPhotoRepository;

    /**
     * @GetMapping 代表使用get请求
     * @return
     */
    @GetMapping(value = "/arPhotoList")
    public ArPhotoListResult arPhotoList(){
        ArPhotoListResult result = new ArPhotoListResult();
        result.setData(arPhotoRepository.findAll());
        result.setCode("0");
        result.setMsg("success");

        return result;
    }
}

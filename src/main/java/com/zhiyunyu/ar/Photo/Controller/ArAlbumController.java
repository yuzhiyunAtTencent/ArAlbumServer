package com.zhiyunyu.ar.Photo.Controller;

import com.zhiyunyu.ar.ArClientCommonResult;
import com.zhiyunyu.ar.Photo.Repository.ArPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public ArClientCommonResult arPhotoList(@RequestParam("userId") String userId){

        ArClientCommonResult result = new ArClientCommonResult();
        result.setData(arPhotoRepository.findByUserId(userId));
        result.setCode("0");
        result.setMsg("success");

        return result;
    }
}

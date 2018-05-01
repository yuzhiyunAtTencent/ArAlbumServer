package com.zhiyunyu.ar.Controller;

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

    @Autowired
    private ArPhotoRepository arPhotoRepository;

    @GetMapping(value = "/arPhotoList")
    public List<ArPhoto> arPhotoList(){
        return arPhotoRepository.findAll();
    }
}

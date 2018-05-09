package com.zhiyunyu.ar.Photo.Repository;

import com.zhiyunyu.ar.Photo.Model.ArPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yuzhiyun on 2018-04-30.
 */
public interface ArPhotoRepository extends JpaRepository<ArPhoto, String> {

    public List<ArPhoto> findByUserId(String userId);
}

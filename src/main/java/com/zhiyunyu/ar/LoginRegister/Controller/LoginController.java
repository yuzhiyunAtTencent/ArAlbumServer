package com.zhiyunyu.ar.LoginRegister.Controller;

import com.zhiyunyu.ar.ArClientCommonResult;
import com.zhiyunyu.ar.LoginRegister.Model.User;
import com.zhiyunyu.ar.LoginRegister.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/login")
    public ArClientCommonResult login(@RequestParam("userName") String userName, @RequestParam("pwd") String pwd){
        ArClientCommonResult result = new ArClientCommonResult();

        User user = userRepository.findByUserName(userName);
        if (null != user && user.getPwd() != null) {
            if (user.getPwd().equals(pwd)) {
                result.setCode("0");
                result.setMsg("success");
                result.setData(user);
            }
        } else {
            result.setCode("1");
            result.setMsg("用户名或密码不存在");
        }
        return result;
    }
}

package com.zhiyunyu.ar.LoginRegister.Repository;

import com.zhiyunyu.ar.LoginRegister.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    public User findByUserName(String username);
}

package com.btpns.training.latihan3.service;

import com.btpns.training.latihan3.entity.UserEntity;

import java.util.List;

public interface UserService {

    public UserEntity findById (int userId);
    public UserEntity findByName (String userName);
    public List<UserEntity> listByRoleId (int listRoleId);

    public void insertUser(UserEntity userEntity);
}

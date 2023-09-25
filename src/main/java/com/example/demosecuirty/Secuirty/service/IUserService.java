package com.example.demosecuirty.Secuirty.service;


import com.example.demosecuirty.Secuirty.model.User;

import java.util.List;

public interface IUserService extends ICrudService<User,Long>{
    List<User> findByName(String name);
}

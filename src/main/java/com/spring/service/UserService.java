package com.spring.service;

import com.spring.model.Users;

import java.util.List;

public interface UserService {
    List<Users> getAllUsers();
    Users getUserById(Long id);
    Users saveUser(Users users);
    void deleteUser(Long id);
}

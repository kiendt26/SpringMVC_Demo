package com.spring.service;

import com.spring.entities.Users;

import java.util.List;

public interface UserService {
    List<Users> getAllUsers();
    Users getUserById(Long id);
    Users saveUser(Users users);
    void deleteUser(Long id);
}

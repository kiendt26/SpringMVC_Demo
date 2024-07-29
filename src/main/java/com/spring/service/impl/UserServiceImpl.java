package com.spring.service.impl;

import com.spring.dao.UsersDAO;
import com.spring.model.Users;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UsersDAO userDAO;
    @Autowired
    public UserServiceImpl(UsersDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<Users> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public Users getUserById(Long id) {
        return userDAO.findById(id).orElse(null);
    }

    @Override
    public Users saveUser(Users users) {
        return userDAO.save(users);
    }

    @Override
    public void deleteUser(Long id) {
        userDAO.deleteById(id);
    }
}

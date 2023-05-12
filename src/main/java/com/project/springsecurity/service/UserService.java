package com.project.springsecurity.service;

import com.project.springsecurity.entity.User;
import com.project.springsecurity.model.UserModel;
import com.project.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserModel createUser(UserModel userModel){
        return userModel.disassemble(userRepository.save(userModel.assemble()));
    }
    public List<UserModel> getUsers(){
        List<User> userList=userRepository.findAll();
        List<UserModel> userModelList=new ArrayList<>();
        for (User user:userList){
            userModelList.add(new UserModel().disassemble(user));
        }
        return userModelList;
    }
}

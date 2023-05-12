package com.project.springsecurity.model;

import com.project.springsecurity.entity.User;
import lombok.Data;

@Data
public class UserModel {
    private String firstName;
    private String lastName;
    private Integer mobileNumber;
    private String email;
    private String password;

    public User assemble() {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setMobileNumber(mobileNumber);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

    public UserModel disassemble(User user) {
        UserModel userModel = new UserModel();
        userModel.setFirstName(user.getFirstName());
        userModel.setLastName(user.getLastName());
        userModel.setMobileNumber(user.getMobileNumber());
        userModel.setEmail(user.getEmail());
        userModel.setPassword(user.getPassword());
        return userModel;
    }
}

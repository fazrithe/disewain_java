package com.sewa.disewain.service;

import com.sewa.disewain.common.ResponseUtil;
import com.sewa.disewain.constan.MessageConstant;
import com.sewa.disewain.form.UserForm;
import com.sewa.disewain.model.UserModel;
import com.sewa.disewain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserSvcImpl implements UserSvc {
    private final UserRepository userRepo;

    @Autowired
    public UserSvcImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    private UserModel user(UserForm form) {
        UserModel user = new UserModel();
        user.setUsernmae(form.getUsername());
        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());
        user.setPassword(form.getPassword());
        return user;
    }

    @Override
    public ResponseEntity<Object> create(UserForm form) {
        try {
            UserModel user = user(form);
            userRepo.save(user);
            return ResponseUtil.build(MessageConstant.SUCCESS, user, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseUtil.build(e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

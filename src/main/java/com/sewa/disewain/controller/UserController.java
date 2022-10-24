package com.sewa.disewain.controller;


import com.sewa.disewain.form.UserForm;
import com.sewa.disewain.service.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private final UserSvc userSvc;

    @Autowired
    public UserController(UserSvc userSvc) {

        this.userSvc = userSvc;
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody UserForm form) {

        return userSvc.create(form);
    }
}

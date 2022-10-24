package com.sewa.disewain.service;


import com.sewa.disewain.form.UserForm;
import org.springframework.http.ResponseEntity;

public interface UserSvc {

    ResponseEntity<Object> create(UserForm form);

}

package com.example.shose.server.controller;

import com.example.shose.server.service.AccountService;
import com.example.shose.server.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nguyễn Vinh
 */
@RestController
@RequestMapping("/account")
public class AccountRestController {

    @Autowired
    private AccountService accountService;

    @GetMapping()
    public ResponseObject getList() {
        return new ResponseObject(accountService.findAll());
    }
}

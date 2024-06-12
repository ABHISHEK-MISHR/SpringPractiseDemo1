package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userCare")
public class UserController {
    @GetMapping
    public ResponseEntity<String> getUser(@RequestParam String a, @RequestParam String b) {
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        if(sum <= 100){
            return ResponseEntity.status(HttpStatus.OK).body("respons is "+sum);
        }
        else{
            return ResponseEntity.status(HttpStatus.CONFLICT).body("sum is not greater than 100");
        }
    }
}

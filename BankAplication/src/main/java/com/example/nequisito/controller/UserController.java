package com.example.nequisito.controller;

import com.example.nequisito.model.User;
import com.example.nequisito.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserServiceImpl userServiceImpl;


    @GetMapping("/name")
    public User findUserByName(@RequestParam String nombres){
        return userServiceImpl.findUserByName(nombres);
    }

//    @GetMapping("/name/{name-pre}")
//    public User findUserByName(@PathVariable("name-pre") String nombres){
//        return userService.findUserByName(nombres);
//    }

//    @PostMapping
//    @PutMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public User saveUser(@RequestBody UserDto user){
//        return userService.findUserByName(user.getUserName());
//    }

//    @DeleteMapping
//    public void deleteUser(@RequestBody UserDto user){

    }

//    @GetMapping
//    public HttpEntity<User> findUserByName(String name){
//        return new HttpEntity(userService.findUserByName(name), HttpStatus);
//    }


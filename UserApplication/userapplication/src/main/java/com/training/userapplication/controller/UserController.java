package com.training.userapplication.controller;

import com.training.userapplication.entities.User;
import com.training.userapplication.exception.UserNotFoundException;
import com.training.userapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/adduser")
    public User saveUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getuser")
    public List<User> getallUsers() {
        List<User> list = userService.getallUser();
        if (list.size() == 0) {
            throw new UserNotFoundException();
        }
        return list;
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable long id) {

        return userService.getUserById(id);
    }

    @GetMapping("/userbyname/{Name}")
    public User findUserByName(@PathVariable String firstName) {
        return userService.getUserByfirstName(firstName);
    }

//    @PutMapping("/updateuser/{id}")
//    public User updateUser(@RequestBody User userobj, @PathVariable long id) {
//        //User newuser = userService.getUserById(id);
//        return userService.modifyUser(userobj, id);
//
//    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);

    }
}

package com.NITKKR.gagandeepKaur.SpringBootBackendService.controller;

import com.NITKKR.gagandeepKaur.SpringBootBackendService.model.User;
import com.NITKKR.gagandeepKaur.SpringBootBackendService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }
    @RequestMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }
    @RequestMapping(method=RequestMethod.POST ,value="/users")
     public void createUser(@RequestBody User u1 )
    {
        userService.addUser(u1);
    }
    @RequestMapping(method=RequestMethod.PUT ,value="/users/{id}")
    public void UpdateUser(@PathVariable Long id,@RequestBody User u1)
    {

        userService.updateUser(id,u1);
    }
    @RequestMapping(method=RequestMethod.DELETE ,value="/users/{id}")
    public void DeleteUser(@PathVariable Long id )
    {
        userService.deleteUser(id);
    }
}

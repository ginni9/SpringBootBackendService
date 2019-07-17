package com.NITKKR.gagandeepKaur.SpringBootBackendService.service;

import com.NITKKR.gagandeepKaur.SpringBootBackendService.model.User;
import com.NITKKR.gagandeepKaur.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAllUsers()
    {
        List<User> users=new ArrayList<User>();
        userRepository.findAll().forEach(users::add);
                return users;
    }
    public void addUser(User user)
    {
        userRepository.save(user);
    }
    public User findUserById(Long id)
    {
        return userRepository.getOne(id);
    }
    public void updateUser(Long id,User user)
    {
        userRepository.save(user);
    }
    public void deleteUser(Long id)
    {
        userRepository.deleteById(id);
    }

}

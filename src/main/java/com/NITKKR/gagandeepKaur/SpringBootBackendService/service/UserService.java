package com.NITKKR.gagandeepKaur.SpringBootBackendService.service;

import com.NITKKR.gagandeepKaur.SpringBootBackendService.model.User;
import com.NITKKR.gagandeepKaur.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<User> findUserById(Long id)
    {
        return userRepository.findById(id);
    }
    public boolean updateUser(Long id,User user)
    {
        if(userRepository.existsById(id)) {
            userRepository.save(user);
            return true;
        }
        else
            return false;
    }
    public boolean deleteUser(Long id)
    {
        if(userRepository.existsById(id))
        {
            userRepository.deleteById(id);
            return true;
        }
        else
            return false;

    }

}

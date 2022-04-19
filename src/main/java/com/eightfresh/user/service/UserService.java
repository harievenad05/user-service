package com.eightfresh.user.service;

import com.eightfresh.user.entity.User;
import com.eightfresh.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}

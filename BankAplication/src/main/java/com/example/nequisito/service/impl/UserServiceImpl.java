package com.example.nequisito.service.impl;

import com.example.nequisito.model.User;
import com.example.nequisito.repository.UserRepository;
import com.example.nequisito.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User findUserByName(String nombres) {
        return userRepository.findUserByNombres(nombres)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
    }
}

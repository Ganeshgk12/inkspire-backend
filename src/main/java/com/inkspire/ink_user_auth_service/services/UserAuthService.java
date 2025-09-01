package com.inkspire.ink_user_auth_service.services;

import com.inkspire.ink_user_auth_service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService {

    @Autowired
    private UserRepository userRepository;
}

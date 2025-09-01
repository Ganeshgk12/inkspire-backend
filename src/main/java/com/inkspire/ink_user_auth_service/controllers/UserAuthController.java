package com.inkspire.ink_user_auth_service.controllers;

import com.inkspire.ink_user_auth_service.services.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inkspire-auth")
public class UserAuthController {
    @Autowired
    private UserAuthService userAuthService;
}

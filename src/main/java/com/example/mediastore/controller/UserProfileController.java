package com.example.mediastore.controller;

import com.example.mediastore.model.UserProfile;
import com.example.mediastore.service.UserProfileService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/userprofile")
@CrossOrigin(origins = "http://localhost:3000")
public class UserProfileController {
    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }



}

package com.example.mediastore.service;

import com.example.mediastore.model.UserProfile;
import com.example.mediastore.repository.MockUserProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {
    private final MockUserProfileRepository mockUserProfileRepository;

    public UserProfileService(MockUserProfileRepository mockUserProfileRepository) {
        this.mockUserProfileRepository = mockUserProfileRepository;
    }

    public List<UserProfile> getUserProfiles() {
        return mockUserProfileRepository.getUserProfiles();
    }

    public void uploadUserProfileImage(UUID id, MultipartFile file) {

    }
}

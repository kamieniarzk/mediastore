package com.example.mediastore.repository;

import com.example.mediastore.model.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class MockUserProfileRepository {
    private static final List<UserProfile> userProfiles = new ArrayList<>();

    static {
        userProfiles.add(new UserProfile(UUID.randomUUID(), "michaelscott", null));
        userProfiles.add(new UserProfile(UUID.randomUUID(), "dwightschrute", null));
        userProfiles.add(new UserProfile(UUID.randomUUID(), "kevinmalone", null));
    }

    public List<UserProfile> getUserProfiles() {
        return userProfiles;
    }
}

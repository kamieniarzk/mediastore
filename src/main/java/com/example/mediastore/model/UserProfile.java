package com.example.mediastore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;


@AllArgsConstructor
public class UserProfile {
    @Getter
    private final UUID id;

    @Getter
    @Setter
    private String username;

    private Optional<String> imgUrl;

    public Optional<String> getImgUrl() {
        return imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return id.equals(that.id) &&
                username.equals(that.username) &&
                Objects.equals(imgUrl, that.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, imgUrl);
    }
}

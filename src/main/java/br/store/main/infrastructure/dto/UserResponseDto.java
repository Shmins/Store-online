package br.store.main.infrastructure.dto;

import br.store.main.core.domain.UserModel;

import java.time.LocalDateTime;

public record UserResponseDto(
        Long id,
        String name,
        String email,
        String password,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {
    public UserResponseDto(UserModel user){
        this(user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getCreatedAt(), user.getUpdatedAt());
    }
}

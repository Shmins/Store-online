package br.store.main.infrastructure.dto;

public record UserCreateRequestDto(
        String name,
        String email,
        String password
) {
}

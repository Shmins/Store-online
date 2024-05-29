package br.store.main.infrastructure.controller;

import br.store.main.core.domain.UserModel;
import br.store.main.core.domain.enums.UserRole;
import br.store.main.infrastructure.dto.UserCreateRequestDto;
import br.store.main.infrastructure.dto.UserResponseDto;
import br.store.main.usecase.user.UserCreateUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserCreateUseCase userCreateUseCase;

    public UserController(UserCreateUseCase userCreateUseCase) {
        this.userCreateUseCase = userCreateUseCase;
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserCreateRequestDto userRequest){
        UserModel user = new UserModel(userRequest.name(), userRequest.email(), userRequest.password(), UserRole.USER_ROLE);
        var savedUser = userCreateUseCase.createUser(user);
        return ResponseEntity.ok().body(new UserResponseDto(user));
    }
}

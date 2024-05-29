package br.store.main.infrastructure.mapper;

import br.store.main.core.domain.UserModel;
import br.store.main.infrastructure.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserEntity toUserEntity(UserModel user){
        return new UserEntity(user.getName(), user.getEmail(), user.getPassword(), user.getRole(), user.getCreatedAt(), user.getUpdatedAt());
    }
    public UserModel toUserModel(UserEntity user){
        return new UserModel(user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getRole(), user.getCreatedAt(), user.getUpdatedAt());
    }
}

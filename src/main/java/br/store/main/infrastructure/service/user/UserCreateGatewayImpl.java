package br.store.main.infrastructure.service.user;

import br.store.main.application.gateway.user.UserCreateGateway;
import br.store.main.core.domain.UserModel;
import br.store.main.infrastructure.entity.UserEntity;
import br.store.main.infrastructure.mapper.UserMapper;
import br.store.main.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserCreateGatewayImpl implements UserCreateGateway {
    @Autowired
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public UserModel createUser(UserModel user) {
        UserEntity savedUser = userRepository.save(userMapper.toUserEntity(user));
        return userMapper.toUserModel(savedUser);
    }
}

package br.store.main.infrastructure.service.user;

import br.store.main.application.gateway.user.UserFindByIdGateway;
import br.store.main.core.domain.UserModel;
import br.store.main.infrastructure.mapper.UserMapper;
import br.store.main.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserFindByIdGatewayImpl implements UserFindByIdGateway {
    @Autowired
    private UserRepository userRepository;
    private UserMapper userMapper;
    
    @Override
    public UserModel findById(Long id) {
        var userFind = userRepository.findById(id);
        return userFind.map(user -> userMapper.toUserModel(user)).orElse(null);
    }
}

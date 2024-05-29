package br.store.main.infrastructure.service.user;

import br.store.main.application.gateway.user.UserUpdateByIdGateway;
import br.store.main.core.domain.UserModel;
import br.store.main.infrastructure.entity.UserEntity;
import br.store.main.infrastructure.mapper.UserMapper;
import br.store.main.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserUpdateByIdGatewayImpl implements UserUpdateByIdGateway {
    @Autowired
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public UserModel updateById(Long id, UserModel user) {
        Optional<UserEntity> userFind = userRepository.findById(id);

        if(userFind.isPresent() && userFind.get().getId().equals(user.getId())){
            userFind.get().setName(user.getName());
            userFind.get().setEmail(user.getEmail());
            userFind.get().setPassword(user.getPassword());
            userFind.get().setRole(user.getRole());
            userFind.get().setUpdatedAt(LocalDateTime.now());

            return userMapper.toUserModel(userRepository.save(userFind.get()));
        }
        else{
            return userMapper.toUserModel(userRepository.save(userMapper.toUserEntity(user)));
        }
    }
}

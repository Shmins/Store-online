package br.store.main.infrastructure.service.user;

import br.store.main.application.gateway.user.UserDeleteByIdGateway;
import br.store.main.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDeleteByIdGatewayImpl implements UserDeleteByIdGateway {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}

package br.store.main.application.gateway.user;

import br.store.main.core.domain.UserModel;

public interface UserUpdateByIdGateway {
    UserModel updateById(Long id, UserModel user);
}

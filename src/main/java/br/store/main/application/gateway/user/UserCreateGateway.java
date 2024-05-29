package br.store.main.application.gateway.user;

import br.store.main.core.domain.UserModel;

public interface UserCreateGateway {
    UserModel createUser(UserModel user);
}

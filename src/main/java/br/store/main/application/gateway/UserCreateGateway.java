package br.store.main.application.gateway;

import br.store.main.core.domain.UserModel;

public interface UserCreateGateway {
    UserModel createUser(UserModel user);
}

package br.store.main.application.gateway.user;

import br.store.main.core.domain.UserModel;

public interface UserFindByIdGateway {
    UserModel findById(Long id);
}

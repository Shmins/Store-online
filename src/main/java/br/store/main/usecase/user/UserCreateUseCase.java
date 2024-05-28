package br.store.main.usecase.user;

import br.store.main.core.domain.UserModel;

public interface UserCreateUseCase {
    UserModel createUser(UserModel user);
}

package br.store.main.usecase.user;

import br.store.main.core.domain.UserModel;

public interface UserFindByIdUseCase {
    UserModel findById(UserModel user);
}

package br.store.main.usecase.user;

import br.store.main.core.domain.UserModel;

public interface UserUpdateByIdUseCase {
    UserModel updateById(Long id, UserModel user);
}

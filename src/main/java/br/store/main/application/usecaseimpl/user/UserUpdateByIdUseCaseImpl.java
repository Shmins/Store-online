package br.store.main.application.usecaseimpl.user;

import br.store.main.application.gateway.user.UserUpdateByIdGateway;
import br.store.main.core.domain.UserModel;
import br.store.main.usecase.user.UserUpdateByIdUseCase;

public class UserUpdateByIdUseCaseImpl implements UserUpdateByIdUseCase {
    private final UserUpdateByIdGateway userUpdateByIdGateway;

    public UserUpdateByIdUseCaseImpl(UserUpdateByIdGateway userUpdateByIdGateway) {
        this.userUpdateByIdGateway = userUpdateByIdGateway;
    }

    @Override
    public UserModel updateById(Long id, UserModel user) {
        return userUpdateByIdGateway.updateById(id, user);
    }
}

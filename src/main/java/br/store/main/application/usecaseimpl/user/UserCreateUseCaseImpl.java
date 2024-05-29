package br.store.main.application.usecaseimpl.user;

import br.store.main.application.gateway.user.UserCreateGateway;
import br.store.main.core.domain.UserModel;
import br.store.main.usecase.user.UserCreateUseCase;

public class UserCreateUseCaseImpl implements UserCreateUseCase {
    private final UserCreateGateway userCreateGateway;

    public UserCreateUseCaseImpl(UserCreateGateway userCreateGateway) {
        this.userCreateGateway = userCreateGateway;
    }

    @Override
    public UserModel createUser(UserModel user) {
        return userCreateGateway.createUser(user);
    }
}

package br.store.main.application.usecaseimpl;

import br.store.main.application.gateway.UserCreateGateway;
import br.store.main.core.domain.UserModel;
import br.store.main.usecase.user.UserCreateUseCase;

public class UserCreateUseCaseImpl implements UserCreateUseCase {
    private UserCreateGateway userCreateGateway;

    public UserCreateUseCaseImpl(UserCreateGateway userCreateGateway) {
        this.userCreateGateway = userCreateGateway;
    }

    @Override
    public UserModel createUser(UserModel user) {
        return userCreateGateway.createUser(user);
    }
}

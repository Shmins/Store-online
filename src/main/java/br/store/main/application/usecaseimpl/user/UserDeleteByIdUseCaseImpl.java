package br.store.main.application.usecaseimpl.user;

import br.store.main.application.gateway.user.UserDeleteByIdGateway;
import br.store.main.usecase.user.UserDeleteByIdUseCase;

public class UserDeleteByIdUseCaseImpl implements UserDeleteByIdUseCase {
    private final UserDeleteByIdGateway userDeleteByIdGateway;

    public UserDeleteByIdUseCaseImpl(UserDeleteByIdGateway userDeleteByIdGateway) {
        this.userDeleteByIdGateway = userDeleteByIdGateway;
    }

    @Override
    public void deleteById(Long id) {
        userDeleteByIdGateway.deleteById(id);
    }
}

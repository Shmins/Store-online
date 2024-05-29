package br.store.main.application.usecaseimpl.user;
import br.store.main.application.gateway.user.UserFindByIdGateway;
import br.store.main.core.domain.UserModel;
import br.store.main.usecase.user.UserFindByIdUseCase;

public class UserFindByIdUseCaseImpl implements UserFindByIdUseCase {
    private final UserFindByIdGateway userFindByIdGateway;

    public UserFindByIdUseCaseImpl(UserFindByIdGateway userFindByIdGateway) {
        this.userFindByIdGateway = userFindByIdGateway;
    }

    @Override
    public UserModel findById(Long id) {
        return userFindByIdGateway.findById(id);
    }
}

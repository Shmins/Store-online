package br.store.main.application.usecaseimpl.item;

import br.store.main.application.gateway.item.ItemDeleteByIdGateway;
import br.store.main.usecase.item.ItemDeleteByIdUseCase;

public class ItemDeleteByIdUseCaseImpl implements ItemDeleteByIdUseCase {
    private final ItemDeleteByIdGateway itemDeleteByIdGateway;

    public ItemDeleteByIdUseCaseImpl(ItemDeleteByIdGateway itemDeleteByIdGateway) {
        this.itemDeleteByIdGateway = itemDeleteByIdGateway;
    }

    @Override
    public void deleteById(Long id) {
        itemDeleteByIdGateway.deleteById(id);
    }
}

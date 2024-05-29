package br.store.main.application.usecaseimpl.item;

import br.store.main.application.gateway.item.ItemFindByIdGateway;
import br.store.main.core.domain.ItemModel;
import br.store.main.usecase.item.ItemFindByIdUseCase;

public class ItemFindByIdUseCaseImpl implements ItemFindByIdUseCase {
    private final ItemFindByIdGateway itemFindByIdGateway;

    public ItemFindByIdUseCaseImpl(ItemFindByIdGateway itemFindByIdGateway) {
        this.itemFindByIdGateway = itemFindByIdGateway;
    }

    @Override
    public ItemModel findById(Long id) {
        return itemFindByIdGateway.findById(id);
    }
}

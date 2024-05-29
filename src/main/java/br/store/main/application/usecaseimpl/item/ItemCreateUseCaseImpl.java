package br.store.main.application.usecaseimpl.item;

import br.store.main.application.gateway.item.ItemCreateGateway;
import br.store.main.core.domain.ItemModel;
import br.store.main.usecase.item.ItemCreateUseCase;

public class ItemCreateUseCaseImpl implements ItemCreateUseCase {
    private final ItemCreateGateway itemCreateGateway;

    public ItemCreateUseCaseImpl(ItemCreateGateway itemCreateGateway) {
        this.itemCreateGateway = itemCreateGateway;
    }

    @Override
    public ItemModel createItem(ItemModel item) {
        return itemCreateGateway.createItem(item);
    }
}

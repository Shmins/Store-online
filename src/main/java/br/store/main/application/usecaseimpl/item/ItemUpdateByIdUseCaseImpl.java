package br.store.main.application.usecaseimpl.item;

import br.store.main.application.gateway.item.ItemUpdateByIdGateway;
import br.store.main.core.domain.ItemModel;
import br.store.main.usecase.item.ItemUpdateByIdUseCase;

public class ItemUpdateByIdUseCaseImpl implements ItemUpdateByIdUseCase {
    private final ItemUpdateByIdGateway itemUpdateByIdGateway;

    public ItemUpdateByIdUseCaseImpl(ItemUpdateByIdGateway itemUpdateByIdGateway) {
        this.itemUpdateByIdGateway = itemUpdateByIdGateway;
    }

    @Override
    public ItemModel updateById(Long id, ItemModel item) {
        return itemUpdateByIdGateway.updateById(id, item);
    }
}

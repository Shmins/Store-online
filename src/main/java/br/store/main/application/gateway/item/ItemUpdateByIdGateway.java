package br.store.main.application.gateway.item;

import br.store.main.core.domain.ItemModel;

public interface ItemUpdateByIdGateway {
    ItemModel updateById(Long id, ItemModel item);
}

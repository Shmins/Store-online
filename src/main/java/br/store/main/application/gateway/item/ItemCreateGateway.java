package br.store.main.application.gateway.item;

import br.store.main.core.domain.ItemModel;

public interface ItemCreateGateway {
    ItemModel createItem(ItemModel itemModel);
}

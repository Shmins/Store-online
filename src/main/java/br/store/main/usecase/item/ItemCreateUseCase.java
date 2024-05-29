package br.store.main.usecase.item;

import br.store.main.core.domain.ItemModel;

public interface ItemCreateUseCase {
    ItemModel createItem(ItemModel item);
}

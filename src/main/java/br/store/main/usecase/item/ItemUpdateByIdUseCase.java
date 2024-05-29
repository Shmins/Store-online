package br.store.main.usecase.item;

import br.store.main.core.domain.ItemModel;

public interface ItemUpdateByIdUseCase {
    ItemModel updateById(Long id, ItemModel item);
}

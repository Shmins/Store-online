package br.store.main.usecase.item;

import br.store.main.core.domain.ItemModel;

public interface ItemFindByIdUseCase {
    ItemModel findById(Long id);
}

package br.store.main.infrastructure.mapper;

import br.store.main.core.domain.ItemModel;
import br.store.main.infrastructure.entity.ItemEntity;

public class ItemMapper {
    public ItemEntity toItemEntity(ItemModel item){
        return new ItemEntity(item.getName(), item.getCategory(), item.getQuantity(), item.getCreatedAt(), item.getUpdatedAt());
    }
    public ItemModel toItemModel(ItemEntity item){
        return new ItemModel(item.getId(), item.getName(), item.getCategory(), item.getQuantity(), item.getCreatedAt(), item.getUpdatedAt());
    }
}

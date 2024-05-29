package br.store.main.infrastructure.service.item;

import br.store.main.application.gateway.item.ItemCreateGateway;
import br.store.main.core.domain.ItemModel;
import br.store.main.infrastructure.mapper.ItemMapper;
import br.store.main.infrastructure.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemCreateGatewayImpl implements ItemCreateGateway {
    @Autowired
    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Override
    public ItemModel createItem(ItemModel itemModel) {
        var savedItem = itemRepository.save(itemMapper.toItemEntity(itemModel));
        return itemMapper.toItemModel(savedItem);
    }
}

package br.store.main.infrastructure.service.item;

import br.store.main.application.gateway.item.ItemFindByIdGateway;
import br.store.main.core.domain.ItemModel;
import br.store.main.infrastructure.mapper.ItemMapper;
import br.store.main.infrastructure.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemFindByIdGatewayImpl implements ItemFindByIdGateway {
    @Autowired
    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Override
    public ItemModel findById(Long id) {
        var itemFind = itemRepository.findById(id);
        return itemFind.map(itemEntity -> itemMapper.toItemModel(itemEntity)).orElse(null);
    }
}

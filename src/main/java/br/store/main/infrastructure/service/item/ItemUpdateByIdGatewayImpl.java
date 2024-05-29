package br.store.main.infrastructure.service.item;

import br.store.main.application.gateway.item.ItemUpdateByIdGateway;
import br.store.main.core.domain.ItemModel;
import br.store.main.infrastructure.mapper.ItemMapper;
import br.store.main.infrastructure.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class ItemUpdateByIdGatewayImpl implements ItemUpdateByIdGateway {
    @Autowired
    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Override
    public ItemModel updateById(Long id, ItemModel item) {
        var itemFind = itemRepository.findById(id);
        if(itemFind.isPresent() && itemFind.get().getId().equals(item.getId())){
            itemFind.get().setName(item.getName());
            itemFind.get().setCategory(item.getCategory());
            itemFind.get().setQuantity(item.getQuantity());;
            itemFind.get().setUpdatedAt(LocalDateTime.now());

            return itemMapper.toItemModel(itemRepository.save(itemFind.get()));
        }
        else{
            return itemMapper.toItemModel(itemRepository.save(itemMapper.toItemEntity(item)));
        }
    }
}

package br.store.main.infrastructure.service.item;

import br.store.main.application.gateway.item.ItemDeleteByIdGateway;
import br.store.main.infrastructure.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemDeleteByIdGatewayImpl implements ItemDeleteByIdGateway {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}

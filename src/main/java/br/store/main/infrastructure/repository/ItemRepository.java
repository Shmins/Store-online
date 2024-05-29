package br.store.main.infrastructure.repository;

import br.store.main.infrastructure.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
}

package br.store.main.core.domain;

import br.store.main.core.domain.enums.CategoryItem;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ItemModel {
    private Long id;
    private String name;
    private CategoryItem category;
    private int quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

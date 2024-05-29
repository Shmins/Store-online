package br.store.main.core.domain;

import br.store.main.core.domain.enums.CategoryItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemModel {
    private Long id;
    private String name;
    private CategoryItem category;
    private int quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

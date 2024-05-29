package br.store.main.infrastructure.entity;

import br.store.main.core.domain.enums.CategoryItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "itens")
@AllArgsConstructor
@NoArgsConstructor
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;
    @Column(name = "item_name")
    private String name;
    @Column(name = "item_categoria")
    private CategoryItem category;
    @Column(name = "item_quantidade")
    private int quantity;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updateAt")
    private LocalDateTime updatedAt;

    public ItemEntity(String name, CategoryItem category, int quantity, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}

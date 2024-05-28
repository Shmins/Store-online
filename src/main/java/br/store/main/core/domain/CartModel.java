package br.store.main.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartModel {
    private UserModel userModel;
    private ItemModel itemModel;
    private int quantity;
}

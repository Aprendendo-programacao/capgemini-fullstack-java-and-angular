package me.gabreuw.shoppingcart.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
@NoArgsConstructor
@Data
public class Cart {

    @Id
    private Integer id;

    private List<Item> items;

    public Cart(Integer id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items != null ?
                items :
                new ArrayList<>();
    }
}

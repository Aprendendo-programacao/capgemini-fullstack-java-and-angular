package me.gabreuw.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {

    private Integer productId;

    private Integer amount;

}

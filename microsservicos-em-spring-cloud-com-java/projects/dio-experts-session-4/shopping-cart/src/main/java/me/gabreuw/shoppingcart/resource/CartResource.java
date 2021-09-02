package me.gabreuw.shoppingcart.resource;

import lombok.RequiredArgsConstructor;
import me.gabreuw.shoppingcart.model.Cart;
import me.gabreuw.shoppingcart.model.Item;
import me.gabreuw.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/cart")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CartResource {

    private final CartRepository cartRepository;

    @PostMapping(path = "/{id}")
    public Cart addItem(
            @PathVariable Integer id,
            @RequestBody Item item
    ) {
        Cart cart = cartRepository
                .findById(id)
                .orElse(new Cart(id));

        cart.getItems().add(item);

        return cartRepository.save(cart);
    }

    @GetMapping(path = "/{id}")
    public Optional<Cart> findById(@PathVariable Integer id) {
        return cartRepository.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void clear(@PathVariable Integer id) {
        cartRepository.deleteById(id);
    }

}

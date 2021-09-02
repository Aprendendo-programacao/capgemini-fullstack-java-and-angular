package me.gabreuw.productcatalog.resource;

import lombok.RequiredArgsConstructor;
import me.gabreuw.productcatalog.model.Product;
import me.gabreuw.productcatalog.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/products")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductResource {

    private final ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return productRepository.findById(id);
    }

}

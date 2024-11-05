package com.platzi.platzi_market.web.controller;

import com.platzi.platzi_market.domain.Product;
import com.platzi.platzi_market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProduct(int productId){
        System.out.println("Valor recibido en cyId: " + productId);
        return productService.getProduct(productId);
    }

    @GetMapping("/category/{categoryId}")
    public Optional<List<Product>> getByCategory(int categoryId){
        return productService.getByCategory(categoryId);
    }

    @PostMapping("/save")
    public Product save(Product product){
        return productService.save(product);
    }

//    @PutMapping("/{id}")
//    public void update (@PathVariable("id") long productId, @RequestBody Product product){
//        productService.update(productId, product);
//    }


    public boolean delete(int productId){
        return productService.delete(productId);
    }

}

package nl.inholland.exam.coffee.zarminaabbas.controller;

import nl.inholland.exam.coffee.zarminaabbas.model.DTO.ProductsDTO;
import nl.inholland.exam.coffee.zarminaabbas.model.Product;
import nl.inholland.exam.coffee.zarminaabbas.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{

    @Autowired
    private ProductServiceImpl productService;


    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.status(200).body(productService.getAll());
    }

    @PostMapping(value = "/products")
    public ResponseEntity<Product> edit(@PathVariable long id, @RequestBody ProductsDTO productDTO)
    {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        return ResponseEntity.status(201).body(productService.edit(product, id));
    }



    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> getTotal(){
        return ResponseEntity.status(200).body(productService.getAll());
    }


//    @PutMapping(value = "/{id}")
//    public ResponseEntity<Product> updateProduct(@RequestBody Product productUpdate){
//        return  ResponseEntity.status(202).body(productService.updateProduct(productUpdate));
//    }

}

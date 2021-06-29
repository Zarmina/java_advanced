package nl.inholland.exam.coffee.zarminaabbas.service;

import nl.inholland.exam.coffee.zarminaabbas.model.Product;

import java.util.List;

public interface ProductService
{
    List<Product> getAll();
    Product create(Product product);
    Product getById(long id);
}

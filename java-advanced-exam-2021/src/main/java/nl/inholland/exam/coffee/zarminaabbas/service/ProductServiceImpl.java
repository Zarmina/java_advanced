package nl.inholland.exam.coffee.zarminaabbas.service;

import nl.inholland.exam.coffee.zarminaabbas.model.Brand;
import nl.inholland.exam.coffee.zarminaabbas.model.Product;
import nl.inholland.exam.coffee.zarminaabbas.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll()
    {
        return (List<Product>) productRepository.findAll();
    }

    public Product create(Product product){
        productRepository.save(product);
        return product;
    }

    public Product getById(long id){
        return productRepository.findById(id);
    }
    public Product edit(Product product, long id)
    {
        Product p = productRepository.findById(id);
        p.setId(product.getId());
        p.setStock(product.getStock());
        p.setPrice(product.getPrice());
        productRepository.save(p);
        return p;
    }


}

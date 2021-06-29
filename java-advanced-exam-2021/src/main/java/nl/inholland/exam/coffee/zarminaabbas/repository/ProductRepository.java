package nl.inholland.exam.coffee.zarminaabbas.repository;

import nl.inholland.exam.coffee.zarminaabbas.model.Brand;
import nl.inholland.exam.coffee.zarminaabbas.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>
{
    Product findById(long id);
}

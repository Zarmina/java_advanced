package nl.inholland.exam.coffee.zarminaabbas.repository;

import nl.inholland.exam.coffee.zarminaabbas.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BrandRepository extends CrudRepository<Brand, Long>
{
}

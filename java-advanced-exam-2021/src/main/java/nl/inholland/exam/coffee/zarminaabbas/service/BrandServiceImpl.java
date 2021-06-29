package nl.inholland.exam.coffee.zarminaabbas.service;

import nl.inholland.exam.coffee.zarminaabbas.model.Brand;
import nl.inholland.exam.coffee.zarminaabbas.model.DTO.BrandDTO;
import nl.inholland.exam.coffee.zarminaabbas.model.Product;
import nl.inholland.exam.coffee.zarminaabbas.repository.BrandRepository;
import nl.inholland.exam.coffee.zarminaabbas.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService
{
    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> getAll()
    {
        return (List<Brand>) brandRepository.findAll();
    }

    public Brand create(Brand brand){
        Brand b = new Brand();
        b.setName(brand.getName());
        brandRepository.save(b);
        return b;
    }
}

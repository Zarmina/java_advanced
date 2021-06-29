package nl.inholland.exam.coffee.zarminaabbas.service;

import nl.inholland.exam.coffee.zarminaabbas.model.Brand;
import nl.inholland.exam.coffee.zarminaabbas.model.DTO.BrandDTO;

import java.util.List;

public interface BrandService
{
    List<Brand> getAll();
    Brand create(Brand brand);
}

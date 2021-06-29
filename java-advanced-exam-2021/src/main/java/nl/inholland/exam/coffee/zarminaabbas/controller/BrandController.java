package nl.inholland.exam.coffee.zarminaabbas.controller;

import nl.inholland.exam.coffee.zarminaabbas.model.Brand;
import nl.inholland.exam.coffee.zarminaabbas.model.DTO.BrandDTO;
import nl.inholland.exam.coffee.zarminaabbas.service.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BrandController
{
    @Autowired
    private BrandServiceImpl brandService;


    @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Brand>> getAll(@RequestBody BrandDTO brandDto){

        return ResponseEntity.status(200).body(brandService.getAll());
    }





    @PostMapping(value = "/products")
    public ResponseEntity<Brand> create(@RequestBody BrandDTO brandDto){

        Brand brand = new Brand();
        brand.setName(brandDto.getName());
        return ResponseEntity.status(200).body(brandService.create(brand));
    }

}

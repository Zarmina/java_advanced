package nl.inholland.exam.coffee.zarminaabbas.model.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor

public class ProductsDTO
{
    private Long id;
    private long stock;
    private double price;

}

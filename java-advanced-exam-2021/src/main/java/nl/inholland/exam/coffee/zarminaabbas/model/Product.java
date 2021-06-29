package nl.inholland.exam.coffee.zarminaabbas.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
@NoArgsConstructor
public class Product
{
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double price;
    private long stock;


    @JsonBackReference
    @ManyToOne
    private Brand brand;

    public void setStockNumber(long stock){

        if (stock < 0)
        System.out.println("stock number can't be less then zero");
    }

    public void setProductPrice(double price){

        if (price < 0)
            System.out.println("product price can't be less then zero");
    }

}

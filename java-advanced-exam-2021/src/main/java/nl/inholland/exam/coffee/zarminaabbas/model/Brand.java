package nl.inholland.exam.coffee.zarminaabbas.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Brand
{
    @GeneratedValue
    @Id private long id;

    @NotNull
    @Column(unique = true)
    private String name;


    @JsonBackReference
    @OneToMany
    private List<Product> products;
}

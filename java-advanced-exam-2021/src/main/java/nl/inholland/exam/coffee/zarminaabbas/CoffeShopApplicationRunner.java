package nl.inholland.exam.coffee.zarminaabbas;

import nl.inholland.exam.coffee.zarminaabbas.model.Brand;
import nl.inholland.exam.coffee.zarminaabbas.model.Product;
import nl.inholland.exam.coffee.zarminaabbas.service.BrandServiceImpl;
import nl.inholland.exam.coffee.zarminaabbas.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CoffeShopApplicationRunner implements ApplicationRunner
{

    @Autowired
    private ProductServiceImpl productService;

    @Autowired
    private BrandServiceImpl brandService;


    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        Product Intermezzo = new Product();
        Intermezzo.setStock(1285);
        Intermezzo.setPrice(0.9);
        Intermezzo.setName("Insta Coffee");

        Product ItalianoClasico = new Product();
        ItalianoClasico.setStock(100);
        ItalianoClasico.setPrice(2.4);
        ItalianoClasico.setName("Espresso Italiano Clasico");

        Product BaristaPerfetto = new Product();
        BaristaPerfetto.setStock(75);
        BaristaPerfetto.setPrice(2.5);
        BaristaPerfetto.setName("Espresso Barista Perfetto");

        Product CafeVanilla = new Product();
        CafeVanilla.setStock(250);
        CafeVanilla.setPrice(1.12);
        CafeVanilla.setName("Cold Cafe Vanilla");

        Product BlackCoffee = new Product();
        BlackCoffee.setStock(250);
        BlackCoffee.setPrice(1.12);
        BlackCoffee.setName("Cold Black Coffee");

        Brand BossCoffee = new Brand();
        BossCoffee.setName("Boss Coffee");
        Brand Lavazza = new Brand();
        Lavazza.setName("Lavazza");
        Brand Segafredo = new Brand();
        Segafredo.setName("Segafredo");

        Intermezzo.setBrand(Segafredo);
        ItalianoClasico.setBrand(Lavazza);
        CafeVanilla.setBrand(BossCoffee);
        BaristaPerfetto.setBrand(Lavazza);
        BlackCoffee.setBrand(BossCoffee);

        brandService.create(Lavazza);
        brandService.create(BossCoffee);
        brandService.create(Segafredo);

        productService.create(Intermezzo);
        productService.create(ItalianoClasico);
        productService.create(BaristaPerfetto);
        productService.create(CafeVanilla);
        productService.create(BlackCoffee);








    }
}

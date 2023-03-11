package spring;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductService implements Printing {
    private List<Product> productList;


    public Product findByTitle(String title){
        for (Product product : productList) {
            if(product.getTitle().equals(title)){
                return product;
            }
        }
        return null;
    }
    @PostConstruct
    private void preparation(){
        Product[] products = {
            new Product(1, "Book", 15),
            new Product(2, "Beer", 28.6),
            new Product(3, "Smartphone", 15999.0),
                new Product(4, "Spoon", 12.5)

        };

        productList = Arrays.stream(products).toList();
    }

    @Override
    public void printAll(){
        productList.forEach(System.out::println);
    }



}

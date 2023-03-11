package spring;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Component
public class Cart implements Printing{
    List<Product> cartList;

    @PostConstruct
    private void listInit (){
        this.cartList = new ArrayList<>();
    }


    public void add (Product product){
        cartList.add(product);
    }
    double countSum (){
        return cartList.stream().mapToDouble(o-> o.getCost()).sum();
    }


    @Override
    public void printAll() {
        cartList.stream().forEach(System.out::println);
    }
}

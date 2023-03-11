package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    Cart cart;

    public void doOrder(){
        cart.printAll();
        System.out.println(cart.countSum());

    }
}

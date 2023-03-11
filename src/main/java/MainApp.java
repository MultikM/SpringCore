import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.AppConfig;
import spring.Cart;
import spring.OrderService;
import spring.ProductService;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCont = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = appCont.getBean("cart", Cart.class);
        ProductService ps = appCont.getBean("productService", ProductService.class);
        OrderService os = appCont.getBean("orderService", OrderService.class);
        cart.add(ps.findByTitle("Book"));
        cart.add(ps.findByTitle("Spoon"));
        os.doOrder();

        appCont.close();
    }
}

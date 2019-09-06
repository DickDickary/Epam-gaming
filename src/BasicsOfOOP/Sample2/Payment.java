package BasicsOfOOP.Sample2;

import java.util.HashMap;
import java.util.Map;

public class  Payment {
    public static void main(String[] args) {


        Product product = new Product("Вишня");
        Product product2 = new Product("Груша");
        Product product3 = new Product("Яблоко");
        Product product4 = new Product("Кук");
        BasketController basketController = new BasketController();
        basketController.buy(product);
        basketController.buy(product4);
        basketController.buy(product2);
        basketController.buy(product3);

    }
   static class Product {

        private String name;
        public Product(String name) {
        }

    }
    static class BasketController{
     public Map buy(Product product){
         Map<Product,Double> map = new HashMap<>();
         map.put(product,Math.random()*5);
         return map;
     }

    }

}

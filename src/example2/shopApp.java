package example2;

public class shopApp {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("mleko",3.00));
        cart.add(new Product("mleko",8.00));
        cart.add(new Product("mleko",1.00));

        System.out.println(cart.info());
    }
}

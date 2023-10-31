package Workshop_Day2;

public class Main_Workshop_Day2 {
    public static void main(String[] args) {
        User user1 = new User("Fatih","Ünal");
        User user2 = new User("Mehmet","Ünal");

        Product product1   = new Product("İphone 15",50000);
        Product product2   = new Product("Macbook Pro 13' ", 70000);
        Product product3   = new Product("Macbook Pro 13' Çanta ", 1000);

        Category category1 = new Category("Bilgisayar");
        Category category2 = new Category("Cep Telefonu");
        Category category3 = new Category("Aksesuar");

        Order order = new Order(34325);
        Order order1 = new Order(57868);
    }
}
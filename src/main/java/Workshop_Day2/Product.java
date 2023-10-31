package Workshop_Day2;

public class Product {
    private String productName;
    private int price;

    public Product() {
    }

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

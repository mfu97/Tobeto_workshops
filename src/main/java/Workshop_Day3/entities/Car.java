package Workshop_Day3.entities;

public class Car {
    private String licensePlate;
    private String carBrand;
    private String carModelName;
    private Double price;
    private int stockAmount;

    public Car() {
    }


    public Car(String licensePlate, String carBrand, String carModelName, Double price, int stockAmount) {
        this.licensePlate = licensePlate;
        this.carBrand = carBrand;
        this.carModelName = carModelName;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}

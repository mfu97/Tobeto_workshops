package Workshop_Day3.business;


import Workshop_Day3.entities.Car;

public interface ICarManager {
    public void add (Car car);
    public void update(Car car,String newlicensePlate);
    public void delete (Car car);

}

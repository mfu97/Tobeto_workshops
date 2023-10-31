package org.example.business;


import org.example.entities.Car;

public interface ICarManager {
    public void add (Car car);
    public void update(Car car,String newlicensePlate);
    public void delete (Car car);

}

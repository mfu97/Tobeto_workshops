package org.example.business;

import org.example.dataAccess.JdbcCarDao;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

public class CarManager implements ICarManager{
    private CarDao carDao;

    public CarManager(CarDao CarDao) {

        this.carDao = CarDao;
    }

    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public void update(Car car, String newlicensePlate) {
        String oldLisansPlate=car.getLicensePlate();
        car.setLicensePlate(newlicensePlate);
        System.out.print(oldLisansPlate + " licanse plate " );
        carDao.update(car);
    }

    @Override
    public void delete(Car car) {
        carDao.delete(car);
    }
}

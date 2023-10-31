package Workshop_Day3.dataAccess;

import Workshop_Day3.entities.Car;

public class HibernateCarDao implements CarDao {

    @Override
    public void add(Car car){
        System.out.println("Added "+car.getLicensePlate() +" to Database with using Hibernate...");
    }
    @Override
    public void update(Car car){
        System.out.println("Updated "+car.getLicensePlate()+" to Database with using Hibernate...");
    }

    @Override
    public void delete(Car car){
        System.out.println("Deleted "+car.getLicensePlate()+" to Database with using Hibernate...");
    }

}
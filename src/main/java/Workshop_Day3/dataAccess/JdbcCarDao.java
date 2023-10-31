package Workshop_Day3.dataAccess;

import Workshop_Day3.entities.Car;

public class JdbcCarDao implements CarDao {
    @Override
    public void add(Car car){
        System.out.println("Inserted "+car.getLicensePlate() +"to Database with using JDBC...");
    }
    @Override
    public void update(Car car){
        System.out.println("Updated "+car.getLicensePlate() +"to Database with using JDBC...");
    }

    @Override
    public void delete(Car car){
        System.out.println("Deleted "+car.getLicensePlate() +"to Database with using JDBC...");
    }
}
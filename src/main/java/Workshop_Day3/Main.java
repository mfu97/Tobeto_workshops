package Workshop_Day3;

import Workshop_Day3.business.CarManager;
import Workshop_Day3.dataAccess.HibernateCarDao;
import Workshop_Day3.entities.Car;


public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("34as123", "Chevrolet", "Cruze", 5000.00, 0 );
        Car car2 = new Car("34bjk1903", "Opel", "Corsa", 4000.00, 10 );
        Car car3 = new Car("34mfu1997", "Honda", "Civic", 3000.00, 3 );
        Car car4 = new Car("06bjk1903", "Fiat", "Egea", 2500.00, 5 );

        CarManager carManager = new CarManager(new HibernateCarDao());
        carManager.add(car2);
        carManager.update(car1,"06BJK1645");
        carManager.delete(car2);
    }

}
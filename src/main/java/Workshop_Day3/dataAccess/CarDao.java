package Workshop_Day3.dataAccess;

import Workshop_Day3.entities.Car;

    public interface CarDao {
        void add(Car car);
        void update(Car car);
        void delete(Car car);
    }


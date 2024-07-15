package web.model;

import java.util.Objects;

public class Car {

    private String model;
    private String manufacturer;
    private int year;

    public Car(String model, String manufacturer, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, year);
    }
}

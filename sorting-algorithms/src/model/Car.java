package model;

public class Car implements Comparable<Car>
{
    private String make;
    private String model;
    private double mpg;
    private int miles;


    public Car(String make, String model, double mpg, int miles) {
        this.make = make;
        this.model = model;
        this.mpg = mpg;
        this.miles = miles;
    }

    @Override
    public int compareTo(Car other)
    {
        return make.compareTo(other.make);
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getMpg() {
        return mpg;
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
    public int getMiles() {
        return miles;
    }
    public void setMiles(int miles) {
        this.miles = miles;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mpg=" + mpg +
                ", miles=" + miles +
                '}';
    }
}

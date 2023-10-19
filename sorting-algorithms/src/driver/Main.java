package driver;

import model.Car;
import sorts.Sorts;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Comparable[] cars = {
            new Car("Toyota", "Camry", 30.0, 110000),
            new Car("Tesla", "S", 100.0, 40000),
            new Car("Nissan", "Rogue", 25.0, 150000),
            new Car("Nissan", "Altima", 25.0, 90000),
            new Car("Audi", "A4", 40.0, 5000)
        };

        Sorts.bubbleSort(cars);

        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }
    }
}

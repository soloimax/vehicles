import java.util.Scanner;

public sealed class Vehicle permits Car, Plane, Ship
{
    String Manufacture;
    String Model;
    double MaxSpeed;
    int Year;
    String Country;
    int MaxPassengersQty;

    public String ShowDetails()
    {
        return "Транспортное средство. Модель: " + Model + ", год выпуска: " + Integer.toString(Year) + ", страна производитель: " + Country + ", кол-во пассажиров: " + Integer.toString(MaxPassengersQty);
    }

    public void SetParams()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Модель: ");
        this.Model = input.nextLine();

        System.out.println("Максимальная скорость: ");
        this.MaxSpeed = input.nextDouble();

        System.out.println("Год выпуска: ");
        this.Year = input.nextInt();

        System.out.println("Страна производитель: ");
        this.Country = input.nextLine();
    }
}

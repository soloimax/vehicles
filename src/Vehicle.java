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

        double mSpeed = 0;
        System.out.println("Максимальная скорость: ");
        try
        {
            mSpeed = input.nextDouble();
        }
        catch (Exception e)
        {
            mSpeed = 0;
        }
        this.MaxSpeed = mSpeed;

        System.out.println("Год выпуска: ");
        this.Year = input.nextInt();

        System.out.println("Страна производитель: ");
        this.Country = input.nextLine();
    }
}

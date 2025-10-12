import java.util.Scanner;

public final class Car extends Vehicle
{
    String Engine;
    String Transmission;

    @Override
    public String ShowDetails()
    {
        return "Автомобиль. Модель: " + Model + ", год выпуска: " + Integer.toString(Year) + ", страна производитель: " + Country + ", тип двигателя: " + Engine+ ", трансмиссия: " + Transmission + ", максимальная скорость (км/ч): " + Double.toString(MaxSpeed);
    }

    @Override
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
        try
        {
            this.Year = input.nextInt();
        }
        catch (Exception e)
        {
            this.Year = 1900;
        }

        System.out.println("Страна производитель: ");
        try
        {
            this.Country = input.nextLine();
        }
        catch (Exception e)
        {
            this.Country = "Китай";
        }

        System.out.println("Тип двигателя: ");
        this.Engine = input.nextLine();

        System.out.println("Трансмиссия: ");
        this.Transmission = input.nextLine();
    }
}

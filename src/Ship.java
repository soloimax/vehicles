import java.util.Scanner;

public final class Ship extends Vehicle
{
    double MaxDistance;

    @Override
    public String ShowDetails()
    {
        return "Корабль. Модель: " + Model + ", год выпуска: " + Integer.toString(Year) + ", максимальная дистанция (км): " + MaxDistance  + ", максимальная скорость (км/ч): " + Double.toString(MaxSpeed);
    }

    @Override
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

        System.out.println("Максимальная дистанция: ");
        this.MaxDistance = input.nextDouble();
    }
}

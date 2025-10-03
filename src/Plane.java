import java.util.Scanner;

public final class Plane extends Vehicle
{
    String SerialNr;
    double MaxDistance;
    double Altitude;

    @Override
    public String ShowDetails()
    {
        return "Самолет. Производитель: " + Manufacture + ", модель: " + Model + ", год выпуска: " + Integer.toString(Year) + ", страна производитель: " + Country + ", максимальная дистанция (км): " + MaxDistance + ", максимальная высота полета (м): " + Double.toString(Altitude) + ", максимальная скорость (км/ч): " + Double.toString(MaxSpeed);
    }

    @Override
    public void SetParams()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Производитель: ");
        this.Manufacture = input.nextLine();

        System.out.println("Модель: ");
        this.Model = input.nextLine();

        System.out.println("Максимальная скорость: ");
        this.MaxSpeed = input.nextDouble();

        System.out.println("Год выпуска: ");
        this.Year = input.nextInt();

        System.out.println("Страна производитель: ");
        this.Country = input.nextLine();

        System.out.println("Серийный номер: ");
        this.SerialNr = input.nextLine();

        System.out.println("Максимальная дистанция: ");
        this.MaxDistance = input.nextDouble();
    }
}

import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String x = in.nextLine();

        String[] str = x.split(" ");
        double y = Double.parseDouble(str[0]);
        USD dol = new USD();
        RUB rub = new RUB();
        switch (str[1])
        {
            case "USD":
                System.out.printf(x+" = %.1f UAH", dol.convert(y));
                in.close();
                break;
            case "RUB":
                System.out.printf(x+" = %.1f UAH", rub.convert(y));
                in.close();
                break;
        }
    }
}
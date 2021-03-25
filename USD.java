public class USD implements Convertable
{
    private double value = 27.9;
    public double convert(double value)
    {
        return this.value * value;
    }
}
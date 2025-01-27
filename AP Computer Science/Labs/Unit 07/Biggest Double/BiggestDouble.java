// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/27/18
// Class - 10th
// Lab - Biggest Double

public class BiggestDouble
{
    private double one, two, three, four;

    public BiggestDouble() {
        this(0, 0, 0, 0);
    }

    public BiggestDouble(double a, double b, double c, double d) {
        setDoubles(a, b, c, d);
    }

    public void setDoubles(double a, double b, double c, double d) {
        one = a;
        two = b;
        three = c;
        four = d;
    }

    public double getBiggest() {
        if (one > two && one > three && one > four)
            return one;
        else if (two > one && two > three && two > four)
            return two;
        else if (three > one && three > two && three > four)
            return three;
        else
            return four;
    }

    public String toString() {
        return one + " " + two + " " + three + " " + four;
    }
}

// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/31/18
// Class - 10th
// Lab - Cool Numbers

import static java.lang.System.*;

public class CoolNumbersRunner
{
    public static void main(String[] args) {
        System.out.println(CoolNumbers.countCoolNumbers(250) + " cool numbers between 6 - " + 250);
        //add more test cases
        System.out.println(CoolNumbers.countCoolNumbers(1250) + " cool numbers between 6 - " + 1250);
        System.out.println(CoolNumbers.countCoolNumbers(2250) + " cool numbers between 6 - " + 2250);
        System.out.println(CoolNumbers.countCoolNumbers(5500) + " cool numbers between 6 - " + 5500);
        System.out.println(CoolNumbers.countCoolNumbers(9500) + " cool numbers between 6 - " + 9500);
        System.out.println(CoolNumbers.countCoolNumbers(23500) + " cool numbers between 6 - " + 23500);
        System.out.println(CoolNumbers.countCoolNumbers(32500) + " cool numbers between 6 - " + 32500);
    }
}

package com.bridgelabz;
/**
 * @author Aravind
 * class to find the maximum of different data types using generic method
 */
public class TestMaximum {

    public static void main(String[] args) {

        Integer number1 = 2;
        Integer number2 = 3;
        Integer number3 = 5;
        Float num1 = 2.5f;
        Float num2 = 3.1f;
        Float num3 = 1.19f;
        String name1 = "Apple";
        String name2 = "Peach";
        String name3 = "Banana";
        Integer maxInt = testMax(number1,number2,number3);
        System.out.println("Maximum integer is : "+maxInt);
        Float maxFloat = testMax(num1,num2,num3);
        System.out.println("Maximum float is : "+maxFloat);
        String maxString = testMax(name1,name2,name3);
        System.out.println("Maximum String is : "+maxString);
    }
    /**
     * Method name: testMax
     * description: find the maximum of different data types using generic method
     * Algorithm: comparable<T> is a generic interface.T accepts different data types here.
     * testMax takes three parameter and find max using compareTo. if one number is greater than other one
     * then compareTo gives positive number(1), lesser than other one it gives negative(-1).if they are equal it gives 0.
     * @param x
     * @param y
     * @param z
     * @return maximum
     */
    public static <T extends Comparable<T>> T testMax(T x,T y ,T z) {

        T maximum= x;
        if(y.compareTo(maximum) > 0 )
        {
            maximum = y;
        }
        if(z.compareTo(maximum) > 0 )
        {
            maximum = z;
        }
        return maximum;
    }
}

package com.bridgelabz;
/**
 * @author Aravind
 * class to find the maximum from given 3 integers
 */
public class TestMaximum {

    public static void main(String[] args) {

        Integer number1 = 2;
        Integer number2 = 3;
        Integer number3 = 5;
        Integer maximumNum = testMax(number1,number2,number3);
        System.out.println("Maximum number is : "+maximumNum);
    }
    /**
     * Method name: testMax
     * description: It takes three integers and calculates max number using compareTo method.
     * Algorithm: testMax takes three parameter and find max using compareTo. if one number is
     * greater than other than compareTo gives positive number, lesser than other one it gives
     * negative.if they are equal it gives 0.
     * @param number1
     * @param number2
     * @param number3
     * @return maximumNumber
     */
    public static Integer testMax(Integer number1, Integer number2, Integer number3) {

        Integer maximumNumber = number1;
        if(number2.compareTo(maximumNumber) > 0 )
        {
            maximumNumber = number2;
        }
        if(number3.compareTo(maximumNumber) > 0 )
        {
            maximumNumber = number3;
        }
        return maximumNumber;
    }
}

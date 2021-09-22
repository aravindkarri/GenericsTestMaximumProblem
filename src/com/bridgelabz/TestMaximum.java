package com.bridgelabz;
/**
 * @author Aravind
 * class to find the maximum from given 3 float numbers
 */
public class TestMaximum {

    public static void main(String[] args) {

        Float number1 = 2.5f;
        Float number2 = 3.1f;
        Float number3 = 1.19f;
        Float maximumNum = testMax(number1,number2,number3);
        System.out.println("Maximum number is : "+maximumNum);
    }
    /**
     * Method name: testMax
     * description: It takes three float numbers and calculates max number using compareTo method.
     * Algorithm: testMax takes three parameter and find max using compareTo. if one number is
     * greater than other one then compareTo gives positive number(1), lesser than other one it gives
     * negative(-1).if they are equal it gives 0.
     * @param number1
     * @param number2
     * @param number3
     * @return maximumNumber
     */
    public static Float testMax(Float number1, Float number2, Float number3) {

        Float maximumNumber = number1;
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

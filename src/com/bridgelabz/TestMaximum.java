package com.bridgelabz;
/**
 * @author Aravind
 * class to find the maximum from given 3 Strings
 */
public class TestMaximum {

    public static void main(String[] args) {

        String name1 = "Apple";
        String name2 = "Peach";
        String name3 = "Banana";
        String maximum = testMax(name1,name2,name3);
        System.out.println("Maximum length of string is : "+maximum);
    }
    /**
     * Method name: testMax
     * description: It takes three String names and calculates max number using compareTo method by
     * checking lexicographically.
     * Algorithm: testMax takes three parameter and find max using compareTo. if one number is
     * greater than other one then compareTo gives positive number(1), lesser than other one it gives
     * negative(-1).if they are equal it gives 0.
     * @param number1
     * @param number2
     * @param number3
     * @return maximumNumber
     */
    public static String testMax(String number1, String number2, String number3) {

        String maximumNumber = number1;
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

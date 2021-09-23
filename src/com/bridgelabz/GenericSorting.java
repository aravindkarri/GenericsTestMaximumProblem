package com.bridgelabz;
/**
 * class to
 * @param <T>
 */
public class GenericSorting<T extends Comparable<T>>
{
    //T type array
    private T[] myArray;
    //Argument constructor
    public GenericSorting(T[] myArray)
    {
        super();
        this.myArray=myArray;
    }
    /**
     * MethodName: sortElements
     * description: sort the given array elements
     * algorithm: bubble sort technique to sort array elements.Adjacent elements are compared with each other
     * and swapping will be done if they are in wrong order.After some iterations array
     * elements will be sorted.
     * @return myArray
     */
    private T[] sortElements()
    {
        int n = myArray.length;
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(myArray[j].compareTo(myArray[j+1])>0)
                {
                    swapElements(j,myArray);
                }
            }
        }
        return myArray;
    }
    //method to swap elements using temp variable
    private void swapElements(int j, T[] myArray2)
    {
        T temp = myArray[j];
        myArray[j] = myArray[j+1];
        myArray[j+1] = temp;

    }
    //main method
    public static void main(String[] args)
    {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','E','L','L','O'};
        GenericSorting<Integer>printIntegerArray = new GenericSorting<>(intArray);
        printIntegerArray.sortElements();
        GenericSorting<Double>printDoubleArray = new GenericSorting<>(doubleArray);
        printDoubleArray.sortElements();
        GenericSorting<Character>printCharacterArray = new GenericSorting<>(charArray);
        printCharacterArray.sortElements();
    }
}

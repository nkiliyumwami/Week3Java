public class Main {
    public static void main(String[] args) {

//        1.Create an array of int called ages that contain the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[]ages = {3,9,23,64,2,8,28,93};

        /*a.Programmatically subtract the value of the first element in the array
         from the value in the last element of the array (i.e. do not use ages[7] in your code).
         Print the result to the console.*/

        int firstElement = ages[ages.length - ages.length];
        int lastElement = ages[ages.length-1];
        int result = lastElement - firstElement;
        System.out.println(firstElement);
        System.out.println(lastElement);
        System.out.println(result);
      /*
        b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
     */
        int []newAges = {3,9,23,64,2,8,28,93,103};
        int firstAge = newAges[newAges.length - newAges.length];
        int lastAge = newAges[newAges.length-1];
        int result2 = lastAge - firstAge;
        System.out.println(firstAge);
        System.out.println(lastAge);
        System.out.println(result2);

        /*c.Use a loop to iterate through the array and calculate the average age. Print the result to the console.*/

        int sumOfAges = 0;
        for(int age : newAges) {
            sumOfAges+=age;
        }
        System.out.println("The average age is " + sumOfAges/ newAges.length);

        /*2.Create an array of String called names that contain the following values:
         “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.*/

        String[] names = {"Tommy", "Tim","Sally", "Buck","Bob"};

        /*a.Use a loop to iterate through the array and calculate the average number of letters per name.
        Print the result to the console.*/

        int sumOfLetters = 0;
        for (String name : names) {
            sumOfLetters += name.length();

        }

        System.out.println( "The average letters per name is : " + sumOfLetters / names.length);


        /*b.Use a loop to iterate through the array again and concatenate all the names together,
          separated by spaces, and print the result to the console.
         */





        /*  3.How do you access the last element of any array?*/

        String lastElementOfArray = names[names.length-1];

        /* 4.How do you access the first element of any array?*/

        String firstElementOfArray = names[0];

        /* 5.Create a new array of int called nameLengths.
        Write a loop to iterate over the previously created names array and
        add the length of each name to the nameLengths array.
        */

        int[] nameLengths = new int[names.length];

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i].length());
        }



        String word = "Test";
        int number = 4;
        System.out.println(StringConcat("Hello", 6));




        System.out.println(FullName("Emmanuel", "Nkiriyumwami"));


        int[]myNumbers = {1,2,3,4,91};

        System.out.println(isSumElementsArray(myNumbers));


        double[]otherNumbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(AverageNumberInArray(otherNumbers));




        double[]firstArray = {1,2,3,4,5,6,7};
        double[]secondArray = {1,2,3,4,5,6,7,8,9};

        System.out.println(isFirstArrayBigger(firstArray, secondArray));

        boolean isHotOutSide = true;
        double moneyInPocket = 9.5;

        System.out.println(willBuyDrink(isHotOutSide, moneyInPocket));



    }

        /*  7.Write a method that takes a String, word, and an int, n, as arguments
        and returns the word concatenated to itself n number of times.
        (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).  */

        public static String StringConcat(String word, int number) {
            String stringResult = " ";
            for(int i = 0; i < number; i++) {
                stringResult+=word;
            }
            return stringResult;
        }

        /*8.Write a method that takes two Strings, firstName and lastName, and returns a full name
        (the full name should be the first and the last name as a String separated by a space).  */

        public static String FullName(String firstName, String lastName){
            String fullName = firstName + " " + lastName;
            return fullName;
        }

        /* 9.Write a method that takes an array of int and returns true
        if the sum of all the ints in the array is greater than 100.*/

        public static boolean isSumElementsArray(int[]digits){
            int sumElements = 0;
            for(int digit: digits) {
                sumElements+=digit;
            }

            return sumElements > 100;
        }

    /* 10.Write a method that takes an array of double and returns the average of all the elements in the array. */

        public static double AverageNumberInArray(double[]numbers) {
        double sum = 0;
        for(double num: numbers) {
            sum+=num;
        }
        double average = sum / numbers.length;

        return average;
        }

        /* 11.Write a method that takes two arrays of double and returns true if the average of
        the elements in the first array is greater than the average of the elements in the second array.*/

        public static boolean isFirstArrayBigger(double[] firstArray, double[]secondArray){
        double sumFirstArray = 0;
        double sumSecondArray = 0;

        for(double firstArr: firstArray) {
            sumFirstArray+=firstArr;
        }

        double averageFirstArray = sumFirstArray / firstArray.length;

        for(double secondArr: secondArray) {
            sumSecondArray+=secondArr;
        }

        double averageSecondArray = sumSecondArray / secondArray.length;

        return averageFirstArray > averageSecondArray;
        }

        /* 12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
        and returns true if it is hot outside and if moneyInPocket is greater than 10.50.*/

        public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket){

            return isHotOutSide && moneyInPocket >= 10.50;
        }

        /* 13.Create a method of your own that solves a problem.
        In comments, write what the method does and why you created it.*/




}
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



    }
}
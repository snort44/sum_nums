public class Main {
//////////////////////////////////////////////////////////////////////
    //The point of this project is to find all the numbers below 1000
    //that are divisible by 1000.
//////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    int int1 = 3;  //1st number to divide by
    int int2 = 5;  //2nd number to divide by
    int sum = 0;   //holds the sum

    for (int i = 1; i<=1000; i++){
            if((i%int1 == 0)  || (i%int2 == 0)){    //Checking to see what numbers will divide by either 3 or 5 without a remainder
                sum += i;       //add the number to the previously added total
            }
        }
        System.out.println("The sum of all the numbers below 1000 that are divisible by 3 or 5 is " + sum);



    }
}
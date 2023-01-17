package numbers;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args) {
        String passedNumber;
        AllMyMethods obiekt = new AllMyMethods();
        passedNumber=obiekt.enterNumber();
        obiekt.checkNaturalNumber(passedNumber);
        obiekt.checkEven(passedNumber);



    }

    static class AllMyMethods{



         String enterNumber (){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a natural number:");
            return  scan.next();
        }

        void checkNaturalNumber(String putNumber){
             int checkThis = Integer.parseInt(putNumber);

             if(checkThis<=0){
                 System.out.println("This number is not natural!");
                 System.exit(1);
             }
        }

        void checkLastDig(String putNumber){
             int lenght = putNumber.length();
             char[] table = putNumber.toCharArray();
             if(table.length-1==7){
                 System.out.println(putNumber = " ends with 7");
             }

        }


        void checkDivisible(String putNumber){

            if(Integer.parseInt(putNumber) % 7 == 0){
                System.out.println(putNumber = " is divisible 7");
            }

        }

        void checkEven(String putNumer){
             if(Integer.parseInt(putNumer)%2==0){
                 System.out.println("This number is Odd.");
             }
             else {
                 System.out.println("This number is Even.");
             }
        }
    }
}

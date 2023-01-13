package numbers;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args) {
        String passedNumber;
        AllMyMethods obiekt = new AllMyMethods();
        passedNumber=obiekt.enterNumber();
        obiekt.checkNaturalNumber(passedNumber);






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

    }
}

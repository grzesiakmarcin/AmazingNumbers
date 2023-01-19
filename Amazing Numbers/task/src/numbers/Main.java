package numbers;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args) {
        String[] tableOfAnswers= new String[4];
        String passedNumber;

        AllMyMethods obiekt = new AllMyMethods();
        passedNumber=obiekt.enterNumber();
        obiekt.checkNaturalNumber(passedNumber,tableOfAnswers);
        obiekt.checkEven(passedNumber,tableOfAnswers);
        obiekt.checkDivisible(passedNumber,tableOfAnswers);
        obiekt.checkLastDig(passedNumber,tableOfAnswers);
        obiekt.printAllinfo(tableOfAnswers);



    }

    static class AllMyMethods{
        void printAllinfo(String[] tab){
            for (String element:tab
                 ) {
                System.out.println(element);

            }


        }




         String enterNumber (){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter natural number");
            return  scan.next();
        }

        String[] checkNaturalNumber(String putNumber,String[]tableOfAnswers){
             int checkThis = Integer.parseInt(putNumber);

             if(checkThis<=0){
                 System.out.println("This number is not natural!");
                 System.exit(1);
             }
             else {tableOfAnswers[2]="Explanation:";
             tableOfAnswers[3]=putNumber+ " ";
             }
             return tableOfAnswers;


        }

        String[] checkDivisible(String putNumber,String [] tableOfAnswers){
            StringBuilder sb= new StringBuilder();

            if(Integer.parseInt(putNumber) % 7 == 0){
                tableOfAnswers[1]="It is a Buzz number.";
                tableOfAnswers[3]=  String.valueOf(sb.append(tableOfAnswers[3] + "is divisible by 7"));
            }
            else{
                tableOfAnswers[1]="It is not a Buzz number.";
                tableOfAnswers[3]= String.valueOf(sb.append(tableOfAnswers[3] + " is not divisible by 7"));
            }
            return tableOfAnswers;

        }

        String[] checkLastDig(String putNumber, String[] tablOfAnswers){
            StringBuilder sb = new StringBuilder();
            Integer.parseInt(putNumber);
             char[] table = String.

                int counter = 1;
            for (char element:table             ) {
                System.out.println(element+ "element " + counter);
                counter++;
            }

             if(table.length-1=='7'){
                 tablOfAnswers[1]="It is a Buzz number.";
                 tablOfAnswers[3]=String.valueOf(sb.append(tablOfAnswers[3]+" ends with 7"));
             }
             else {
                 tablOfAnswers[3]=String.valueOf(sb.append(tablOfAnswers[3]+" nor ends with 7"));
             }
             return tablOfAnswers;

        }


        String[] checkEven(String putNumer,String[] tableOfAnswers ){
             if(Integer.parseInt(putNumer)%2==0){
                 tableOfAnswers[0]=("This number is Odd.");
             }
             else {
                 tableOfAnswers[0]=("This number is Even.");
             }
             return  tableOfAnswers;
        }
    }
}

import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
//        ----------IF STATEMENT------------
//        int a =45;
//        if( a >40){
//            System.out.println("True");
//        }

//        --------------IF-ELSE STATEMENT------------

//        int age = 2;
//        if(age >=18){
//            System.out.println("Eligible to vote ");
//
//        }else{
//            System.out.println("Not Eligibel to Vote ");
//        }


//        ------------IF-ELSE-IF LADDER ------MULTIPLE CONDITIONS--------

//        int marks = 65;
//        if(marks <=40){
//            System.out.println("Fail");
//        }else if(marks >=50){
//            System.out.println("D");
//        }else if(marks>=70){
//            System.out.println("C");
//        }else if(marks>=80){
//            System.out.println("B");
//        }else if(marks>=99){
//            System.out.println("A");
//        }else{
//            System.out.println("Invalid");
//        }



//          ------------  NESTED IF- ELSE----------------
//         int id = 14;
//         String name = "artik";
//         if(id == 114){
//
//             if(name == "Kartik"){
//                 System.out.println("He is in 7th sem");
//             }else{
//                 System.out.println("Unknown");
//             }
//         } else{
//             System.out.println("Something is Missing");
//         }

//     --------------   TERNARY OPERATOR-----------
//            int age = 18;
//            String elig = (age>=18) ? "Vote" : "No Vote";
//        System.out.println(elig);


//        -------------SWITCH---------------
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter the Day: ");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//                default:
//                    System.out.println("Invalid Day");
//        }



//        ---------QUESTIONS-----------

//        int marks = 82;
//
//        if (marks >= 90) {
//            System.out.println("A+");
//        } else if (marks >= 75) {
//            System.out.println("A");
//        } else if (marks >= 60) {
//            System.out.println("B");
//        } else {
//            System.out.println("C");
//        }


//        Q11 — Pass/Fail
//        Create a program:
//        marks = 67
//        If marks are 50 or above, print
//        Pass
//        Otherwise:
//        Fail
//                  int marks =67;
//                  if(marks>=50){
//                      System.out.println("Pass");
//                  }else{
//                      System.out.println("Fail");
//                  }


//        Create a program that checks:
//        int number = -5;
//        Output should be:Negative
//        It should also correctly handle positive numbers and 0.


//            int num =0;
//            if(num>0){
//                System.out.println("+"+ num);
//            }else if(num<0){
//                System.out.println("-"+ num);
//            }else{
//                System.out.println("0");
//            }


//        Q13 — Greatest of Two Numbers
//        Given:
//        Print:72 is greater Use if-else.

//        int a = 45;
//        int b = 72;
//        if (a > b) {
//            System.out.println("45 is Greater");
//        }else{
//            System.out.println("72 is Greater");
//        }



//        Q14 — Mini Placement Question
//        Write a program that takes:
//        int marks = 78;
//        and prints:
//        Excellent → 90 or above
//        Good → 75–89
//        Average → 50–74
//        Fail → below 50
//        Don't use loops or any advanced concepts.
        int marks =78;
        if( marks >=90){
            System.out.println("excellent");
        }else if(marks>=75){
            System.out.println("good");
        }else if(marks>=50){
            System.out.println("average");
        }else{
            System.out.println("Fail");
        }







    }

}

public class ForLoop {
    static void main() {

//        -----FIRST LOOP----
//        for(int i=1; i<=5; i++){
//            System.out.println(i);
//        }
//                System.out.println("EXAMPLE 1:");
//        for(int i=1; i<=4; i++){
//            System.out.println("Kartik");
//        }

//        System.out.println("EXAMPLE 2:");
//            for(int i=1; i<=10; i+=2){
//                System.out.println(i);
//            }

//        System.out.println("NESTED LOOPS EXAMPLE 3:");
//        for(int i=1; i<=3; i++){
//            for(int j=1; j<=3; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        System.out.println("EXAMPLE 4:");
//        for(int i=1; i<=3; i++){
//            for(int j=1; j<=3; j++){
//                System.out.println("i = "+i +"j = "+j);
//            }

//        System.out.println("Break Keyword:");
//        for(int i=1; i<=10; i++){
//            if(i == 5){
//                break;   // stop and exit from the current/nearest loop
//            }
//            System.out.println(i);

        System.out.println("Continue Keyword:");
        for(int i=1; i<=10; i++){
            if(i == 5){ // skip the 5th iteration
                continue;
            }
            System.out.println(i);


        }

    }
}

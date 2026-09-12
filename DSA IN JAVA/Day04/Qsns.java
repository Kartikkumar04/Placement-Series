public class Qsns{
    public static void main(String[]args){
//        Print counting from 1 to n
//        int n=10;
//        for(int i=1; i<=n; i++){
//            System.out.println(i);
//        }


//        Print counting from n to 1
//        for(int i=n; i>=1; i--){
//            System.out.println(i);
//        }

//        Print the 10 multiples of n
//        int n=7;
//        for(int i=1; i<=10; i++){
//            System.out.println(n*i);
//        }

//        Q4: print your name 100 times.
//        int n=100;
//        for(int i=1; i<=n; i++){
//            System.out.println("KK");
//        }

//        Print all prime numbers from 1 to 100.

        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

//    int n=7;
//        for(int i=1; i<=10; i++){
//            if(n/2 == !=0){
//                System.out.println("Not Prime");
//            }else{
//                System.out.println(prime);
//            }
//        }


    }

}
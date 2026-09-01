public class Evenoddele6 {
    public static void main(String[] args) {
        int[] numbers = {12,45,7,89,34,20,11};
        int even =0;
        int odd =0;

        for(int i=0; i< numbers.length; i++){
            if(numbers[i]%2==0){
                even =even+1;

            }else{
                odd = odd +1;
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}

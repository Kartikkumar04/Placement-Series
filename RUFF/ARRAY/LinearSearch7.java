public class LinearSearch7{
    public static void main(String[] args) {
        int [] numbers = {10,25,30,45,50};
        
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == 30){
                System.out.println("30 Found");
            }else{
                System.out.println("Not Found");
            }
        }
    }
}
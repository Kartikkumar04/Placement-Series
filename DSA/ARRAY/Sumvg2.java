public class Sumvg2{
    public static void main(String[]args){
        int [] marks={78,75,92,67,88};
        int sum = 0;
        for(int i=0; i< marks.length; i++){
            sum = sum+ marks[i];
        }
        double avg = (double) sum/marks.length;
        System.out.println("Total Marks: "+sum);
        System.out.println("Average: "+avg);

    }
}
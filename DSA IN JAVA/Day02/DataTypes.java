public class DataTypes {
    static void main() {
//        DATE TYPES
        byte by = 127;
        short s = 32587;
        long l = 5254872;
        float f = 3.14f;
        double d = 3.123455789123457;
        char c = 'a';
        System.out.println(" Character is: "+ (char) (c+2) );
        boolean eligibleToVote = true;

//        IMPLICIT
        byte maxValue = 127;
        long extendMaxValue = 500;
        System.out.println(extendMaxValue);

//        EXPLICIT
        long maxV = 1572943781;
        int newMv = (int)maxV;
        System.out.println(newMv);
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        // int to byte
            int a= 33;
            byte b= (byte) a;
            System.out.println(b);

            // float to int
            float f = 54.22f;
            int i = (int) f;
            System.out.println(i);

            // TYpe promote
            byte bb =10;
            byte cc =30;
            int result = bb + cc;
            System.out.println(result);
    }
}

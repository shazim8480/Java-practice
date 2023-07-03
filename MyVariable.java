public class MyVariable {
    public static void main (String args[]) {
        // variables //
        int a = 10;
        int b = 5 ;

        // calculation => java calculates from left to right //
        // int ans  = a * b / a - b; // 0
        int ans  = (a * b) / (a - b); // 10 (parenthesis is important !!!!)
        System.out.println(ans);
        // int age = 26;
        // String name = "Kyoraku";
        // double pencilPrice = 500.75;

        // re-assign variables //
        // name = "Shunsui";
        // age = 49;
        // System.out.println("Hi");

        // int sum = a + b;
        // int diff = b - a;
        // int multi = a * b;
        // double div = b / a;

        // System.out.println(sum);
        // System.out.println(diff);
        // System.out.println(multi);
        // System.out.println(div);
    }
}

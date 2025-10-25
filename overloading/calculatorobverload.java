public class calculatorobverload {

    
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static double add(double a, double b) {
        return a + b;
    }

   
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public static String add(String s, int n) {
        return s + n;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));           
        System.out.println(add(2.5, 3.1));       
        System.out.println(add(1, 2, 3));        
        System.out.println(add("Jumlah: ", 100)); 

       
        System.out.println(add(1, 2.0)); 
    }
}

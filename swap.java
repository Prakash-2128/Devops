
class swap {
    public static void main(String[] args) {
        int a = 5, b = 6;
        int temp;
        
        System.out.printf("Before swap: a = %d and b = %d%n", a, b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.printf("After swap: a = %d and b = %d%n", a, b);
    }
}

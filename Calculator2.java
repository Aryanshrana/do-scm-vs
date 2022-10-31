public class Calculator2 {
    void addition(int a, int b) {
        int r = a + b;
        System.out.println(r);
    }

    void subtraction(int a, int b) {
        int s = a - b;
        System.out.println(s);
    }

    public static void main(String[] args) {
        Calculator2 bj = new Calculator2();
        bj.addition(5, 6);
        bj.subtraction(9, 4);
    }

}

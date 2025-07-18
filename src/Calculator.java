public class Calculator {
    static int Soma(int a, int b){
        return a+b;
    }
    static int Multiplicacao(int a, int b){
        return a*b;
    }
    static int Divisao(int a, int b){
        return a/b;
    }
    static int Subtrair(int a, int b){
        return a - b;
    }
    public static void main(String[] args) {
        System.out.println(Soma(2, 3));
    }
}

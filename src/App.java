import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.close();

        if(a > 0){
            System.out.printf("+%.4E\n", a);
        }else if(a < 0){
            System.out.printf("%.4E\n", a);
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        if(a==0){
            System.out.println("Bat dau");
        }
        StopWatch dh =new StopWatch();
         dh.start();
        int b= scanner.nextInt();
        if(b==1){
            dh.stop();
            System.out.println(" Ket thuc " + dh.stop());
        }
    }
}

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heigth, weight, bmi;
        System.out.println("Nhap vao chieu cao: ");
        heigth = sc.nextInt();
        heigth*=0.01;
        System.out.println("Nhap vao can nang: ");
        weight = sc.nextInt();
        bmi = weight/heigth*heigth;

        if(bmi<18.5){
            System.out.println("UnderWeight");
        }else if(bmi>=18.5&&bmi<25.0){
            System.out.println("Normal");
        }else if(bmi>=25.0&&bmi<30){
            System.out.println("OverWeight");
        }else if(bmi>30){
            System.out.println("Obese");
        }
    }

}

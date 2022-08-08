package TUT;

import java.util.Scanner;

public class TUT_3 {
    Scanner sc = new Scanner(System.in);

    public int verify(float a[]){
        System.out.println("enter your account no:");
        int i = sc.nextInt();
        if(i<=a.length+1){
            return i;
        }
        else {
            System.out.println("enter vaild acc no");
            return -1;
        }
    }
    public void with(int j,float a[]){
        System.out.println("enter your money:");
        float m = sc.nextFloat();
        if (a[j] < m) {
            System.out.println("insufficent balance");
        } else {
            a[j] = a[j] - m;
            System.out.println("withdrawl ho gaya");
        }

    }
    public void bal(int j,float a[]){

            System.out.println(a[j]);


    }
    public void dep(int j,float a[]){
        System.out.println("enter the money u wanna deposit ");
        float d = sc.nextFloat();
        a[j] = a[j] + d;
    }
    public void openacc(float a[]){
        System.out.println("enter your name");
        System.out.println("your acc no is:"+a.length+1);

    }
    public static void main(String[] args) {
        float []a={1000000,200000,300000,400000,500000,5000};
        Scanner sc1=new Scanner(System.in);
        int j;

        boolean flag=true;
        while (flag) {
            System.out.println("Welcome to SBI");
            System.out.println("Please select a option:");
            System.out.printf("1:check bank balance:\n" +
                    "2.Withdraw money:\n" +
                    "3.deposit money:\n" +
                    "4.exit");

            int p = sc1.nextInt();
            TUT_3 t = new TUT_3();
            j = t.verify(a);
            if (j != -1) {
                switch (p) {
                    case 1:

                          t.bal(j,a);

                        break;
                    case 2:

                            t.with(j,a);

                        break;
                    case 3:

                            t.dep(j,a);

                        break;
                    case 4:
                        t.openacc(a);
                    case 5:
                        flag = false;
                        System.out.println("Thank you");
                        break;
                }
            }
        }


    }
}

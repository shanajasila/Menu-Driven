import java.util.Scanner;

public class menu {

    public static void main(String args[]){
            while (true){
                System.out.println("\nEnter your option:");
                System.out.println("\n1.Largest among three numbers\n2.smallest among three numbers\n3.Prime or not\n4.Even or not\n5.Reverse\6.Exit");
                Scanner sc=new Scanner(System.in);
                int menu= sc.nextInt();
                switch (menu){
                    case 1:
                        System.out.println("\nEnter Three Numbers:");
                        int a= sc.nextInt();
                        int b= sc.nextInt();
                        int c= sc.nextInt();
                        int l=((a>b)?(a>c?a:c):(b>c?b:c));
                        System.out.println("The largest Number is: "+l);

                }
            }
    }

}

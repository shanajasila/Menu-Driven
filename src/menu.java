import java.util.Scanner;

public class menu {

    public static void main(String args[]){
            int flag=0;
            while (true){
                System.out.println("\nEnter your option:");
                System.out.println("\n1.Largest among three numbers\n2.smallest among three numbers\n3.Prime or not\n4.Even or not\n5.Reverse\n6.Exit");
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
                    case 2:
                        System.out.println("\nEnter Three Numbers:");
                        int a1= sc.nextInt();
                        int b1= sc.nextInt();
                        int c1= sc.nextInt();
                        int s=((a1<b1)?(a1<c1?a1:c1):(b1<c1?b1:c1));
                        System.out.println("The largest Number is: "+s);
                    case 3:
                        System.out.println("\nEnter a number");
                        int a2= sc.nextInt();
                        if(a2==0||a2==1){
                            System.out.println("Not a prime number");
                        }
                        for(int i=2;i<=a2/2;i++){
                            if(a2%i==0){
                                flag=1;
                                break;
                            }
                        }
                        if (flag==1) {
                            System.out.println(a2 + " Not a prime number");
                        }
                        else{
                            System.out.println(a2+" Is a prime number");
                        }

                    case 4:
                        System.out.println("Enter the number");
                        int a3= sc.nextInt();
                        if(a3%2==0){
                            System.out.println(a3+" Is Even");
                        }
                        else {
                            System.out.println(a3+" not even");
                        }
                }
            }
    }

}

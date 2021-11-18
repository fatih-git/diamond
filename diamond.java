import java.util.Scanner;

/**
 * @author fatih-git
 */

public class diamond {

    public static void main(String[] args) {

        int n;
        Scanner input=new Scanner(System.in);

        System.out.print("Elmas çizmek için tek sayı giriniz: ");
        n=input.nextInt();

        for(int i=1; i<=n/2+1; i++){

            for(int j=1; j<=((n/2)+(1-i)); j++){
                System.out.print(" ");
            }

            for(int k=1; k<=((2*i)-1); k++){
                System.out.print("*");
            }

            System.out.println("");
        }

        for (int x=1; x<=((n/2)); x++){

            for(int y=1; y<=x; y++){
                System.out.print(" ");
            }

            for(int z=((2*x)-1); z<=(n-2); z++){
                System.out.print("*");
            }

            System.out.println("");
        }

    }

}

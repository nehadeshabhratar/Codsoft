import java.util.*;

public class Calculator 
{
    public static void main(String[] args) 
    {    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Subject ");
        int num=s.nextInt();
        int total = 0;
         int max=100;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100)=");
            int m = s.nextInt();

            
            if (m < 0 || m  > max) {
                System.out.println("Enter valid marks");
                return;
            }
            else{
                    total =total+m;
        }
    }
    
        
        System.out.println("total marks "+total);
        float aP;
        aP = total/num;
        System.out.println("average percentage"+aP+"%");

        String grade;
        if (aP>= 80 && aP<=100) {
            System.out.println("Grade A");
        }else if (aP >= 60 && aP<=80) {
            System.out.println("Grede B");
        } else if (aP >= 50 && aP<=60){
            System.out.println("Grade c");
        } else if (aP >= 35 && aP<=50) {
            System.out.println("Grade d");
        }else {
            System.out.println("Failed");
        }
    }

    
}

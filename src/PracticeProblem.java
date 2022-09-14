import java.util.Scanner;
public class PracticeProblem {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows, cols , tree number");
        int cols=sc.nextInt();
        int rows=sc.nextInt();
        int treeNumber=sc.nextInt();
        if(treeNumber%cols==2 || treeNumber%cols==4)
            System.out.println("yes");
        else if(treeNumber>=1 && treeNumber<=cols)
            System.out.println("yes");
        else System.out.println("no");




    }
}

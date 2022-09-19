import java.util.Scanner;

public class ExceptionName {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        try{
            if(height<120)
            {
                throw new CustomizedException("not eligible for ride");
            }
            else
                System.out.println("eligible for ride");
        }
        catch (CustomizedException e) {
            System.out.println(e.getMessage()+" handled");
        }





    }
}

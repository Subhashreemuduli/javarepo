public class AdditionOf2DA {
    public static void main(String[] args)
    {
        int[][] arr1={{1,2,3} ,{3,5,7},{4,6,8}};
        int[][] arr2={{4,7,8},{6,9,8},{6,7,8}};
        int[][] arr3=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}

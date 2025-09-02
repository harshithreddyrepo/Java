public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {
                      {1,0,0},
                      {0,1,0},
                      {0,0,1}
                    };
        int[][] b = {
                      {1,5},
                      {7,1},
                      {0,9}
                    };
        int[][] c = new int[a.length][b[0].length];
        int sum;
        // Columns of the first matrix should be equal to the Rows of the second matrix
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<b[i].length;j++)
           {
               sum=0;
               for(int k=0;k<b.length;k++)
               {
                  sum = sum + a[i][k]*b[k][j];
               }
              c[i][j]=sum;
           }
       }
        for(int[] arr : c)
        {
            for(int num:arr)
            {
                System.out.print(num+"  ");
            }
            System.out.println();
        }
    }
}

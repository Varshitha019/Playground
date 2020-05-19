
import java.util.*;
public class Main
{
    public static void maxi_col(int mat[][], int m, int n)
    {
        int i,j;
        for(i = 0; i < n; i++)
        {
            int max = mat[0][i];
            for(j = 1; j < m; j++)
            {
                if(mat[j][i] > max)
                {
                    max = mat[j][i];
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args)
    {
        int n, m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat1 = new int[m][n];
        int i, j;
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                mat1[i][j] = sc.nextInt();
        }
        maxi_col(mat1,m,n);
    }
}

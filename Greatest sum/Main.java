#include<iostream>
using namespace std;
int main()
{
    int m, n, row, col, sum = 0, row_ind = 0, col_ind = 0;
    cin >> m >> n;
    int row_arr[m];
    int i, j;
    int mat[m][n];
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat[i][j];
    }

    int z = 0;

    cout << "Sum of rows is ";
    for(row=0; row<m; row++)
    {
        sum = 0;
        for(col=0; col<n; col++)
        {
            sum += mat[row][col];
        }
        cout << sum << " ";
        row_arr[z++] = sum;
    }
    cout << endl;
    int temp_row = row_arr[0];
    for(i=1;i<m;i++)
    {
        if(temp_row < row_arr[i])
        {
            temp_row = row_arr[i];
            row_ind = i;
        }
    }
    cout << "Row " << row_ind + 1 << " has maximum sum ";
    cout << endl;
    cout << "Sum of columns is ";
    sum = 0;
    int y = 0;
    int col_arr[n];
    for (i = 0; i < n; ++i)
    {
        sum = 0;
        for (j = 0; j < m; ++j)
        {
            sum = sum + mat[j][i];
        }
        cout << sum << " ";
        col_arr[y++] = sum;
    }
    int temp_col = col_arr[0];
    for(i=1;i<n;i++)
    {
        if(temp_col < col_arr[i])
        {
            temp_col = col_arr[i];
            col_ind = i;
        }
    }
    cout << endl;
    cout << "Column " << col_ind + 1 << " has maximum sum ";
    cout << endl;
    return 0;
}
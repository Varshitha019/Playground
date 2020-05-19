#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c,a[100][100],b[100][100],s[100][100];
cin>>r;
  cin>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>b[i][j];
    }
  }
 for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
  {
   
  s[i][j]=a[i][j]+b[i][j];
  }
}
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cout<<s[i][j]<<" ";
    cout<<"\n";
  }
  return 0;
}


#include<iostream>
using namespace std;
int main()
{
int i , j, r , c , n , a[100][100],max[100];
cin>>r;
cin>>c;
for(i = 0; i < r; i=i+1)
{
for(j = 0; j < c; j=j+1)
{
cin>>a[i][j];
}
}
for(i = 0; i < r; i++)
{
for(j = 0; j < c; j++)
cout<<"";
}
for(i = 0; i < r; i++)
{
max[i] = a[i][j];
for(j = 0; j < c ; j++)
{
if(a[i][j]>max[i])
{
max[i]=a[i][j];
}
}

}
for(i = 0; i < r; i++)
{
cout<<max[i]<<"\n";
}
return 0;
}

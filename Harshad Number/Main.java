#include<iostream>
using namespace std;
int main()
{
int m,n;
  cin>>n;
  m=n;
int sum=0;
for (int k=1;m>0;m/=10)
{
k=m%10;
sum=sum+k;
}
if (n%sum==0)
{
cout<<"Harshad Number";
}
  else
    cout<<"Not Harshad Number";
}

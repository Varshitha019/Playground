#include<iostream>
int main()
{
int n,i=0;
std::cin>>n;
if(n==0)
{
n=1;
}
while(n>0)
{
n/=10;
i++;
 }
std::cout<<i;
return 0;
}

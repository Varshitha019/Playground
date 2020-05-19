#include<iostream>
int main()
{
int n1,n2,n3,n4;
std::cin>>n1>>n2>>n3>>n4;
int small=0;
int gcd=0;
if(n1<n2&&n1<n3)
{
small=n1;
}
else if(n2<n1&&n2<n3)
{
small=n2;
}
else
small=n3;
while(small>=1)
{
if(n1%small==0&&n2%small==0&&n3%small==0)
{
gcd=small;
break;
}
small--;
}
if(gcd==n4)
std::cout<<"Answer is correct.";
else
std::cout<<"Answer is wrong.";
}

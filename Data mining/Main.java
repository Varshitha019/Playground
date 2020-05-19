#include<iostream>
int main()
{
    int n,n1,sum=0,sum1=0;
   std::cin>>n;
    while(n>0)
    {
        n1=n%10;
        if (n1%2==0)
        {
            sum=sum+n1;
        }
        else
        {
            sum1=sum1+n1;
        }
        n=n/10;
    }
    if(sum==sum1)
    {
        std::cout<<"Yes";
    }
    else
        std::cout<<"No";
        return 0;

}
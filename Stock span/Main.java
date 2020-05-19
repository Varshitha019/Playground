#include<iostream>
using namespace std;
void stockSpan(int n,int *a)
{
  int c=0,i;
  std::cout<<"1\n";
  for(i=0;i<n-1;i++)
  {
    if(a[i]>a[i+1])
    {
      std::cout<<"1\n";
    }
    else
    {
      c=c+2;
      std::cout<<c<<"\n";
    }
  }
}
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  stockSpan(n,a);
  return 0;
}
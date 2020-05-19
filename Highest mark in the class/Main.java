#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n],i;
  for(i=0;i<n;i++)
  {
   std::cin>>a[i];
  }
  int sum=0,h=0;
  for(i=0;i<n;i++)
  {
    sum+=a[i];
    if(a[i]>h)
      h=a[i];
  }
  std::cout<<h;
}
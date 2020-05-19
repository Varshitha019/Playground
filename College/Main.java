#include <iostream>
#include <string.h>
using namespace std;
struct college
{
  char name[100],city[100];
  int esty;
  float pass;
};

int main()
{
  int n;
  cin>>n;
  college c[n],t;
  for(int i=0;i<n;i++)
  {
   std::cin>>c[i].name;
    std::cin>>c[i].city;
    std::cin>>c[i].esty;
   std:: cin>>c[i].pass;
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(strcmp(c[i].name,c[j].name)>0)
      {
        t=c[i];
        c[i]=c[j];
        c[j]=t;
      }
    }
  }
  std::cout<<"Enter the number of colleges"<<endl;
  for(int i=0;i<n;i++)
  {
    std::cout<<"Enter the details of college "<<i+1<<endl;
    std::cout<<"Enter name"<<endl;
    std::cout<<"Enter city"<<endl;
    std::cout<<"Enter year of establishment"<<endl;
    std::cout<<"Enter pass percentage"<<endl;
  }
  std::cout<<"Details of colleges"<<endl;
  for(int i=0;i<n;i++)
  {
    std::cout<<"College:"<<i+1<<endl;
    std::cout<<"Name:"<<c[i].name<<endl;
    std::cout<<"City:"<<c[i].city<<endl;
    std::cout<<"Year of establishment:"<<c[i].esty<<endl;
    std::cout<<"Pass percentage:"<<c[i].pass<<endl;
  }
}
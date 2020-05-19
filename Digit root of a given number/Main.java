#include<iostream>
using namespace std;
int main()
{
 int num ,z , x ,count1 =0,count2=0 ,sum =0 ,y ,digital_root=0;
 cin>>num;
 
 z = num;
 
 while(num!=0)
 {
  num =num / 10;
  count1++;
 }
 for(int i=0;i<count1;i++)
 {
  x= z %10;
  sum = sum + x;
  z = z/10;
  count2++;
 
 }
 for(int j=0;j<count2;j++)
 {
  y = sum % 10;
  digital_root = digital_root + y;
  sum = sum / 10;
 }
 cout<<digital_root;
 
   return 0;
}
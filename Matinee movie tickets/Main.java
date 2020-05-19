#include<iostream>
using namespace std;
int main()
{
int age;
float time;
float a=10.15,b=13.30,c=18.00,d=22.00;
cin>>age>>time;
if(age>=13 && time==b || time==c)
{
cout<<"$5.00";
}
else if(age>=13 && time==a || time==d)
{
cout<<"$8.00";
}
if(age<13 && time==b || time==c)
{
cout<<"$2.00";
}
else if(age<13 && time==a || time==d)
{
cout<<"$4.00";
}
}
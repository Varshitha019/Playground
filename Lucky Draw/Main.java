#include <iostream>
using namespace std;
int main()
{
int num, i, j = 0;
cin >> num;
for (i = 1; i <= num; i++)
{
if ((num % i) == 0)
{
j++;
}
}
switch(j)
{
case 2:cout<<"Eligible";
    break;
default:cout<<"Not eligible";
break;
}
}


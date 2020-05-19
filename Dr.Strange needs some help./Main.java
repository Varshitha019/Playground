#include<iostream>
using namespace std;
int main()
{
int m,n,req;
cin>>m;
cin>>n;
cin>>req;
if(m*n*req<=50)
{
cout<<"Doctor, you can proceed with your experiment.";
}
else
{
cout<<"Sorry Doctor! You need more bacteria.";
}
return 0;
}

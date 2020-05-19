#include<iostream>
using namespace std;
int main()
{
  int i,j;
  string str;
cin>>str;
  cout<<"Floating part is : ";
for(i=0;i<str.size();i++)
{
    if(str[i]=='.')
    break;
}

for(j=i+1;j<str.size();j++)
{
    cout<<str[j];
}
return 0;
}
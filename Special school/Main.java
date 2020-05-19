#include<iostream>
#include<string.h>
using namespace std;
void strrrev(char * str) 
{
 int j = 0, i = 0;
 while(str[j+1]) j++;
 while(i < j) 
{
  char temp = str[i];
  str[i] = str[j];
  str[j] = temp;
  i++;
  j--;
}
}
int main()
{
    char str1[50],str2[50];
    cin>>str1;
    cin>>str2;
    strrrev(str1);
    if(strcmp(str2,str1)==0)
    //if(c==0)
    cout<<"It is correct";
    else
    cout<<"It is wrong";
    return 0;
}
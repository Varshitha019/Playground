#include<iostream>
#include<cmath>
using namespace std;
int main(){
int num, digitSum, temp, remainderNum, digitNum;
cin>>num;
temp = num;
digitNum = 0;
while (temp != 0) {
digitNum++;
temp = temp/10;
}
temp = num;
digitSum = 0;
while (temp != 0) {
remainderNum = temp%10;
digitSum = digitSum + pow(remainderNum, digitNum);
temp = temp/10;
}
if (num == digitSum)
cout<<"Kindly proceed with encrypting";
else
cout<<"It is not an Armstrong number";
return 0;
}

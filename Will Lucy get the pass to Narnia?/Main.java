#include <iostream>

using namespace std;

int main(){

int c,a,b;

cout<<"Enter first number : ";

cin>>a;

cout<<"Enter second number : ";

cin>>b;

cin>>c;

cout<<"Menu"<<"\n";

cout<<"1.Addition"<<"\n";

cout<<"2.Subtraction"<<"\n";

cout<<"3.Multiplication"<<"\n";

cout<<"4.Division"<<"\n";

cout<<"5.Remainder"<<"\n";

switch(c){

case 1:

cout<<a+b;

break;

case 2:

cout<<a-b;

break;

case 3:

cout<<a*b;

break;

case 4:

cout<<a/b;

break;

case 5:

cout<<a%b;

break;

default:

cout<<"Invalid operation";

}

return 0;

}


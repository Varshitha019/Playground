#include<iostream>
using namespace std;
int main()
{
int petrol,dist,possibleDist;
float milage;
std::cin>>milage>>petrol>>dist;
possibleDist=milage*petrol;
if(possibleDist >= dist)
std::cout<<"Can reach";
else
std::cout<<"Cannot reach";
return 0;
}


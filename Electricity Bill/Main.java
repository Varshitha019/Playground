#include <iostream>
using namespace std;
int main()
{
int unit;
int amt, total_amt, sur_charge;
cin>>unit;
if(unit <=200)
{
amt = unit * 0.50;
}
else if(unit <= 400)
{
amt = 100 + ((unit-200) * 0.65);
}
else if(unit <= 600)
{
amt = 200 + ((unit-400) * 0.80);
}
else
{
amt = 425 + ((unit-600) * 1.25);
}
sur_charge = amt * 0.001;
total_amt= amt + sur_charge;
cout<<"Rs."<<total_amt;
return 0;
}




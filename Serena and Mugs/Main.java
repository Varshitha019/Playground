#include<iostream>

using namespace std;

int main()

{

int n,c,i,sum=0;

std::cin>>n;

std::cin>>c;

int arr[n];

for(i=0;i<n;i++)

{
std::cin>>arr[i];

}

for(i=0;i<n;i++)

{

sum=sum+arr[i];

}

if(sum<=c)

{

std::cout<<"YES";

}

else

{
std::cout<<"NO";

}

}

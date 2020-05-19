#include <iostream> 
using namespace std; 
int main() 
{ 
int n1=0,n2=1,n3,i,number;
std::cin>>number;
for(i=2;i<number;++i) 
{ 
n3=n1+n2; 
n1=n2; 
n2=n3;
} 
std::cout<<n3;
}

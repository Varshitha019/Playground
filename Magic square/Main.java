#include<iostream>
 using namespace std;
int main(){
int M[20][20];
int m, n, i, j, s1=0, s2=0, s3=0, set;
cin>>m;
{                  
for (i = 1; i<=m; i++)
for (j = 1; j<=m; j++)
cin>>M[i][j];
for (i = 1; i <= m; ++i) 
for (j = 1; j <= m; ++j)
if (i == j)
s1 = s1 + M[i][j];
for (i = 1; i<=m; i++) {
for (j = 1; j<=m; j++) {
s2 = s2 + M[i][j];
}
if (s1 == s2)
set = 1;
else {
set = 0;
break;
}
s2=0;
}
for (i = 1; i<=m; i++) {
for (j = 1; j<=m; j++) {
s3 = s3 + M[j][i];
}
if (s1 == s3)
set = 1;
else {
set = 0;
break;
}
s3=0;
}
if (set == 1)
cout<<"Yes";
else
cout<<"No";
}
return(0);
}
#include <iostream>
#include <bits/stdc++.h> 
#include <string.h> 
using namespace std;
struct Student
{
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa;
}; 
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct Student*)p)->name, 
                  ((struct Student*)q)->name); 
} 
int main()
{
  int i,n;
  cout << "Enter the number of students\n";
  cin>>n;
  Student a[n]; 
  for(i=0;i<n;i++)
  {
    cout << "Enter the details of student "<<i+1<<"\n";
    cout << "Enter name\n";
    cin>>a[i].name;
    cout << "Enter department\n";
    cin >> a[i].department;
    cout << "Enter year of study\n";
    cin >> a[i].yearOfStudy;
	cout << "Enter cgpa\n";
    cin >> a[i].cgpa;
  }
  qsort(a, n, sizeof(struct Student), comparator); 
    cout << "Details of students" << endl;
  for(i=0;i<n;i++)
  {
    cout << "Student "<<i+1<<"\n";
     cout << "Name:" << a[i].name << endl;
     cout <<"Department:" << a[i].department << endl;
     cout <<"Year of study:" << a[i].yearOfStudy << endl;
     cout <<"CGPA:" << a[i].cgpa << endl;
  }
    return 0;
}
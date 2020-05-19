#include <stdio.h>
struct student {
char name[50];
int roll;
int marks;
} s;
int main()
{
fgets(s.name, sizeof(s.name), stdin);
scanf("%d", &s.roll);
scanf("%d", &s.marks);
printf( "\n");
printf( "Student Details\n");

printf("Name: ");

printf("%s", s.name);

printf("Roll: %d\n", s.roll);

printf("Marks: %d\n", s.marks);

return 0;

}

#include <stdio.h>
#include <string.h>
int main()
{
char s[200];
int count = 0, i;
scanf("%[^\n]s", s);
for (i = 0;s[i] != '\0';i++)
{
if (s[i] == ' ' && s[i+1] != ' ')
count++;
}
if((count+1)<10)
printf("Caption eligible for the contest");
else
printf("Caption not eligible for the contest");
}
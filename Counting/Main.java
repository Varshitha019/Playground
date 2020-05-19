#include <iostream>
using namespace std;

int main()
{
    string line;
    int vowels, consonants, digits, spaces,symbol;

    vowels =  consonants = digits = spaces = symbol= 0;
    getline(cin, line);

    for(int i = 0; i < line.length(); ++i)
    {
        if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
           line[i]=='o' || line[i]=='u' || line[i]=='A' ||
           line[i]=='E' || line[i]=='I' || line[i]=='O' ||
           line[i]=='U')
        {
            ++vowels;
        }
        else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
        {
            ++consonants;
        }
        else if(line[i]>='0' && line[i]<='9')
        {
            ++digits;
        }
        else if (line[i]==' ')
        {
            ++spaces;
        }
        else
        {
            ++symbol;
        }
    }
    cout << "Vowels:" << vowels << endl;
    cout << "Consonants:" << consonants << endl;
    cout << "White Spaces:" << spaces << endl;
   cout << "Digits:" << digits << endl;
     cout << "Symbols:" << symbol << endl;
    return 0;
}
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[20];
  int count=0;
  cin>>str;
  for(int i=0;i<strlen(str);i++)
  {
   count += 1; 
  }
  cout<<"The number of letters in the name is "<<count;
}
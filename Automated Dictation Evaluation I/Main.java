#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[20];
  cin>>str;
  char str1[20];
  cin>>str1;
  int result = strcmp(str,str1);
  if(result==0)
  {
   cout<<"It is correct"; 
  }
  else{
   cout<<"It is wrong"; 
  }
  
}
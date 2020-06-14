#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1;
  string s2;
  int count=0,x,y;
  getline(cin,s1);
  getline(cin,s2);
  x=s1.size();
  y=s2.size();
  
  for(int i=0;i<s1.size();i++)
  {
   if(s1[i]==s2[x-1])
   {
    count+=1;
     x--;
   }
    
  }
  
  if(count==y)
  {
   cout<<"It is correct"; 
  }
  else{
   cout<<"It is wrong"; 
  }
}
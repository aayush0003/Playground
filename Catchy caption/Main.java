#include <string>
#include <iostream>
using namespace std;
int main()
{
   string s;
  getline(cin,s);
  int count=0;
  for(int i=0;i<s.size();i++)
  {
   if(s[i]==' '){
    count+=1; 
   }
  }
  if(count>9){
  cout<<"Caption not eligible for the contest";  
  }
  else{
   cout<<"Caption eligible for the contest"; 
  }

}
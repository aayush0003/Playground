#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thu,fri,sat,b1,b2,temp,weekd,salweekd =0,total,r1,r2,r3,r4,r5;
  cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
  b1 = sat*125;
  b2 = sun*150;
  if(mon<= 8 )
    r1=mon*100;
  else if(mon>8)
    r1 = (8*100) +(mon-8)*15 + (mon-8)*100;

  if(tue<= 8 )
    r2 = tue*100;
    
  else if(tue>8)
    r2 = (8*100) +(tue-8)*15 + (tue-8)*100;
   
  if(wed<= 8 )
    r3 = wed*100;
    
 else if(wed>8)
    r3 = (8*100) +(wed-8)*15 + (wed-8)*100;
    
  if(thu<= 8 )
    r4 = thu*100;
   
  else if(thu>8)
    r4 = (8*100) +(thu-8)*15+ (thu-8)*100;

  if(fri<= 8 )
    r5 = fri*100;
  
  else if(fri>8)
    r5 = (8*100) +(fri-8)*15 + (fri-8)*100;
   
  temp = mon+tue+wed+thu+fri;
  if(temp>40)
    weekd = temp-40;
    salweekd= weekd*100 + weekd*25;
  total = b1+b2+r1+r2+r3+r4+r5+salweekd;
  cout<<total;
  
  
  
    
  
}
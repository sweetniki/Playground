

#include <iostream>
#include<math.h>
using namespace std;
int main()
{
  int x;
  int final=0;
  cin>>x;
  int sq=x*x;
  int count=0;  
  while(sq>0)
  {
     count++;
     sq=sq/10;
  }
  sq=x*x;
  for(int i=1;i<count;i++)
  {
    int eq=pow(10,i);
      if(eq==x)
        continue;
    int sum=sq/eq+sq%eq;
  if(sum==x)
      final=1;
  }
    if(final==1)
        cout<<"Kaprekar Number";
    else
        cout<<"Not a Kaprekar Number";
   return 0;
}

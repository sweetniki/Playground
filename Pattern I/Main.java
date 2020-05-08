
#include<iostream>
using namespace std;
int main()
{
  int x,y,i,j;
  cin>>x;
  
  y=x+3;
  
  for(i=x ; i<=y ;i++)
  {
    for(j=x-1; j<i ;j++)
    {
       cout<<i;
    }
  cout<<endl;
  }
  for(i=y; i>=x ;i--)
  {
    for(j=x; j<=i ;j++)
    {
       cout<<i;
    }
  cout<<endl;
  }
  return 0;
}


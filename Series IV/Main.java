#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  for(int i =1;i<=n;i++)
  {
    int sum = 0;
    if(i % 2== 0)
    	sum = pow(i,2) - 2;
    else
      sum = pow(i,2) - 1;
    cout<<sum<<" ";
  }  
  return 0;
}

#include<iostream>
#include<math.h>
using namespace std;

int main()
{
	int a,sum,n=11;
  	cin>>a;
  
  for(int i=0;i<a;i++)
  {
    sum = pow(n,2);
    cout<<sum<<" ";
    n+=4;
  }
  return 0;
}

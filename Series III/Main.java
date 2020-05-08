
#include<iostream>
#include<math.h>
using namespace std;

int main()
{
	int a=6,b=5,n;
  cin>>n;
  
  for(int i=0;i<n;i++)
  {
    cout<<a<<" ";
    a = a+b;
    b = b+5;
  }
  return 0;
}


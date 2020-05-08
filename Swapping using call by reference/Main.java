#include <iostream>
using namespace std;
int swap(int &a , int &b)
{
 	int temp=0;
  temp = a;
  a = b;
  b = temp;
}

int main()
{
	int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
  
  return 0;
}

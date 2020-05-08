
#include<iostream>
using namespace std;

int func(int n)
{
  if(n == 0)
    return 0;
  return (n % 10 + func(n/10));
}
int main()
{
  int n,res=0;
  cin>>n;
  res =  func(n);
  cout<< func(res);
	return 0;
}

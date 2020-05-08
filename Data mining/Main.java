#include<iostream>
using namespace std;
int main()
{
 	int num,sum =0,even =0,odd = 0;
  	cin>>num;
  while(num > 0)
  {
  	sum = num % 10;
    if(sum%2 == 0)
    	even += sum;
    else
      odd += sum;
    num = num/10;
  }
  if(even == odd)
    cout<<"Yes";
  else
    cout<<"No";
 return 0;
}

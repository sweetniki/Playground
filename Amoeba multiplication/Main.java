#include<iostream>
using namespace std;
int main()
{
  int num,temp1=0,temp2=1,sum =0;
  cin>>num;
  for (int i = 1; i < num; i++)
    {
       sum = temp1 + temp2;
       temp1 = temp2;
       temp2 = sum;
    }
  cout<<temp1;
  return 0;
}


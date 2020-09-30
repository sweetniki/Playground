
#include<iostream>
using namespace std;
int main()
{
  int num,temp=0,temp2=1,sum =0;
  cin>>num;
  for (int i = 1; i < num; i++)
    {
       sum = temp + temp2;
       temp = temp2;
       temp2 = sum;
    }
  cout<<temp;
  return 0;
}


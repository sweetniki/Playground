
#include<iostream>
using namespace std;
int factorial(int num)
{
  if( num > 0)
    return num * factorial(num-1);
  else
    return 1;
}

int main()
{
  //Type your code here.
  int num;
  cin>>num;
  cout<<"The factorial of "<<num<<" is "<<factorial(num);
}

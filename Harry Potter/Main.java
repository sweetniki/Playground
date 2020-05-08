#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,i,r1,r3,a1[10];

 std::cin>>a;

 i=0;

 while(a!=0)

 {

  r1=a%10;

       a1[i]=r1;

       i++;

      a=a/10;

 }

 r3=a1[0]+a1[3];

std::cout<<r3;
}
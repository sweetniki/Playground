#include<iostream>
using namespace std;
int main()
{int year;
  //Type your code here.
 std::cin>>year;
if(year%4==0)
{
  if(year%100==0)
  {
    if(year%400==0)
    
            std::cout<<year<<" is a leap year";
      else
            std::cout<<year<<" is  not a leap year";
       }
    else
           std::cout<<year<<" is a leap year";
       }
    else
      std::cout<<year<<" is not a leap year";
    return 0;
  }


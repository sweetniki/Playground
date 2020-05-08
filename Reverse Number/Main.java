#include <iostream>
int main() 
{
	// Type your code here
  int number,rev=0,rem;
  std::cin>>number;
  while(number!=0)
  {
    rem=rev*10;
    rev=rem+number%10;
    number=number/10;
   }
  std::cout<<rev;
  return 0;
}
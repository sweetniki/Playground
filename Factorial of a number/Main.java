#include<iostream>
int main(){
  // Type your code here
  int fact=1,num,i;
  std::cin>>num;
  for(i=1;i<=num;i++)
  {
    fact=fact*i;
  }
  std::cout<<fact;
  
}
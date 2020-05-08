#include<iostream>
#include<math.h>
int arm(int n)
{
  int sum=0,m=n,val1=n;
int count=0;
  while(m>0)
  {
    m=m/10;
    count++;

  }    
for(int i=0;i<count;i++)
{
  int temp=n%10; int value=1;
  		for(int j=0;j<count;j++)
        {
          value=value*temp;
        }
  sum=sum+value;
 
  		n=n/10;  
} if(sum==val1)
{
  return 1;
}
}
int main()
{
    int n;
    std::cin>>n;
  if(arm(n)==1)
  {
    std::cout<<"Kindly proceed with encrypting";
    
  }
  else
  {
    std::cout<<"It is not an Armstrong number";
  }
}

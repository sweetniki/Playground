#include<iostream>
int main()
{
  int n,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
   std::cin>>a[i];
  }
  int comp;
  std::cin>>comp;
  for(i=0;i<n;i++)
  {
    if(comp==a[i])
    {
      std::cout<<"She passed her exam";
      break;
    }
  }
  if(i==n)
  {
    std::cout<<"She failed";
  }
  return 0;
}
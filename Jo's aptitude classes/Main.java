#include<iostream>
int factor(int x,int y,int z)
{
    int gcf=0;
for(int i=1;i<x+y+z;i++)
{
    if(x%i==0 && y%i==0 && z%i==0)
    {
        gcf = i;
    }
}
  return gcf;
}
int main()
{
  int x,y,z,ans;
  std::cin>>x>>y>>z>>ans;
  if(factor(x,y,z)==ans)
  {
    std::cout<<"Answer is correct.";
  }
  else
  {
    std::cout<<"Answer is wrong.";
  }
}


  #include<iostream>
using namespace std;
int main()
{
int x,y,r;
double inter,amount,disc,finall;
std::cin>>x>>y>>r;
inter=(x*y*r)/100;
amount=x+inter;
disc=inter*2/100;
finall=x+inter-disc;
  
std::cout<<inter<<endl;
std::cout<<amount<<endl;
std::cout<<disc<<endl;
std::cout<<finall<<endl; 
  return 0;
}

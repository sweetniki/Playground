#include<iostream>

using namespace std;

int main()

{

float x1,x2,x3,y1,y2,y3,x,y;

cin>>x1;//2

std::cin>>y1;//4

std::cin>>x2;//10

std::cin>>y2;//15

std::cin>>x3;//5

std::cin>>y3;//8

x=(x1 + x2 + x3)/3;//5.66667

y=(y1 + y2 + y3)/3;//9

std::cout<<x<<"\n"<< y;

return 0;

}
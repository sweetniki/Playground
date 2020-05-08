#include<iostream>
using namespace std;
int main()
{
	int r,c,stick;
	cin >> r >> c;
	if( r < c )
    stick = r;
  else
    stick = c;
  if(stick%2==0)
	cout<<"Mani Iyer";
  else
	cout<<"Arun Gupta";
  return 0;
}

#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,dtotal,ctotal;
  cin >> d1 >> c1 >> d2 >> c2;
  dtotal = d1 + d2;
  ctotal = c1+c2;
  if(ctotal >= 100)
  {
   dtotal += 1;
    ctotal -=100;
  }
  cout<<dtotal<<endl<<ctotal;
  return 0;
}


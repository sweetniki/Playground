
#include<iostream>
using namespace std;
int main()
{
  int a,c=0,n,s=0,i=0;
  cin>>n;
  do{
  	c++;
       cin>>a;
        s+=a;
        i++;
    }while(s<n);
  cout<<"The number of turns is "<<c;
}

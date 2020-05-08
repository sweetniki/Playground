#include<iostream>
using namespace std;
int main()
{
	int n;
  cin>>n;
 int space,i,j,lterm,rterm; 
  lterm = 1;
  rterm = n*n +1;
  for( i=n ; i > 0 ;i--)
  {
  	for(space = n; space > i; space--)
  	{
  		cout<<"--";
  	}
    for(j = 1; j<=i ; j++)
    {
      cout<<lterm<<"*";	
      lterm++;
    }
    for(j=1 ; j <= i ; j++)
    {
      cout<<rterm;
      if(j < i)
        cout<<"*";
        rterm++;
    }
      rterm = rterm - (i-1) * 2 - 1;
      cout<<endl;
  }
  return 0;
}

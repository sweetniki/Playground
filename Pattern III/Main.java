#include<iostream>
using namespace std;
int main()
{
int n;
	cin>>n;
  for(int i=1;i<n+1;i++)
  {
    for(int j=0;j<i;j++)
    {
      if(j==i-1)
      {
      cout<<i<<endl;
      }
      else
      {
        cout<<i<<"*";
      }
    }
  }
 for(int i=n;i>0;i--)
 {
   for(int j=i;j>0;j--)
   {
      if(j==1)
      {
		cout<<i<<endl;
      }
      else
      {
        cout<<i<<"*";
      }
   }
 }
 return 0;
}

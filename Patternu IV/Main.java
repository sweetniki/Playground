#include <iostream>
using namespace std;
int main()
{
    // Type your code here
  int n;
  cin>>n;
  
  for(int i=1;i<=n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i%2==0 && j==0)
      {
      cout<<i+1;
      }
      else if(i%2!=0 &&j==n-1)
      {
        cout<<i+1;
      }
      else
      {
        cout<<i;
      }
    }
  cout<<endl;  
  }
    return 0;
}

#include<iostream>
using namespace std;
int main()
{
	int a,b;
  	cin>>a>>b;
  	int *mugs;
  mugs = (int*) malloc(a * sizeof(int)) ;
  for(int i=0 ; i < a ; i++)
  {
    cin>>*(mugs+i);
  }
  int win = 0;
  for(int i=0 ; i < a; i++)
  {
	if (*(mugs + i) == *(mugs + i+1))
	{
      win = 1;
      break;
	}
    else
      win = 0;
  }
  if( win == 1)
    cout<<"YES";
  else
    cout<<"NO";
  return 0;
}

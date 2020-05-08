#include<iostream>
#include<math.h>
using namespace std;

int test(int,int);
int main()
{
	int m,n,req,val;
  cin>>m>>n>>req;
  
  val = test(m,n);
  
  if( req <= val)
  	cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}

int test(int a,int b)
{
	return pow(a,b);
}

	



#include<iostream>
using namespace std;
int main()
{
  	int n,a,b=0;
 	cin>>n; 
    for (int i=1; i<=n; i++) 
    { 
        if (i%2 != 0) 
        { 
            for (a=b+1; a<b+i; a++)
            {
                cout<<a<<"*"; 
            }
            cout<<a++<<endl;  
            b = a;     
        } 
        else
        { 
            b = b+i-1; 
            for (a=b; a>b-i+1; a--) 
            {   
      	        cout<<a<<"*"; 
            }
          cout<<a<<endl;     
        } 
    }
  return 0;
}

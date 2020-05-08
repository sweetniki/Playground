#include <iostream>
using namespace std;
int fib(int x) {
   if((x==1)||(x==0)) {
      return(x);
   }else {
      return(fib(x-1)+fib(x-2));
   }
}
int main() {
   int x , i=0,a[15];
   cin >> x;
   while(i < x)
   {
      a[i] = fib(i);
      i++;
   }
   for(int i = 0;i<=x;i++)
   {
       if( i == x)
       {
           cout<<"The term "<< i <<" in the fibonacci series is "<<a[i-1];   
           break;
       }
   }
   return 0;
}

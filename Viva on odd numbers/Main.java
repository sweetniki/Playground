
#include<iostream>
using namespace std;
int main()
{
  int a ,count=0;
  float score=0.0f;
  do{
    cin>>a;
    if(a < 0)
    {
      score -= 1.0;
    }else if(a% 2 != 0)
    {
    	score++;
      count++;
    }
    else
    {
    	score -= 0.5;
    }
  }while(a>0 && count != 3);
  cout<<score;
  return 0;
}

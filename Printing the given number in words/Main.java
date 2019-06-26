#include<stdio.h>
int main()
{
  int x;
  scanf("%d",&x);
  if(x<=5)
  {
    if(x==5)
    {
    printf("five");
    }
    if(x==3)
    {
      printf("Three");
    }
  }
  else{
    printf("Invalid");
  }
  return 0;
}
#include<stdio.h>
int main()
{
  int x,c,d;
  scanf("%d",&x);
  c=x/100;
  d=x%10;
  c=c+d;
  printf("%d",c);
  return 0;
}
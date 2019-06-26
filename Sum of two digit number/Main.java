#include<stdio.h>
int main()
{
int x,g,h;
  scanf("%d",&x);
  g=x%10;
  h=x/10;
  g=g+h;
  printf("%d",g);
  
  return 0;
}
#include <stdio.h>

int main(void){
   int ayush;
   printf("How much rupees >>>");
   scanf("%d",&ayush);

    if (ayush >= 25000){

        printf("I am going to Goa with P\n");
    }
    else if (ayush >= 15000){
        printf("Going to Shopping with P\n");
    }
    else if (ayush > 5000){
        printf("Candle light dinner\n");
    }
    else{
        printf("Intezaar kisi ka\n ");
    }


return 0;


}
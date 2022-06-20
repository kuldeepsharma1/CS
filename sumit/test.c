#include <stdio.h>

int main() {
float celsius, fahrenheit;

printf("Enter temp in Celsius : ");
scanf("%f", &celsius);

fahrenheit = (1.8 * celsius) + 32;
printf("\nTemperature in Fahrenheit : %f \n", fahrenheit);

return (0);
}
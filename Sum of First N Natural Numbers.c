#include <stdio.h>

int main() {
    int n, sum = 0;
    
    printf("Enter a positive integer: ");
    scanf("%d", &n);
    
    // For loop to add numbers from 1 to n
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    
    printf("Sum of first %d natural numbers = %d\n", n, sum);
    return 0;
}

#include <stdio.h>

int main() {
    int n, i;
    
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int nums[n];

    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &nums[i]);
    }

    printf("First element: %d\n", nums[0]);
    printf("Last element: %d\n", nums[n - 1]);

    return 0;
}

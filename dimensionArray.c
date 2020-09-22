#include <stdio.h>
#include <stdlib.h>

// int main() {
//     int t[3][4];
//     for(int i = 0;i < 3;i++)
//     {
//         for(int j = 0;j < 4;j++)
//         {
//             printf("Enter the number for t[%d][%d]: ", i, j);
//             scanf("%d", &t[i][j]);
//         }
//     }
//     for (int i = 0; i < 3; i++)
//     {
//         for (int j = 0; j < 4; j++)
//         {
//             printf("%d ", t[i][j]);
//         }
//         printf("\n");
//     }
// }

int sum(int a,int b){
    int sum;
    sum = (a + b) * 2;
    return sum;
}

int main() {
    int a, b, re;
    printf("Enter the number for a: ");
    scanf("%d", &a);
    printf("Enter the number for b: ");
    scanf("%d", &b);
    re = sum(a, b);
    re = re + sum(a, b);
    printf("The result: %d", re);
}

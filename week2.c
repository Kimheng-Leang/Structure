#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// int main() {
//     int num, choise, fac = 1, p, n = 1, sum = 0, rem, rev = 0;
//     bool status = true;
//     printf("1. factorial\n2. find power\n3. check prime number\n4. check perfect number\n5. reverse number\n ");
//     printf("Enter the option: ");
//     scanf("%d", &choise);
//     printf("Enter the number: ");
//     scanf("%d", &num);
//     switch(choise)
//     {
//         case 1:
//             for(int i = 1;i <= num;i++)
//             {
//                 fac *= i;
//             }
//             printf("\n%d facatorial is %d.\n", num, fac);
//             break;
//         case 2:
//             printf("Enter the power that you want to raise: ");
//             scanf("%d", &p);
//             for(int i = 1;i <= p;i++)
//             {
//                 n *= num;
//             }
//             printf("\n%d raise to the power of %d is %d\n", num, p, n);
//             break;
//         case 3:
//             for(int i = 2;i < num/2;i++)
//             {
//                 if (num % i == 0)
//                 {
//                     status = false;
//                     break;
//                 }
//             }
//             if (status == true)
//             {
//                 printf("\n%d is a prime number.\n", num);
//             }
//             else
//             {
//                 printf("\n%d is not a prime number.\n", num);
//             }
//             break;
//         case 4:
//             for(int i = 1;i < num;i++)
//             {
//                 if (num % i == 0)
//                 {
//                     sum += i;
//                 }
//             }
//             if (sum == num)
//             {
//                 printf("\n%d is a perfect number.\n", num);
//             }
//             else
//             {
//                 printf("\n%d is not a perfect number.\n", num);
//             }
//             break;
//         case 5:
//             while (num != 0)
//             {
//                 rem = num % 10;
//                 rev = rev * 10 + rem;
//                 num /= 10;
//             }
//             printf("\nThe reverse number: %d\n", rev);
//             break;
//         default:
//             printf("\nYour input is invalid, please try again !!!!\n");
//             break;
//     }
// }

// int main() {
//     int year;
//     printf("Enter the year: ");
//     scanf("%d", &year);
//     if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0)
//     {
//         printf("%d is a leap year.", year);
//     }
//     else
//     {
//         printf("%d is not a leap year.", year);
//     }
    
// }

// fibonacci sequence: 0 1 1 2 3 5 8 ....
int main() {
    int prev = 0, pre = 1, trm, i, n;
    printf("Enter the number: ");
    scanf("%d", &n);
    printf("The fibonaccin sequence: %d %d ", prev, pre);
    for(i = 3;i <= n;i++)
    {
        trm = prev + pre;
        printf("%d ", trm);
        prev = pre;
        pre = trm;
    }
    printf("\n");
}

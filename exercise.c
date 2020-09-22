#include <stdio.h>
#include <stdbool.h>
#include <math.h>

// reverse an integer
// int main() {
//     int num, rev = 0, remainder;
//     printf("Enter the integer: ");
//     scanf("%d", &num);//num = 512
//     while (num != 0)
//     {
//         remainder = num % 10;//5
//         rev = rev * 10 + remainder; // 215
//         num /= 10;//0
//     }
//     printf("Reverse integer: %d", rev);
// }

// Multiplication table up to 10
// int main() {
//     int num, i;
//     printf("Enter the number: ");
//     scanf("%d", &num);
//     for(i = 1;i <= 10;i++)
//     {
//         printf("%d * %d = %d\n", num, i, (num * i));
//     }
// }

// check the input whether it's a number, symbol or character.
// check character whether it's a vowel or consonant, uppercase or lowercase.
// int main() {
//     char alp;
//     printf("\nEnter the character: ");
//     scanf("%c", &alp);
//     if (alp >= 48 && alp <= 57)
//     {
//         printf("%c is a number.", alp);
//     }
//     else if (alp >= 65 && alp <= 90)
//     {
//         if (alp == 'A' || alp == 'E' || alp == 'I' || alp == 'O' || alp == 'U')
//         {
//             printf("%c is a vowel in uppercase.", alp);
//         }
//         else
//         {
//             printf("%c is a consonant in uppercase.", alp);
//         }
//     }
//     else if (alp >= 97 && alp <= 122)
//     {
//         if (alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u')
//         {
//             printf("%c is a vowel in lowercase.", alp);
//         }
//         else
//         {
//             printf("%c is a consonant in lowercase.", alp);
//         }
//     }
//     else
//     {
//         printf("%c is a symbol.", alp);
//     }
//     printf("\n");
// }

// check the number whether it's a perfect number or not
// 6 can be divise by 1, 2, 3 while 1+2+3 = 6
// int main() {
//     int num,sum = 0;
//     printf("Enter the number: ");
//     scanf("%d", &num);
//     for(int i = 1;i < num;i++)
//     {
//         if (num % i == 0)
//         {
//             sum += i;
//         }
//     }
//     if (sum == num)
//     {
//         printf("%d is a perfect number.", num);
//     }
//     else
//     {
//         printf("%d is not a perfect number.", num);
//     }

// }

// int main()
// {
//     int result = 1, rev = 0, fac = 1, num, n, sum = 0;
//     int remainder, number, p;
//     bool status = true;
//     printf("Enter the number: ");
//     scanf("%d", &num);
//     printf("1. factorial\n2. find power\n3. check prime number\n4. check perfect number\n5. reverse number \n");
//     printf("Enter the option: ");
//     scanf("%d", &n);
//     switch (n)
//     {
//         {
//         case 1:
//             for (int i = 1; i <= num; i++)
//             {
//                 fac *= i;
//             }
//             printf("%d factorial is %d.", num, fac);
//             break;
//         case 2:
//             printf("Enter the power that you want to raise: ");
//             scanf("%d", &p);
//             for (int i = 1; i <= p; i++)
//             {
//                 result *= num;
//             }
//             printf("%d raise to the power of %d is %d.", num, p, result);
//             break;
//         case 3:
//             for (int i = 2; i < num / 2; i++)
//             {
//                 if (num % i == 0)
//                 {
//                     status = false;
//                     break;
//                 }
//             }
//             if (status == 1)
//             {
//                 printf("%d is a prime number.", num);
//             }
//             else
//             {
//                 printf("%d is not a prime number.", num);
//             }
//             break;
//         case 4:
//             for (int i = 1; i < num; i++)
//             {
//                 if (num % i == 0)
//                 {
//                     sum += i;
//                 }
//             }
//             if (num == sum)
//             {
//                 printf("%d is a perfect number.", num);
//             }
//             else
//             {
//                 printf("%d is not a perfect number.", num);
//             }
//             break;
//         case 5:
//             number = num;
//             while (num != 0)
//             {
//                 remainder = num % 10;
//                 rev = rev * 10 + remainder;
//                 num /= 10;
//             }
//             printf("The reverse integer of %d is %d.", number, rev);
//             break;
//         default:
//             printf("Your input is invalid !!!!!!.");
//             break;
//         }
//     }
// }

int main()
{
    int a, total = 1, sum = 0, rev, remain;
    printf("Enter the number: ");
    scanf("%d", &a);
    //1.calculator to find factorial of number
    for (int i = 1; i <= a; i++)
    {
        total = total * (i);
    }
    printf("  %d factorial = ", a);
    printf("%d \n", total);

    //3.check prime number
    if (a == 2 || a == 3)
    {
        printf("\n  %d is a prime number\n", a);
    }
    else if (a % 2 == 0 || a % 3 == 0)
    {
        printf("\n  %d is not a prime number\n", a);
    }
    else
    {
        printf("\n  %d is a prime number\n", a);
    }

    //4.check perfect number
    for (int i = 1; i < a; i++)
    {
        if (a % i == 0)
        {
            sum += i;
        }
    }
    if (sum == a)
    {
        printf("\n  %d is a perfect number\n", a);
    }
    else
    {
        printf("\n  %d is not a perfect number\n", a);
    }
    //5.reverse number
    printf("\n  %d", a);
    while (a != 0)
    {
        remain = a % 10;
        rev = rev * 10 + remain;
        a /= 10;
    }
    printf(" reverse to %d", rev);
}

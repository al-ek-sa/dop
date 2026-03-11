#include <stdio.h>
#include <stdlib.h>


int main() {
    int size;
    int input;
    const int MAX_VALUE = 65535;

    while (1) {
        printf("Введите размер массива: ");
        input = scanf("%d", &size);
        while (getchar() != '\n');
        if (input == 1 && size > 0) {
            break;
        }
    }

    int *arr = (int*)malloc(size * sizeof(int));

    for (int i = 0; i < size; i++) {
        while (1) {
            input = scanf("%d", &arr[i]);
            while (getchar() != '\n');
            if (input == 1 && arr[i] >= 0 && arr[i] <= MAX_VALUE) {
                break;
            }
            printf("Число вышло за диапазон либо введено не целое значение");
        }
    }

    for (int i = 0; i < size; i++) {
        printf("%d \n", arr[i]);
    }

    unsigned long long result = 0;

    for (int i = size - 1; i >= 0; i--) {
        result = (arr[i] % 2) + (result * 2);
        if (result > 65535) {
            printf("выход за одз\n");
            result = result - 65535;
        }
    }
    printf("Результат: %llu\n", result);

    free(arr);
    return 0;
}
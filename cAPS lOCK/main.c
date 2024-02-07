#include <stdio.h>
#include <ctype.h>

int main() {
    char word[101];
    scanf("%s", word);


    int isAllUppercase = 1;
    int isExceptFirstLowercase = 1;

    for (int i = 0; word[i] != '\0'; ++i) {
        if (!isupper(word[i])) {
            isAllUppercase = 0;
            if (i != 0) {
                isExceptFirstLowercase = 0;
                break;
            }
        }
    }

  
    if (isAllUppercase || (isExceptFirstLowercase && word[0] >= 'a' && word[0] <= 'z')) {
        for (int i = 0; word[i] != '\0'; ++i) {
            word[i] = isupper(word[i]) ? tolower(word[i]) : toupper(word[i]);
        }
    }


    printf("%s\n", word);

    return 0;
}

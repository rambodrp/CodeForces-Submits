#include<iostream>
using namespace std;
int main(){
    string s;
    int upper= 0 , lower = 0 , i; 
    cin >> s;

    if(s.length() >= 1 && s.length() <=100){
        for(i = 0 ;i<s.length();i++){
            if(s[i] >= 'A' && s[i] <= 'Z')
                upper++;
            else if (s[i] >= 'a' && s[i] <= 'z')
                lower++;
        }
        if(upper > lower){
            for(int x = 0; x<s.length(); x++)
            cout << static_cast<char>(toupper(s[x])) ;
        }else if (upper <= lower){
            for(int y = 0; y<s.length() ; y++)
            cout << static_cast<char>(tolower(s[y]));
        }
    }
    return 0;
}

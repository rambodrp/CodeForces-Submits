#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> coins(n);

    for (int i = 0; i < n; ++i) {
        cin >> coins[i];
    }
    sort(coins.rbegin(), coins.rend());
    int total_sum = 0;
    for (int i = 0; i < n; ++i) {
        total_sum += coins[i];
    }

    int your_sum = 0;
    int coins_taken = 0;

    for (int i = 0; i < n; ++i) {
        your_sum += coins[i];
        coins_taken++;
        if (your_sum > total_sum / 2) {
            break;
        }
    }

    cout << coins_taken << endl;

    return 0;
}

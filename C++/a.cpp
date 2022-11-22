#include<iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int a[10];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int i;
    int j;
    cin >> i;
    cin >> j;
    int b;
    int c;
    int temp;
    for (int k = 0; k < n; k++) {
        if (a[k] == i) {
            b = k;
        }
        if (a[k] == j) {
            c = k;
        }
    }
    temp = a[b];
    a[b] = a[c];
    a[c] = temp;
    int d = true;
    for (int l = 0; l < n; l++) {

        if (d) {
            cout << a[l];
            d = false;
        } else {
            cout << " " << a[l];
        }
    }

}

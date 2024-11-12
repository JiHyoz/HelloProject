#include <iostream>
#include <stdio.h>

using namespace std;

int mul();

int main() {
    int d = mul();
    cout << "result " << d << endl;
    return 0;
}

int mul() {
    int a = 10;
    int b = 0;
    int c = a / b;
    return c;
}
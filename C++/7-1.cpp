/**
* 7-1 堆栈操作合法性
* 假设以S和X分别表示入栈和出栈操作。如果根据一个仅由S和X构成的序列，
* 对一个空堆栈进行操作，相应操作均可行（如没有出现删除时栈空）且最后
* 状态也是栈空，则称该序列是合法的堆栈操作序列。请编写程序，输入S和X
* 序列，判断该序列是否合法。
*/
#include "iostream"

using namespace std;

bool judge(const string &str, const int &sqr) {
    int flag = 0;

    for (int i = 0; i < str.length(); i++) {
        if (str[i] == 'S') {
            flag++;
            if (flag > sqr) return false;
        } else {
            flag--;
            if (flag < 0) return false;
        }
    }
    if (flag != 0) return false;
    else return true;
}

int main() {
    int num, sqr;
    cin >> num >> sqr;

    for (int i = 0; i < num; i++) {
        string str;
        cin >> str;

        judge(str, sqr) ? cout << "YES" << endl : cout << "NO" << endl;
    }

    return 0;
}
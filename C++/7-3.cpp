/**
 * 7-3 凯撒密码
 * 为了防止信息被别人轻易窃取，需要把电码明文通过加密方式变换成为密文。输入一
 * 个以回车符为结束标志的字符串（少于80个字符），再输入一个整数offset，用凯
 * 撒密码将其加密后输出。恺撒密码是一种简单的替换加密技术，将明文中的所有字母
 * 都在字母表上偏移offset位后被替换成密文，当offset大于零时，表示向后偏移；
 * 当offset小于零时，表示向前偏移。
 */
#include "iostream"
#include "list"

using namespace std;

// 字符转置
char strExchange(char str, int lab) {
    if (str >= 'a' && str <= 'z') {
        if (str + lab % 26 > 'z') return str + lab % 26 - 26;
        else if (str + lab % 26 < 'a') return str + lab % 26 + 26;
        else return str + lab % 26;
    } else if (str >= 'A' && str <= 'Z') {
        if (str + lab % 26 > 'Z') return str + lab % 26 - 26;
        else if (str + lab % 26 < 'A') return str + lab % 26 + 26;
        else return str + lab % 26;
    } else return str;
}

int main() {
    list<char> list1;

    while (true) {
        char str = getchar();
        if (str == '\n') break;
        else list1.push_back(str);
    }

    int lab = 0;
    cin >> lab;

    for (char &it: list1) {
        cout << strExchange(it, lab);
    }

    return 0;
}
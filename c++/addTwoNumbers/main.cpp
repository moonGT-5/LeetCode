#include "Solution.h"
#include <iostream>

void printList(ListNode* head) {
    ListNode* current = head;
    while (current != nullptr) {
        std::cout << current->val << " -> ";
        current = current->next;
    }
    std::cout << "NULL\n";
}

int main() {
    // 创建两个链表并添加元素
    ListNode* l1 = new ListNode(2);
    l1->next = new ListNode(4);
    l1->next->next = new ListNode(3);

    ListNode* l2 = new ListNode(5);
    l2->next = new ListNode(6);
    l2->next->next = new ListNode(4);

    // 打印原始链表
    std::cout << "List 1: ";
    printList(l1);
    std::cout << "List 2: ";
    printList(l2);

    // 相加操作
    ListNode* sumList = addTwoNumbers(l1, l2);

    // 打印相加后的链表
    std::cout << "Sum List: ";
    printList(sumList);

    // 释放内存
    while (l1 != nullptr) {
        ListNode* temp = l1;
        l1 = l1->next;
        delete temp;
    }
    while (l2 != nullptr) {
        ListNode* temp = l2;
        l2 = l2->next;
        delete temp;
    }
    while (sumList != nullptr) {
        ListNode* temp = sumList;
        sumList = sumList->next;
        delete temp;
    }

    return 0;
}

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1, l2):
        dummyHead = ListNode(0)
        p, q, current = l1, l2, dummyHead
        carry = 0

        while p or q:
            x = p.val if p else 0
            y = q.val if q else 0
            sum = carry + x + y
            carry = sum // 10
            current.next = ListNode(sum % 10)
            current = current.next
            if p: p = p.next
            if q: q = q.next

        if carry > 0:
            current.next = ListNode(carry)

        return dummyHead.next

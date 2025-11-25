/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // фиктивная начальная нода
        ListNode current = dummy;
        int carry = 0; // перенос
        
        // Проходим по обоим спискам пока есть элементы или перенос
        while (l1 != null || l2 != null || carry != 0) {
            // Получаем значения текущих нод (0 если нода null)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // Суммируем значения и перенос
            int sum = val1 + val2 + carry;
            
            // Вычисляем новое значение и перенос
            int digit = sum % 10;
            carry = sum / 10;
            
            // Создаем новую ноду для результата
            current.next = new ListNode(digit);
            current = current.next;
            
            // Переходим к следующим нодам
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummy.next; // пропускаем фиктивную ноду
    }
}
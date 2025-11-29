/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    // Создаем фиктивную начальную ноду для упрощения логики
    dummy := &ListNode{Val: 0}
    current := dummy
    carry := 0 // перенос при сложении
    
    node1, node2 := l1, l2
    
    // Проходим по обоим спискам, пока есть элементы или перенос
    for node1 != nil || node2 != nil || carry != 0 {
        // Получаем значения текущих нод (0 если нода nil)
        val1, val2 := 0, 0
        
        if node1 != nil {
            val1 = node1.Val
            node1 = node1.Next
        }
        
        if node2 != nil {
            val2 = node2.Val
            node2 = node2.Next
        }
        
        // Суммируем значения и перенос
        sum := val1 + val2 + carry
        
        // Вычисляем цифру для текущей позиции и новый перенос
        digit := sum % 10
        carry = sum / 10
        
        // Создаем новую ноду для результата
        current.Next = &ListNode{Val: digit}
        current = current.Next
    }
    
    return dummy.Next // пропускаем фиктивную ноду
}
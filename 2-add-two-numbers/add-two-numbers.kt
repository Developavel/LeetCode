class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // Создаем фиктивную начальную ноду для упрощения логики
        val dummy = ListNode(0)
        var current: ListNode? = dummy
        var carry = 0 // перенос при сложении
        
        var node1 = l1
        var node2 = l2
        
        // Проходим по обоим спискам, пока есть элементы или перенос
        while (node1 != null || node2 != null || carry != 0) {
            // Получаем значения текущих нод (0 если нода null)
            val val1 = node1?.`val` ?: 0
            val val2 = node2?.`val` ?: 0
            
            // Суммируем значения и перенос
            val sum = val1 + val2 + carry
            
            // Вычисляем цифру для текущей позиции и новый перенос
            val digit = sum % 10
            carry = sum / 10
            
            // Создаем новую ноду для результата
            current?.next = ListNode(digit)
            current = current?.next
            
            // Переходим к следующим нодам
            node1 = node1?.next
            node2 = node2?.next
        }
        
        return dummy.next // пропускаем фиктивную ноду
    }
}
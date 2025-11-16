class Solution {
    public boolean isPalindrome(int x) {
        // Отрицательные числа не могут быть палиндромами
        if (x < 0) {
            return false;
        }
        
        // Преобразуем число в строку
        String str = String.valueOf(x);
        
        // Сравниваем строку с перевернутой версией
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
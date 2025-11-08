class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Берем первую строку как основу для сравнения
        String first = strs[0];
        
        // Проходим по всем символам первой строки
        for (int i = 0; i < first.length(); i++) {
            char currentChar = first.charAt(i);
            
            // Проверяем этот символ во всех остальных строках
            for (int j = 1; j < strs.length; j++) {
                // Если текущая строка короче или символ не совпадает
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return first.substring(0, i);
                }
            }
        }
        
        return first;
    }
}
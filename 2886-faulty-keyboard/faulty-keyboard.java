class Solution {
    public String finalString(String s) {
        StringBuilder strs = new StringBuilder();
        int i = 0;
        while(i < s.length()) {
            if (s.charAt(i) != 'i') strs.append(s.charAt(i));
            if(s.charAt(i) == 'i') strs.reverse();
            i++;
        }
        return strs.toString();
    }
}
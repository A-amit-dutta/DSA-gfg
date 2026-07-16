class Solution {
    public String sortString(String s) {
        int [] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<26;i++){
            char ch = (char)(97+ i);
            int j = 0;
            while(j<arr[i]){
                sb.append(ch);
                j++;
            }
            if(j>=s.length()) break;
        }
        return sb.toString();
    }
}
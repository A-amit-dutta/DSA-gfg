class Solution {
    public static boolean isRotated(String s1, String s2) {
        if(s1.length()<2) 
            return s1.equals(s2);
        StringBuilder sb = new StringBuilder();
        sb.append(s1.substring(2,s1.length()));
        sb.append(s1.substring(0,2));
        if(s2.equals(sb.toString()))
            return true;
        sb.setLength(0);
        
        sb.append(s1.substring(s1.length() - 2));
        sb.append(s1.substring(0, s1.length() - 2));
        
        if(s2.equals(sb.toString()))
            return true;
        return false;
    }
}
package assignment_stringmanipulation;

public class StringManipulator {
    public String trimAndConcat(String strA, String strB) {
        return strA.trim().concat(strB.trim());
    }

    public Integer getIndexOrNull(String str, char letter) {
        int idx = str.indexOf(letter);
        if(idx >= 0){
            return idx;
        } else {
            return null; 
        }
    }

    public Integer getIndexOrNull(String str1, String str2) {
        int idx = str1.indexOf(str2);
        if(idx >= 0){
            return idx;
        } else {
            return null; 
        }
    }

    public String concatSubstring(String str1, int beginIndex, int endIndex, String str2) {
        return str1.substring(beginIndex, endIndex).concat(str2);
    }
}

public class StringManipulator{
    public String trimAndConcat(String string1, String string2){
        String newString = string1.trim() + string2.trim();
        return newString;
    }
    public Integer getIndexOrNull(String string, char charecter){
        int char_position = string.indexOf(charecter);
        if (char_position == -1){
            return null;
        }
        else{
        return char_position;
        }
    }
    public Integer getIndexOrNullOf(String string1, String string2){
        int char_position = string1.indexOf(string2);
        if (char_position == -1){
            return null;
        }
        else{
        return char_position;
        }
    }

    public String concatSubstringy(String word1, int int1, int int2, String word2){
        String newString = word1.substring(int1, int2) + word2;
        return newString;
    }
}

public class SimpleStringMethods {
    /**
     * @param s the String to be manipulated.
     * @return the length of string s.
     */
    public int getStringLength(String s){
        return s.length();
    }

    /**
     * charAt can be used to retrieve specific characters of a String, such as the first character.
     * @param s the String to be manipulated.
     * @param n an index of String s.
     * @return the character of String s that is located at position n.
     */
    public char getCharacterAtIndex(String s, int n){
        if (n >= 0 && n < s.length()) {
            return s.charAt(n);
        } else {
            throw new IndexOutOfBoundsException("Index " + n + " out of bounds for string of length " + s.length());
        }
    }

    /**
     * indexOf can be used to retrieve the index of the first character of a String, such as the position of character
     * 'a' in banana, which would result in 1.
     * it returns -1 if the character does not exist.
     * @param s the String to be manipulated.
     * @param c a character within s.
     * @return the index of the first occurrence of c within s.
     */
    public int getIndexGivenCharacter(String s, char c){
        return s.indexOf(c);
    }
}
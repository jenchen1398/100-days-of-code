/**
 * Implement an algorithm to determine if a string has all unique characters. What if you can not
 * use additional data structures?
 */

/**
 * Brute force implementation with additional data structure (hashtable). Runs in O(n).
 */

public boolean allUniqueChars1(String s) {
    int[] counts = new int[140]; //ASCII ranges from 0-127, leaving extra room
    char[] schars = s.toCharArray();
    for(char c: schars) {
        counts[(int) c] += 1;
        if (counts[(int) c] > 1)
            return false;
    }
    return true;
}

/**
 * Revised implementation using no additional DS (runs in O(n^2))
 **/ 
public boolean allUniqueChars2(String s) {
    for (int i=0; i<s.length; i++){
        char c = s.charAt(i);
        for (int j=i+1; j<s.length; j++){
            char d = s.charAt(j);
            if (c == d) return false;
        }
    }
    return true;
}

// How can I improve runtime to O(n) w/o additional DS? Or O(logn)?

/**Option 1: Use a bitvector**/
public boolean allUniqueChars3(String s) {

}

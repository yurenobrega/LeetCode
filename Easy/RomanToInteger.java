class Solution {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int total = 0;
        for(int c = 0; c < charArray.length; c++) {
            if (charArray[c] == 'I' && c+1 < charArray.length) {
                if (charArray[c+1] == 'V' || charArray[c+1] == 'X') {
                    total -= 1;
                }
                else {
                    total += 1;
                }
            }
            else if(charArray[c] == 'V') {
                total += 5;
            }
            else if(charArray[c] == 'X' && c+1 < charArray.length) {
                if (charArray[c+1] == 'L' || charArray[c+1] == 'C') {
                    total -= 10;
                }
                else {
                    total += 10;
                }
            }
            else if(charArray[c] == 'L') {
                total += 50;
            }
            else if(charArray[c] == 'C' && c+1 < charArray.length) {
                if (charArray[c+1] == 'D' || charArray[c+1] == 'M') {
                    total -= 100;
                }
                else {
                    total += 100;
                }
            }
            else if(charArray[c] == 'D') {
                total += 500;
            }
            else if(charArray[c] == 'M') {
                total += 1000;
            }
            else if(charArray[c] == 'I') {
                total += 1;
            }
            else if(charArray[c] == 'X') {
                total += 10;
            }
            else if(charArray[c] == 'C') {
                total += 100;
            }
        }
        return total;
    }
}

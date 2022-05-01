public class EncrypterDecrypter {

    static Character [] charsToChange = {'S', 'H', 'L', 'F', 'P', 'T', 'E'};
    static Character [] charsToChangeTo = {'#', '^', '&', '!', ')', '%', '>'};

    public static String encryptText(String phrase) {
        Character currChar;
        Character originalChar;
        String processedPhrase = "{+} ";

        for (int i = 0; i < phrase.length(); i++) {
            currChar = (Character) phrase.charAt(i); 
            originalChar = currChar;
            currChar = Character.toUpperCase(currChar);
            for (int j = 0; j < charsToChange.length; j++) {
                if (currChar.equals(charsToChange[j])) {
                    currChar = charsToChangeTo[j]; 
                    break; 
                }
                if (currChar.equals(charsToChangeTo[j])) {
                    currChar = charsToChange[j];
                    break;
                }
                if (j == 6) {
                    currChar = originalChar;
                    break;
                }
            }
            String itemToAdd = currChar.toString();
            processedPhrase = processedPhrase.concat(itemToAdd);
        }
        return processedPhrase; 
    }

    public static String decryptText(String phrase) {
        Character currChar;
        Character originalChar;
        String processedPhrase = "{-} ";

        for (int i = 0; i < phrase.length(); i++) {
            currChar = (Character) phrase.charAt(i); 
            originalChar = currChar;
            currChar = Character.toUpperCase(currChar);
            for (int j = 0; j < charsToChange.length; j++) {
                if (currChar.equals(charsToChange[j])) {
                    currChar = charsToChangeTo[j]; 
                    break; 
                }
                if (currChar.equals(charsToChangeTo[j])) {
                    if (Character.isUpperCase(originalChar)) {
                        currChar = charsToChange[j];
                        break;
                    }
                    currChar = Character.toLowerCase(charsToChange[j]);
                    break;
                }
                if (j == 6) {
                    currChar = originalChar;
                    break;
                }
            }
            String itemToAdd = currChar.toString();
            processedPhrase = processedPhrase.concat(itemToAdd);
        }
        return processedPhrase; 
    }
}
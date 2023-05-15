package Morse;

import java.util.HashMap;

public class Logik {
    private HashMap<String, String> morse;
    private String[] mening;
    private String meningCheck;
    private StringBuilder sb = new StringBuilder();

    public Logik() {

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        String[] morseCode = {"*_", "_***", "_*_*", "_**", "*", "**_*", "__*", "****", "**", "*___", "_*_", "*_**", "__", "_*", "___", "*__*", "__*_", "*_*", "***", "_", "**_", "***_", "*__", "_**_", "_*__", "__**", " "};

        morse = new HashMap<>();

        for (int i = 0; i < letters.length; i++) {
            morse.put(letters[i], morseCode[i]);
            morse.put(morseCode[i], letters[i]);
        }

        meningCheck = StartMorse.sentence;

        if (meningCheck.matches("[a-zA-Z]+")) {
            mening = meningCheck.split(""); //Problem att man inte kan ha mellanslag mellan ord men allt annat funkar
            for (int i = 0; i < mening.length; i++) {
                String character = String.valueOf(mening[i]);
                if (morse.containsKey(character)) {
                    sb.append(morse.get(character)).append(" ");
                }
            }
        } else {
            mening = meningCheck.split(" ");
            for (int i = 0; i < mening.length; i++) {
                String character = String.valueOf(mening[i]);
                if (morse.containsKey(character)) {
                    sb.append(morse.get(character));
                }
            }
        }
    }
    public String converterSB(String key) {

        return sb.toString();

    }

}

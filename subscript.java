package Chimera.tech;

public class subscript {

    public String generateSubscript(int i) {
        StringBuilder sb = new StringBuilder();
        for (char ch : String.valueOf(i).toCharArray()) {
            sb.append((char) ('\u2080' + (ch - '0')));
        }
        return sb.toString();
    }
}

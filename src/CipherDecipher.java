public class CipherDecipher {
    public String ciphering(String normal) {
        StringBuffer newStr=new StringBuffer(normal);
        for(int i = 0; i < normal.length(); i++) {
            if(Character.isLowerCase(normal.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(normal.charAt(i))); }
            else if(Character.isUpperCase(normal.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(normal.charAt(i))); }}
        newStr = newStr.reverse();
        String ciphertext = new String(newStr);
        ciphertext = ciphertext.replaceAll(" ","\\*");
        String ciphertext2 = new String();
        for(int i = 0; i < ciphertext.length(); i++) {
            if((i+1)%2==0){
                char ch = ciphertext.charAt(i);
                if(ch == '*'){
                    ciphertext2 += (int) '*';}
                else{
                    ciphertext2 += (int) ch;}}
            else if((i+1)%2!=0){
                char ch = ciphertext.charAt(i);
                ciphertext2 += ch;}}
        return ciphertext2 + 3;}
    public String deciphering(String ciphered) {
        String work = ciphered.substring(0,ciphered.length()-1);
        StringBuffer work2 = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        for (char c : work.toCharArray() ) {
            if(!Character.isLetterOrDigit(c)){
                if(c == '*'){
                    if(temp.length()!=0){
                        work2.append((char) Integer.parseInt(String.valueOf(temp)));
                        temp = new StringBuffer();}
                    work2.append(" ");
                    continue; }
                else if(c == '\''){
                    if(temp.length()!=0){
                        work2.append((char) Integer.parseInt(String.valueOf(temp)));
                        temp = new StringBuffer();}
                    work2.append(c);
                    continue; }
                else{
                    work2.append(c);
                    continue;} }
            else if(Character.isDigit(c)){
                temp.append(c);
                continue; }
            else if(Character.isLetter(c)){
                if(temp.length()!=0){
                    work2.append((char) Integer.parseInt(String.valueOf(temp)));
                    temp = new StringBuffer();
                    work2.append(c);
                    continue; }
                else{
                    work2.append(c);
                    continue;
                }} }
        if(temp.length()!=0){
            work2.append((char) Integer.parseInt(String.valueOf(temp))); }
        StringBuffer decipher=new StringBuffer(work2.reverse());
        for(int i = 0; i < work2.length(); i++) {
            if(Character.isLowerCase(work2.charAt(i))) {
                decipher.setCharAt(i, Character.toUpperCase(work2.charAt(i))); }
            else if(Character.isUpperCase(work2.charAt(i))) {
                decipher.setCharAt(i, Character.toLowerCase(work2.charAt(i))); }}
        return new String(decipher).replaceAll("\\*"," ");
                }}
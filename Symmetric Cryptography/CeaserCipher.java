public class CeaserCipher {
    public static void main(String []args){

        System.out.println(encrypt("ZYxbc", 7));
        System.out.println(decrypt(encrypt("ZYxbc", 7),7));



    }


    public static String encrypt(String plainText, int shift){
        String cipherText = "";
        for(int i = 0; i < plainText.length(); i++){
            char ch = plainText.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + shift);
                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }
                cipherText += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + shift);
                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }
                cipherText += ch;
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public static String decrypt(String cipherText,int shift){

        String plainText ="";

        for(int i = 0; i<cipherText.length();i++){
            char ch = cipherText.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch-shift);
                if(ch <'a'){
                    ch =(char)(ch - 'a' + 'z'+1);
                }
                plainText += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - shift);
                if(ch < 'A'){
                    ch = (char)(ch - 'A' + 'Z' + 1);
                }
                plainText += ch;
            }
            else{
                plainText += ch;
            }



        }
        return plainText;

    }
}
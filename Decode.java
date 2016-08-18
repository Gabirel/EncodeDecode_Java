import java.util.Base64;

/**
 * Created by Gabirel on 8/18/16.
 * 1. Base64 Decode
 * 2. URL Decoder
 */
public class Decode {
    public String reverseBase64(String cipherText) {
        String plainText;

        Base64.Decoder decoder = Base64.getDecoder();

        plainText = new String(decoder.decode(cipherText));
        return plainText;
    }


    public String reverseURLEncode(String urlEncodedText){
       String plainText;

        Base64.Decoder decoder = Base64.getUrlDecoder();

        plainText = new String(decoder.decode(urlEncodedText));
        return plainText;
    }
}

package base64;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

public class Base64BasicEncryptionExample {
  public static void main(String[] args) {
    Base64.Encoder encoder = Base64.getEncoder();

    byte[] byteArray = {1, 2};
    byte[] encodedBytes = encoder.encode(byteArray);

    System.out.println("Encoded Byte Array : " + encodedBytes);

    byte[] newByteArray = new byte[10];
    int x = encoder.encode(encodedBytes, newByteArray);

    System.out.println("Encoded byte array written in another byte array : " + newByteArray);
    System.out.println("Number of bytes written: " + x);

    //String encoding using Base64 encoding

    String string = encoder.encodeToString("VishnuChaturvedi".getBytes());
    System.out.println("Encoded String : " + string);

    //String Decoding

    Base64.Decoder decoder = Base64.getDecoder();

    System.out.println("Decoded String : " + new String(decoder.decode(string)));

    //URL encoding and decoding

    Base64.Encoder urlEncoder = Base64.getUrlEncoder();

    String encodedURL = urlEncoder.encodeToString("https://www.instagram.com/___vishnu__chaturvedi_/".getBytes());
    System.out.println("Encoded URL : " + encodedURL);

    Base64.Decoder urlDecoder = Base64.getUrlDecoder();
    String decodedURL = new String(urlDecoder.decode(encodedURL));
    System.out.println("Decoded URL : " + decodedURL);

  }

}

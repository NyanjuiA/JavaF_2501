package sess11_additional_java_features;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import util.Spacer;

/**
 * Java program to demonstrate Base64 encoding and decoding in Java. This class
 * showcases encoding in standart, URL, and MIME formats.
 *
 *
 * @author a.nyanjui
 */
public class Base64Demo
{

    // Class constant string to store the encoding characterset
    private static final String UTF_8 = StandardCharsets.UTF_8.name();

    /**
     * Encodes a string to Base64 (Standard encoding).
     *
     * @param input The input string to be encoded.
     * @return The Base64 encoded string.
     *
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String encodeBase64(String input)
            throws UnsupportedEncodingException
    {
        return Base64.getEncoder().encodeToString(input.getBytes(UTF_8));
    }

    /**
     * Decodes a Base64 encoded string.
     *
     * @param encoded The Base64 encoded string.
     * @return The decoded string.
     *
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String decodeBase64(String encoded)
            throws UnsupportedEncodingException
    {
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        return new String(decodedBytes, UTF_8);
    }

    /**
     * Encodes a string to Base64 using URL-safe encoding (RFC 4648 5). Uses '-'
     * instead of '+', '_' instead of '/' and omits padding '='.
     *
     * @param input The input string to be encoded.
     * @return The URL-safe Base64-encoded string (no padding).
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String encodeBase64URL(String input)
            throws UnsupportedEncodingException
    {
        return Base64.getUrlEncoder().encodeToString(input.getBytes(UTF_8));
    }

    /**
     * Decodes a URL-safe Base64-encoded string. Accepts strings encoded with
     * {@link Base64#getUrlEncoder()} (i.e., using '-' and '_', no padding).
     *
     * @param encoded The URL-safe Base64-encoded string.
     * @return The original decoded string
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String decodeBase64URL(String encoded)
            throws UnsupportedEncodingException
    {
        byte[] decodedBytes = Base64.getUrlDecoder().decode(encoded);
        return new String(decodedBytes, UTF_8);
    }

    /**
     * Encodes a string to Base64 using MIME encoding (RFC 2045). Uses standard
     * alphabet but inserts line breaks every 76 characters.
     *
     * @param input The input string to encode.
     * @return The MIME Base64-encoded string (with line breaks and padding).
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String encodeBase64Mime(String input)
            throws UnsupportedEncodingException
    {
        return Base64.getMimeEncoder().encodeToString(input.getBytes(UTF_8));
    }

    /**
     * Decodes a MIME Base64-encoded string. Handles line breaks and padding as
     * produced by {@link Base64#getMimeEncoder()}.
     *
     * @param encoded The MIME Base64-encoded string (may contain line breaks).
     * @return The original decoded string.
     * @throws IllegalArgumentException If the input is not valid MIME Base64.
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String decodeBase64Mime(String encoded)
            throws UnsupportedEncodingException
    {
        byte[] decodedBytes = Base64.getMimeDecoder().decode(encoded);
        return new String(decodedBytes, UTF_8);
    }

    /**
     * Generate a concatenated string of random UUIDs.
     *
     * @param count The number of UUIDs to generate.
     * @return A string containing concated UUIDs without separators.
     */
    private static String generateRandomUUIDs(int count)
    {
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < count; ++n)
        {
            sb.append(UUID.randomUUID().toString());
        }
        return sb.toString();
    }

    // main method begins program execution
    public static void main(String[] args)
    {
        String original = "Java string to be encoded with special chars: + / =";

        try
        {
            //=============================================
            // Standard Base64
            //=============================================
            String encodedBasic = encodeBase64(original);
            String decodedBasic = decodeBase64(encodedBasic);
            System.out.printf("Standard Encoded: %s\nStandard Decoded %s\n",
                    encodedBasic,decodedBasic);
            Spacer.separator();
            
            //=============================================
            // URL-Safe Base64
            //=============================================
            String encodedURL = encodeBase64(original);
            String decodedURL = decodeBase64(encodedURL);
            System.out.printf("URL-Safe Encoded: %s\nURL-Safe Decoded %s\n", 
                    encodedURL,decodedURL);
            Spacer.separator();
            
            //=============================================
            // MIME Base64
            //=============================================
            String longText = generateRandomUUIDs(10);
            String encodedMIME = encodeBase64(longText);
            String decodedMIME = decodeBase64(encodedMIME);
            System.out.printf("MIMe Encoded (with line breaks): %s\nMIME "
                    + "Decoded matches original %b\n",encodedMIME,
                    longText.equals(decodedMIME));
            System.out.println("Decoded Length in number of characters: " + 
                    decodedMIME.length());
            Spacer.separator();
            
            
        } catch (Exception e)
        {
            System.err.println("Error: " + e.getLocalizedMessage());
        }
    }
}

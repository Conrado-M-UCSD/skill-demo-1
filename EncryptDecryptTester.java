import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class EncryptDecryptTester {
    
    @Test
    public void testMethodsSimple() {
        String secretMessage = "shhhh, secret!";
        String orginalSecret = "{-} {+} " + secretMessage;
        String expectedMsg = "{+} #^^^^, #>cr>%F";
        secretMessage = EncrypterDecrypter.encryptText(secretMessage);
        assertEquals(expectedMsg, secretMessage);

        secretMessage = EncrypterDecrypter.decryptText(secretMessage);
        assertEquals(orginalSecret, secretMessage);

    }
}

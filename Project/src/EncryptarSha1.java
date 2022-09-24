/*5. Crie uma classe Java que recebe via linha de comando o nome de um file qualquer 
e exibe no console o hash SHA1 desse file. Dica: você pode se basear no exemplo a seguir, 
que gera o hash md5 e adaptá-lo para gerar o hash SHA1: https://www.baeldung.com/java-md5  */

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class EncryptarSha1 {
    public void gerar() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do file: ");
        String file = scanner.nextLine();
       
        MessageDigest digestm = MessageDigest.getInstance("sha-1");
        digestm.reset();
        digestm.update(file.getBytes());

        String sha1 = String.format("%040x",new BigInteger(1,digestm.digest()).toString(16));
        System.out.println("hash =" + sha1);
        scanner.close();
    }
}

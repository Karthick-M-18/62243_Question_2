import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner readInput = new Scanner(System.in);
        String normal=readInput.nextLine();
        String ciphered=readInput.nextLine();
//        String normal = "Welcome to hackerrank";
//        String ciphered = "75N65R82E75C65H*O84*69M79C76E1191";
        CipherDecipher cipherOrDecipher = new CipherDecipher();
        System.out.println(cipherOrDecipher.ciphering(normal));
        System.out.println(cipherOrDecipher.deciphering(ciphered));
    }
}

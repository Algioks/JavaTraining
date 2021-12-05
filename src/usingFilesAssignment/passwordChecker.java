//THE TASK
// Read a file that checks the criteria for a password.
//
//Use this data for your test, or create your own:
//
//*as=Hdflv
//7234243&*
//{=5Y9Y7qo
//Y1{4?9Tff
//05-;4uLZb
//.)814WynN
//72V$V5jn%
//58.,3USfv
//3{5;9OCnd
//:Q%85pGi1
///?92QL4sp
//(%6PiX61p
//295+_OIun
//
//Questions for this assignment
//Read a file that checks the criteria for a password
//
//1. Read a file that contains multiple sets of passwords (use http://www.theonegenerator.com/ to generate a set of test data)
//
//2. Verify that the password contains all the following criteria:
//1. A number
//2. A letter
//3. Special character (! @ #)
//
//3. Create three User Defined Exceptions for the corresponding criteria.
//
//4. If the password does not meet the criteria, create and throw the appropriate exception

package usingFilesAssignment;
import java.io.*;

public class passwordChecker {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\PC\\Desktop\\projects\\JavaTraining\\Files\\passwords.txt";
        File file = new File(fileName);
        String[] passwords = new String[13];

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("ERROR: Could not read the file: " + fileName);
        }


        for (String password : passwords) {
            System.out.println("***********\n" + password);
            boolean hasletter = false;
            boolean hasnumber = false;
            boolean hasspecialCharacter = false;
            boolean hasInvalidCharacter = false;

            for (int n = 0; n < password.length(); n++) {
                if ("0123456789".contains((password.substring(n, n + 1)))) {
                    //System.out.println("Position " + n + " contains a number");
                    hasnumber = true;
                } else if ("abcdefghijklmnoprstuvwxyzq".contains((password.substring(n, n + 1).toLowerCase()))) {
                    //System.out.println("Position " + n + " contains a letter");
                    hasletter = true;
                } else if ("!@#$%^&*()_-~=`[]'/*-+.?:".contains((password.substring(n, n + 1)))) {
                    //System.out.println("Position " + n + " contains a special character");
                    hasspecialCharacter = true;
                } else {
                    try {
                        throw new InvalidCharacterException(password.substring(n, n + 1));
                    } catch (InvalidCharacterException e) {
                        e.toString();
                    }
                }
            }
            try {
                if (!hasnumber) {
                    System.out.println("Password is INVALID");
                    throw new passwordMissingANumberException(password);
                } else if (!hasletter) {
                    System.out.println("Password is INVALID");
                    throw new passwordMissingALetterException(password);
                } else if (!hasspecialCharacter) {
                    System.out.println("Password is INVALID");
                    throw new passwordMissingASpecialCharacterException(password);
                } else {
                    System.out.println("Password is valid");
                }

            } catch (passwordMissingALetterException | passwordMissingANumberException | passwordMissingASpecialCharacterException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Closing password checking app");
    }
}

    class InvalidCharacterException extends Exception {
        String ch;
        InvalidCharacterException(String ch) {
            this.ch = ch;
        }

        public String toString() {
            return ("invalidCharacterException: " + ch);
        }
    }

    class passwordMissingANumberException extends Exception {
        String password;

        passwordMissingANumberException(String password) {
            this.password = password;
        }

        public String toString() {
            return ("The password is missing a number: " + password);
        }
    }

    class passwordMissingALetterException extends Exception {
        String password;

        passwordMissingALetterException(String password) {
            this.password = password;
        }

        public String toString() {
            return ("The password is missing a letter: " + password);
        }
    }

    class passwordMissingASpecialCharacterException extends Exception {
        String password;

        passwordMissingASpecialCharacterException(String password) {
            this.password = password;
        }

        public String toString() {
            return ("The password is missing a special character: " + password);
        }
    }
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
//2. Verify that the password contains all of the following criteria:
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
        String password = null;

        boolean letterFlag = false;
        boolean numberFlag = false;
        boolean specialCharacterFlag = false;

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

        for (int i = 0; i < passwords.length; i++) {
            password = passwords[i];

                try {
                    for (int n = 0; n < password.length(); n++) {
                        if (password.) {
                            if (password.substring(n + 1, (n + 3)).equals("12")) {
                                throw new passwordMissingANumber(password);
                            }
                        }
                    }
                if (password) {
                    throw new passwordMissingALetter(password);
                }
                for (int n = 0; n < password.length() - 2; n++) {
                    if (password) {
                    throw new passwordMissingASpecialCharacter(password);
                    }
                }
                System.out.println(passwords);
            } catch (passwordMissingANumber e) {
                System.out.println("ERROR: password is missing a number");
                System.out.println(e.toString());
            } catch (passwordMissingALetter e) {
                System.out.println("ERROR: password is missing a letter");
                System.out.println(e.toString());
            } catch (passwordMissingASpecialCharacter e) {
                System.out.println("ERROR: password is missing a special character");
                System.out.println(e.toString());
            } finally {
                System.out.println("Closing the Password checking program");
            }
        }

    }
}
class passwordMissingANumber extends Exception {
    String password;

    passwordMissingANumber(String password) {
        this.password = password;
    }

    public String toString() {
        return ("The password is missing a number: " + password);
    }
}

class passwordMissingALetter extends Exception {
    String password;

    passwordMissingALetter(String password) {
        this.password = password;
    }

    public String toString() {
        return ("The password is missing a letter: " + password);
    }
}

class passwordMissingASpecialCharacter extends Exception {
    String password;

    passwordMissingASpecialCharacter(String password) {
        this.password = password;
    }

    public String toString() {
        return ("The password is missing a special character: " + password);
    }
}

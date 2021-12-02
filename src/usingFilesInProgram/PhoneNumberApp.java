package usingFilesInProgram;

import java.io.*;

public class PhoneNumberApp {

    public static void main(String[] args) {

        //This will read a text file and will retrieve phone number

        String fileName = "C:\\Users\\PC\\Desktop\\projects\\JavaTraining\\Files\\PhoneNumber.txt";
        File file = new File(fileName);
        String[] phoneNums = new String[6];
        String phoneNum = null;


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < phoneNums.length; i++) {
                phoneNums[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("ERROR: Could not read the file: " + fileName);
        }


        //Valid phone number
        //11 digits long
        //are code is 86 or 370
        //There can be 112 in the phone

        for (int i = 0; i < phoneNums.length; i++) {
            phoneNum = phoneNums[i];
            try {
                if (phoneNum.length() != 11) {
                    throw new ElevenDigitsException(phoneNum);
                }
                if ((phoneNum.charAt(0) == '0') || (phoneNum.charAt(1) == '9')) {
                    throw new AreaCodeException(phoneNum);
                }
                for (int n = 0; n < phoneNum.length() - 2; n++) {
                    if (phoneNum.substring(n, (n + 1)).equals("1")) {
                        if (phoneNum.substring(n + 1, (n + 3)).equals("12")) {
                            throw new EmergencyPhoneException(phoneNum);
                        }
                    }
                }
                System.out.println(phoneNum);
            } catch (ElevenDigitsException e) {
                System.out.println("ERROR: Phone number is not 10 digits");
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println("ERROR: Phone number has invalid area code");
                System.out.println(e.toString());
            } catch (EmergencyPhoneException e) {
                System.out.println("ERROR: Invalid 112 found");
                System.out.println(e.toString());
            } finally {
                System.out.println("Closing the Phone Number App");
            }
        }
    }
}

class ElevenDigitsException extends Exception {
    String num;

    ElevenDigitsException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("ElevenDigitsException: " + num);
    }
}

class AreaCodeException extends Exception {
    String num;

    AreaCodeException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("AreaCodeException: " + num);
    }
}

class EmergencyPhoneException extends Exception {
    String num;

    EmergencyPhoneException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("EmergencyPhoneException: " + num);
    }
}
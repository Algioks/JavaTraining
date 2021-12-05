package dataStructures;

public class Arrays {

    public static void main(String[] args) {

        String[] alphabet = {"a", "b", "c", "d"/*,"e","f","g","h","i","j","k","l","m","n","o","p","r","s","t","u","v","w","v","x","y","z","q"*/};

        System.out.println("Old fashioned way:");
        for (int i = 0; i < 4; i++) {
            System.out.print(alphabet[i] + "");
        }

        System.out.println("\n\nUsing length variable:");
        for (int n = 0; n < alphabet.length; n++) {
            System.out.print(alphabet[n] + "");
        }

        System.out.println("\n\nUsing the FOR-EACH method:");
        for (String letter : alphabet) {
            System.out.print(letter + "");
        }

        System.out.println("\n\nUsing the Double Arrays:");
        String[][] users = {
                {"John", "Williams", "jv1@trainigns.com", "123456789" },
                {"Sarah", "Johns", "jv2@trainigns.com", "1456456546" },
                {"Tom", "Williams", "jv3@trainigns.com", "4564567867" }};

        //get the size of the array
        int numOfUsers = users.length;
        int numOfFields = users[0].length;
        System.out.println("Number of users: " + numOfUsers);
        System.out.println("Number of fields: " + numOfFields);


        //Traverse the double array
        System.out.println("\n\nTraversing the old way");
        for (int i = 0; i < numOfUsers; i++) {
            for (int g=0; g<numOfFields; g++ ){
                System.out.println(users[i][g]);
            }
        }


        //Traverse the double array
        System.out.println("\n\nTraversing the double array");
        for (int i = 0; i < numOfUsers; i++) {
            String firstName = users[i][0];
            String lastName = users[i][1];
            String email = users[i][2];
            String phone = users[i][3];

            System.out.println(firstName + " " + lastName + " " + email + " " + phone);
        }

        System.out.println("\n\nUsing FOR EACH");
        for (String[] user : users) {
            System.out.print("[ ");
            for (String field : user) {
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }

    }

}

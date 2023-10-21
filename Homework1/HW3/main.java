/*
    Write JAVA program which will work with String object (variable
        • It should print out
        • String first letter/character (on which position is the first String character?)
        • String last character (on which position is the last String character?)
        • Middle letter
        - if the string has odd number of characters, then it is the character that is
        on a half way from the string beginning and end
        - if the string has even number of characters (n), then it is the character
        that is on n/2 position
        • SUM of these 3 characters
        • Find out which character has the
        “biggest value” i.e. biggest code
*/
class Main {
	public static void main( String args[]) {
        // String used as Input
        String Name = "Java Developer";

        // Print the last and first
        System.out.println("Its first characther is: " + Name.charAt(0));
        System.out.println("Its last characther is: " + Name.charAt(Name.length()-1));
        
        // Find the Middle
        int mid;
        if(Name.length() % 2 == 0) {
            mid = Name.length() / 2;
        }  else {
            mid = (Name.length() / 2) + 1;
        }

        System.out.println("It's middle characther is: " + Name.charAt(mid));
        System.out.println("The sum of these characters is: " + ((int)Name.charAt(0) + (int)Name.charAt(mid) + (int)Name.charAt(Name.length()-1)));

        // Authors Note: I Did not understand if the problem asks between the 3 characthers or all characters
        char max_value = 0;
        /*
        if (Name.charAt(0) > Name.charAt(Name.length()-1)) {
            if (Name.charAt(0) > Name.charAt(mid)) {
                max_value = Name.charAt(0);
                result = Name.charAt(0);
            } else {
                max_value = Name.charAt(mid);
                result = Name.charAt(mid);
            }
        } else {
            if (Name.charAt(Name.length()-1) > Name.charAt(mid)) {
                max_value = Name.charAt(Name.length()-1);
                result = Name.charAt(Name.length()-1);
            } else {
                max_value = Name.charAt(mid);
                result = Name.charAt(mid);
            }
        }
        */

        for(int i=0; i < Name.length(); i++) {
            if(Name.charAt(i) > max_value) {
                max_value =  Name.charAt(i);
            }
        }

        System.out.println("The biggest character of these three is: " + max_value + " with code of: " + (int)max_value);

    }
}

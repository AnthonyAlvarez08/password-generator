import java.util.Scanner;

public class PasswordGenerator
{

    // theses will be the sets of possible characters for a password
    private static String digits = "0123456789";
    private static String lowercase = "qwertyuiopasdfghjklzxcvbnm";
    private static String uppercase = lowercase.toUpperCase();
    private static String specials = "`~!@#$%^&*()-_=+[]{}\\|;:'\",./<>?";

    // I don't like the printing method so here
    public static void print(String n)
    {
        System.out.print(n);
    }

    public static void print()
    {
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        String passSet = new String(lowercase);  // the set of characterss to be included in the password
        String password = "";  // the password that will be output
        int passLength;  // password length
        String choice;  // choice of inclusion


        // announce what is automatically included
        print("The password will include lowercase letters by default\n");

        // ask for password length
        System.out.print("Enter password length:  ");
        passLength = reader.nextInt();
        print();

        // ask for upper case & add it
        print("include uppercase (y/n)  ");
        choice = reader.next();
        print();

        if (choice.equals("y"))
            passSet += uppercase;

        // ask for digits case & add it
        print("include digits/numbers (y/n)  ");
        choice = reader.next();
        print();

        if (choice.equals("y"))
            passSet += digits;

        // ask for special characters case & add it
        print("include special characters (y/n)  ");
        choice = reader.next();
        print();

        if (choice.equals("y"))
            passSet += specials;



        // generate the password
        for (int i = 0; i < passLength; ++i)
        {
            password += passSet.charAt((int)(Math.random() * passSet.length()));
        }

        // output and exit
        print("Here is your password: " + password + "\n");
        print("You should copy it to your clipboard and close the console immediately\n");
        reader.close();
        System.exit(0);
    }
}
import java.io.Console;
public class ConsoleEx  {
    public static void main(String[] args) {
        Console c = System.console(); 
        if (c == null){
            System.out.println("no console ");
            return;
        }
        String username = c.readLine("enter name: ");
        char[] pass = c.readPassword("enter password");
        
        String password = new String(pass);

        System.out.println("Username is "+ username);
        System.out.println(("Password is "+password));
    }
    
}

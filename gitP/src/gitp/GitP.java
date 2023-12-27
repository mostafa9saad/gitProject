package gitp;

/**
 *
 * @author mosta
 */
class HelloJava
{
    public void printHelloWorld()
    {
        System.out.println("Hello World");
    }
	public void loginMethod()
	{
		System.out.println("Login Function");
	}
}
class HelloITI
{
    public void printHelloITI()
    {
        System.out.println("Hello ITI");
    }
     public void printHelloGIT()
    {
        System.out.println("Hello Git");
    }
}
<<<<<<< HEAD



=======
class Database{
    int id;
    String name;

    public Database(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
>>>>>>> database
public class GitP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new HelloJava().printHelloWorld();
       new HelloITI().printHelloITI();
       new HelloITI().printHelloGIT();

       
    }
    
    public void signUP()
    {
        System.out.println("signUP");
    }
    
}


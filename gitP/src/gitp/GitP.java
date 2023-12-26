/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitp;

/**
 *
 * @author mosta
 */
class HelloJava
{
    public void printHelloWorld()
    {
        System.out.println("HelloWorld");
    }
}
class HelloITI
{
    public void printHelloITI()
    {
        System.out.println("HelloITI");
    }
     public void printHelloGIT()
    {
        System.out.println("HelloGit");
    }
}
public class GitP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new HelloJava().printHelloWorld();
       new HelloITI().printHelloITI();
       new HelloITI().printHelloGIT();

       
    }
    
}

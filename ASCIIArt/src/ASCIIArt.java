/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */


public class ASCIIArt {
	public static void MessageBox() {
		System.out.println(" A_A_A_A_A_A_A_A");
		System.out.print("< ");
		Message();
		System.out.println(" >");
		System.out.println(" Y^Y^Y^Y^Y^Y^Y^Y");
	}
	public static void Message() {
		System.out.print("This is a pen");
	}
	public static void Pencil() {
		System.out.println("\t      A");
		System.out.println("\t     / \\");
		System.out.println("\t    /   \\");
		System.out.println("\t   /     \\");
		System.out.println("\t   |VVVVV|");
		Body();
		Body();
		Body();
		System.out.println("\t   |     |");
		System.out.println("\t   | No2 |");
		System.out.println("\t   |_____|");
		System.out.println("\t   |||||||");
		System.out.println("\t   [_____]");
	}
	public static void Statement() {
		System.out.println("\nVery basic, old-school style, no.2 pencil.");
	}
	public static void Body() {
		System.out.println("\t   |  O  |");
		System.out.println("\t   |  O  |");
		System.out.println("\t   |  O  |");
		System.out.println("\t   |  O  |");
		System.out.println("\t   |  O  |");
	}
	public static void main (String [] args) {
		MessageBox();
		Pencil();
		Statement();
	}
}
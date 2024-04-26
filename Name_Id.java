package first_project_pack;

import java.util.Scanner;

public class Name_Id {
	
	private static String name;
	private static int id;
	
	public static void StudentDetails(String name,int id) {
//		Name_Id.name=Name;
//		Name_Id.id=Id;
		System.out.println("Name: "+getName());
		System.out.println("Id: "+getId());
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Name_Id.name = name;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Name_Id.id = id;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String Name=scan.nextLine();
		setName(Name);
		System.out.println("Enter your Id:");
		int Id=scan.nextInt();
		setId(Id);
		System.out.println();
		System.out.println("Your Details are:");
		System.out.println();
//		System.out.println("Name: "+getName());
//		System.out.println("Id: "+getId());
		StudentDetails(Name, Id);
		System.out.println();
		System.out.println("The Course List:");
		Course_List.SubjectsList();
		Course_List.DisplayList();
	}

}

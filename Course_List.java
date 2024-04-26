package first_project_pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Course_List {
	
	public static final Scanner scan = new Scanner(System.in);

	
	public static final String Selection[]=new String[5];
	public static void SubjectsList() {
		String Subjects[]= {
		    "Introduction to Programming",
	            "Data Structures and Algorithms",
	            "Object-Oriented Programming",
	            "Software Engineering Principles",
	            "Database Management Systems",
	            "Web Development Fundamentals",
	            "Computer Networks",
	            "Operating Systems",
	            "Cybersecurity Basics",
	            "Artificial Intelligence",
	            "Machine Learning",
	            "Big Data Analytics",
	            "Cloud Computing",
	            "Mobile App Development",
	            "Internet of Things (IoT)",
	            "Human-Computer Interaction",
	            "Game Development",
	            "Digital Image Processing",
	            "Embedded Systems",
	            "Robotics and Automation",
	            "Cryptography and Network Security",
	            "Data Mining and Warehousing",
	            "Software Testing and Quality Assurance",
	            "Programming Languages (e.g., Java, Python)",
	            "Computer Graphics",
	            "Information Retrieval",
	            "Distributed Systems",
	            "Compiler Design",
	            "Computer Vision",
	            "Parallel and Distributed Computing",
	            "Network Programming",
	            "Natural Language Processing",
	            "Quantum Computing",
	            "Geographical Information Systems (GIS)",
	            "Bioinformatics",
	            "Virtual Reality (VR) and Augmented Reality (AR)",
	            "Digital Signal Processing",
	            "Semantic Web",
	            "Computational Biology",
	            "Nanotechnology in Computing"
		};
		for(int i=0;i<Subjects.length;i++) {
			System.out.println(i+1+" "+Subjects[i]);
		}
		System.out.println();
		System.out.println("Enter 5 Subject Numbers of Your Interest:");
		for(int i=0;i<Selection.length;i++) {
			int index =scan.nextInt();
			Selection[i]=Subjects[index-1];
		}
		System.out.println();
		System.out.println("Your Selected Subjects:");
		for(int i=0;i<Selection.length;i++) {
			System.out.println(i+1+" "+Selection[i]);
		}
		System.out.println();
	}
	
	public static void DisplayList() {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> List = new ArrayList<>();
		System.out.println("Please confirm by typing Yes/No!..");
		String input=scan.nextLine();
		if(input.equalsIgnoreCase("Yes")) {
			List.addAll(Arrays.asList(Selection));
			System.out.println("The Subjests is added to your course.");
			System.out.println();
			for(int i=0;i<List.size();i++) {
				System.out.println(List.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		SubjectsList();
		DisplayList();
	}
}

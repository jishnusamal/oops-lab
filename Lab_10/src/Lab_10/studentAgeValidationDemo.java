package Lab_10;

class Student {
	String name = "";
	int age;
	
	Student() {
		this("Harry Potter", 30);
	}
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void registerStudent(String name, int age) throws IllegalArgumentException {
	    this.name = name;
	    if ((age >= 18) && (age <=60)) {
		    this.age = age;
	    } else {
	    	if (age<18) {
	    		throw new IllegalArgumentException(this.name + " is still minor. LOL.");
	    	} else if (age > 60) {
	    		throw new IllegalArgumentException(this.name + " is >60.");
	    	}
	    	
	    }
	}

}

public class studentAgeValidationDemo {

	public static void main(String[] args) {
		Student db = new Student();
		try {
			db.registerStudent("Debraj", 17);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}

//Write a program to validate the age of a student during their registration. If the age is not 
//between 18 and 60, throw an IllegalArgumentException. Create Student class with 
//Private attributes name and age. Add method registerStudent(String name, int age) that 
//throws an IllegalArgumentException if the age is invalid (that is, not between 18 and 60) 
//Write StudentAgeValidationDemo class to create instance of student class and invoke 
//registerStudent method with valid and invalid data Catch the exception and display an 
//error message for invalid input.

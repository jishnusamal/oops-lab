package Lab_7;

class Building {
	String name = "";
	double footage = 0;
	int stories = 1;
	
	Building(String name, double footage, int stories) {
		this.name = name;
		this.footage = footage;
		this.stories = stories;
	}
	
	void display() {
		System.out.println(this.name);
		System.out.println("Footage (in sq. ft.): "+ this.footage);
		System.out.println("No. of Stories: "+ this.stories);
	}
}

class House extends Building {
	int bedrooms = 1;
	int bathrooms = 1;
	
	House(String name, double footage, int stories, int bedrooms, int bathrooms) {
		super(name, footage, stories);
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
	}
	
	void display() {
		super.display();
		System.out.println("No. of Bedrooms: "+ this.bedrooms);
		System.out.println("No. of Bathrooms: "+ this.bathrooms);
	}
}

class School extends Building {
	static enum GradeLevel {
		Elementary, JuniorHigh, HighSchool, University
	}
	
	int classrooms = 1;
	GradeLevel gl = GradeLevel.Elementary;
	
	School(String name, double footage, int stories, int classrooms, GradeLevel gl) {
		super(name, footage, stories);
		this.classrooms = classrooms;
		this.gl = gl;
	}
	
	void display() {
		super.display();
		System.out.println("No. of Classrooms: "+ this.classrooms);
		System.out.println("Grade Level: "+ this.gl);
	}
}


public class BuildingDemo {

	public static void main(String[] args) {
		House Antilia = new House("Antilia", 400000, 27, 400, 200);
		Antilia.display();
		
		System.out.println();
		
		School mit = new School("MIT", 871200, 6, 200, School.GradeLevel.University);
		mit.display();
	}

}

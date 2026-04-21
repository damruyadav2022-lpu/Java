class Student {
    int marks;
    int roll; 
    String name;

    void display() {
        // Corrected print statement syntax
        System.out.println("marks:" + marks + ", Roll:" + roll + ", Name:" + name);
    }
}

class method{ // Renamed class to avoid conflict with 'Class' keyword
    public static void main(String args[]) {
        // 1. Create an instance (object) of the Student class
        Student deepak = new Student(); 

        // 2. Access variables and methods using the object reference
        deepak.marks = 100;
        deepak.roll = 12546824;
        deepak.name = "Deepak";
        deepak.display(); 
    }
}

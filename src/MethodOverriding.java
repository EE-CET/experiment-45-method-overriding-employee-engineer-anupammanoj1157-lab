// Parent Class
class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}

class Engineer extends Employee {
   
    @Override
    void display() {
        System.out.println("Name of class is Engineer");
        
        super.display();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Engineer eng = new Engineer();
        eng.display();
    }
}

package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.A_Classes.Exercises.Person;

public class Person {
    
    //INSTANCE VARIABLES
    private String firstName;
    private String lastName;
    private int age;
    
    
    //METHODS - GETTERS
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    
    
    //METHODS - SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <0 || age>100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    
    //METHODS - OTHER
    public boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }else{
            return false;
        }
    }
    
    public String getFullName(){
        if (firstName == null && lastName == null){
            return "";
        }else if(lastName.isEmpty()){ // Same as lastName == null
            return firstName;
        }else if(firstName.isEmpty()){
            return lastName;
        }else{
            return firstName + " " + lastName;
        }
    }
    
    
}

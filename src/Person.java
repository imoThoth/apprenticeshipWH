public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;


    Person(){

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String name) {
        this.firstName = name;
    }

    public Person(int age){
        this.age = age;
    }

    public int getAge() {
        if(this.age < 0){
            System.out.println("Person is a newborn");
        }
        return this.age;
    }

    public int setAge(int newAge){
        this.age = newAge;
        return newAge;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return  this.lastName;
    }

    public String setLastName(String lastName){
        this.lastName = lastName;
        return this.lastName;
    }

    public String setFirstName(String firstName){
        this.firstName = firstName;
        return this.firstName;
    }

}

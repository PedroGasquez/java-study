public class Person {

    //Attributes
    public String Name;
    public int Age;

    //Constructor
    public Person(String initialName, int initialAge) {
        this.Name = initialName;
        this.Age = initialAge;
    }

    //Getters Methods
    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.Age;
    }

    //Setters Methods
    public void setName(String newName){
        this.Name = newName;
    }
    public void setAge(int newAge){
        if(newAge > 0 || newAge < 100)
            this.Age = newAge;
    }

    public void IntroduceYourself(){
        System.out.println("Ola meu nome e" + this.Name + "e eu tenho" + this.Age + "anos.");
    }
}

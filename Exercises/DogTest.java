class Flea {

   // Properties of the class...
   private String name;

   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   private String name;
   private int    age;
   private Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   // Methods of the class...
   public String toString() {
      return "I am a dog called " + name + ", I am " + age + " years old and I have got a flea called " + dogsFlea;
   }

}

class DogOwner {
   // Properties
   private String name;
   private int    salary;
   private Dog    ownersDog;

   // Constructor
   public DogOwner(String aName, int aSalary, Dog aDog){
      name = aName;
      salary = aSalary;
      ownersDog = aDog;
   }

   // Methods
   public String toString(){
      return "I am " + name + " and my salary is " + salary + ". I also have a dog called " + ownersDog + ".";
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea p = new Flea("Pop");
      Flea s = new Flea("Squeak");
      Flea z = new Flea("Zip");

      Dog r = new Dog("Rex", 3, p);
      Dog j = new Dog("Jimbo", 5, s);
      Dog f = new Dog("Fido", 2, z);

      System.out.println(r.toString());
      System.out.println(j.toString());
      System.out.println(f.toString());

      DogOwner a = new DogOwner("Angus", 8000, r);
      DogOwner b = new DogOwner("Brian", 2000, j);
      DogOwner c = new DogOwner("Charles", 10000, f);

      System.out.println(a.toString());
      System.out.println(b.toString());
      System.out.println(c.toString());

     // System.out.println(a.ownersDog.dogsFlea.toString());

   }
}


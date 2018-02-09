class Person {

   // Properties of the class...
   private String name;
   public int     age;
   private String eye_color;

   // This had to be deleted in question 10
   // Constructor of the class...
   //public Person(String aName, int anAge, String an_eye_color) {
   //   name = aName;
   //   age  = anAge;
   //   eye_color = an_eye_color;
   //}

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name + ",");
      System.out.println("my age is " + age);
      System.out.println("and my eye color is " + eye_color + ".");
      commentAboutAge();
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
         System.out.println("old person");
      }
   }
   public void growOlder(){
      age = age + 1;
   }
   public void giveKnighthood(){
      name = "Sir " + name;
   }
   public void growOlderBy(int years){
      age = age + years;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      //Person ls = new Person("Luke Skywalker",34, "blue");
      //Person wp = new Person("Winston Peters",48, "black");
      Person ls = new Person();
      Person wp = new Person();

      ls.talk();
      wp.talk();

      // Make Winston Peters older and give him knight status.
      wp.growOlder();
      wp.giveKnighthood();

      // Luke Skywalker's age and grow him 10 years older
      System.out.println(ls.age);
      ls.growOlderBy(10);

   }

}


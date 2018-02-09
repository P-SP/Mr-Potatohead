class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }

   public Citizen(String aName) {
      name    = aName;
      //salary, savings and loan become zero automatically
   }

   // Methods of the class...
   public int getSalary() {
      return salary;
   }
   public void setSalary(int aSalary) {
      salary = aSalary;
   }
   public void salaryRise(int amount){
      salary = salary + amount;
   }
   public int netWorth(){
      return savings - loan;
   }
   public String toString(){
      String all_info = "Name: " + name + ", salary: " + salary + ", savings: " + savings;
      if (loan > 0){
         all_info = all_info + ", loan: " + loan;
      }
      all_info = all_info + ".";
      return all_info;
   }

}

class CitizenTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);

      System.out.println("Ernie's salary is: " + e.getSalary());

      // Ernie
      e.salaryRise(10000);
      System.out.println(e.netWorth());
      System.out.println(e.toString());

      // Bert
      System.out.println(b.toString());

      //Fred
      Citizen f = new Citizen("Fred");
      System.out.println(f.toString());

   }
}

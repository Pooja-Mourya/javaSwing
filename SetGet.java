public class SetGet {

  class SetRock {
    String name;
    String surname;
    int age;

    SetRock() {
      this.name = "pooja";
      this.surname = "kumari";
      this.age = 2;
    }

    // getter
    public int getAge() {
      return this.age;
    }

    public void setAge(int age) {
      if (age <= 20) {
        throw new IllegalArgumentException("Invalid Age");
      } else {
        this.age = age;
      }
      //   this.age = age;
    }
  }

  public static void main(String[] args) {
    SetGet sg = new SetGet();
    SetRock sr = sg.new SetRock();
    sr.getAge();
    sr.setAge(25);
    System.out.println("Name: " + sr.name); // Output: Name: pooja
    System.out.println("surname: " + sr.surname); // Output: surname: kumari
    System.out.println("age: " + sr.age); // Output: age: 24
  }
}

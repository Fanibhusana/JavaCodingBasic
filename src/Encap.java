  class Personnnn{
    private String name;
    private String branch;
    private  int roll;
    private String address;
    private  int age;

      public String getBranch() {
          return branch;
      }

      public void setBranch(String branch) {
          this.branch = branch;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getRoll() {
          return roll;
      }

      public void setRoll(int roll) {
          this.roll = roll;
      }

      public String getAddress() {
          return address;
      }

      public void setAddress(String address) {
          this.address = address;
      }

      public int getAge() {
          return age;
      }

      public void setAge(int age) {
          this.age = age;
      }
  }

public class Encap {
    public static void main(String[] args) {
        Personnnn pp = new Personnnn();
        pp.setName("Fani");
        pp.setAge(21);
        pp.setBranch("CSE");
        pp.setRoll(123);
        pp.setAddress("BBSR");
        System.out.println("Name: "+pp.getName());
        System.out.println("Address: "+ pp.getAddress());
        System.out.println("age: "+pp.getAge());
        System.out.println("Branch: "+pp.getBranch());
        System.out.println("Roll: "+ pp.getRoll());

    }
}

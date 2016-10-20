public class Person {
  /**
  **  This Person class can be  used for   People in  all other classes
  **/
  // listing attributes
  String name ;
  int iage  ;
  String  LastName  ;    // New attribute added  Dev L
  public String getLastName() {
       return lastName  ;
  }

  //  listing methods
  public String getName() {
      return  name ;
  }
  public  int getAge() {
      return  iage ;
  }
  //  adding  setter  methods -  Dev R
  public void setName(String n)  {
    name = new String(n) ;
  }
  public  void setAge(int  a) {
    iage = a ;
  }
}

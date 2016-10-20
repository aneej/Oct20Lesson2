public class Person {
  /**
  **  This Person class can be  used for   People in  all other classes
  **/
  // listing attributes
  String name ;
  int i_age  ;           // Merge with Dev R  resolved; retained i_age  rather than iage. you should have a underscore between  the  Type and Variable-Name
  String  LastName  ;    // New attribute added  Dev L
  public String getLastName() {
       return lastName  ;
  }

  //  listing methods
  public String getName() {
      return  name ;
  }
  public  int getAge() {
      return  i_age ;
  }
  //  adding  setter  methods -  Dev R
  public void setName(String n)  {
    name = new String(n) ;
  }
  public  void setAge(int  a) {
    i_age = a ;
  }
}

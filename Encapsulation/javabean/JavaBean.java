package javabean;

//! Non-abstract class
public class JavaBean {
    //! Private data members
    private int age ;

    //! public setter method
    public void setAge(int age){
        this.age = age;
    }

    //! public getter method
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        JavaBean java = new JavaBean();
        java.setAge(3);
        int age = java.getAge();
        System.out.println(age);
    }
}

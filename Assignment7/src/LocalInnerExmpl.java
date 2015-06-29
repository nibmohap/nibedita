
public class LocalInnerExmpl{   
 private String name="nibedita";  
 void display(){   
  class Local{   
   void msg(){System.out.println("hello  :"+name);}   
  }   
  Local l=new Local();   
  l.msg();   
 }   
 public static void main(String args[]){   
 LocalInnerExmpl obj=new LocalInnerExmpl();   
  obj.display();   
 }   
}  


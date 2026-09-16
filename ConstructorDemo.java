class A
{
   A()
   {
     System.out.println("construction of class A");
   }
}
class B extends A
{
   B()
   {
     System.out.println("construction of class B");
   }
}
class C extends B
{
   C()
   {
     System.out.println("construction of class C");
   }
}

public class ConstructorDemo
{
  public static void main(String args[])
  {
    System.out.println("creating object of class C");
    C obj=new C();
  }
}  
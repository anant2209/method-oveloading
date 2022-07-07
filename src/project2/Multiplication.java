package project2;
class Multiplication
{
  void multiply(int a, int b)
  {
    System.out.println("Result is"+(a*b)) ;
  }
  void multiply(int a, int b,int c)
  {
    System.out.println("Result is"+(a*b*c));
  }
  public static void main(String[] args)
  {
    Multiplication obj = new Multiplication();
    obj.multiply(48,5);   
    obj.multiply(8,6,8);   
  }
}
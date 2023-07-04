class Meter
{
public static void main(String... S)
{
System.out.println("Enter name:");
String x1=new java.util.Scanner(System.in).nextLine();
System.out.println("Enter no of units:");
int x2=new java.util.Scanner(System.in).nextInt();
System.out.println("total bill:");
int rate;
rate=2;
rate=3;
rate=4;
rate=5;
rate=6;
if( x2>1)
{
if(x2<=50)
 {
 System.out.println("rate=2");
 }
 else if(x2<=300)
 {
 System.out.println("rate=3");
 }
 else if(x2<=350)
 {
 System.out.println("rate=4");
 }
 else if(x2<=400)
 {
 System.out.println("rate=5");
 }
 else if(x2>400)
 {
 System.out.println("rate=6");
 }
else
{
System.out.println("no bill will be given");
}
{
System.out.println(x2*rate+18);
}
}
}
}


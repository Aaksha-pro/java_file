class cmndCal 
{
public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[2]);
char opr = args[1].charAt(0);

if (opr == '+')
{
System.out.println("Sum of  "+a+" and "+b+" is "+(a+b));
}
else if (opr == '-')
{
System.out.println("difference of  "+a+" and "+b+" is "+(a-b));
}
else if (opr == 'x' || opr =='X')
{
System.out.println("Product of  "+a+" and "+b+" is "+(a*b));
}
else if (opr == '/')
{
System.out.println("division of  "+a+" and "+b+" is "+(a/b));
}
else
{
System.out.println("invalid input");
}
}
}
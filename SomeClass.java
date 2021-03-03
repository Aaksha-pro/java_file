class SomeClass
{
public static void main(String args[])
{

SomeClass obj=new SomeClass();
obj.setA(10);
System.out.println(obj.getA());



if (args.length!=0)

for (int i=0;i<args.length;i++)

System.out.printf("Argument "+i+"is:"+args[i]);

else

System.out.println("No CLA");


}
}
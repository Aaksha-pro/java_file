class SampleNew

{



public static void main(String args[])

{







SomeClass obj=new SomeClass();

obj.setA(10);

System.out.println(obj.getA());









if(args.length!=0)

{



for(int i=0;i<args.length;i++)

{

System.out.println("Argument "+i+"is:"+args[i]);

}

}

else

{

System.out.println("No CLA");

}



}

}


class SomeClass

{



int a;//State



void setA(int a)

{





System.out.println("Value Setted");



this.a=a;

}



int getA()

{





System.out.println("Value Returned");

return this.a;



}



}
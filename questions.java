class  FinalizeDemo{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Finalized...");
    }
}
public class InterviewQue {
    public static void main(String[] args) {
        int i = 10;  //Single value Container
        Integer iRef = new Integer(i);  //Boxed (Constructing the Object)

        int j = iRef.intValue();  //UnBoxing(Extracting the value from Object)

        Integer kRef = i;  //AutoBoxing(Integer kRef = new Integer(i);)

        int l = kRef;  //AutoUnboxing

        //OOPS -> Objects | you can also Pass By Reference the primitives.

        FinalizeDemo fdRef = new FinalizeDemo();
        fdRef = null;
        System.gc();

        String str = new String("Hello");
        StringBuilder builder = new StringBuilder("Hello");
        StringBuffer buffer = new StringBuffer("Hello");

        str.concat("Hi...");
        builder.append("Hi...");
        buffer.append("Hi...");

        System.out.println(str);   //IMMUTABLE
        System.out.println(builder); //MUTABLE
        System.out.println(buffer);  //MUTABLE

        String str1 = new String("Hello");  //str1 is a ref variable.it is having the address of an object
        String str2 = new String("Hello");  //str2 is a ref variable.it is having the address of some other object

        if (str1 == str2){  //comparing references
            System.out.println("str1 == str2");
        }else {
            System.out.println("str1 != str2");
        }
        if (str1.equals(str2)){  //comparing values within the objects
            System.out.println("str1 equals str2");
        }else {
            System.out.println("str1 not equals str2");
        }
    }
}

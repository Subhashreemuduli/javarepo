public class wrapperClass {
    public static void main(String[] args)
    {
//      int a=9;
//      Integer i=Integer.valueOf(a);
//      Integer I1=a;//auto boxing
//        if(i instanceof Integer)
//        {
//            System.out.println("An object of integer is created");
//        }
//        double d=6.78;
//        Double d1=Double.valueOf(d);
//        Double D=d;
//        if(d1 instanceof Double){
//            System.out.println(" an object of double is created");
        Integer i=new Integer(9);
        int i1=i.intValue();
        Double d=new Double(6.78);
        double d1=d.doubleValue();

        if(i instanceof Integer)
            System.out.println("An object of integer is created");
        if(d instanceof Double)
            System.out.println("An object of double is created");

        }



    }


public class MainClass {
    public static void main(String[] args)
    {
        Adder adder=new Adder();
        System.out.println("My superclass is "+adder.getClass().getSuperclass().getName());
        System.out.println(adder.add(30,12)+ " "+adder.add(7,6)+" " +adder.add(10,10));
    }
}

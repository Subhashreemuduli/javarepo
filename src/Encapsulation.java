public class Encapsulation {
    public static void main(String[] args)
    {
        Student student=new Student();
        student.setName("Subhashree");
        student.setAge(15);
       // System.out.println(student.getName());
      //  System.out.println(student.getAge());
        AgeModifier ageModifier=new AgeModifier();
        ageModifier.ageModify();
   //     System.out.println(student.getAge());
    }
}

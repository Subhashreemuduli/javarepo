public class Student {
    private String name;
    private int age;
    private int standard;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }
    public void setStandard(int age,int standard)
    {
        if(age>16)
        {
            this.standard=standard;
            System.out.println("Student can admitted to class 10");
        }
        else{
            System.out.println("Student admitted to class 10");
        }
    }


}

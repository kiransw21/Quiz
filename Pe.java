public class Pe {
    public static void main(String args) {
    Student t=new Student();
    t.dislay();
    }
    }
    
    class Student{
    private String Student1;
    Student( String name){
        this.Student1=name;
        
    }
    public void dislay() {
        System.out.println(Student1);
    }
    }
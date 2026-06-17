class student {

    // student(){
    //     System.out.println("Object Created");
    // }
    student(String name){
        System.out.println("Object Created for " + name);
    }

}
public class Test {
    public static void main(String[] args) {
        student s1 = new student("Ravi");
    }
}
import java.lang.reflect.Method;

//@My_annotation
public class Test_annotation {
    //@My_annotation
    public int age;

    @My_annotation(name = "type", gid = Integer.class)
    public Test_annotation(int age) {
        this.age = age;
    }

    @My_annotation(name = "method", gid = Void.class)
    public static void print(){
        @My_annotation(name = "Local_var", gid = Integer.class)
        int a = 10;
    }

    public void setAge(/*@My_annotation*/ int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Method[] methods = Test_annotation.class.getDeclaredMethods();
        for (Method method : methods) {

            boolean hasAnnotation = method.isAnnotationPresent(My_annotation.class);
            if (hasAnnotation) {

                My_annotation annotation = method.getAnnotation(My_annotation.class);
                System.out.println("method = " + method.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= "+annotation.gid());
            }
        }
    }
}

import java.lang.annotation.*;

@Target({ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface My_annotation {
    public String name();
    public Class gid();
    public int id() default  -1;
}

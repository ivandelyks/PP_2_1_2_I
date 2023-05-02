import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanSecond =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");

        Cat beanCatSecond =
                (Cat) applicationContext.getBean("cat");

        System.out.println("Hello World comparison");
        System.out.println(bean == beanSecond);

        System.out.println("Cat comparison");
        System.out.println(beanCat == beanCatSecond);
    }
}
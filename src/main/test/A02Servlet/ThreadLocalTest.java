package A02Servlet;

public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal<Object> threadLocal = new ThreadLocal<>();
        MyServlet myServlet = new MyServlet();

        System.out.println(threadLocal.get());
    }
}

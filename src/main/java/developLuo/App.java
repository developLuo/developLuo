package developLuo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        App app = new App();
        System.out.println(app.addNumber(10,20));
    }
    public int addNumber(int a,int b){
        return a+b ;
    }
}

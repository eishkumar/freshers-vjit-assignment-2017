package placement.company.app.my_app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "A warm wishes from Restaurant Management System" );
        System.out.println( "Restaurant Management System Welcomes You..!" );
        Restaurant r=new Restaurant("Place of Luck Restaurant",10,60);
        System.out.println("Welcome to "+r.getRestaurantName());
        Manager m=new Manager("Manager1");
		m.createItems();
        r.initiateOrder(m);
        System.out.println("Process is completed succesfully.");
    }
}

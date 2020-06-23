import com.applications.world.hello.Beverage;
import com.applications.world.hello.CaramelDecorator;
import com.applications.world.hello.ExpressoBeverage;
import com.applications.world.hello.SoyDecorator;

public class Application {

    public static void main(String[] args) {
        Beverage myBeverage = new ExpressoBeverage(3);
        CaramelDecorator caramelDecorator = new CaramelDecorator(myBeverage, 2);
        SoyDecorator soyDecorator1 = new SoyDecorator(caramelDecorator, 1);

        SoyDecorator soyDecorator2 = new SoyDecorator(new CaramelDecorator(new ExpressoBeverage(10), 15), 20);

        System.out.println("Price of #1: " + soyDecorator1.cost());
        System.out.println("Price of #2: " + soyDecorator2.cost());

    }
}

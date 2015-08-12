/**
 * Created by muhammadkhalilullah on 8/11/2015.
 */
public class ChocolateFactory {
    public static IChocolate getChocolate(String chocolate) {
        switch (chocolate) {
            case "milk":
                return new MilkChocolate();
            case "white":
                return new WhiteChocolate();
            default:
                return null;
        }
    }
}

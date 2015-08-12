/**
 * Created by muhammadkhalilullah on 8/11/2015.
 */
public class WhiteChocolate implements IChocolate {
    static int chocolateNumber;

    public WhiteChocolate() {
        chocolateNumber = 0;
    }

    public WhiteChocolate(int chocolateNumber) {
        this.chocolateNumber = chocolateNumber;
    }

    @Override
    public String Eat() {
        return String.format("Eating white chocalate #%d!", chocolateNumber);
    }

    @Override
    public String Chew() {
        return "Chewing white chocolate, hmm this is yummy!";
    }

    @Override
    public String Swallow() {
        return "Wow, this chocolate is hard to swallow should of chewed it a bit more!";
    }

    @Override
    public IChocolate next() {
        return new WhiteChocolate(++chocolateNumber);
    }

    @Override
    public void doSomething(int choice) {
        switch (choice) {
            case 1:
                System.out.println(this.Eat());
                break;
            case 2:
                System.out.println(this.Chew());
                break;
            case 3:
                System.out.println(this.Swallow());
                break;
            case 4:
                this.next();
                break;
            default:
                return;
        }
    }
}

package za.ac.cput.assignment5.ChainOfResponsibility;

/**
 * Created by student on 2016/04/08.
 */
public class PersonType4 implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void handleRequest(PersonChain request) {
        if (request.getSelectPerson().equalsIgnoreCase("FMCG"))
        {
            request.getPersonType4();
            System.out.println("FMCG");

        }
        else
        {
            System.out.println("Your person type is not available");
        }
    }
}

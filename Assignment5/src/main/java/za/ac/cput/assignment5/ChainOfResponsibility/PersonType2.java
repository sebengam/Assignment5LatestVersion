package za.ac.cput.assignment5.ChainOfResponsibility;

/**
 * Created by student on 2016/04/08.
 */
public class PersonType2 implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void handleRequest(PersonChain request) {
        if (request.getSelectPerson().equalsIgnoreCase("Doctor"))
        {
            System.out.println("Doctor");
            request.getPersonType2();
        }
        else
        {
            nextInChain.handleRequest(request);
        }
    }
}

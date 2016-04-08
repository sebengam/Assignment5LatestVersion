package za.ac.cput.assignment5.ChainOfResponsibility;

/**
 * Created by student on 2016/04/08.
 */
public class PersonType3 implements Chain {


    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void handleRequest(PersonChain request) {
        if (request.getSelectPerson() == "TechnolgySpecialist")
        {
            System.out.println("TechnologySpecialist");
            request.getPersonType3();
        }
        else
        {
            nextInChain.handleRequest(request);
        }
    }
}

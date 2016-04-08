package za.ac.cput.assignment5.ChainOfResponsibility;

import za.ac.cput.assignment5.Domain.Person;

/**
 * Created by student on 2016/04/08.
 */
public class PersonType1 implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void handleRequest(PersonChain request) {

        if (request.getSelectPerson().equalsIgnoreCase("Lawyer"))
        {
            System.out.println("Lawyer");
            request.getPersonType1();
        }
        else
        {
            nextInChain.handleRequest(request);
        }
    }
}

package za.ac.cput.assignment5.ChainOfResponsibility;

import za.ac.cput.assignment5.Domain.Person;

/**
 * Created by student on 2016/04/08.
 */
public interface Chain {

        public void setNextChain (Chain nextChain);
        public abstract void handleRequest(PersonChain request);


}

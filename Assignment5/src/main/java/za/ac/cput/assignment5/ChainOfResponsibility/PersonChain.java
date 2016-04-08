package za.ac.cput.assignment5.ChainOfResponsibility;

/**
 * Created by student on 2016/04/08.
 */
public abstract class PersonChain implements Chain {

    private String personType1;
    private String personType2;
    private String personType3;
    private String personType4;
    private String selectPerson;

    public PersonChain(String newPersonType1, String newPersonType2, String newPersonType3, String newPersonType4, String newSelectPerson) {
        personType1 = newPersonType1;
        personType2 = newPersonType2;
        personType3 = newPersonType3;
        personType4 = newPersonType4;
        selectPerson = newSelectPerson;

    }




    public String getPersonType1() {
        return personType1;
    }

    public String getPersonType2() {
        return personType2;
    }

    public String getPersonType3() {
        return personType3;
    }

    public String getPersonType4() {
        return personType4;
    }

    public String getSelectPerson() {
        return selectPerson;
    }
}
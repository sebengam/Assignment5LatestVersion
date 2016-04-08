package za.ac.cput.assignment5.ChainOfResponsibility;

/**
 * Created by student on 2016/04/08.
 */
public class OccupationChain implements Chain
{
    private String occ1;
    private String occ2;
    private String occ3;
    private String occ4;
    private String occ5;
    private String occ6;
    private String occ7;

    private String selectOccupation;
    public OccupationChain(String newOcc1, String newOcc2, String newOcc3, String newOcc4, String newOcc5,String newOcc6,String newOcc7, String newSelectOccupation)
    {

        occ1 = newOcc1;
        occ2 = newOcc2;
        occ3 = newOcc3;
        occ4 = newOcc4;
        occ5 = newOcc5;
        occ6 = newOcc6;
        occ7 = newOcc7;
        selectOccupation = newSelectOccupation;
    }

    public String getOcc1() {
        return occ1;
    }

    public String getOcc2() {
        return occ2;
    }

    public String getOcc3() {
        return occ3;
    }

    public String getOcc4() {
        return occ4;
    }

    public String getOcc5() {
        return occ5;
    }

    public String getOcc6() {
        return occ6;
    }

    public String getOcc7() {
        return occ7;
    }

    public String getSelectOccupation() {
        return selectOccupation;
    }

    @Override
    public void setNextChain(Chain nextChain) {

    }

    @Override
    public void handleRequest(PersonChain request) {

    }
}

package espengjostol.jsftest.greet;

import javax.faces.bean.ManagedBean;

/**
 * About ManagedBean being deprecated, see https://stackoverflow.com/questions/38040947/the-type-managedbean-is-deprecated
 */
@ManagedBean(name = "goodbye", eager = true)
public class GoodbyeBean {

    public GoodbyeBean() {
        System.out.println(this + " is up");
    }

    public String getMessage() {
        return this + " says goodbye!";
    }
}

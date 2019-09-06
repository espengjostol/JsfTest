package espengjostol.jsftest.greet;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Hello {

    public Hello() {
        System.out.println(this + " is up");
    }

    public String getMessage() {
        return this + " says hello!";
    }
}

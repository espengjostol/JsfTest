package espengjostol.jsftest.ajax;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ajaxHandler", eager = true)
public class AjaxHandler {

    public AjaxHandler() {
        System.out.println(this + " is up");
    }

    public void act() {
        System.out.println("Acting on Ajax call!");
    }
}

package org.wooddog.bassman.loader;

/**
 * Created by IntelliJ IDEA.
 * User: dencbr
 * Date: 30-11-2010
 * Time: 16:20:30
 * To change this template use File | Settings | File Templates.
 */
public class MalformedActionArgument extends Exception {
    public MalformedActionArgument() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public MalformedActionArgument(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public MalformedActionArgument(String message, Throwable cause) {
        super(message, cause);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public MalformedActionArgument(Throwable cause) {
        super(cause);    //To change body of overridden methods use File | Settings | File Templates.
    }
}

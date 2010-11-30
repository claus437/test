package org.wooddog.bassman.loader;

import org.wooddog.bassman.Score;

/**
 * Created by IntelliJ IDEA.
 * User: dencbr
 * Date: 30-11-2010
 * Time: 15:44:22
 * To change this template use File | Settings | File Templates.
 */
public interface Action {
    void execute(Score score, String argument) throws MalformedActionArgument;
}

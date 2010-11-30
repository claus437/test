package org.wooddog.bassman.loader;

import org.wooddog.bassman.Score;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: dencbr
 * Date: 30-11-2010
 * Time: 15:53:14
 * To change this template use File | Settings | File Templates.
 */
public class ResolutionAction implements Action {
    private static final Pattern ARGUMENT_SPLIT = Pattern.compile("RESOLUTION\\W+(\\d+)\\W*/(\\W*\\d+)");

    public ResolutionAction() {
    }

    public void execute(Score score, String argument) throws MalformedActionArgument {
        Matcher matcher;
        int measure;
        int beat;

        matcher = ARGUMENT_SPLIT.matcher(argument);
        if (!matcher.find()) {
            throw new MalformedActionArgument(argument + " is not a valid argument");
        }

        measure = Integer.parseInt(matcher.group(1));
        beat = Integer.parseInt(matcher.group(2));

        score.setResolution(beat / measure);
    }
}

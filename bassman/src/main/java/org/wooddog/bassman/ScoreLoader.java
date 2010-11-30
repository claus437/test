package org.wooddog.bassman;

import org.wooddog.bassman.loader.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: dencbr
 * Date: 30-11-2010
 * Time: 15:38:18
 * To change this template use File | Settings | File Templates.
 */
public class ScoreLoader {


    public Score load(String resource) throws IOException, MalformedActionArgument {
        BufferedReader reader;
        Map<String, Action> actions;
        Score score;
        String line;
        int lineNo;

        reader = null;

        score = new Score();
        actions = createBuilder();


        try {
            reader = new BufferedReader(new FileReader(resource));
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    getAction(actions, line).execute(score, line);
                }
            }
        } finally {
            reader.close();
        }

        return score;
    }


    private Action getAction(Map<String, Action> actionMap, String line) throws IOException {
        String name;
        Action action;

        name = line.substring(0, line.indexOf(" "));
        action = actionMap.get(name);
        if (action == null) {
            throw new IOException("unknown command " + name);
        }

        return action;
    }

    private Map<String, Action> createBuilder() {
        HashMap<String, Action> actions;

        actions = new HashMap<String, Action>();
        actions.put("RESOLUTION", new ResolutionAction());
        actions.put("BEGIN", new BeginAction());
        actions.put("INSTRUMENT", new InstrumentAction());
        actions.put("LOOP", new LoopAction());

        return actions;
    }
}

package rules;

import java.util.ArrayList;
import java.util.Iterator;

public class Rules implements Iterable<Rule> {
    private final ArrayList<Rule> rules;

    public Rules() {
        this.rules = new ArrayList<>();
    }

    public boolean add(Rule rule){
        return rules.add(rule);
    }

    @Override
    public Iterator<Rule> iterator() {
        return rules.iterator();
    }
}

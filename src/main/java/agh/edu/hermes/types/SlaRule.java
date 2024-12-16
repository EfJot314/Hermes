package agh.edu.hermes.types;

import agh.edu.hermes.generators.IdGenerator;
import agh.edu.hermes.types.attributes.*;

import java.util.ArrayList;
import java.util.List;


public class SlaRule {

    public final long id;
    public final ValueType valueType;
    private final List<Condition> conditions;

    public SlaRule(ValueType valueType) {
        this.id = IdGenerator.getRuleId();
        this.valueType = valueType;
        this.conditions = new ArrayList<>();
    }

    public boolean addConditions(List<Condition> conditions) {
        for(Condition condition : conditions) {
            if(!this.conditions.contains(condition)) {
                return false;
            }
        }
        return true;
    }

    public boolean addCondition(Condition condition) {
        return conditions.add(condition);
    }

    public List<Condition> getConditions() {
        return new ArrayList<>(conditions);
    }

    public void clearConditions() {
        this.conditions.clear();
    }

}

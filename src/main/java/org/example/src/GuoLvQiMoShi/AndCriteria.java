package org.example.src.GuoLvQiMoShi;

import java.util.List;

public class AndCriteria implements Criteria {

    private final Criteria criteria1;
    private final Criteria criteria2;

    public AndCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria1.meetCriteria(persons);
        return criteria2.meetCriteria(firstCriteriaPersons);
    }
}

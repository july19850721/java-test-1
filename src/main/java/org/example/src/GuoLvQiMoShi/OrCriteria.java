package org.example.src.GuoLvQiMoShi;

import java.util.List;

public class OrCriteria implements Criteria {

    private final Criteria criteria1;
    private final Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria1.meetCriteria(persons);
        List<Person> otherCriteriaItems = criteria2.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
package com.cydeo.tasks;

public class OddPredicate implements UnaryPredicate<Integer>{ // QS 2

    @Override
    public boolean test(Integer obj) {
        return obj %2 != 0;
    }

}

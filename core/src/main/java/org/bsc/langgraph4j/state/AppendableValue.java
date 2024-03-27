package org.bsc.langgraph4j.state;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AppendableValue<T> {
    final List<T> values;
    public AppendableValue( List<T> values) {
        this.values = new ArrayList<>(values);
    }
    public AppendableValue() {
        this(Collections.emptyList());
    }
    public void append(Object value) {
        if (value instanceof Collection ) {
            this.values.addAll((Collection<? extends T>) value);
        }
        else {
            this.values.add((T)value);
        }
    }

    public String toString() {
        return String.valueOf(values);
    }
}
package ReFreSH.Jarvis.ObjectModel;

import java.util.Objects;

@SuppressWarnings("ALL")
/**
 * a tuple
 */
public class Tuple<T1, T2> {
    /**
     * First Item.
     */
    public T1 First;
    /**
     * Second Item.
     */
    public T2 Second;


    /**
     * Initialize a Traid with its items.
     *
     * @param first  First Item.
     * @param second Second Item.
     */
    public Tuple(T1 first, T2 second) {
        First = first;
        Second = second;
    }

    @Override
    public String toString() {
        return "Tuple {" + "First=" + First +
                ", Second=" + Second +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple<?, ?>)) {
            return false;
        }
        Tuple<?, ?> Tuple = (Tuple<?, ?>) o;
        return First.equals(Tuple.First) &&
                Second.equals(Tuple.Second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(First, Second);
    }
}

package ReFreSH.Jarvis.ObjectModel;

import java.util.Objects;

/**
 * represents a Triad. mutable.
 *
 * @param <T1> type of the first item.
 * @param <T2> type of the second item.
 * @param <T3> type of the third item.
 */
public class Triad<T1, T2, T3> {
    /**
     * First Item.
     */
    public final T1 First;
    /**
     * Second Item.
     */
    public final T2 Second;
    /**
     * Third Item.
     */
    public final T3 Third;

    /**
     * Initialize a Triad with its items.
     *
     * @param first  First Item.
     * @param second Second Item.
     * @param third  Third Item.
     */
    public Triad(T1 first, T2 second, T3 third) {
        First = first;
        Second = second;
        Third = third;
    }

    @Override
    public String toString() {
        return "Triad {" + "First=" + First +
                ", Second=" + Second +
                ", Third=" + Third +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triad<?, ?, ?>)) {
            return false;
        }
        Triad<?, ?, ?> Triad = (Triad<?, ?, ?>) o;
        return First.equals(Triad.First) &&
                Second.equals(Triad.Second) &&
                Third.equals(Triad.Third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(First, Second, Third);
    }
}


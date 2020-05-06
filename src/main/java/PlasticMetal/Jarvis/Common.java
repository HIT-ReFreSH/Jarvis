package PlasticMetal.Jarvis;

public class Common
{
    /**
     * Coalesce two nullable expressions, equals (C#)first??second
     * @param first the first expression
     * @param second the second expression
     * @param <T> type of the expressions
     * @return if first not-null, first; otherwise, second.
     */
    public static<T> T CoalesceNull(T first,T second){
        return first==null?second:first;
    }

}

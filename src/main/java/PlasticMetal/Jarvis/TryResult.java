package PlasticMetal.Jarvis;

/**
 * represents a result of a JarvisTry
 * @param <T> Type of Try output
 */
public class TryResult<T>
{
    public final T Out;
    public final boolean Result;

    /**
     * the parse succeeded, initialize a TryResult with output
     * @param out the Try Result
     */
    public TryResult(T out){
        Result=true;
        Out=out;
    }

    /**
     * the parse failed. Out=null.
     */
    public TryResult(){
        Result=false;
        Out=null;
    }
}

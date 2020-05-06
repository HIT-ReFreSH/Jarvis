package PlasticMetal.Jarvis.ObjectModel;

/**
 * represents a result of a JarvisTry
 * @param <T> Type of Try output
 */
public class TryResult<T> extends Tuple<Boolean,T>
{
    public final T Out;
    public final boolean Result;

    /**
     * the parse succeeded, initialize a TryResult with output
     * @param out the Try Result
     */
    public TryResult(T out){
        super(true,out);
        Result=true;
        Out=out;
    }

    /**
     * the parse failed. Out=null.
     */
    public TryResult(){
        super(false,null);
        Result=false;
        Out=null;
    }
}

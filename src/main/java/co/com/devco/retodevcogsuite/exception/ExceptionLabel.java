package co.com.devco.retodevcogsuite.exception;

public class ExceptionLabel extends AssertionError{

    public ExceptionLabel(String lbl, Throwable throwable){
        super(lbl,throwable);
    }
}

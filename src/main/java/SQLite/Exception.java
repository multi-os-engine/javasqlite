package SQLite;

import org.moe.svm.anns.JNI;

/**
 * Class for SQLite related exceptions.
 */

public class Exception extends java.lang.Exception {

    /**
     * Construct a new SQLite exception.
     *
     * @param string error message
     */

    @JNI
    public Exception(String string) {
	super(string);
    }
}

package SQLite;

import org.moe.svm.anns.JNI;

/**
 * Callback interface for SQLite's trace function.
 */

public interface Trace {

    /**
     * Callback to trace (ie log) one SQL statement.
     *
     * @param stmt SQL statement string
     */

    @JNI
    public void trace(String stmt);
}


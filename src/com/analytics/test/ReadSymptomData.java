package com.analytics.test;

import java.util.List;
/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 *
 * The implementation does not need to order the list
 * filepath will be defined in main method (filepath)
 *
 */
public interface ReadSymptomData {
    /**
     * GetSymptoms method
     * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
     */
    List<String> getSymptoms();

}
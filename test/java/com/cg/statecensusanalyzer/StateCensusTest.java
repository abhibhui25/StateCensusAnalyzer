package com.cg.statecensusanalyzer;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StateCensusTest {
    public static final String STATECENSUS_CSVFILE= "C:\\Users\\Abhishek Bhui\\Downloads\\StateCensusData.csv";
    public static final String WRONG_FILE = "/incorrect.txt";
    @Test
    public void GivenTheStateCodesCsvFile_IfHasCorrectNumberOfRecords_ShouldReturnTrue() throws IOException {
        try {
            int count = StateCensusAnalyser.openCsvBuilder(STATECENSUS_CSVFILE, StateCensusAnalyser.class);
            System.out.println(count);
            Assert.assertEquals(29, count);
        } catch (StateCensusException e) {
            e.printStackTrace();
        }
    }
}
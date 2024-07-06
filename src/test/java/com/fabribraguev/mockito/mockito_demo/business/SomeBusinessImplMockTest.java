package com.fabribraguev.mockito.mockito_demo.business;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SomeBusinessImplMockTest {

    @Test
    public void findTheGreatestOfAllData_threeValues(){
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25,5,1});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

        int result = businessImpl.findTheGreatestFromAllTheData();

        assertEquals(25,result);
    }
    @Test
    public void findTheGreatestOfAllData_oneValue(){
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

        int result = businessImpl.findTheGreatestFromAllTheData();

        assertEquals(1,result);
    }
}
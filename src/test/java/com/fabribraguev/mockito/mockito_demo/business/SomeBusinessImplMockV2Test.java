package com.fabribraguev.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockV2Test {
    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    public void findTheGreatestOfAllData_threeValues(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25,5,1});

        int result = businessImpl.findTheGreatestFromAllTheData();

        assertEquals(25, result);
    }
    @Test
    public void findTheGreatestOfAllData_oneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1});

        int result = businessImpl.findTheGreatestFromAllTheData();

        assertEquals(1, result);
    }
    @Test
    public void findTheGreatestOfAllData_emptyArray(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});

        int result = businessImpl.findTheGreatestFromAllTheData();

        assertEquals(Integer.MIN_VALUE, result);
    }
}
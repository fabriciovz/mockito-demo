package com.fabribraguev.mockito.mockito_demo.business;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SomeBusinessImplStubTest {

    @Test
    public void findTheGreatestOfAllData_threeValues(){
        DataService dataServiceStub = new DataServiceStub1();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllTheData();
        assertEquals(25,result);
    }
    @Test
    public void findTheGreatestOfAllData_oneValue(){
        DataService dataServiceStub = new DataServiceStub2();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllTheData();
        assertEquals(1,result);
    }
}


class DataServiceStub1 implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{25,5,1};
    }
}

class DataServiceStub2 implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{1};
    }
}

package com.monsanto.mbt;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShipmentTest {

    @Test
    public void testShipment_Sorted_By_Color(){
        //Implement your solution to get list of shipments
    	ShipmentController shipments = new ShipmentController();
    	//shipments.sortShipmentByColor(WidgetUtils.getSampleWidgets());
    	 Widget expected = new Widget(11, "Green", WidgetUtils.stringToDateConverter("02-01-2015"));
    	 assertEquals(expected,shipments.sortShipmentByColor(WidgetUtils.getSampleWidgets()).get(0).getWidgetList().get(9));
    }

    @Test
    public void testShipment_Sorted_By_Date(){
        //Implement your solution to get list of shipments
    	ShipmentController shipments = new ShipmentController();
    	//shipments.sortShipmentByDate(WidgetUtils.getSampleWidgets());
        Widget expected = new Widget(25, "Green", WidgetUtils.stringToDateConverter("05-16-2011"));
        assertEquals(expected,shipments.sortShipmentByDate(WidgetUtils.getSampleWidgets()).get(1).getWidgetList().get(7));
    }


}

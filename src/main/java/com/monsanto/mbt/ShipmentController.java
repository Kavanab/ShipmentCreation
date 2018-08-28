package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShipmentController {
	private static final  int MAX_SHIPMENT_SIZE = 10;
	 
	public List<Shipment> sortShipmentByDate(List<Widget> widgetList){
		List<Shipment> shipmentList = new ArrayList<Shipment>();
		
		Collections.sort(widgetList, Widget.widgetDateComparator);
		
		shipmentList = createShipmentList(widgetList);
		
		System.out.println(shipmentList);
		
		return shipmentList;
	}
	
	public List<Shipment> sortShipmentByColor(List<Widget> widgetList){
		List<Shipment> shipmentList = new ArrayList<Shipment>();
		
		Collections.sort(widgetList, Widget.widgetColourComparator);
		
		shipmentList = createShipmentList(widgetList);
		
		System.out.println(shipmentList);
		
		return shipmentList;
	}
	
	public List<Shipment> createShipmentList(List<Widget> widgetList){
		
		List<Shipment> shipmentList = new ArrayList<Shipment>();
		
		int numberOfShipments = widgetList.size() % MAX_SHIPMENT_SIZE == 0
                ? widgetList.size()/MAX_SHIPMENT_SIZE : widgetList.size()/MAX_SHIPMENT_SIZE+ 1;
                
        for (int i = 0; i < numberOfShipments; i++) {
            Shipment shipment = new Shipment();
            shipment.setWidgetList(widgetList.subList(
                    i*MAX_SHIPMENT_SIZE, i*MAX_SHIPMENT_SIZE + MAX_SHIPMENT_SIZE > widgetList.size()
                            ? widgetList.size() : i*MAX_SHIPMENT_SIZE+MAX_SHIPMENT_SIZE
                    )
            );
            shipmentList.add(shipment);
        }
        
		return shipmentList;
	}
}

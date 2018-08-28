package com.monsanto.mbt;

import java.util.List;

public class Shipment {

	List<Widget> widgetList;

	public List<Widget> getWidgetList() {
		return widgetList;
	}

	public void setWidgetList(List<Widget> widgetList) {
		this.widgetList = widgetList;
	}

	@Override
	public String toString() {
		//return "Shipment [widgetList=" + widgetList + "]";
		return "{\"widgets\":" + widgetList +
        '}';
	}

}

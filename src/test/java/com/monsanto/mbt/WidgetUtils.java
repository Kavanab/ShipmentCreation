package com.monsanto.mbt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WidgetUtils {

    public static List<Widget> getSampleWidgets() {
        List<Widget> widgets = new ArrayList<Widget>();

        widgets.add(new Widget(1, "Red", stringToDateConverter("01-01-2006")));//0
        widgets.add(new Widget(2, "Blue",  stringToDateConverter("02-03-2007")));//1
        widgets.add(new Widget(3, "Red",  stringToDateConverter("03-09-2006")));//2
        widgets.add(new Widget(4, "Green", stringToDateConverter( "04-01-2009")));//3
        widgets.add(new Widget(5, "Green",  stringToDateConverter("05-07-2011")));//4
        widgets.add(new Widget(6, "Blue", stringToDateConverter( "06-02-2016")));//5
        widgets.add(new Widget(7, "Green",  stringToDateConverter("07-01-2008")));//6
        widgets.add(new Widget(8, "Blue",  stringToDateConverter("08-02-2009")));//7
        widgets.add(new Widget(9, "Red",  stringToDateConverter("09-01-2005")));//8
        widgets.add(new Widget(10, "Blue",  stringToDateConverter("01-03-2013")));//9
        widgets.add(new Widget(11, "Green", stringToDateConverter( "02-01-2015")));//10
        widgets.add(new Widget(12, "Green", stringToDateConverter( "03-01-2012")));//11
        widgets.add(new Widget(13, "Red", stringToDateConverter( "04-01-2014")));//12
        widgets.add(new Widget(14, "Green",  stringToDateConverter("04-07-2009")));//13
        widgets.add(new Widget(15, "Red", stringToDateConverter( "05-01-2011")));//14
        widgets.add(new Widget(16, "Red",  stringToDateConverter("06-01-2016")));//15
        widgets.add(new Widget(17, "Red",  stringToDateConverter("07-01-2008")));//16
        widgets.add(new Widget(18, "Green", stringToDateConverter( "08-08-2009")));//17
        widgets.add(new Widget(19, "Red",  stringToDateConverter("09-01-2005")));//18
        widgets.add(new Widget(20, "Blue",  stringToDateConverter("01-05-2017")));//19
        widgets.add(new Widget(21, "Red",  stringToDateConverter("01-12-2006")));//20
        widgets.add(new Widget(22, "Blue",  stringToDateConverter("02-13-2007")));//21
        widgets.add(new Widget(23, "Red",  stringToDateConverter("03-14-2006")));//22
        widgets.add(new Widget(25, "Green",  stringToDateConverter("05-16-2011")));//23
        widgets.add(new Widget(24, "Red",  stringToDateConverter("04-15-2009")));//24

        return widgets;
    }

    public static Date stringToDateConverter(String strDate){
        Date parsedDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        try {
            parsedDate = formatter.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsedDate;
    }
}

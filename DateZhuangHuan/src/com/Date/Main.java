package com.Date;

import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner input=new Scanner(System.in);
		String date=input.nextLine();
		DateFormat dateformat=new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss");
		Date date1=dateformat.parse(date);
        SimpleDateFormat simple=new SimpleDateFormat("MM/dd/yyyy-hh-mm-ssa",new Locale("US"));
        System.out.println(simple.format(date1).toLowerCase());
	}

}

package global.sesoc.calendar.dao;

import java.util.ArrayList;

import global.sesoc.calendar.vo.Calendar;

public interface CalendarMapper {

	
	public int insertCalendar(Calendar c);
	
	public ArrayList<Calendar> calendarList(Calendar c); 
	
	public int calendarDelete(Calendar c);
	
	public int calendarUpdate(Calendar c);
	
}

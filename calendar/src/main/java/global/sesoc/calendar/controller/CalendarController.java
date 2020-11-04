package global.sesoc.calendar.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import global.sesoc.calendar.dao.CalendarDao;
import global.sesoc.calendar.vo.Calendar;
import global.sesoc.calendar.HomeController;

@RestController
public class CalendarController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	public CalendarDao dao;
	
	@RequestMapping(value = "/calendarInsert" ,method = RequestMethod.POST)
	public String calendarInsert(Calendar c) {
		
		
		c.setMember_ID("test");
		logger.info("켈린더:{}", c);
		int result = dao.insertCalendar(c);
		
		if(result>0) {
			
			return "success";
		}
				
		return "fail";
	}

	@RequestMapping(value = "/calendarList", method =RequestMethod.POST)
	public ArrayList<Calendar> calendarList(){
		
		Calendar c = new Calendar();
		c.setMember_ID("test");
		ArrayList<Calendar> list = dao.calendarList(c);
		
		
		
		return list;
	}
	
	@RequestMapping(value = "/calendarDelete", method =RequestMethod.POST)
	public String calendarDelete(Calendar c){
		
		c.setMember_ID("test");
		int del = dao.calendarDelete(c);	
		if(del>0) {
			return "success";
		}
	
	return "fail";
	}

	@RequestMapping(value = "/calendarUpdate", method =RequestMethod.POST)
	public String calendarUpdate(Calendar c){
		
		c.setMember_ID("test");
		System.out.println(c);
		int ud = dao.calendarUpdate(c);	
		if(ud > 0) {
			return "success";
		}
	return "fail";
	}

	@RequestMapping(value = "/calendarMove", method =RequestMethod.POST)
	public String calendarMove(Calendar c){
		
		c.setMember_ID("test");
		System.out.println(c);
		int up = dao.calendarUpdate(c);	
		if(up > 0) {
			return "success";
		}
	
	return "fail";
	}
	
}

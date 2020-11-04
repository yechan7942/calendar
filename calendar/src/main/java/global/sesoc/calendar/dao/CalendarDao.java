package global.sesoc.calendar.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.aop.aspectj.AspectJAdviceParameterNameDiscoverer.AmbiguousBindingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.calendar.vo.Calendar;

@Repository
public class CalendarDao {

	@Autowired
	private SqlSession session;

	public int insertCalendar(Calendar c) {

		CalendarMapper mapper = session.getMapper(CalendarMapper.class);

		return mapper.insertCalendar(c);

	}

	public ArrayList<Calendar> calendarList(Calendar c) {

		CalendarMapper mapper = session.getMapper(CalendarMapper.class);
		ArrayList<Calendar> list = mapper.calendarList(c);
		return list;
	}

	public int calendarDelete(Calendar c) {

		CalendarMapper mapper = session.getMapper(CalendarMapper.class);

		return mapper.calendarDelete(c);

	}

	public int calendarUpdate(Calendar c) {

		CalendarMapper mapper = session.getMapper(CalendarMapper.class);

		return mapper.calendarUpdate(c);
	}

}

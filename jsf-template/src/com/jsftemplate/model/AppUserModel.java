package com.jsftemplate.model;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.jsftemplate.db.AppUser;
import com.jsftemplate.hibernate.HibernateSession;
import com.jsftemplate.hibernate.SQL;

public class AppUserModel {
	@SuppressWarnings("unchecked")
	public static AppUser findByUserName(String userName){
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("AppUser", "findByUserName");
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(AppUser.class);
		query.setParameter("userName", userName);
		List<AppUser> list = query.list();
		session.close();
		return list.get(0);
	}
}

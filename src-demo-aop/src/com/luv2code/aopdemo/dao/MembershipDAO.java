package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public int addMembership() {
		System.out.println(getClass()+": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		return 1;
	}
}

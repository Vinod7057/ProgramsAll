package com.cj;

public class College {

	public static void main(String[] args) {
		
		Student st =new Student();
		st.setSid(12);
		st.setSname("vinod");
		Staff ge =new Staff();
		ge.setStaffid(23);
		ge.setStaffname("avinash");
		ge.setStaffsalary(1200.00);
		
		System.out.println(st.getSid()+""+st.getSname());
		System.out.println(ge.getStaffid() +" "  +ge.getStaffname()+""+ge.getStaffsalary());
	}

}

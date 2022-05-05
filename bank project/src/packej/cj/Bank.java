package packej.cj;

public class Bank {

	public static void main(String[] args) {
		Staff st=new Staff();
		st.setSid(2);
		st.setSneme("modi");
		st.setSsalary(20000.00);
		
		Customer cu=new Customer();
		cu.setCid(3);
		cu.setCname("goti");
		cu.setCacno(326531987l);
		
		System.out.println(st.getSid()+""+st.getSneme()+""+st.getSsalary());
		System.out.println(cu.getCid()+""+cu.getCname()+""+cu.getCacno());

	}

}

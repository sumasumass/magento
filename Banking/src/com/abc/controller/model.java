package com.abc.controller;

public class model {

	 
		private int accno;
		private string custid;
		private string pwd;
		private int balance;
		private string email;
		private string name;
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public string getCustid() {
			return custid;
		}
		public void setCustid(string custid) {
			this.custid = custid;
		}
		public string getPwd() {
			return pwd;
		}
		public void setPwd(string pwd) {
			this.pwd = pwd;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public string getEmail() {
			return email;
		}
		public void setEmail(string email) {
			this.email = email;
		}
		public string getName() {
			return name;
		}
		public void setName(string name) {
			this.name = name;
		}
		
		public Model()
		{
			try {
				Class.forName(Oracle.jdbc.driver.OracleDriver");"
				System.out.println("driverloaded");
			}
			catch(ClassNotFoundException) {
				e.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:oracle:thin:@//
						System.out.println("Connected");
			
			}
			catch(SQL Exceptione) {
				System.out.println("notdone");
				
			}
		}
		public boolean login()
		{
			Resultset res;
			try
			{
				prepareStatement pstmt=con.preparestatement("select *from BANK where CUSID=? AND)
			}
		}
		

	}



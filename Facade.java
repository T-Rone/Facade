package com;

public class Facade {
		public MedicineStore medicineStore;
		public Pay pay;
		public Register register;
		public Takemed takemed;
		public  Facade() {
			register  = new Register();
			medicineStore= new MedicineStore();
			pay = new Pay();
			takemed = new Takemed();
		}
//		//接待处挂号	
//		public void register()
//		{		
//			register.register();	
//		}	
//		//接待处带着病人去治疗，这个地方有点不妥，毕竟病人需要和医生直接打交道，理解就好	
//		public void Store()
//		{	
//			medicineStore.MedicineStore();
//		}	
//		//接待处缴费	
//		public void pay()
//		{		
//			pay.pay();
//		}	
//		//接待处取药
//		public void getMedicine()
//		{	 
//			takemed.Take();
//		}
	//今天听老师讲新体会，写在一个方法不好吗
		public void    Seedoctor() {
			register.register();	
			medicineStore.MedicineStore();
			pay.pay();
			takemed.Take();
		}
}

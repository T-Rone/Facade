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
//		//�Ӵ����Һ�	
//		public void register()
//		{		
//			register.register();	
//		}	
//		//�Ӵ������Ų���ȥ���ƣ�����ط��е㲻�ף��Ͼ�������Ҫ��ҽ��ֱ�Ӵ򽻵������ͺ�	
//		public void Store()
//		{	
//			medicineStore.MedicineStore();
//		}	
//		//�Ӵ����ɷ�	
//		public void pay()
//		{		
//			pay.pay();
//		}	
//		//�Ӵ���ȡҩ
//		public void getMedicine()
//		{	 
//			takemed.Take();
//		}
	//��������ʦ������ᣬд��һ������������
		public void    Seedoctor() {
			register.register();	
			medicineStore.MedicineStore();
			pay.pay();
			takemed.Take();
		}
}

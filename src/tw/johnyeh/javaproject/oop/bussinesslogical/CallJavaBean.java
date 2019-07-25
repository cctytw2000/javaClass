package tw.johnyeh.javaproject.oop.bussinesslogical;

public class CallJavaBean {
	public CallJavaBean(TestJavaBeanEX01 bean) {
		bean.getAddress();
		bean.getCustomer();
		bean.getOrderNumber();
		bean.getPhone();

		System.out.println(bean.getAddress());
		System.out.println(bean.getCustomer());
		System.out.println(bean.getPhone());
		System.out.println(bean.getOrderNumber());
	}

	public static void main(String[] args) {
		TestJavaBeanEX01 bsl = new TestJavaBeanEX01();
		bsl.setAddress("III");
		bsl.setCustomer("john");
		bsl.setOrderNumber("201907190002");
		bsl.setPhone("0972111111");
		CallJavaBean cjb = new CallJavaBean(bsl);
	}

}

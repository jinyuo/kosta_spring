package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//기존 방식
		//Member member = new Member();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample02/springDIConstructor.xml");
		
		System.out.println("---------------------------------------");
		//서비스의 insert 호출
		MemberService service =  context.getBean("service", MemberService.class);
		service.insert();
	}
}

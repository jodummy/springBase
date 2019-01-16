package testPjt01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		// 일반 자바 방식
		// TransporationWalk transW = new TransporationWalk();
		// transW.move();

		// 스프링에서는 xml파일로 객체를 생성 -> containar 방식
		// xml 접근방식
		// application 접근하는 방법
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		TransporationWalk transporationWalk = ctx.getBean("tWalk", TransporationWalk.class);
		transporationWalk.move();

		ctx.close();
	}
}

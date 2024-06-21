package com.smhrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//[5DAO지움]import com.smhrd.db.BoardDAO;
import com.smhrd.db.BoardMapper;
import com.smhrd.model.BoardVO;

//Spring F/W 흐름
// (1) Dispatcher Servlet (Front Controller) 요청을 받는다.
// (2) HandlerMapping 에게 요청값(==url)을 보낸다.
// (3) HandlerMapping 요청값과 일치하는 Controller를 SpirngContainer에서 찾는다.>@controller쓰는이유

// 해당하는 클래스 파일이 SC안에 자동으로 생성될 수 있게 만들고, Controller임을 명시하는 어노테이션

// (4) HandlerAdapter가 HM이 찾은 Controller를 실행

@Controller //기능이 정의되어 있음. springcontroller를 적재시기킨다.
public class BoardController {
	@Autowired //[4.]별표백만게
	private BoardMapper mapper; //[3]생성
	//Autowired
	//:자동으로 연결해줘.
	//: Spring Container에서 mapper를 구현한 구현체를 자동으로 연결해준다.
	
	
	
	//1.Spring F/W는 url mapping값을 <<메소드 단위로 설정>>
	// 접근제한자 + 리턴타입 + 명 매개변수
	//3.annotation 생성 > url mapping값을 잡아주는 방법 , ()안에 "/"경로 설정
	@RequestMapping("/") // 직역하면 /로 요청이 들어왔을때 board메소드를 실행
	public String board(Model model) {
		//Model을 가져오는 방법
		// -->메소드의 매개변수로 해당하는 객체를 작성
		// --> SC가 자동으로 객체를 채워줌!!
		
		
		//1.DAO생성
		
		//[지움1] BoardDAO dao = new BoardDAO();
		
		//2.DAO사용해서 결과값 받아오기
		 List<BoardVO> list = mapper.boardList();//[2.dao ->mapper 변경]
		//3. 받아온 결과값 model(request)영역에 담아주기
		// model이란? >> request의 경량화된 버전
		 model.addAttribute("list", list);
		// 4. board.jsp로 forward방식으로 이동하기
		
		return "board"; //4. 원래는WEB-INF/views/board.jsp
		//board --> 논리적인 주소값
		//WEB-INF/views/board.jsp -->물리적인 주소값
		// 논리적인 주소값을 물리적인 주소값으로 자동으로 변환해주는 View Resolver 객체가 이미 존재.
		// ViewResolver의 역할은? (확인해보고싶다면 servlet-context.xml봐보기!)
		// WEB-INF/views/ +리턴한 값 +.jsp
	}//2.매개변수와 리턴값이 뭔지모르니 틀만 잡아준다.
	
	
	
	
	
	
	
	
}

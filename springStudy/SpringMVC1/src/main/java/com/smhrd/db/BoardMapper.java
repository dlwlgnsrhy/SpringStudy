package com.smhrd.db;

import java.util.List; //ctrl +shift +o

import com.smhrd.model.BoardVO;


//mybatis f/w 사용할때 interface 형식을 사용!

//[1]DAO -> Mapper로 변경!!
public interface BoardMapper {

	//전체 게시글을 조회해서 결과값을 반환해주는 메소드
	
	public List<BoardVO> boardList();
	// BoardMapper mapper = new SqlSessionFactoryBean();
	// sql session 빌려오기 , 사용하기 ,반납하기,결과값 반환하기
	//session.select("boardList") 내용 참고
	// mapper.boardList();
	// 모두 SqlSessionFactoryBean의 역할!!!!
	// 즉, spring에서 알아서해준다.
}
//[2]안에 내용 다지움 (spring,bean설정으로 해결) 
// >>[3] 중괄호 지움 >> [4]interface형식으로 변경>>> [5]renameclass  (import했던 안쓰는 것 지움)
//boardcontroller 빨간줄 해결하러감
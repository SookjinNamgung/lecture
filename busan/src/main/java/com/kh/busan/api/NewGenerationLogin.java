package com.kh.busan.api;

public class NewGenerationLogin {

	// 요청 보낼 때 요청 URL에 뭘 요청하는지 보내자
	
	// 행위는 메소드로 구분하자
	// GET → 조회
	// POST → 생성
	// PUT → 수정
	// DELETE → 삭제
	
	// https://jwt.io/    json토큰
	// 흐름. id,pwd입력 > controller > service검증 > 성공 시 token정보 생성 > axios.then으로 token(쿠키/로컬이든)
	// 토큰을 탈취할 수 있으므로 만료기간을 설정함(개발자 마음이지만 보통1일 accessToken) + 리프래시토큰(RefeshToken 7일) 두개만들어서 다 줌. 리프래시는 DB에 저장해둠
	// 1일 뒤 엑세스가 만료되면 리프래시를 요청해서 acesstoken을만듦
	
	// Spring Security 는 Filter기반으로 동작한다.
}

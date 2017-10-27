package my.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.board.BoardDBBean;
import my.board.BoardDataBean;

public class UpdateFormAction implements CommandAction {
	public String requestPro(HttpServletRequest req , HttpServletResponse res) throws Throwable {
		
		int num = Integer.parseInt(req.getParameter("num")); //해당 글 번호 
		String pageNum = req.getParameter("pageNum");   //해당 페이지 번호
		
		BoardDBBean dbPro = BoardDBBean.getInstance(); //DB처리
		BoardDataBean article = dbPro.updateGetArticle(num);	//해당 글번호에 대한 해당 레코드 업데이트
		
		//해당 뷰에서 사용할 속성
		req.setAttribute("pageNum", new Integer(pageNum));
		req.setAttribute("article", article);
		
		return "updateForm.jsp";	// 뷰
	}
}

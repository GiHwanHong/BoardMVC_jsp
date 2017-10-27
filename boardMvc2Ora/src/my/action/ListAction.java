package my.action;

import java.util.*;
import javax.servlet.http.*;

import my.board.BoardDBBean;

public class ListAction implements CommandAction{

	public String requestPro(HttpServletRequest request , 
			HttpServletResponse response) throws Throwable{
		
		String pageNum = request.getParameter("pageNum");
		
		if(pageNum == null) pageNum = "1";
		
		int pageSize = 10;
		int currentPage = Integer.parseInt(pageNum);
		int startrow = (currentPage - 1) * pageSize + 1;
		int endRow = currentPage * pageSize;
		int count = 0;
		int number = 0;
		
		List articleList = null;
		BoardDBBean dbPro = BoardDBBean.getInstance(); //DB 연동하는 부분!
		count = dbPro.getArticleCount() ; // 전체 글의 수를 가져온다!
		
		if(count > 0) {
			articleList = dbPro.getArticles(startrow, endRow);
		}else {
			articleList = Collections.EMPTY_LIST;
		}
		
		number = count - (currentPage - 1) * pageSize; // 글 목록에 표시할 글번호
		// 뷰에서 사용할 속성
		
		request.setAttribute("currentPage", new Integer(currentPage));
		request.setAttribute("startRow", new Integer(startrow));
		request.setAttribute("endRow", new Integer(endRow));
		request.setAttribute("count", new Integer(count));
		request.setAttribute("pageSize", new Integer(pageSize));
		request.setAttribute("number", new Integer(number));
		request.setAttribute("articleList", articleList);
		
		return "list.jsp"; 	// 해당 뷰 
	}
	
}

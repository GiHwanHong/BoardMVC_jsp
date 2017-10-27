package my.action;

import javax.servlet.http.*;

import my.board.BoardDBBean;
import my.board.BoardDataBean;

public class ContentAction implements CommandAction {

	public String requestPro(HttpServletRequest req,HttpServletResponse res) throws Throwable{
		
		int num = Integer.parseInt(req.getParameter("num")); //�ش� �� ��ȣ 
		String pageNum = req.getParameter("pageNum");   //�ش� ������ ��ȣ
		
		BoardDBBean dbPro = BoardDBBean.getInstance(); //DBó��
		BoardDataBean article = dbPro.getArticle(num);	//�ش� �۹�ȣ�� ���� �ش� ���ڵ�
		
		req.setAttribute("num", new Integer(num));
		req.setAttribute("pageNum", new Integer(pageNum));
		req.setAttribute("article", article);
		
		return "content.jsp";	// ��
	}
}

package my.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.board.BoardDBBean;
import my.board.BoardDataBean;

public class UpdateFormAction implements CommandAction {
	public String requestPro(HttpServletRequest req , HttpServletResponse res) throws Throwable {
		
		int num = Integer.parseInt(req.getParameter("num")); //�ش� �� ��ȣ 
		String pageNum = req.getParameter("pageNum");   //�ش� ������ ��ȣ
		
		BoardDBBean dbPro = BoardDBBean.getInstance(); //DBó��
		BoardDataBean article = dbPro.updateGetArticle(num);	//�ش� �۹�ȣ�� ���� �ش� ���ڵ� ������Ʈ
		
		//�ش� �信�� ����� �Ӽ�
		req.setAttribute("pageNum", new Integer(pageNum));
		req.setAttribute("article", article);
		
		return "updateForm.jsp";	// ��
	}
}

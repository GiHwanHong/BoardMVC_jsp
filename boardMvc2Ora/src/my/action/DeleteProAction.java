package my.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.board.BoardDBBean;
import my.board.BoardDataBean;

public class DeleteProAction implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		request.setCharacterEncoding("euc-kr");
		
		int num = Integer.parseInt(request.getParameter("num")); // �ش� �� ��ȣ
		String pageNum = request.getParameter("pageNum"); // �ش� ������ ��ȣ
		String passwd = request.getParameter("passwd");
		
		BoardDBBean dbPro = BoardDBBean.getInstance(); // DBó��
		int check = dbPro.deleteArticle(num, passwd); // �ش� �۹�ȣ�� ���� �ش� ���ڵ�

		request.setAttribute("pageNum", new Integer(pageNum));
		request.setAttribute("check", new Integer(check));

		return "deletePro.jsp"; // ��
	}
}

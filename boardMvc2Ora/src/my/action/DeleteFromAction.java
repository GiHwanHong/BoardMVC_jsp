package my.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.board.BoardDBBean;
import my.board.BoardDataBean;

//�� ���� ��
public class DeleteFromAction implements CommandAction {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		int num = Integer.parseInt(request.getParameter("num")); // �ش� �� ��ȣ
		String pageNum = request.getParameter("pageNum"); // �ش� ������ ��ȣ

		// �信�� ����� �Ӽ�
		request.setAttribute("num", new Integer(num));
		request.setAttribute("pageNum", new Integer(pageNum));

		return "deleteForm.jsp"; // ��
	}
}
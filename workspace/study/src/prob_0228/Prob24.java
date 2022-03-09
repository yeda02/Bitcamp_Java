package prob_0228;

public class Prob24 {

	private static String getParameter(String url, String paramName) {

		String para = url.substring(url.indexOf(paramName));
		String string = para.substring(para.indexOf("=") + 1, para.indexOf("&"));

		return string;
	}

	public static void main(String[] args) {
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";

		String prodName = getParameter(url1, "prodName");
		System.out.println("��ǰ �̸�: " + prodName);

		String url2 = "http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";

		String userAddress = getParameter(url2, "address");
		System.out.println("ȸ�� �ּ�: " + userAddress);
	}

}
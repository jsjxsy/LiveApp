package imooc.bear.live;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//��ȡ���ݿ����ӵ���
public class SqlManager {

	private static final String dbPro = "jdbc:mysql://";
	private static final String host = "192.168.1.234";// ip��ַ
	private static final String port = "30112";// �˿ں�
	private static final String dbName = "5d4b8dd3c5be4";// ���ݿ�����
	private static final String charset = "?useUnicode=true&charactsetEncoding=utf-8";// �ַ���

	private static final String url = dbPro + host + ":" + port + "/" + dbName
			+ charset;
	private static final String user = "b3c15e03e3df4";
	private static final String password = "d10ce1a25ae64";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

}

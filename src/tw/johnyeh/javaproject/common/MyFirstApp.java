package tw.johnyeh.javaproject.common;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This my first project
 * @author JohnYeh (葉冠麟)
 * @version 版本 :  v1.2
 * 
 */
public class MyFirstApp {
/**
 * 進入點
 * @param args 進入點參數
 */
	public static void main(String[] args) {
		System.out.println("hola");
		/**
		 * 新增視窗和按鈕，setSize代表視窗長寬單位是PX
		 * add 代表新增
		 */
		JFrame jf = new JFrame("DB CRUD");
		jf.setSize(300, 250);
		jf.add(new JButton("Create"));
		jf.add(new JButton("Read"));
		jf.add(new JButton("Update"));
		jf.add(new JButton("Delete"));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}

}

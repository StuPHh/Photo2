package text;

import java.io.*;

public class read {
	public static void main(String[] args) throws Exception {
		// 指定要读取的图片
		FileInputStream in = new FileInputStream(new File("C:\\Users\\吴利明\\Desktop\\test1.jpg"));
		File file = new File("C:\\Users\\吴利明\\Desktop\\test1.jpg");
		if (!file.exists()) {
			// 如果文件不存在，则创建该文件
			file.createNewFile();
		}
		// 指定要写入的图片
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\吴利明\\Desktop\\test1.jpg"));
		// 每次读取的字节长度
		int n = 0;
		// 存储每次读取的内容
		byte[] bb = new byte[1024];
		while ((n = in.read(bb)) != -1) {
			// 将读取的内容，写入到输出流当中
			out.write(bb, 0, n);
		}
		// 关闭输入输出流
		out.close();
		in.close();
	}
//	public static void main(String[] args) {
//		String dirname = "/tmp";
//        File f1 = new File(dirname);
//        if (f1.isDirectory()) {
//            System.out.println("目录 " + dirname);
//            String s[] = f1.list();
//            for (int i = 0; i < s.length; i++) {
//                File f = new File(dirname + "/" + s[i]);
//                if (f.isDirectory()) {
//                    System.out.println(s[i] + " 是一个目录");
//                } else {
//                    System.out.println(s[i] + " 是一个文件");
//                }
//            }
//        } else {
//            System.out.println(dirname + " 不是一个目录");
//        }
//	}
}

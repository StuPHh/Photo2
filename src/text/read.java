package text;

import java.io.*;

import sun.security.krb5.internal.ccache.Tag;

public class read {
	public static void main(String[] args) throws Exception {
		// 指定要读取的图片
		File jpegFile = new File("C:\\Users\\吴利明\\Desktop\\test1.jpg");
        Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);
        for (Directory directory : metadata.getDirectories()) {
            for (Tag tag : directory.getTags()) {
                //格式化输出[directory.getName()] - tag.getTagName() = tag.getDescription()
                System.out.format("[%s] - %s = %s\n",
                        directory.getName(), tag.getTagName(), tag.getDescription());
            }
            if (directory.hasErrors()) {
                for (String error : directory.getErrors()) {
                    System.err.format("ERROR: %s", error);
                }
            }
        }
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

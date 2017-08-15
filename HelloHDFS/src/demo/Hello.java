package demo;

import java.io.InputStream;
import java.net.URL;
//import java.nio.file.FileSystem;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class Hello {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
//		URL url = new URL("hdfs://192.168.31.110:9000/hello.txt");
//		InputStream stream =url.openStream();
//		IOUtils.copyBytes(stream, System.out, 4096,true);
//		System.out.println("=============");
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS","hdfs://192.168.31.110:9000");
		FileSystem system =FileSystem.get(conf);
		
		boolean b =system.mkdirs(new Path("/hello/h"));
		System.out.println(b);
		
	}

}

package Server;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
//import org.apache.log4j.spi.LoggerFactory;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
//import org.eclipse.jetty.util.log.Logger;
//import org.eclipse.jetty.util.log.LoggerLog;
import org.eclipse.jetty.webapp.WebAppContext;
//import org.mortbay.jetty.nio.SelectChannelConnector;
import org.xml.sax.SAXException;

//import ch.qos.logback.classic.Logger;

public class QuickStart {
	 public static void main(String[] args) {  
	        try {  
	        	new QuickStart();
	            // 服务器的监听端口  
	            Server server = new Server(8080);  
	            // 关联一个已经存在的上下文  
	            ServerConnector connect=new ServerConnector(server,new HttpConnectionFactory());
	            connect.setHost("localhost");
	            connect.setReuseAddress(true);
//	            connect.setIdleTimeout(30000000);
//              设置描述符位置  
	            WebAppContext context = new WebAppContext();  
//		        String webapp = "E:/MyProject/eclipse Project/jspbotstrap/src/main/webapp"; 
		        String webapp="../jspbotstrap/src/main/webapp";
		        context.setDescriptor(webapp+"/WEB-INF/web.xml");  //指定web.xml配置文件  
		        context.setResourceBase(webapp);        //指定webapp目录  
	            context.setContextPath("/jspbotstrap");   // 设置上下文路径  
	            context.setClassLoader(Thread.currentThread().getContextClassLoader()); 
	            context.setConfigurationDiscovered(true);  
	            context.setParentLoaderPriority(true);  
	            server.setHandler(context);  
	            server.addConnector(connect);
	            server.setStopAtShutdown(true);   // 设置在JVM退出时关闭Jetty的钩子。
	            Logger logger=Logger.getLogger(Logger.class);
//	            server.setHandler(new handle());
	            // 启动  
	            server.start();
	            System.out.println();
	            if( server.isStarted()){
	            	logger.info("Server start at: http://"+connect.getHost()+":"+((ServerConnector)server.getConnectors()[0]).getPort()+context.getContextPath());
	            }
	            System.out.println();
	            server.join();  
	        } catch (FileNotFoundException e) {  
	            e.printStackTrace();  
	        } catch (SAXException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  
}

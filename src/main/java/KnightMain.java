import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import Spring.Classes.Knight;


public class KnightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext context = new FileSystemXmlApplicationContext("SpringConfig.xml");
		 Knight Knight1 = (Knight) context.getBean("knight1");
		 Knight Knight2 = (Knight) context.getBean("knight2");
		 Knight1.embarkOnQuest();
		 Knight2.embarkOnQuest();
	
	}

}

package com.MyMavenProject.AutomationProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogReports {
private static Logger log;
public static void LogInfo(Object msg)
{
	PropertyConfigurator.configure("D:\\newfolder\\AutomationProject\\src\\main\\java\\com\\MyMavenProject\\AutomationProject\\Objectrepojitory\\log4j.properties");
log=Logger.getLogger("Log4jReports");
log.info(msg);


}

}

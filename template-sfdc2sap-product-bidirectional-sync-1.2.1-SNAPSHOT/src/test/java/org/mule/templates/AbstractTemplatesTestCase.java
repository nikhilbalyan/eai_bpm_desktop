/**
 * Mule Anypoint Template
 * Copyright (c) MuleSoft, Inc.
 * All rights reserved.  http://www.mulesoft.com
 */
package org.mule.templates;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.mule.api.config.MuleProperties;
import org.mule.construct.Flow;
import org.mule.tck.junit4.FunctionalTestCase;

/**
 * This is the base test class for Templates integration tests.
 * 
 * @author damiansima
 */
public class AbstractTemplatesTestCase extends FunctionalTestCase {
	
	private static final String MAPPINGS_FOLDER_PATH = "./mappings";
	private static final String TEST_FLOWS_FOLDER_PATH = "./src/test/resources/flows/";
	private static final String MULE_DEPLOY_PROPERTIES_PATH = "./src/main/app/mule-deploy.properties";

//	@BeforeClass
//	public static void beforeClass() {
//		System.setProperty("mule.env", "test");
//	}
//
//	@AfterClass
//	public static void afterClass() {
//		System.getProperties().remove("mule.env");
//	}

	@Override
	protected String getConfigResources() {
		String resources = "";
		try {
			Properties props = new Properties();
			props.load(new FileInputStream(MULE_DEPLOY_PROPERTIES_PATH));
			resources = props.getProperty("config.resources");
		} catch (Exception e) {
			throw new IllegalStateException(
				"Could not find mule-deploy.properties file on classpath. " +
				"Please add any of those files or override the getConfigResources() " +
				"method to provide the resources by your own.");
		}
		return resources + getTestFlows();
	}

	protected String getTestFlows() {
		StringBuilder resources = new StringBuilder();

		File testFlowsFolder = new File(TEST_FLOWS_FOLDER_PATH);
		File[] listOfFiles = testFlowsFolder.listFiles();
		if (listOfFiles != null) {
			for (File f : listOfFiles) {
				if (f.isFile() && f.getName().endsWith("xml")) {
					resources.append(",")
								.append(TEST_FLOWS_FOLDER_PATH)
								.append(f.getName());
				}
			}
			return resources.toString();
		} 
		return "";
	}

	@Override
	protected Properties getStartUpProperties() {
		Properties properties = new Properties(super.getStartUpProperties());

		String pathToResource = MAPPINGS_FOLDER_PATH;
		File graphFile = new File(pathToResource);

		properties.put(MuleProperties.APP_HOME_DIRECTORY_PROPERTY, graphFile.getAbsolutePath());

		return properties;
	}

	protected Flow getFlow(String flowName) {
		return (Flow) muleContext.getRegistry().lookupObject(flowName);
	}

}

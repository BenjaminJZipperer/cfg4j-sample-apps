package org.cfg4j.sample;

public class EngineBean
{
	private String ENGINE_STATUS = "on_listening";
	private String NEXT_STATUS = null;
              
                private String[] result = {ENGINE_STATUS,NEXT_STATUS};

	public String[] getResults()
	{
		return this.result;
	}
}
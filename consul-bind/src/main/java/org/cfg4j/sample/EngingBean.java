package org.cfg4j.sample;
/* test git stash example: most bottom method was stashed then  method above was created then final commit */
public class EngineBean
{
	private String ENGINE_STATUS = "on_listening";
	private String NEXT_STATUS = null;
              
                private String[] result = {ENGINE_STATUS,NEXT_STATUS};

	public String[] getResults()
	{
		return this.result;
	}


	public int i_am_new_while_benjamin_worked_on_station_on_something_else()
	{
		return -1000800; // limit in my scope?
	}
	//first request User-Story
	public void setResultA(String engine_status)
	{
		this.ENGINE_STATUS = engine_status;
	}

}
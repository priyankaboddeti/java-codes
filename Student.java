package collections;

import java.io.Serializable;


	class Student implements Serializable 
	{
		private int id;
		private String name;
		
		Student(int id,String name)
		{
			super();
			this.id=id;
			this.name=name;
		}
		public int getId()
		{
			return id;
		}
		public void setId(int id)
		{
			this.id=id;
		}
		public String getName()
		{
			return name;
		}
		public void setNmae(String name)
		{
			this.name=name;
		}
}

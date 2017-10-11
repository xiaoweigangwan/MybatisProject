
public class MyBatisUtil{
   private static final SqlSessionFactory sqlSessionFactory;
   static{
	String resource = "mybatis-config.xml";
	InputStream inputStream = null;
	try{
      	    inputStream = Resources.getResourceAsStream(resource);
        }catch(IOException e){
	    System.out.println(e.getMessage());
        }
	sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
   }
   public static SqlSessionFactory getSqlSessionFactory(){
         return sqlSessionFactory;
   }	

}

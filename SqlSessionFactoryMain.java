public class SqlSessionFactoryMain{
public static final SqlSessionFactory sqlSessionFactory = null;
public static final SqlSessionFactory getSessionFactory(){
	if(sqlSessionFactory==null){
	String resource = "mapconfig.xml"
	InputStream inputStream = new InputStream(resource);
	try{
		sqlSessionFactory = new SqlSessionFactoryBuild().build(inputStream);

}catch(Exception e){
	system.out.println(e.getMessage());
}
}
      return sqlSessionFactory ;
}


}

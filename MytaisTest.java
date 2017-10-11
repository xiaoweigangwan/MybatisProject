public class MytaisTest{
 public static SqlSessionFactroy sqlSessionFactory = null;
    static{
       sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }	 
    public static void testAdd(){
	SqlSession sqlSession = sqlSessionFactory.openSession();
	UserInfo userInfo = new UserInfo();
	userInfo.setUserName("userNameValue");
	userInfo.setPassword("passwordValue");
	sqlSession.insert("insert",userInfo);
	sqlSession.commit();
	sqlSession.close();
    }
}

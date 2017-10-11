public class Run{
public static void main(String[] args){
  SqlSessionFactory sqlSessionFactory = ;
  SqlSession sqlSession = sqlSessionFactory.openSession();
  List<map> listUserinfo = sqlSession.selectList("");
}
}

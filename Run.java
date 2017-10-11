public class Run{
public static void main(String[] args){
  SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
  SqlSession sqlSession = sqlSessionFactory.openSession();
  List<Map> listUserinfo = sqlSession.selectList("getAllUserinfo");
  for(int i=0;i<listUserinfo.size();i++)
  {
    Map map = listUserinfo.get(i);
    System.out.println(map.get("ID")+" "+map.get("USERNAME"));
  }
  HasMap mapParam = new HasMap();
  mapParam.put("id",5);
  mapParam.put("ordersql","id desc");
  List<Map> listMap = sqlSession.selectList("",mapParam);
  for(int i=0;i<listMap.size();i++)
  {
    Map map = listMap.get(i);
    System.out.println(map.get("ID")+" "+map.get("USRENAME"));
  }
}
}

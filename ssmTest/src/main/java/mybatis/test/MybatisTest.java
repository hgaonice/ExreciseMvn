package mybatis.test;


import mybatis.dao.StudentDao;
import mybatis.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    public static void main(String[] args) throws IOException {
        InputStream input = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
//        student.setId(3);
        student.setAge(20);
        student.setGender("女");
        student.setName("红");

        int i = mapper.insertStu(student);
        sqlSession.commit();
        String result = i > 0 ? "添加成功！" : "添加失败！";
        System.out.println(result);
    }
    public void mybatisTest() throws Exception {


    }

    public void testMybatis() {
        String resource = "mybatis-config.xml";
// 加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

// 构建sqlSession的工厂
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();
        System.out.println(sqlSession);
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setAge(20);
        student.setGender("男");
        student.setName("某某");
        int i = mapper.insertStu(student);
        System.out.println(i);
    }

    public void mybatisTest01() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = sessionFactory.openSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setAge(12);
        student.setGender("女");
        student.setName("王红");

        int i = mapper.insertStu(student);
        sqlSession.commit();
        System.out.println(i);

    }
}

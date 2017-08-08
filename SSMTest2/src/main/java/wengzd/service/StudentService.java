package wengzd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wengzd.dao.StudentMapper;
import wengzd.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentMapper stu;
	
    public int deleteByPrimaryKey(Integer id)
    {
    	return stu.deleteByPrimaryKey(id);
    }

    public int insert(Student record)
    {
    	return stu.insert(record);
    }

    public int insertSelective(Student record)
    {
    	return -1;
    }

    public Student selectByPrimaryKey(Integer id)
    {	
    	return stu.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Student record)
    {
    	return -1;
    }

    public int updateByPrimaryKey(Student record)
    {
    	return stu.updateByPrimaryKey(record);
    }
}

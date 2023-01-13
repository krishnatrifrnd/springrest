package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
		return courseDao.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(long parseLong) {
		courseDao.deleteById(parseLong);
	}
}

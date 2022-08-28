package br.com.mobileng.study.core.repository;

import br.com.mobileng.study.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}

package br.com.mobileng.study.course.endpoint.service;

import br.com.mobileng.study.core.model.Course;
import br.com.mobileng.study.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    // @Autowired
    // private CourseRepository courseRepository;

    public Iterable<Course> list(Pageable pageable) {
        log.info("Listing All Courses");
        return courseRepository.findAll(pageable);
    }
}

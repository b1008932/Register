import uk.ac.shu.webarch.register.*;

class BootStrap {

    def init = { servletContext ->
println("BootStrap::init");

def ash_instructor = Instructor.findByStaffId("12345a") ?: new Instructor(staffId:"12345a", name: "Ashley Moran").save();
def john_instructor = Instructor.findByStaffId("6789a") ?: new Instructor(staffId:"6789a", name: "John Peters").save();

def web_arch_course = Course.findByCourseCode("11111d") ?: new Course(courseCode:"11111d", 
courseName: "Web Architectures",
description: "Web Applications").save();

def new_class = new RegClass(name:"WebArch-Mondays", classInstructor:ash_instructor, course:web_arch_course).save();


    }
    def destroy = {
    }
}

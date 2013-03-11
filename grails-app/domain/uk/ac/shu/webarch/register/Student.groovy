package uk.ac.shu.webarch.register

class Student {



String fullStudentName
String studentNumber
String notes

Set courses

Set classAtts

static hadMany = [
courses: Enrollment,
classAtts: RegisterEntry
]

static mappedBy = [
courses: "student",
classAtts:"student"
]



    static constraints = {
fullStudentName(nullable:false, blank:false,maxSize:256);
studentNumber(nullable:false, blank:false,maxSize:256);
    }
}

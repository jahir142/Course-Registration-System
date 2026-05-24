function showCourse(){
   fetch("http://localhost:8080/courses")
   .then((response) => response.json())
   .then((courses) => {
    const datatable=document.getElementById("coursetable")

    courses.forEach(course => {
        var row=`<tr>
        <td>${course.Courseid}</td>
         <td>${course.CourseName}</td>
          <td>${course.trainerName}</td>
           <td>${course.CourseDuration}</td> </tr>`

           datatable.innerHTML+=row;
    });
   })
}

function showEnrolledStudents(){
   fetch("http://localhost:8080/courses/enroll")
   .then((response) => response.json())
   .then((courses) => {
    const datatable=document.getElementById("enrolledtable")

    courses.forEach(student => {
        var row=`<tr>
        <td>${student.id}</td>
         <td>${student.name}</td>
          <td>${student.email}</td>
           <td>${student.course}</td> </tr>`

           datatable.innerHTML+=row;
    });
   })
}




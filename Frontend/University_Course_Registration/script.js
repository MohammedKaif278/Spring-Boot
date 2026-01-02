const BASE_URL="http://localhost:8080/courseregistration";

// REGISTER COURSE
function registerCourse() {
    const data = {
        registrationId: Number(document.getElementById("registrationId").value),
       studentId: Number(document.getElementById("studentId").value),
        studentName: document.getElementById("studentName").value,
        courseCode: document.getElementById("courseCode").value,
        courseName: document.getElementById("courseName").value,
        semester: Number(document.getElementById("semester").value),
        credits: Number(document.getElementById("credits").value)
       
    };

    //Basic Validations
    if(!data.studentId || !data.studentName || !data.courseCode)
    {
        alert("Please fill all required fields");
        return;
    }

    fetch(`${BASE_URL}/register`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(res => res.text())
    .then(msg =>{
        document.getElementById("message").innerText=msg;
        loadRegistraations();
    })
   
    .catch(err => console.error(err));
}


//Load All Registrations
function loadRegistrations()
{
    fetch(`${BASE_URL}/registrations`)
    .then(res =>res.json())
    .then(data =>{
        const tableBody=document.getElementById("tableBody");
        tableBody.innerHTML="";
        data.forEach(reg =>{
            tableBody.innerHTML+=`
            <tr>
                <td>${reg.registrationId}</td>
                <td>${reg.studentId}</td>
                <td>${reg.studentName}</td>
                <td>${reg.courseCode}</td>
                <td>${reg.courseName}</td>
                <td>${reg.semester}</td>
                <td>${reg.credits}</td>
                <td>${reg.registrationStatus}</td>
                <td><button onclick="dropCourse(${reg.registrationId})">Drop</button></td>
            </tr> `;

        });
    })
}


// DROP COURSE
function dropCourse(id) {

    fetch(`${BASE_URL}/drop/${id}`, {
        method: "PUT"
    })
    .then(res => res.text())
    .then(msg => {
        alert(msg);
        loadRegistrations();
    })
    .catch(err => console.error(err));
}
var JSONnotif = document.getElementById("fetchData").innerHTML;
//const notifJSON = JSON.parse(JSONnotif);

let yearCon = document.getElementById("yr-con");
let monCon = document.getElementById("mon-con");
let dayCon = document.getElementById("day-con");
let notifCon = document.getElementById("notif-con");
let openCloseNotif = document.getElementById("open-close-notif-con");
let notificationCon =  document.getElementById("notification-container");

setInterval(() =>{
    let date = new Date();
    yearCon.innerHTML = date.getFullYear();
    const months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
    monCon.innerHTML = months[date.getMonth()];
    dayCon.innerHTML = date.getDate();
}, 1000);


for (var i=0; i<3; i++){
    notifCon.innerHTML +=
        `<div class="notif-item-con">
            <img src="icons/icons8_packaging_50px_1.png" alt="pic" width="30px" height="30px" />
            <div class="pack-name-con">
                <p>`+notifJSON.name+`</p>
            </div>
            <div class="not-post-date">`+notifJSON.dateCreated+`</div>
        </div>`;
}
var openClosedNotif = true;
openCloseNotif.addEventListener("click", function () {
    if(openClosedNotif) {
        openCloseNotif.src = "icons/icons8_left_96px.png";
        notificationCon.style.display = "none";
        openClosedNotif = false;
    }
    else if(openClosedNotif == false){
        openCloseNotif.src = "icons/icons8_right_96px.png";
        notificationCon.style.display = "block";
        openClosedNotif = true;
    }
})

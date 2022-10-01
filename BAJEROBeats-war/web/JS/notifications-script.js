let yearCon = document.getElementById("yr-con");
let monCon = document.getElementById("mon-con");
let dayCon = document.getElementById("day-con");
let notifCon = document.getElementById("notif-con");

let date = new Date();
yearCon.innerHTML = "2022";
const months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
monCon.innerHTML = months[date.getMonth()];
dayCon.innerHTML = date.getDate();

for (var i=0; i<3; i++){
    notifCon.innerHTML +=
        `<div class="notif-item-con">
            <img src="icons/icons8_packaging_50px_1.png" alt="pic" width="30px" height="30px" />
            <div class="pack-name-con">
                <p>Paradise Pack samples </p>
            </div>
            <div class="not-post-date">31 Oct</div>
        </div>`;
}

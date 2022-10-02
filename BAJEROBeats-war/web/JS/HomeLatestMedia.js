var JSONdata = document.getElementById("fetchData").innerHTML;
const mediaJSON = JSON.parse(JSONdata);

const prdName = document.getElementById("prdName");
prdName.innerHTML = mediaJSON.name;

const prdDate = document.getElementById("prdDate");
prdDate.innerHTML = mediaJSON.dateCreated;

const prdCost = document.getElementById("prdCost");
prdCost.innerHTML = mediaJSON.cost;


var plyBtn1 = document.getElementById("playPause-btn1");
var plyBtn2 = document.getElementById("playPause-btn2");
var plyBtn3 = document.getElementById("playPause-btn3");
var plyBtn4 = document.getElementById("playPause-btn4");

var btns = [plyBtn1, plyBtn2, plyBtn3, plyBtn4];
const songLinks = ['','','','']; //4 media links for preview.
let wavesurfer1 = null;
let wavesurfer2 = null;
let wavesurfer3 = null;
let wavesurfer4 = null;
var wavesurfers = [wavesurfer1, wavesurfer2, wavesurfer3, wavesurfer4 ];
const previews = ['#preview-1', '#preview-2', '#preview-3', '#preview-4'];

var isPlaying = 0;
function stop(music){
    switch(music){
        case 1:
            wavesurfers[music-1].pause();
            plyBtn1.src = "icons/icons8_Play_Button_Circled_50px.png"
            break;
        case 2:
            wavesurfers[music-1].pause();
            plyBtn2.src = "icons/icons8_Play_Button_Circled_50px.png"
            break;
        case 3:
            wavesurfers[music-1].pause();
            plyBtn3.src = "icons/icons8_Play_Button_Circled_50px.png"
            break;
        case 4:
            wavesurfers[music-1].pause();
            plyBtn4.src = "icons/icons8_Play_Button_Circled_50px.png"
            break;
    }
}
var i=0
for(i; i<btns.length; i++){
    wavesurfers[i] = WaveSurfer.create({
        container: previews[i],
        waveColor: 'black',
        progressColor: 'red',
        height: 40,
        barWidth: 1,
        barRadius: 1,
        responsive: true
    });

    wavesurfers[i].load(songLinks[i]);

}

//1

plyBtn1.onclick = function(){
    if(plyBtn1.src.includes("Play")){
        stop(isPlaying);
        wavesurfers[0].play();
        isPlaying = 1;
        plyBtn1.src = "icons/icons8_pause_squared_50px.png"
    }
    else{
        wavesurfers[0].pause();
        plyBtn1.src = "icons/icons8_Play_Button_Circled_50px.png"
    }

}

//2

plyBtn2.onclick = function(){
    if(plyBtn2.src.includes("Play")){
        stop(isPlaying);
        wavesurfers[1].play();
        isPlaying = 2;
        plyBtn2.src = "icons/icons8_pause_squared_50px.png"
    }
    else{
        wavesurfers[1].pause();
        plyBtn2.src = "icons/icons8_Play_Button_Circled_50px.png"
    }

}

//3

plyBtn3.onclick = function(){
    if(plyBtn3.src.includes("Play")){
        stop(isPlaying);
        wavesurfers[2].play();
        isPlaying = 3;
        plyBtn3.src = "icons/icons8_pause_squared_50px.png"
    }
    else{
        wavesurfers[2].pause();
        plyBtn3.src = "icons/icons8_Play_Button_Circled_50px.png"
    }

}

//4

plyBtn4.onclick = function(){
    if(plyBtn4.src.includes("Play")){
        stop(isPlaying);
        wavesurfers[3].play();
        isPlaying = 4;
        plyBtn4.src = "icons/icons8_pause_squared_50px.png"
    }
    else{
        wavesurfers[3].pause();
        plyBtn4.src = "icons/icons8_Play_Button_Circled_50px.png"
    }

}



let plyBtn = document.getElementById("playPause-btn");

let wavesurfer = WaveSurfer.create({
    container: '#audio-waveform',
    waveColor: 'violet',
    progressColor: 'red',
    height: 50,
    barWidth: 4,
    barRadius: 4,
    responsive: true
});

wavesurfer.load('media/Driemanskap.mp3');

plyBtn.onclick = function(){
    if(plyBtn.src.includes("Play")){
        wavesurfer.play();
        plyBtn.src = "icons/icons8_pause_squared_50px.png"
    }
    else{
        wavesurfer.pause();
        plyBtn.src = "icons/icons8_Play_Button_Circled_50px.png"
    }

}

function showConfirmation(status) {

    var body = document.getElementById("body");
    body.innerHTML +=
        "<div class=\"confir-wrapper\" id=\"confir-wrapper\">\n" +
        "          <div class=\"con-wrapper\">\n" +
        "              <div class=\"con-pic\">\n" +
        "                <img id='conPic' src=\"\" alt=\"ok\" width=\"100px\" /><br />\n" +
        "              </div>\n" +
        "              <div id='conBgTxt' class=\"con-bg-txt\"></div>\n" +
        "              <div id='conTxt' class=\"con-text\"></div>\n" +
        "              <div class=\"con-but\">\n" +
        "                  <button id=\"confButton\">OK</button>\n" +
        "              </div>\n" +
        "          </div>\n" +
        "      </div>"

    var confPage = document.getElementById("confir-wrapper");
    var confButton = document.getElementById("confButton");
    confButton.addEventListener("click",function () {
        confPage.style.visibility = "hidden";
    });

    var conPic = document.getElementById("conPic");
    var conBgTxt = document.getElementById('conBgTxt');
    var conTxt = document.getElementById('conTxt');
    if (status=='success'){
        conPic.src = "icons/icons8_ok_100px.png";
        conBgTxt.innerHTML = "Congratulations";
        conTxt.innerHTML = "Completed successfully!";
    }
    else if(status=='error'){
        conPic.src = "icons/icons8_attention_100px.png";
        conBgTxt.innerHTML = "Error!";
        conTxt.innerHTML = "Caught an error!";
    }

}
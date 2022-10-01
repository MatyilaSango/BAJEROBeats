<!--
    Document   : sign in
    Created on : Jul 30, 2022, 8:23:49 PM
    Author     : Sango
-->

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("sign in.jsp");
    }
%>

<html>
    <head>
        <title>BAJEROBeats</title>
        <link rel="icon" href="icons/BAJERO-logo.png" type="png" />
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous" />
        <link href="Styles/bootstrap.min.css" rel="stylesheet" />
        <link href="Styles/styles.css" rel="stylesheet" />
        <script src="https://unpkg.com/wavesurfer.js"></script>
    </head>
    <body>
    <div class="wrapper">
        <div class="row nav-container justify-content-center" id="nav-container">
            <script src="JS/script.js"></script>
        </div>
        <div class="main-banner">
            <div class="content-wrapper">
                <div class="new-content-card">
                    <div class="prdct-txt">
                        <span style="font-size: 15px;"><b>NEW PRODUCT:</b></span><br>
                    </div>
                    <div class="pn">
                        <span style="font-size: 20px;"><b>${productName}</b></span><br>
                    </div>
                    <div class="date-div">
                        <span style="font-size: 15px;">%=${dateCreated}</span>
                    </div>
                    <div class="content-image-div prod">
                        <div class="sale-tag">
                            <span>For sale!</span>
                        </div>
                    </div>
                    <div class="like-to-cart-save">
                        <nav>
                            <div class="like-div">
                                .
                            </div>
                            <div class="to-cart-det-div">
                                <div class="BUNDLE-KIT">
                                    <span><b>BUNDLE KIT</b></span>
                                </div>
                                <div class="free-d">
                                    <span style="color: red; font-size: 13px">${cost}</span>
                                </div>
                                <input type="button" class="btn-download" value="ADD TO CART" />


                            </div>
                            <div class="save-div">
                                <img src="icons/icons8_bookmark_ribbon_50px.png" width="50px" alt="pic" />
                            </div>
                        </nav>

                    </div>
                    <div class="audio-review-containter" id="audio-review-containter">
                        <div class="preview-name"><span><b>Preview:</b></span></div>
                        <div class="audio-box">
                            <span><b>Name</b></span>
                            <div class="audio-placement">
                                <img id="playPause-btn1" src="icons/icons8_Play_Button_Circled_50px.png" alt="pic" width="35px" />
                                <div id="preview-1"></div>
                            </div>
                        </div>
                        <div class="audio-box">
                            <span><b>Name</b></span>
                            <div class="audio-placement">
                                <img id="playPause-btn2" src="icons/icons8_Play_Button_Circled_50px.png" alt="pic" width="35px" />
                                <div id="preview-2"></div>
                            </div>
                        </div>
                        <div class="audio-box">
                            <span><b>Name</b></span>
                            <div class="audio-placement">
                                <img id="playPause-btn3" src="icons/icons8_Play_Button_Circled_50px.png" alt="pic" width="35px" />
                                <div id="preview-3"></div>
                            </div>
                        </div>
                        <div class="audio-box">
                            <span><b>Name</b></span>
                            <div class="audio-placement">
                                <img id="playPause-btn4" src="icons/icons8_Play_Button_Circled_50px.png" alt="pic" width="35px" />
                                <div id="preview-4"></div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>


        </div>
        <div class="row footer" id="footer">
            <script src="JS/script.js"></script>
        </div>
        <div class="notification-container" id="notification-container">
            <div class="date-con">
                <div class="yr-con" id="yr-con"></div>
                <div class="mon-con" id="mon-con"></div>
                <div class="day-con" id="day-con"></div>
            </div>
            <div class="notif-con" >
                <p>Notifications</p>
                <div class="notif-con-list" id="notif-con">

                </div>

            </div>
        </div>
        <div class="open-close-notif-con" >
            <img id="open-close-notif-con" src="icons/icons8_right_96px.png" width="30px" height="30px" alt="pic"/>
            <p>Open/close notifications!</p>
        </div>
    </div>
    <script src="JS/previewTracks.js"></script>
    <script src="JS/notifications-script.js"></script>
    </body>
</html>
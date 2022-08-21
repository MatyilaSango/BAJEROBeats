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

<html xmlns="http://www.w3.org/1999/html">
    <head>
        <title>BAJEROBeats</title>
        <link rel="icon" href="icons/BAJERO-logo.png" type="png" />
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous" />
        <link href="Styles/bootstrap.min.css" rel="stylesheet" />
        <link href="Styles/styles.css" rel="stylesheet" />
    </head>
    <body>
        <div class="wrapper">
            <div class="row nav-container justify-content-center" id="nav-container">
                <script src="JS/script.js"></script>
            </div>
            <div class="main-banner">
                <div class="content-wrapper">
                    <div class="container-wrapper" id="content-wrapper" onscroll="onScrollShowHideBtn()">
                        <script src="JS/ExploreList.js"></script>
                    </div>
                </div>

            </div>
            <div class="row footer" id="footer">
                <script src="JS/script.js"></script>
            </div>
        </div>
        <button id="toTopBtn" onclick=""><img src="icons/icons8_up_50px_1.png" alt="up" width="30px" /></button>
    </body>
</html>
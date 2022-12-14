<!-- 
    Document   : sign in
    Created on : Jul 31, 2022, 6:16:49 PM
    Author     : Sango
-->

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
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
            <div class="row log-in-body">
                <div class="col-lg-12 col-md-12 col-sm-12 log-in-col">
                    <div class="sign-up-container">
                        <div class="sign-in-text">
                            <span style="font-size: 25px;"><b>SIGN UP</b></span>
                        </div>
                        <div class="sign-in-details">
                            <form action="Sign_Up" method="post">
                                <div class="con">
                                    <div class="sign-in-details-container">
                                        <img src="icons/icons8_user_50px_1.png" rel="pic" width="25px" height="25px" alt="pic" />
                                        <input type="text" placeholder="Username" required name="username" />
                                    </div>
                                </div>
                                <div class="con">
                                    <div class="sign-in-details-container">
                                        <img src="icons/icons8_user_50px_1.png" rel="pic" width="25px" height="25px" alt="pic" />
                                        <input type="email" placeholder="Email" required name="email" />
                                    </div>
                                </div>
                                <div class="con">
                                    <div class="sign-in-details-container">
                                        <img src="icons/icons8_lock_50px.png" rel="pic" width="25px" height="25px" alt="pic" />
                                        <input type="password" placeholder="Password" required name="password" />

                                    </div>
                                </div>
                                <div class="con">
                                    <div class="sign-in-details-container">
                                        <img src="icons/icons8_lock_50px.png" rel="pic" width="25px" height="25px" alt="pic" />
                                        <input type="password" placeholder="Confirm password" required name="confirm_password" />

                                    </div>
                                </div>
                                <div class="con">
                                    <div class="sign-in-btn-container">
                                        <input type="submit" value="SIGN UP" class="sign-in-btn" />
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row footer" id="footer">
                <script src="JS/script.js"></script>
            </div>
        </div>
    <script src="JS/confirmation_pop_handler.js"></script>
    <script>
        if(confStatus=="success"){
            showConfirmation("success");
        }
        else if(confStatus == "error"){
            showConfirmation("error");
        }
    </script>
    </body>
</html>


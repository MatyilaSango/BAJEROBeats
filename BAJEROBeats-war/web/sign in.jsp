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
<html>
    <head>
        <title>BAJEROBeats</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous" />
        <link href="Styles/bootstrap.min.css" rel="stylesheet" />
        <link href="Styles/styles.css" rel="stylesheet" />

    </head>
    <body>
        <div class="wrapper">
            <div class="row nav-container">
                <div class="logo-icon col-lg-4 col-md-4 col-sm-0">
                    logo
                </div>
                <div class="mid-links col-lg-4 col-md-4 col-sm-8">
                    <nav>
                        <a href="">Home</a> |
                        <a href="">Explore</a> |
                        <a href="">My list</a>
                    </nav>
                </div>
                <div class="right-links col-lg-4 col-md-4 col-sm-4">
                    <nav>
                        <a href=""><img src="icons/icons8_search_50px_4.png" width="18px" height="18px" alt="pic" />Search</a> |
                        <a href=""><img src="icons/icons8_user_50px.png" width="18px" height="18px" alt="pic" />Account</a> |
                        <a href=""><img src="icons/icons8_shopping_cart_50px.png" width="18px" height="18px" alt="pic" />Cart</a>
                    </nav>
                </div>
            </div>
            <div class="row log-in-body">
                <div class="col-lg-12 col-md-12 col-sm-12 log-in-col">
                    <div class="sign-in-container">
                        <div class="sign-in-text">
                            <span style="font-size: 25px;"><b>SIGN IN</b></span>
                        </div>
                        <div class="sign-in-details">
                            <form action="Sign_In" method="post">
                                <div class="con">
                                    <div class="sign-in-details-container">
                                        <img src="icons/icons8_user_50px_1.png" rel="pic" width="25px" height="25px" alt="pic" />
                                        <input type="text" placeholder="Username" required name="username" />
                                    </div>
                                </div>
                                <div class="con">
                                    <div class="sign-in-details-container">
                                        <img src="icons/icons8_lock_50px.png" rel="pic" width="25px" height="25px" alt="pic" />
                                        <input type="password" placeholder="Password" required name="password" />
                                        <a href="" ><span style="font-size: 10px; color: black;">FORGOT PASSWORD</span></a>
                                        <div class="error-message">
                                            <span style="color: red; font-size: 10px;">{error}</span>
                                        </div>

                                    </div>
                                </div>
                                <div class="con">
                                    <div class="sign-in-btn-container">
                                        <input type="submit" value="LOG IN" class="sign-in-btn" />
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="sign-in-alternates">
                            <a href="">SIGN UP</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row footer">
                <div class="footer col-lg-12 col-md-12 col-sm-12">
                    <span style="color: white; font-size: 15px;">�2022, BAJEROBeats</span>
                </div>
            </div>
        </div>
    </body>
</html>


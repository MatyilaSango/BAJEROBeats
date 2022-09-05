document.getElementById("nav-container").innerHTML =
    `<div class="logo-icon col-lg-4 col-md-4 col-sm-0" id="logo-icon">
                    <img src="icons/BAJERO-logo.png" width="150px" id="image-logo"/>
                </div>
                <div class="mid-links col-lg-4 col-md-4 col-sm-12">
                    <nav>
                        <a href="Home.jsp" class="nav-text">Home</a> |
                        <a href="Explore.jsp" class="nav-text">Explore</a> |
                        <a href="" class="nav-text">My list<div id="mylist-notification">0</div></a>
                        <div class="dropdown-container">
                            <div class="dropdown">
                                <img id="dropdown-btn" src="icons/icons8_menu_filled_50px_1.png" alt="pic" width="30px" />
                                <div class="drpContents" id="drpContents">
                                    <div class="drp-nav">
                                        <a href="" class="nav-text"><img src="icons/icons8_search_50px_black.png" width="25px" alt="pic" /></a>
                                    </div>
                                    <div class="drp-nav">
                                        <a href="" class="nav-text"><img src="icons/icons8_user_50px_black.png" width="25px" alt="pic" /></a>
                                    </div>
                                    <div class="drp-nav">
                                        <a href="Cart.jsp" class="nav-text"><img src="icons/icons8_shopping_cart_50px_black.png" width="25px" alt="pic" /><div id="cart-notification"><span style="color: black;">0</span></div></a>
                                    </div>  
                                </div>
                            </div>
                        </div>
                    </nav>
                </div>
                <div class="right-links col-lg-4 col-md-4 col-sm-0">
                    <nav>
                        <a href="" class="nav-text"><img src="icons/icons8_search_50px_4.png" width="18px" height="18px" alt="pic" />Search</a> |
                        <div class="prof-acc-con" >
                            <a href="" class="nav-text" id="acc-btn"><img src="icons/icons8_user_50px.png" width="18px" height="18px" alt="pic" />Account</a> 
                            <div class="prof-float-cont" id="prof-float-cont">
                                <div class="head-prof">
                                    <img src="icons/icons8_gender_neutral_user_50px.png" alt="pic" width="35px" height="35px" />
                                    <span class="usern"><b>Username</b></span><br />
                                    <span style="font-size: 10px;">email@mail.com</span>
                                </div>
                                <button><b>Profile</b></button>
                                <div class="prof-item-dis">
                                    <p>Cart: 0</p>
                                </div>
                                <div class="prof-item-dis">
                                    <p>Favourites: 0</p>
                                </div>
                                <button class="out-b"><b>Log out</b></button>
                            </div>
                        </div>
                        | <a href="Cart.jsp" class="nav-text"><img src="icons/icons8_shopping_cart_50px.png" width="18px" height="18px" alt="pic" />Cart<div id="cart-notification">0</div></a>
                    </nav>
                </div>`;

document.getElementById("footer").innerHTML =
                `<div class="footer col-lg-12 col-md-12 col-sm-12">
                    <span style="color: white; font-size: 15px;">Copyright 2022, BAJEROBeats</span>
                </div>`;

var drpNavContents = document.getElementById("drpContents");
var drpdwnBtn = document.getElementById("dropdown-btn");
var accBtn = document.getElementById("acc-btn");
var accDisPro = document.getElementById("prof-float-cont");

drpdwnBtn.onclick = function(){
    if(drpNavContents.style.display == "none"){
        drpNavContents.style.display = "inline-block"
    }
    else{
        drpNavContents.style.display = "none"
    }
}

accBtn.onclick = function(){
    if(accDisPro.style.display=="none"){
        accDisPro.style.display="block";
    }else{
        accDisPro.style.display="none";
    }
}
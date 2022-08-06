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
                                        <a href="" class="nav-text"><img src="icons/icons8_shopping_cart_50px_black.png" width="25px" alt="pic" /><div id="cart-notification"><span style="color: black;">0</span></div></a>
                                    </div>  
                                </div>
                            </div>
                        </div>
                    </nav>
                </div>
                <div class="right-links col-lg-4 col-md-4 col-sm-0">
                    <nav>
                        <a href="" class="nav-text"><img src="icons/icons8_search_50px_4.png" width="18px" height="18px" alt="pic" />Search</a> |
                        <a href="" class="nav-text"><img src="icons/icons8_user_50px.png" width="18px" height="18px" alt="pic" />Account</a> |
                        <a href="" class="nav-text"><img src="icons/icons8_shopping_cart_50px.png" width="18px" height="18px" alt="pic" />Cart<div id="cart-notification">0</div></a>
                    </nav>
                </div>`;

document.getElementById("footer").innerHTML =
                `<div class="footer col-lg-12 col-md-12 col-sm-12">
                    <span style="color: white; font-size: 15px;">Copyright 2022, BAJEROBeats</span>
                </div>`;

var drpNavContents = document.getElementById("drpContents");
var drpdwnBtn = document.getElementById("dropdown-btn");

drpdwnBtn.onclick = function(){
    if(drpNavContents.style.display == "none"){
        drpNavContents.style.display = "inline-block"
    }
    else{
        drpNavContents.style.display = "none"
    }
}
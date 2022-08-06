
const itemCard = document.getElementById("cart-wrapper");
var newAdd = "";
var i = 0;
for ( i; i<20; i++){
    newAdd +=
        `<div class="new-content-card cart-card">
        <div class="prdct-txt">
            <span style="font-size: 15px;"><b>PRODUCT:</b></span><br>
        </div>
        <div class="pn">
            <span style="font-size: 20px;"><b>PACKAGE NAME</b></span><br>
        </div>
        <div class="date-div">
            <span style="font-size: 15px;">DATE</span>
        </div>
        <div class="content-image-div">

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
                        <span style="color: red; font-size: 13px">FREE DOWNLOAD</span>
                    </div>
                    <input type="button" class="btn-download" value="CHECKOUT" />
                </div>
                <div class="save-div">
                    <img src="icons/icons8_bookmark_ribbon_50px.png" width="50px" alt="pic" />
                </div>
            </nav>

        </div>
        
    </div>`
}
itemCard.innerHTML = newAdd;
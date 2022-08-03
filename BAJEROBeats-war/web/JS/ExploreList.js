
const itemCard = document.getElementById("content-wrapper");
var newAdd = "";
var i = 0;
for ( i; i<20; i++){
    newAdd +=
        " <div class=\"new-content-card ex-new-content-card\">\n" +
        "                <div class=\"pn\">\n" +
        "                    <span style=\"font-size: 20px;\"><b>PACKAGE NAME</b></span><br>\n" +
        "                </div>\n" +
        "                <div class=\"date-div\">\n" +
        "                    <span style=\"font-size: 15px;\">DATE</span>\n" +
        "                </div>\n" +
        "                <div class=\"content-image-div\">\n" +
        "\n" +
        "                </div>\n" +
        "                <div class=\"like-to-cart-save\">\n" +
        "                    <nav>\n" +
        "                        <div class=\"to-cart-det-div btn-to-det\">\n" +
        "                            <img src=\"icons/icons8_arrow_filled_50px_2.png\" class=\"to-btn\" alt=\"pic\" />\n" +
        "                        </div>\n" +
        "                    </nav>\n" +
        "                </div>\n" +
        "            </div>"
}
itemCard.innerHTML = newAdd;
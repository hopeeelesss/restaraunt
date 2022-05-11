var slideIndex = 0;
showSlides();
                    
function showSlides() {
    var i;
    var slides = document.getElementsByClassName("employee");
    for (i = 0; i < slides.length; i ++) {
        slides[i].style.display = "none";
    }
    slideIndex += 4;
    if (slideIndex > slides.length) {slideIndex = 4}
    for(i = 1; i <= 4; i++){
        slides[slideIndex - i].style.display = "block";
    }
    setTimeout(showSlides, 5000); // Change image every 5 seconds
}
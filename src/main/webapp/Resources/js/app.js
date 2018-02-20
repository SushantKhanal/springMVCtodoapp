var x = false;
var id;
function check(element) {
    x = !x;
    //console.log(element.value);
    console.log(x);
    id = document.getElementById(element.toString());
    id.classList.toggle("strike");
}
// function assignId(array,elem) {
//     return array.indexOf('elem');
// }
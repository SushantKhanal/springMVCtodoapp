var element;
var stringName, checkboxName;
function check(id, elemValue) {
    stringName = id+elemValue;
    checkboxName = elemValue+id;
    //creating an invisible element to pass the id of marked elements to backend
    if(document.getElementById(checkboxName.toString()).checked) {
        //console.log(stringName);
        $( "#mainList" ).append("<input type='hidden' name='idOfMarkedItems' class='"+stringName+"' value='"+stringName+"'/>" );
    }
    //deleting the particular invisible element when the checkbox that created it is unchecked
    if(!document.getElementById(checkboxName.toString()).checked){
        $("."+stringName).remove();
    }
    element = document.getElementById(stringName.toString());
    element.classList.toggle("strike");
}

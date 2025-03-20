const userName = prompt("Key in your name");

if (username){
    const charCount = userName.length;
    console.log('The number of characters is ${charCount}');
}else{
    console.log("No name entered");
}
